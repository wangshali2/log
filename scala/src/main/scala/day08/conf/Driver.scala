package day08.conf

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.{ServerSocket, Socket}
import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
  * 驱动中心
  *
  * 规划数据(切片)
  *
  * 规划资源(按照数据计算所需的资源)
  *
  * 申请资源
  *     发送消息:  ResourceMessage(resourceCount:Int)
  *               ResourceMessage(3)
  *
  * 下发任务
  *
  * 统计结果
  *
  */
object Driver {

  val results:ListBuffer[Int] = ListBuffer()

  def main(args: Array[String]): Unit = {

    val srcData = ListBuffer(1,2,3,4,5,6,7,8,9,10)

    //切分数据
    val splitData: mutable.Buffer[ListBuffer[Int]] = splitSrcData(srcData)

    //申请资源
    requestResource(splitData.length)

    // 汇总结果
    calResult(splitData.length)

    // 下发任务
    sendTask(splitData)

  }

   /**
    切分数据
    */
  def splitSrcData(srcData:ListBuffer[Int]) ={
    val eles: Int = Configuration.getPropsValue(CoreUtils.EXECUTOR_CAL_MAX_NUMS).toInt
     srcData.sliding(eles,eles).toBuffer
  }

  /**
    * 申请资源
    */
  def requestResource(resourceNums:Int): Unit ={
    val resourceCenter = new Socket(Configuration.getPropsValue(CoreUtils.RESOURCECENTER_HOST),
      Configuration.getPropsValue(CoreUtils.RESOURCECENTER_PORT).toInt)

    //与资源中心通信，申请资源
    val resourceCenterOut = new ObjectOutputStream(resourceCenter.getOutputStream)

    //通信的内容
    val message = ResourceMessage(resourceNums)

    resourceCenterOut.writeObject(message)

    resourceCenterOut.flush()

    resourceCenter.close()
  }

  /**
    * 下发任务
    */
    def sendTask(splitData: mutable.Buffer[ListBuffer[Int]]): Unit ={
      val driver = new ServerSocket(Configuration.getPropsValue(CoreUtils.DRIVER_PORT).toInt)

      for(i <- 1 to splitData.length){
          val executorService: Socket = driver.accept()

          new Thread(new Runnable {
            override def run(): Unit = {
              //发送任务
              //Out
              val executorServiceOut = new ObjectOutputStream(executorService.getOutputStream)

              // 任务对象
              val task = new Task
              val taskData: ListBuffer[Int] = splitData.remove(0)
              task.data = taskData

              task.logic= _.sum

              executorServiceOut.writeObject(task)
              executorServiceOut.flush()
              executorService.shutdownOutput()

              //接收计算结果

              val executorServiceIn = new ObjectInputStream(executorService.getInputStream)
              val result: Int = executorServiceIn.readObject().asInstanceOf[Int]

              println("数据:" + taskData + "的结算结果为: " + result)


              //将每个计算节点返回的结果存储到results中
              results.append(result)


              executorService.close()

              Thread.sleep(1000)
            }
          }).start()

      }
    }

  def calResult(resultNums:Int): Unit ={
   new Thread(new Runnable {
     override def run(): Unit = {
       while(results.length != resultNums){
         println("等待汇总结果中......")
         Thread.sleep(1000)
       }

       println("计算的最终结果为：" + results.sum)

     }
   }).start()
  }


}
