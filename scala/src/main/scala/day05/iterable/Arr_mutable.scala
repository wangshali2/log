package day05.iterable

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
 * @author wsl
 * @version 2022-04-16-21:32
 *          可变数组
 */
object Arr_mutable {
  def main(args: Array[String]): Unit = {

    //创建数组1
    val buffer = new ArrayBuffer[Int]()

    //创建数组2
    val buffer2: ArrayBuffer[Int] = ArrayBuffer(5, 6, 7, 8)

    buffer.append(1, 2, 3, 4)
    //修改数据
    buffer.update(0, 5)
    buffer(0) = 1

    buffer.remove(2) //index
    println(buffer.mkString(","))

    //添加元素
    val buffer3: buffer.type = buffer += 5
    println(buffer3.mkString(","))
    println(buffer eq buffer3) //true

    // 使用 ++ 运算符会产生新的集合数组
    val buffer5: ArrayBuffer[Int] = buffer ++ buffer2
    //使用 ++= 运算符会更新之前的集合，不会产生新的数组
    val buffer6: buffer.type = buffer ++= buffer2
    println(buffer eq buffer5) //false
    println(buffer eq buffer6) //true


    //相互转换
    val buff: ArrayBuffer[Int] = ArrayBuffer(1, 2, 3, 4)
    val arr: Array[Int] = Array(4, 5, 6, 7)
    val buff1: mutable.Buffer[Int] = arr.toBuffer
    val arr1: Array[Int] = buff.toArray
  }
}
