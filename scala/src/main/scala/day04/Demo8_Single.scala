package day04

import java.util.Date

/**
 * @author wsl
 * @version 2022-04-16-20:53
 *          1.类
 *          Scala中的属性其实在编译后也会生成方法;
 *          Scala中一个源文件中可以声明多个类;
 *
 *          class修饰的类编译后只生成一个class文件  xxx.class
 *          object修饰的类编译后生成两个class文件  xxx.class 和xxx.$class
 *
 *          class:用来修饰普通的类 -(伴生类)xxx.class
 *          object：用来修饰伴随着普通的类-(伴生类)出现的一个单例对象--(伴生对象)xxx.$class
 *          简称：把同一个名字的类class称伴生类，object称为伴生对象。
 *
 *          scala中没有static，因此提供了伴生对象模仿java中static的语法，
 *          这个类的所有“静态”内容都可以放置在它的伴生对象中声明，然后通过伴生对象名称直接调用。
 *
 *          需要创建对象再调方法---class
 *          不用创建对象，直接调用方法---object
 */
object Demo8_Single {

  //new Single 私有化不能new了

  //创建对象
  private val s1: Single = Single()
  private val s2: Single = Single()

  println(s1 eq s2) //true  是单例模式

  //val method = new Method() //调用构造器创建对象,当构造器私有化后，不能创建

  println("-----------------------------------------------")

  private val bool: Boolean = method.isInstanceOf[Method]  //判断是否是[类型]
  private val method3: Method = method.asInstanceOf[Method] //转换成[类型]的实例
  // method.getClass     //java获取类的信息
  private val pClass: Class[Method] = classOf[Method] //scala获取类的信息

  val method: Method.type = Method //获得伴生对象
  val method1: Method = Method() //apply方法编译器能够自动识别，因此可以不显示调用
  val method2: Method = Method.apply() //通过apply创建对象 两种方式相同
  val wsl: Date = Method("wsl")

}

/**
 * 1.构造器私有化
 */
class Single private {

}

/**
 * 2.创建伴生对象--（伴生对象是单例的）
 */
object Single {

  //3.new对象
  private val single = new Single

  def apply() = {
    single
  }
}

/**
 * 主构造函数私有化
 */
class Method private {

}

/**
 * 伴生对象
 */
object Method {

  /**
   * 在伴生对象中通过apply方法创建对象，不一定是当前对象,伴生对象可以访问伴生类的私有内容-
   *
   * @return
   */
  def apply(): Method = new Method()

  /**
   * apply可以重载,()不能省略
   *
   * @param name
   * @return
   */
  def apply(name: String) = {
    new _root_.java.util.Date()
  }
}