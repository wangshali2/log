package day05.iterable

import scala.collection.mutable

/**
 * @author wsl
 * @version 2022-04-19-17:22
 *          scala 集合 set  不可变   不用导包，在predef下
 *
 */
object SetDemo {
  def main(args: Array[String]): Unit = {
    //todo 不可变
    val set1 = Set(1,2,3,4)
    val set2 = Set(5,6,7,8)
    //new Set(1,2)  trait

    // 增加数据
    val set3: Set[Int] = set1 + 5 + 6
    val set4: Set[Int] = set1.+(6,7,8)
    println( set1 eq set3 ) // false

    // 删除数据
    val set5: Set[Int] = set1 - 2 - 3

    val set6: Set[Int] = set1 ++ set2
    val set7: Set[Int] = set2 ++: set1
    println(set6 eq set7)  //false

    //todo 可变
    val set = mutable.Set(1,2,3,4)
    println(set.add(6))   //true
    println(set.add(4))   //false  添加失败

    //update  如果要更新的元素存在，true:覆盖，false：删除
    //       如果要更新的元素不存在，true:添加，false：不添加
    set.update(1,true)
    set.update(1,false)
    println(set.mkString(","))



    val set10 = mutable.Set(1,2,3,4)
    val set11 = mutable.Set(3,4,5,6)

    // 交集
    val set9: mutable.Set[Int] = set10 & set11
    println(set9.mkString(","))
    // 差集
    val set8: mutable.Set[Int] = set10 &~ set11
    println(set8.mkString(","))
  }

}
