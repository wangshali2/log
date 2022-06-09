package day08.conf

import java.io.{ObjectInputStream, ObjectOutputStream}
import java.net.Socket

/**
  * 计算节点
  *
  * 领取任务并计算
  */
case class ExecutorService(name:String) {

  override def toString: String = {
    name
  }

  def start(): Unit ={
    val thisExecutor = this
    new Thread(new Runnable {
      override def run(): Unit = {
        Thread.sleep(1000)

        val driver = new Socket(Configuration.getPropsValue(CoreUtils.DRIVER_HOST),
          Configuration.getPropsValue(CoreUtils.DRIVER_PORT).toInt)
        // In
        val driverIn = new ObjectInputStream(driver.getInputStream)
        val task: Task = driverIn.readObject().asInstanceOf[Task]

        //执行计算
        val result: Int = task.cal()

        //将计算的结果写回到Driver端
        val driverOut = new ObjectOutputStream(driver.getOutputStream)
        driverOut.writeObject(result)
        driverOut.flush()

        driver.close()

        // 注销executorService
        ResourceCenter.closeExecutorService(thisExecutor)
      }
    }).start()
  }
}
