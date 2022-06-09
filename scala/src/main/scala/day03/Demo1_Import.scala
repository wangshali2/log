package day03


/**
 * @author wsl
 * @version 2022-04-16-12:30
 * import:java导入的包中的类;scala导的是包.
 *
 * java import:
 * 静态导入--> import static xxxxx 导入静态类中的属性、方法等，直接使用，不用类名.属性了。
 *
 * scala import:
 * 1.基本语法一致
 * 2.Scala中的import语法可以在任意位置使用
 * 3.Scala中可以导包
 * 4.Scala中可以在同一行中导入多个类，简化代码
 * 5.Scala中可以屏蔽某个包中的类-避免冲突
 * 6.Scala中可以给类起别名，简化使用-同时使用
 * 7.Scala中可以使用类的绝对路径
 * 8.默认情况下，Scala中会导入如下包和对象
 *          import java.lang._
 *          import scala._
 *          import scala.Predef._
 * 9.导入对象
 */
object Demo1_Import {
  def main(args: Array[String]): Unit = {

    import java.util.ArrayList //导类
    new ArrayList  //直接使用

    import java.util //导包
    new util.ArrayList() //包.类

    import java.util.{List, ArrayList, HashMap}

    import java.util._  //Scala中使用下划线代替Java中的星号
    import java.sql.{Date =>_, Array =>_, _}
    new Date()   //两个包下都有Date，Array，不屏蔽绿色run箭头消失

    import java.util.{Date => utildate, _}
    import java.sql.{Date => sqldate, _}
    new utildate()
    new sqldate(2011-11-11)

    //取别名
    val name = "zs"
    type myString = java.lang.String
    type myInt=java.lang.Integer
    var pwd:myInt=123;
    val username: myString = "lisi"

    new _root_.java.util.ArrayList //通过绝对路径查找
  }
}
