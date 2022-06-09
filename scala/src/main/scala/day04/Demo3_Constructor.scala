package day04

/**
 * @author wsl
 * @version 2022-04-16-15:46
 *          构造器
 *          java的默认构造器  public User07 (){}
 *          scala
 *          1.主构造器--必须调用
 *          2.辅构造器--必须直接或间接调用主构造器
 *          3.在主构造器中通过var /val 声明的参数，可以直接作为类的属性使用
 *
 */
class Method1 private { //主构造函数私有化

  var username: String = _

  def this(name: String) { // 辅助构造函数，使用this关键字声明
    this() //调用主构造器
    username = name
  }

  def this(name: String, pwd: String) {
    this(name) //调用辅助构造器
  }
}

/**
 * 类也是函数,因此可以直接写语句
 *
 * @param name
 * @param age
 */
class Method2(var name: String, val age: Int) {
  name = "wsl"

  def this(name: String) = { //辅助构造器1
    this(name, 20) //调用主构造器
  }

  def this() {
    this("wsl") //通过调用辅助构造器1来调用主构造器
  }
}


object Demo3_Constructor {
  def main(args: Array[String]): Unit = {
    val method = new Method2() //调无参构造器时()可以不加
    val wsl1 = new Method2("wsl")
    val wsl2 = new Method2("wsl", 20)
    println("姓名：%s,年龄：%d " + wsl2.name,wsl2.age)

  }
}