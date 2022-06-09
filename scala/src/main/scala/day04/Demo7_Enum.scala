package day04

/**
 * @author wsl
 * @version 2022-04-16-20:44
 *
 */
object Demo7_Enum {
  def main(args: Array[String]): Unit = {
    println(Color.red)
    println(Color.values)

    //type定义新类型
    type S=String
    var  v:S="abc"

  }
}

/**
 * 应用类
 */
object AppDemo extends App{
  println("app....")
}

/**
 * 枚举
 */
object Color extends Enumeration{
  var red=Value(1,"red")
  var yellow=Value(2,"yellow")
}
