package day05.iterable

import scala.collection.mutable.ListBuffer

/**
 * @author wsl
 * @version 2020-11-27
 */
object Operator {
  def main(args: Array[String]): Unit = {

    val list = ListBuffer(1, 2, 3, 4)

    //map：转换结构
    println(list.map("*" * _))

    //flatten：将集合拆分成一个个体
    val list2 = List(List(1, 2, 5), List(3, 4))
    println(list2.flatten)

    val list3 = List(List(List(1, 2)), List(List(3, 4)))
    println(list3.flatten.flatten) //递归

    val list4 = List("hello scala", "hello spark") //string也是集合
    println(list4.flatten) //h e l l o

    //flatmap
    println(list4.flatMap(str => {
      str.split(" ")
    }))

    println(list4.flatMap(_.split(" ")))

    //filter
    val list6 = List(4, 2, 1, 3)
    println(list6.filter(_ % 2 == 0)) //过滤出偶数

    val list7 = List("hello", "scala", "hello", "spark")
    println(list7.filter(_.startsWith("h"))) //过滤出以h开头的

    println(list4.flatMap(_.split(" ")).filter(_.startsWith("h")))
    list2.flatMap(elem => elem.map(_ * 2))

    //group by 分组
    val list8 = List(1, 2, 3, 4, 5, 6, 7, 8, 9)
    println(list8.groupBy((i: Int) => {
      i % 3
    })) //以元素%3的结果分组

    val list9 = List("hello", "scala", "hello", "spark", "hello", "scala", "hello")
    println(list9.groupBy(str => str)) //以相同单词分组

    //sortBy 集合排序：按照指定的排序规则将集合中元素排序
    println(list6.sortBy(i => i))
    println(list6.sortBy(i => -i)) //倒序
    println(list6.sortBy(i => i)(Ordering.Int.reverse)) //倒序 Ordering 指定排序规则

    val list10 = List((10, "www"), (10, "ss"), (20, "ll"))
    //按照元素的第1个元素排序，相同再按照第2个元素排序
    println(list10.sortBy(t => t)(Ordering.Tuple2(Ordering.Int.reverse, Ordering.String.reverse)))
    println(list10.sortBy(kv => -kv._1))

    //sortwith 自定义排序：先按第一个元素排，再按第二个元素排
    println(list10.sortWith((left, right) => {
      if (left._1 == right._1) {
        left._2 > right._2
      } else {
        left._1 > right._1 // >降序，<升序
      }
    }))

    println(List("Steve", "Tom", "John", "Bob").sortWith(_.compareTo(_) < 0))
    //List("Bob", "John", "Steve", "Tom")

  }
}
























