package day01

/**
 * @author wsl
 * @version 2022-04-14-17:44
 *          1. Scala语言是完全面向对象和函数的语言；Java语言不是完全面向对象的语言.例如基本类型 、一些关键字例如void(Unit对象) ,static(Object对象)等.
 *             2. object : Scala中是没有static. Scala通过object的方式来模仿java的中static
 *             3. def ： define的缩写. 声明方法.
 *             4. scala => main(args: Array[String]) => 变量名 : 变量类型
 *             *  java  => main(String[] args)  => 变量类型  变量名
 *             Java :  传统思想.  我爱上了一个女人  这个女人叫翠花
 *             Scala:  开放思想.  我爱上了翠花.  她是女人.
 *
 *          使用object修饰的"类",编译完之后会有两个class文件：当前类名.class和当前类名$.class
 *          1. 当前类名.class
 *             是一个final修饰的类，有static main方法 。
 *             2. 当前类名$.class
 *             是一个final修饰的类，有一个静态的当前类型的变量     public static demo2$ MODULE$;
 *             有一个私有的构造器            MODULE$ = this;       将当前类的对象赋值给  MODULE$
 *             有一个静态代码块              new  Scala02_object$ ()     创建当前类对象
 *             有一个普通的main方法         该方法中的代码就是 def main(args: Array[String]): Unit中的代码
 *
 *          3. 当前类名.class ==> static main ==> 当前类名$.class  ==> MODULE$  ==> 普通main
 *
 *          public final class demo2  {
 *          *  public static void main(String[] paramArrayOfString) {
 *          *    demo2$.MODULE$.main(paramArrayOfString);
 *          *  }
 *          }
 */
object demo1_Variable {
  def main(args: Array[String]): Unit = {

    println("hello world")

    //var/val 变量名：类型=值,声明的同时必须初始化
    var name: String = "hangman"

    //强类型语言，类型可以推断出来
    name = "hangman"

    //val=final
    val age = 18
    //age=2

    println("-------------------------Type-----------------------")

    //AnyVal
    val a: Byte = 10
    val b: Short = a //隐式转换
    val c: Int = 10
    val d: Long = 10
    val e: Float = 10
    val f: Double = 10
    val g: Unit = () //void  唯一实例()
    var ss: Short = c.toShort //强转
    ss.toString  //所有的类型都提供了toString
    var s = "hello" + c  //任意类型都提供了和字符串进行拼接的方法
    //Anyref
    val arr: Array[String] = new Array[String](5)


    println("-----------------------string-----------------------")

    //所有运算符都是方法,数字其实也是对象
    //== 和 equals比较的是内容  eq比较的是地址
    val str = new String("abc")
    val str1 = new String("abc")
    println(str == str1) //true
    println(str equals str1) //true
    println(str eq str1) //false
    println(str.eq(str1)) //false


    //用的是java中的字符串
    val newName: String = name.substring(0, 1)
    println(newName)
    println("hello" + newName) //拼接
    printf("hello %s,%d", newName, age) //传值
    print(s"name=$newName,age=$age")
    print(s"$newName,$age")

    //多行字符串   | 默认顶格符

    println(
      s"""
         |{"name":"$newName","age":"$age"}
         |""".stripMargin
    )

    println(
      s"""
         |select
         |*
         |from table
         |where name="$newName"
         |""".stripMargin
    )
  }
}



