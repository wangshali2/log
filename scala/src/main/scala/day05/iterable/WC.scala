package day05.iterable

import scala.io.Source

/**
 * @author wsl
 * @version 2022-04-19-18:42
 *
 */
object WC {
  def main(args: Array[String]): Unit = {

    wc()
    wc2()
    wc3()

  }

  def wc() = {
    val group: Map[String, List[(String, Int)]] = Source.fromFile("scala/input/1.txt")
      .getLines().toList
      .flatMap(_.split(" "))
      .map((_, 1))
      .groupBy(_._1)

    val result: Map[String, Int] = group.map(kv => {
      (kv._1, kv._2.size)
    })

    println(result)
  }

  def wc2(): Unit = {
    val group: Map[String, List[String]] = Source.fromFile("scala/input/1.txt")
      .getLines().toList
      .flatMap(_.split(" "))
      .groupBy(str => str)

    val result: List[(String, Int)] = group.map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(kv => -kv._2)

    println(result)

  }

  def wc3(): Unit = {
    val dataList = List(("Hello Scala", 4), ("Hello Spark flume hbase", 2), ("hive hadoop Hello", 3), ("kafka hbase", 2))
    val result: List[(String, Int)] = dataList.map(kv => (kv._1 + " ") * kv._2)
      .flatMap(_.split(" "))
      .groupBy(str => str)
      .map(kv => (kv._1, kv._2.length))
      .toList
      .sortBy(t => -t._2)

    println(result)
  }


}
