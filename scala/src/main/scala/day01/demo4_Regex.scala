package day01

import scala.util.matching.Regex

/**
 * @author wsl
 * @version 2022-04-28-13:35
 *正则表达式
 */
object demo4_Regex {
  def main(args: Array[String]): Unit = {

    val pattern: Regex = "Scala".r
    val str = "Scala1 scala2 is scalable3 Language able22 able1"


    println(pattern findFirstIn str) // 匹配字符串第一个
    println(pattern replaceFirstIn(str, "Java")) //替换

    val pattern1 = new Regex("(S|s)cala") //匹配大写 or 小写
    println((pattern1 findAllIn str).mkString(",")) //匹配所有

    val pattern2 = new Regex("abl[ae]\\d+")
    println((pattern2 findAllIn str).mkString(","))

  }
}
