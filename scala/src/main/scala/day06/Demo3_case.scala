package day06


/**
 * @author wsl
 * @version 2020-11-28
 *          样例类：1.通过关键字case声明,
 *          2.仍然是类，只是会自动生成伴生对象，默认提供很多方法例如apply(),unapply()
 *          3.默认会把参数直接当成类的属性，用val修饰，自己可以修改成var；
 *          4.默认会实现序列化接口，建议开发中使用样例类
 */
object Scala03_Match {
  def main(args: Array[String]): Unit = {

    val (x,y)=(1,2)
    println(s"x=$x,y=$y")

    val Array(f,s,_*)=Array(1,7,2,9)
    println(s"f=$f,s=$s")

    //变量场景
    val Emp(name, age) = Emp("lisi", 20) //apply
    println(s"name=$name,age=$age")

    //模式匹配
    val user: Emp = Emp("wsl", 12)
    val result: String = user match {
      case Emp("wsl", 12) => "yes"
      case _ => "no"
    }
    println(result)

  }
}

//样例类
case class Emp(name: String, age: Int)

