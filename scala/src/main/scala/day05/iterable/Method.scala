package day05.iterable

import scala.collection.mutable.ListBuffer

/**
 * @author wsl
 * @version 2020-11-27
 *          集合常用方法
 */
object Method {
  def main(args: Array[String]): Unit = {
    val list = ListBuffer(1, 2, 3, 4, 5, 6, 7, 8)
    val list2 = ListBuffer(3, 4, 5, 6)

    println(list.length)
    println(list.size)
    println(list.isEmpty)
    println(list.contains(1))
    //取集合元素       前2个
    println(list.take(2))
    println(list.takeRight(2)) //后2个

    //取满足条件的第一个元素
    println(list.find(_ % 2 == 0))

    //丢弃前几个元素
    println(list.drop(2))
    println(list.dropRight(2))

    println(list.reverse) //反转
    println(list.distinct) //去重

    println(list.head) //取头,集合第一个元素
    println(list.tail) //取尾，除了头其他部分
    println(list.last) //取最后一个元素
    println(list.init) //取除了最后一个元素

    //并集   不去重
    println(list.union(list2))
    //交集
    list.intersect(list2)
    //差集
    println(list.diff(list2)) //1 2
    println(list2.diff(list)) //5 6

    //切分  以元素个数切分
    println(list.splitAt(2)) //(ListBuffer(1, 2),ListBuffer(3, 4，5,6，7,8))
    //滑动   以元素个数切分  每隔1位往右滑
    println(list.sliding(3).mkString(",")) //(1,2,3),(2,3,4),(3,4,5)
    //滚动   每隔2位往右滑
    println(list.sliding(3, 2).mkString(",")) //(1, 2, 3),(3, 4, 5),(5, 6, 7),(7, 8)
    //拉链
    println(list.zip(list2)) //((1,3), (2,4), (3,5), (4,6))
    //数据索引拉链
    println(list2.zipWithIndex) //((3,0), (4,1), (5,2), (6,3))

    //数值
    println(list.max)
    println(list.min)
    println(list.sum)

    //index0 +/- index1
    println(list.reduce(_ + _)) //sum
    println(list.product) //乘积
    println(list.reduceLeft(_ - _)) //从左到右
    println(list.reduceRight(_ - _))//从右到左

    //集合折叠  一个数跟集合计算
    println(list.fold(6)(_ + _))//6+1=7 7+2=9 9+3=12
    println(list.fold(6)(_ - _))//6-1=5 5-2=3 3-3=0

    //集合扫描  记录每次的计算结果
    println(list.scan(6)(_ + _))  //6,7,9,12
    println(list.scanLeft(6)(_ + _))   //6,7,9,12
    println(list.scanRight(6)(_ - _))  //(-4,5,-3,6)  6 3-6=-3 2--3=5 1-5=-4

  }
}
