package day02.fun

/**
 * @author wsl
 * @version 2022-04-15-17:28
 *          高级函数编程
 *          函数作为值
 *          1.通过  函数名 _   来赋值
 *          2.通过 获取类型来直接赋值
 */
object Fun3_High {
  def main(args: Array[String]): Unit = {


    /**
     * 函数作为值1.无参
     *
     * @return
     */
    def fun1(): String = {
      "zhangsan"
    }

    println(fun1) //zhangsan
    println(fun1 _) //<function0>


    /**
     * 函数作为值2.有参
     *
     * @param name
     * @return
     */
    def fun2(name: String): String = {
      "name=" + name
    }

    fun2("wsl") //函数调用

    //方式1.把函数对象赋值给变量，函数名 _
    val str: String => String = fun2 _
    println(str("wsl2")) //变量(参数)

    //方式2.如果不想使用_需要手动指定类型
    val str2: String => String = fun2
    println(str2("wsl3"))


    /**
     *
     * @param i 函数作为参数
     * @return
     */
    def fun3(i: Int): Int = {
      i * 2
    }

    def fun33(f: Int => Int): Int = {
      f(10) //参数函数不确定，参数函数里传入的参数是10
    }

    println(fun33(fun3)) //20
    println(fun33(fun3 _)) //fun3()作为函数已经声明过，可以判断是传递函数


    /**
     *
     * @param i
     * @return 函数作为返回值
     */
    def fun4(i: Int): Int = {
      i * 3
    }

    def fun44() = {
      fun4 _
    }

    println(fun44()(10)) //10作为返回值函数里的参数


    println(fun33((x: Int) => {
      x * 20
    }))
    println(fun33((x) => {
      x * 20
    }))
    println(fun33((x) => x * 20))
    println(fun33(x => x * 20))
    println(fun33(_ * 20)) //匿名函数  _ * 20 代替了f(10)即代替了fun3()


    /**
     * 闭包现象：
     * 1.匿名函数
     * 2.将函数作为值赋值给变量
     * 3.嵌套函数中内部函数在外部使用
     * 4.内部函数使用了外部函数的变量:先执行外部函数拿到返回值后再调用内部函数。而外部变量在外部变量执行完毕后就已经被销毁了。
     * 因为编译器修改了内部函数的参数列表，将外部的变量作为内部函数的参数传递到了内部函数里，因此可以使用到了。
     * 当前版本2.12:修改了内部函数的参数列表
     * 之前版本2.11:如果有闭关现象会多出一个匿名类
     *
     * */

    //4.内部函数使用了外部函数的变量
    def fun5() = {
      val i = 20

      def fun55() = {
        i * 2
      }

      fun55 _ //函数作为返回值
    }

    println(fun5()()) //fun55()无参所以这里是()


    def fun6(i: Int): Int => Int = {
      def fun66(j: Int): Int = {
        i + j
      }

      fun66 _
    }

    println(fun6(1)(2))

    //3.嵌套函数中内部函数在外部使用
    def test(): () => Unit = {
      def test1(): Unit = {

      }

      test1 _
    }

    test()()

    /**
     * 函数柯里化,支持写多个参数列表，好处简化参数列表
     *
     * @param i
     * @param j
     * @return
     */
    //柯里化写法
    def fun66(i: Int)(j: Int)(f: (Int, Int) => Int): Int = {
      f(i, j)
    }

    //普通写法
    def fun77(x: Int, y: Int, f: (Int, Int) => Int) = {
      f(x, y)
    }

    println(fun66(1)(2)(_ + _))
    println(fun77(1, 2, _ + _))

    //嵌套函数
    def fun88(i: Int) = {
      def fun99(j: Int) = {
        i + j
      }

      fun99(10) //i
    }

    println("fun88:" + fun88(20)) //j

    //柯里化，简化嵌套函数
    println("fun66:" + fun66(10)(20)(_ + _))

    /**
     * 控制抽象
     *
     * @param op 是一段逻辑，可以是一行代码
     */
    def my(op: => Unit) = {
      op
    }

    my ( println("xx"))

    //多行代码用{}代替()
    my {
      val age = 30
      if (age < 20) {
        println("少年")
      } else {
        println("老年")
      }
    }

    /** 递归函数:
     * 1.递归要有退出条件
     * 2.在scala中递归方法需要明确返回值类型，不然会报错
     */
    def fun8(j: Int): Int = {
      if (j <= 1) {
        1
      } else {
        j * fun8(j - 1)
      }
    }

    println(fun8(5))
    //println(sum(1000000000)) //java.lang.StackOverflowError
    //递归的深度太深，数据一直在压栈出不去，知道num<=1才能出去

    /**
     * 尾递归  --推荐使用
     * 5,0  => sum(4,5)
     * 4,5  =>sum(3,9=4+5)
     *
     * @param num
     * @param result
     * @return
     */
    def sum2(num: Int, result: Int): Int = {
      if (num < 1) {
        result
      } else {
        sum2(num - 1, num + result)
      }
    }

    println(sum2(5, 0))



    /**
     * 惰性函数当函数返回值被声明为lazy时，函数的执行将被推迟，直到我们首次对此取值，该函数才会执行
     * @return
     */
    def fun9(): String = {
      println("function...")
      "zhangsan"
    }

    lazy val a = fun9()
    println("----------")
    println(a)


  }
}
