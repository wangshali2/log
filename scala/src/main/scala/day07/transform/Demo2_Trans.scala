package day07.transform

/**
 * @author wsl
 * @version 2022-04-28-11:21
 *          隐式转换
 *          java中的隐式转换：对基本类型来讲是提升精度的过程，int(32)->long(64)；
 *          对引用类型来讲是类型提升的过程，class User extends Person, user->person。
 *          scala 中没有精度提升，因为没有基本类型；对于anyref来讲也是类型提升的过程，除此之外scala对隐式转换做了扩展：
 *          当代码编译出错后，scala会尝试通过查找转换规则(例如通过implicit修饰的函数)重新对出错的代码进行编译，让本来编译出错的代码能编译出错---二次编译。
 *
 */
object Demo2_Trans {
  def main(args: Array[String]): Unit = {

    val a: Int = 2.0.toInt //手动转换

    val b: Int = trans(2.0)

    val c = 2.0 //自动调用

    transform2("zs") //有隐式变量(√)和隐式参数
    transform2("zs")() //有隐式变量和隐式参数(√)
    transform2("zs")("999") //使用自定义pwd


  }

  //隐式变量
  implicit val newpwd: String = "888"

  def trans(d: Double) = {
    d.toInt
  }

  /**
   * 隐式函数：自动调用,但不能有多个相同的转换规则
   *
   * @param d
   * @return
   */
  implicit def transform(d: Double): Int = {
    d.toInt
  }

  /**
   * 隐式参数
   *
   * @param d
   * @return
   */
  def transform2(name: String)(implicit pwd: String = "777") = {
    println(s"name=$name,pwd=$pwd")
  }
}
