package day07.transform

import java.io.{BufferedReader, FileReader, IOException}

/**
 * @author wsl
 * @version 2020-11-27
 *          1.catch只能出现一次，需要通过模式匹配的方式对各种异常进行区分处理；
 *          2.范围大的异常写到后面；
 *          3.异常不区分所谓的编译时异常和运行时异常，也无需显示声明异常。
 */
object Demo1_Exception {
  def main(args: Array[String]): Unit = {
    try {
      var n = 10 / 0
    } catch {
      case ex: ArithmeticException => {
        println("发生算术异常")
      }
      case ex: Exception => {
        println("发生了异常1")
      }
    } finally {
      println("finally")
    }
  }
}

class User2{
  //显示声明异常，用注解。
  @throws[Exception]
  def get()={
    throw  new Exception
  }
}

class Reader(name: String) {

  private val in = new BufferedReader(new FileReader(name))
  @throws[IOException]("if the file doesn't exist")
  def read() = in.read()
}