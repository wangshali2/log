package day05.iterable

import scala.collection.mutable

/**
 * @author wsl
 * @version 2020-11-27
 *          map  不可变  无序
 */
object MapDemo {
  def main(args: Array[String]): Unit = {
    val empty: mutable.Map[Nothing, Nothing] = mutable.Map.empty

    //todo 不可变
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)

    //TODO 可变
    val map2: mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    val mapNew: Map[String, Int] = map + ("d" -> 4)
    println(map eq mapNew) //false

    map2.put("d", 4)
    println(map2.mkString(","))

    map2.update("A", 4)
    println(map2.mkString(","))

    //删除数据
    val map1: mutable.Map[String, Int] = map2 - "d"

    //获取指定key的值
    println(map2.apply("b"))
    // println(map2.apply("e")) //k不存在抛异常

    //Option避免空指针异常
    val op: Option[Int] = map2.get("e")
    if (!op.isEmpty) {
      println(op.get)
    } else {
      println(op.getOrElse(0)) //没有返回0
    }


    //获取可能存在的key值, 如果不存在就使用默认值
    println(map2.getOrElse("e", "default"))
    println(map2.getOrElse("a", "default"))
    println(map2.getOrElse("b", "default"))


    //转换
    val array: Array[(String, Int)] = map.toArray

    val map3 = mutable.Map(("a", 1), ("b", 2))
    //遍历
    for (t <- map3) {
      print(t._1 + ":" + t._2)
    }
    println()

    for ((k, v) <- map3) {
      print(k + ":" + v)
    }
    println()

    //遍历
    println(map3.foreach(t => print(t._1 + ":" + t._2)))
    println()

    map2.clear() //清空集合


    val map5: mutable.Map[String, Int] = mutable.Map[String, Int]()
    map5("wsl") = map5.getOrElse("wsl", 0) + 1
    println(map5)
    map5("wsl") = map5.getOrElse("wsl", 0) + 1
    println(map5)




  }
}
