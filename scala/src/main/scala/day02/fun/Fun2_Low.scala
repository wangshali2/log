package day02.fun

/**
 * @author wsl
 * @version 2022-04-15-17:04
 *          至简原则：
 *          能省则省，能省的原则是scala的编译器能正常推断
 */
object Fun2_Low {
  def main(args: Array[String]): Unit = {

    def fun1(name: String): String = {
      return "zss=" + name
    }

    // 1.省略return（默认返回最后一行）
    def fun2(name: String): String = {
      "zss=" + name
    }

    // 2.省略返回值类型
    def fun3(name: String) = {
      "zss=" + name
    }

    // 3.省略{}，如果函数体只有一行代码
    def fun4(name: String) = "zss=" + name

    // 4.省略参数列表()，如果函数声明时没有参数
    def fun5 = "zss"

    def fun55() = "www"

    //函数声明时有(),调用可以加或不加；但声明时没有(),调用不能加()
    println(fun55()) //正常调用
    println(fun5) //调用省略()

    //5.匿名函数：只关心函数的逻辑不关心名字，可以省略def 和函数名
    //语法： （）=>{}
    //调用： 将匿名函数赋值给变量

    val a = () => {
      println("hello")
    }
    val b = (name: String, age: Int) => {
      name + age
    }

    a() //调用
    println(b("wsl", 123))


    // 函数体写了return，返回值类型不能省，当函数声明的返回值类型是Unit时，返回()
    def fun7(): Unit = {
      return "123"
    }

    println(fun7()) //()


    //过程函数：明确返回值类型是Unit，不写返回类型的情况下可以把=省略
    def fun8() {
      "123"
    }

    println(fun8()) //()
  }
}
