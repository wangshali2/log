package day05.iterable

/**
  * @author wsl
  * @version 2020-11-27
  *          并行
  */
object ThreadDemo {
  def main(args: Array[String]): Unit = {
    val result1 = (0 to 100).map{x => Thread.currentThread.getName}
    val result2 = (0 to 100).par.map{x => Thread.currentThread.getName}

    println(result1)     //串行，都是main线程
    println(result2)     //并行，多个线程同时处理

  }
}
