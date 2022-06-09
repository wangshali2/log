package day03

/**
 * @author wsl
 * @version 2022-04-16-12:15
 *          面向对象: java 的包功能单一，可有可无;scala的包扩展了java中包的功能
 *          1.Scala中的包和类的物理路径没有关系，可以自定义
 *          2.包可以声明多次，且可以嵌套，体现层级关系
 *          3.子包可以直接访问父包的内容，不需要导包
 *          4.可以把包当成对象，将包中所有类的共同的部分抽取到包对象中
 */
object Demo2_SubPackage {
  def main(args: Array[String]): Unit = {
    test() //调用包对象中的函数
    println(name) //访问包对象中的属性
  }
}
