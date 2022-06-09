package day01

import java.io.{File, PrintWriter}
import scala.util.control.Breaks

/**
 * @author wsl
 * @version 2022-04-15-14:02
 *          用的是java的io
 */
object demo3_For {


  def main(args: Array[String]): Unit = {

    val age = 20
    //(表达式) 表达式都是有返回值的
    //if循环
    val str: String = if (age < 10) "少年" else "中年"

    if (age < 10) {
      "少年"
    } else {
      println(str)
    }

    //for
    for (i <- Range(1, 5)) { // 不包含5
      println("i=" + i)
      println("for")
    }

    for (i <- 1 to 5) { // 包含5
      println("i=" + i)
    }

    for (i <- 1 until 5) { // 不包含5
      println("i = " + i)
    }

    for (i <- Range(1, 5) if i != 3) { //不输出3  循环守卫
      println("i=" + i);
    }

    for (i <- Range(1, 5, 2)) { //输出1,3
      println("i = " + i)
    }
    for (i <- 1 to 5 by 2) { //循环步长为2，输出1,3,5
      println("i = " + i)
    }

    for (i <- Range(1, 5); j <- Range(1, 4)) { //循环嵌套
      println("i=" + i + ",j=" + j)
    }

    for (i <- Range(1, 5)) {
      for (j <- Range(1, 4)) {
        println("i=" + i + ",j=" + j)
      }
    }

    //循环的时候定义变量
    for (i <- Range(1, 5); j = i - 1) {
      println("j=" + j)
    }

    //循环的时候定义变量
    for (i <- Range(1, 5); j = i - 1) {
      println("j=" + j)
    }


    val result = for (i <- Range(1, 5)) {
      i * 2
    }
    println(result) //()

    //默认情况下for循环没有返回值，想要返回值用关键字yield
    val result1 = for (i <- Range(1, 5)) yield {
      i * 2
    }
    println(result1) //Vector(2, 4, 6, 8)

    //调用线程的方法，区别关键字用 ` 符号
    Thread.`yield`()

    //循环中断 多行代码时用{}代替()
    Breaks.breakable {
      for (i <- Range(1, 5)) {
        if (i == 3) {
          //scala的break效果通过抛异常来中断,需要用breakable套起来
          // Breaks.break()
          Breaks.break
        }
        println("i=" + i)
      }
    }

    var i = 0
    while ( i < 5 ) {
      println(i)
      i += 1
    }

    do {
      println(i)
    } while ( i < 5 )



  }
}
