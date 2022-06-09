package day06

/**
 * @author wsl
 * @version 2020-11-28
 *          偏函数：其实就是对集合中符合条件的数据进行处理的函数.
 *          匹配不上不会抛异常，直接丢弃
 */
object Demo6_Partial {
  def main(args: Array[String]): Unit = {

    val list: List[Any] = List(1, 2, 3, 4, "a")
    // println(list.map(_* 2))   any类型不能*2

    //需求1：将list1中所有数字都乘以2,其他的元素丢弃
    //方式1 函数
    println(list.filter(ele => ele.isInstanceOf[Int]).asInstanceOf[List[Int]].map(_ * 2))
    println(list.filter(_.isInstanceOf[Int]).map(_.asInstanceOf[Int] * 2))
    //方式2 简化偏函数
    println(list.collect { case i: Int => i * 2 })

    //需求2.将list1中所有数字都乘以2,其他的元素不动
    //方式1 函数
    println(list.map(ele => {
      if (ele.isInstanceOf[Int]) {
        ele.asInstanceOf[Int] * 2
      } else {
        ele
      }
    }))


    //方式2 声明偏函数
    val mypf: PartialFunction[Any, Any] = {
      case i: Int => i * 2
      case s: String => s
    }
    println(list.collect(mypf)) //list.map()  不支持偏函数

    //简化偏函数
    println(list.collect {
      case i: Int => i * 2
      case s: String => s
    })


    // 3.声明偏函数  [Int, String]Int:输入类型 ，String:返回类型
    val pf: PartialFunction[Int, String] = {
      case 1 => "one"
    }
    // 应用偏函数
    println(List(1, 2, 3, 4).collect(pf)) //one
    //简化
    println(List(1, 2, 3, 4).collect { case 1 => "one" }) //one


  }
}






















