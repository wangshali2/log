package day01

import java.io.{File, PrintWriter}

/**
 * @author wsl
 * @version 2022-04-15-14:02
 *          用的是java的io
 */
object demo2_InOut {


  def main(args: Array[String]): Unit = {

    //控制台输入
    val age: Int = scala.io.StdIn.readInt()
    printf(s"输入的年龄是:$age")

    //文件输入   D:\learn\code\wsl\log\scala\input\1.txt
    val words: Iterator[String] = scala.io.Source.fromFile("scala/input/1.txt").getLines()
    while (words.hasNext) {
      println(words.next())
    }

    //输出
    val writer = new PrintWriter(new File("scala/input/2.txt"))
    writer.write("hello world ")
    writer.close()

    def test(): Unit = {
      println("")
    }

    def test2(): String = {
      ""
    }

  }
}
