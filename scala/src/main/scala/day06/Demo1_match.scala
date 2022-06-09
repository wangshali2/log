package day06

/**
 * @author wsl
 * @version 2020-11-27
 *          模式匹配：
 *          1.没有break，没有穿透现象，匹配某个case成功即返回。
 *          2.case _ 表示匹配default。如放最上面时，什么都可以匹配不会写入后面的分支；没有case _ 匹配不上时会报异常
 */
object Demo1_match {
  def main(args: Array[String]): Unit = {

    val a: Int = 10
    val b: Int = 20
    val operator: Char = '/'
    val result = operator match {
      case '+' => a + b
      case '-' => a - b
      case '*' => a * b
      case '/' => a / b
      case _ => "illegal" //default
    }
    println(result)


  }

}
