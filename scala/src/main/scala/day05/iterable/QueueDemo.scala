package day05.iterable

import scala.collection.mutable

/**
  * @author wsl
  * @version 2020-11-27
  * 队列  先进先出
  */
object QueueDemo {
  def main(args: Array[String]): Unit = {
    val que = new mutable.Queue[String]()
    //进队
    que.enqueue("a", "b", "c")
    val que1: mutable.Queue[String] = que += "d"
    println(que eq que1)


    //出队
    println(que.dequeue())
    println(que.dequeue())
    println(que.dequeue())


  }
}
