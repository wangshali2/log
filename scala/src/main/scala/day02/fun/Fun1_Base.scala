package day02.fun

/**
 * @author wsl
 * @version 2022-04-15-14:02
 *          [修饰符] def 函数名 ( 参数列表 ) [:返回值类型] = {
 *          函数体
 *          }
 *          类中定义的函数即是方法;函数则是一个完整的对象，函数声明在其他位置：方法的里面(函数可以进行嵌套)
 *          方法具体面向对象的特性：例如重写、重载；函数不能重写、重载
 *
 */
object Fun1_Base {


  def main(args: Array[String]): Unit = {

    //1.无参，无返回值
    def test(): Unit = {
      println("")
    }

    //2.无参，有返回值
    def test2(): String = {
      ""
    }

    //有参无返回值
    def fun3(name: String): Unit = {
      println(name)
    }

    fun3("zhangsan")

    //有参无返回值
    def fun4(name: String): String = {
      "Hello " + name
    }

    println(fun4("zhangsan"))

    //可变参数，可变参数不能放置在参数列表的前面
    def fun7(names: String*): Unit = {
      println(names)
    }

    fun7() //List()
    fun7("zhangsan") //WrappedArray(zhangsan)
    fun7("zhangsan", "lisi") //WrappedArray(zhangsan, lisi)

    //函数的参数默认是val声明的，不能进行修改
    def register(name: String, pwd: String) = {
      var passwords = pwd
      if (pwd == null) {
        // pwd = "1234"   val 不能修改，除非转成var
        passwords = "1234"
      }
    }

    //可以在参数列表中声明参数的默认值，不传参数时使用默认值
    def register2(name: String, pwd: String = "123") = {
      println("name= " + name + ",pwd= " + pwd)
    }

    register2("wsl") //wsl 123
    register2("wsl", "123456") //wsl 123456
    register2("wsl", null) //wsl null


    //带名参数:有默认值的需要放到最后，可以不传，其他位置参数少传报错
    def register3(name: String, pwd: String = "123", tel: String) = {
      println("name= " + name + ",pwd= " + pwd + ",tel= " + tel)
    }

    register3("zs", "123", "138")
    //或者传参的时候指定参数
    register3("zs", tel = "138")

    //TODO 4.参
    //参数最大个数：一般情形下参数个数没有限制；特殊：当把函数作为对象赋值给变量时，最多22个.
    val b = register3 _
    b("zs", "123", "138") //b也是函数，调用b

  }
}
