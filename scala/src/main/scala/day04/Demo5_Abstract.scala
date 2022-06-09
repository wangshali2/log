package day04

/**
 * @author wsl
 * @version 2022-04-16-16:47
 *          抽象：不完整，不具体
 *          1.java中的抽象；
 *          抽象类：不希望被实例化对象来使用，
 *          抽象方法：没有方法体，子类需要重写父类的抽象方法或者也是抽象类
 *
 *          2.scala中的抽象
 *          抽象类:通过abstract修饰
 *          抽象方法:有方法的定义，没有方法体，不能被abstract修饰.
 *          抽象属性：只有属性的声明，没有赋值，子类需要将父抽象类的属性赋值;
 *
 *
 *          抽象类中不一定包含抽象方法或抽象属性，
 *          但是包含抽象属性或者抽象方法的类一定是抽象类。
 */
object Demo5_Abstract {

}

/**
 * 抽象类
 */
abstract class User08 {
  var name: String //抽象属性:属性只有声明没有初始化
  val age: Int = 30 //具体属性

  /**
   * 抽象方法
   */
  def test(): Unit

  /**
   * 具体方法
   *
   * @param i
   * @param j
   * @return
   */
  def sum(i: Int, j: Int): Int = {
    i + j
  }
}

class SubUser08 extends User08 {
  var name = "zs" //补充抽象父类属性

  // 表面是重写属性，实现上是重写方法。且只能重写val声明的属性
  override val age = 40 //反编译都是private的，子类不能用，而且还提供了get,set方法，所以需要override


  override def test(): Unit = ???

  /**
   * 子类想要重写父类具体的方法，要用override修饰
   *
   * @param i
   * @param j
   * @return
   */
  override def sum(i: Int, j: Int): Int = {
    i + j
  }
}
