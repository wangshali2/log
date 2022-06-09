package day05.iterable

/**
 * @author wsl
 * @version 2022-04-19-15:58
 *          seq集合 不可变list
 */
object List_Immutable {
  def main(args: Array[String]): Unit = {

    val list = List(1, 2, 3, 4)

    val list0 = List() //空集合
    val nil = Nil
    println(list0 eq nil) //true

    val list1: List[Int] = list :+ 1
    println(list eq list1) //false

    val list2: List[Int] = 1 +: list
    println(list2.mkString(","))

    val list3: List[Int] = list.updated(1, 5)

    //创建集合
    val list4: List[Int] = 1 :: 2 :: 3 :: Nil
    val list5: List[Int] = list ::: Nil

    //连接数组
    val list6: List[Int] = List.concat(list4, list5)
    println(list4.mkString(","))
    println(list5.mkString(","))
    println(list6.mkString(","))

    // 创建一个指定重复数量的元素列表
    val list7: List[String] = List.fill[String](3)("wsl")
    println(list7.mkString(","))
  }
}
