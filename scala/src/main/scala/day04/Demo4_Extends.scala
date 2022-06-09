package day04

/**
 * @author wsl
 * @version 2022-04-16-15:46
 *          extends
 */

class Super(name: String) {
  println("father")
}

class Sub(name: String) extends Super(name) {
  println("son")

  def this(name: String, age: Int) = {
    this(name)
    println("c")
  }

}

object Demo3_Extends {
  def main(args: Array[String]): Unit = {
    val zh = new Sub("zh", 30)  //执行顺序：father->son->c


  }
}