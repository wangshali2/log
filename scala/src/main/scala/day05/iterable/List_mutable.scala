package day05.iterable

import scala.collection.mutable
import scala.collection.mutable.ListBuffer

/**
 * @author wsl
 * @version 2022-04-19-15:58
 *          seq集合 可变list
 */
object List_mutable {
  def main(args: Array[String]): Unit = {

    val buf = new ListBuffer[Int]
    buf.append(1, 2, 3, 4)
    buf.update(0, 5)
    buf.remove(2, 2)
    buf.foreach(println)

    // 可变集合
    val buffer1 = ListBuffer(1, 2, 3, 4)
    val buffer2 = ListBuffer(5, 6, 7, 8)

    // 增加数据
    val buffer3: ListBuffer[Int] = buffer1 :+ 5
    val buffer4: ListBuffer[Int] = buffer1 += 5
    val buffer5: ListBuffer[Int] = buffer1 ++ buffer2
    val buffer6: ListBuffer[Int] = buffer1 ++= buffer2

    println(buffer5 eq buffer1) //false
    println(buffer6 eq buffer1) //true

    val buffer7: ListBuffer[Int] = buffer1 - 2 //2去掉
    val buffer8: ListBuffer[Int] = buffer1 -= 2
    println(buffer7 eq buffer1) //false
    println(buffer8 eq buffer1) //true
    println(buffer7.mkString(","))

    //转换
    val list: List[Int] = buf.toList
    val list1 = List(5, 6, 7, 8)
    val buffer: mutable.Buffer[Int] = list1.toBuffer


  }
}
