package day08.conf

import java.io.ObjectInputStream
import java.net.{ServerSocket, Socket}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * 资源中心
  *
  * 启动计算节点
  *
  * 管理计算节点(状态,可用或者不可用....)
  *
  * 接收资源申请的请求
  *
  * 分配资源
  *
  * 回收资源
  *
  *
  */
object ResourceCenter {
  //维护可用计算节点的集合
  val  canUseExecutors:ListBuffer[ExecutorService] = ListBuffer()
  // 维护正在使用的计算节点
  val  inUseExecutors : mutable.Set[ExecutorService] = mutable.Set()
  // 资源申请列表
  private val resourceRequests: mutable.Queue[Socket] = mutable.Queue()


  def main(args: Array[String]): Unit = {
    startResourceCenter()
    statusExecutors()
    handleResourceRequest()
    acceptDriverResourceRequest()

  }


  /**
    * 启动资源中心
    */
  def startResourceCenter(): Unit ={
      // 获取结算节点的个数
      val executor_nums: Int = Configuration.getPropsValue(CoreUtils.EXECUTOR_NUMS).toInt

     // 启动计算节点
     for(i <- 1 to executor_nums){
       canUseExecutors.append(ExecutorService("executor"+i))
     }

     //println("canUseExecutors:" + canUseExecutors.mkString(" , "))
  }

  /**
    * 管理计算节点的状态
    */
  def statusExecutors(): Unit ={
    new Thread(new Runnable {
      override def run(): Unit = {
        while(true){
          println("canUseExecutors:" + canUseExecutors.mkString(" , "))
          println()
          println("inUseExecutors:" + inUseExecutors.mkString(" , "))

          Thread.sleep(1000)
        }
      }
    }).start()
  }

   /*
      接收资源申请
    */
  def acceptDriverResourceRequest(): Unit ={
    val resourceCenter =
      new ServerSocket(Configuration.getPropsValue(CoreUtils.RESOURCECENTER_PORT).toInt)

    while(true){
      // 接收资源申请的请求
      val driver: Socket = resourceCenter.accept()

      // 将资源申请放置到队列中
      resourceRequests.enqueue(driver)
    }
  }

  /*
    分配资源
   */
  def handleResourceRequest(): Unit ={
    new Thread(new Runnable {
      override def run(): Unit = {
        while(true){
          // 判断当前是否有申请资源的请求
          while(resourceRequests.size == 0){
            println("暂时没有资源请求.....")
            Thread.sleep(1000)
          }
          //取出队列的队首的资源请求
          val currentDriver: Socket = resourceRequests.dequeue()
          //通信获取资源申请的详情
          //In
          val driverIn = new ObjectInputStream(currentDriver.getInputStream)
          val message: ResourceMessage =
              driverIn.readObject().asInstanceOf[ResourceMessage]
          //获取申请的资源的个数
          val driverNeedExecutors: Int = message.resourceCount

          //分配
          for(i <- 1 to driverNeedExecutors){

            while(canUseExecutors.size <=0){
              println("资源暂时无法分配,1秒后重试....")
              Thread.sleep(500)
            }
            //让ExecutorService开始工作
            val service: ExecutorService = canUseExecutors.remove(0)

            //把当前的ExecutorService放置到正在使用的列表中
            inUseExecutors.add(service)

            service.start()

          }
          // 当前driver的资源分配结束
          currentDriver.close()
        }

      }

    }).start()
  }

  /**
    * 回收资源
    */
  def closeExecutorService(executor:ExecutorService): Unit ={
    //将使用完的ExecutorService放置到 canUse列表中
    canUseExecutors.append(executor)
    inUseExecutors.remove(executor)
  }
}
