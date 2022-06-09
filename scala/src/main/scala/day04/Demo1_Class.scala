package day04

import scala.beans.BeanProperty

/**
 * @author wsl
 * @version 2022-04-16-15:19
 *
 */
class User {

  /**
   * 1.属性都是private修饰的；
   * 2.用val声明的属性 底层是final修饰的，只有get方法，没有set方法；
   * 3.定义了属性编译完后，还提供了类似get,set方法；
   * 4.真正的get 和set方法：
   * scala中通过一个注解@BeanProperty来生成对应的set和get方法，来兼容其他框架。
   *
   */
  private var name: String = _ // 下划线表示类的默认初始化

  //修饰符的范围
  private var age: Int = _ // 本类
  private[day04] var pwd = "123" //包权限，本类，本包
  protected val salary = 1000 //本类，子包可以访问但不能使用
  @BeanProperty
  val address = "sh" //public 默认 但是不能显示写 不是关键字

}

class SubUser extends User {
  private val user = new User
  println(user.address)
  println(user.pwd)
  //println(user.salary) 运行会报错
}

object Demo1_Class {
  def main(args: Array[String]): Unit = {
    val user = new User
    user.pwd
    user.address
  }
}