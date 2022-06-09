package day04

/**
 * @author wsl
 * @version 2022-04-16-17:53
 *          java中抽象类和接口区别：
 *          1.从使用角度：抽象类将子类中共通的功能抽取到父类中，通过抽象的方式描述；
 *          接口更习惯称之为标准规范。如果一个类符合这种标准就可以实现这个接口，或者说通过接口规范来约束具体的实现。
 *          例如JDBC是连接数据库的规范，不同的数据库厂家遵循这种规则。
 *          2.从语法角度：java类是单继承的，接口是多现实的，通过接口来弥补单继承，可以让具体的类即能继承又能实现接口。
 *
 *          scala中的特质 trait即能理解为接口又能理解为抽象类。
 *          接口多实现=>特质可以多混入，特质继承特质；
 *          类是单继承=>特质可以继承类，还可以混入多个特质。
 *          将多个类的相同特征从类中剥离出来,这种混入的操作可以在声明类时使用，也可以在创建类对象时动态混入。
 *
 */
object Demo6_Trait {
  def main(args: Array[String]): Unit = {

    //1.创建类对象时动态混入
    val mysql = new Mysql1 with DBOperate
    val mysql1 = new Mysql1 with DBStore {
      override def toMemory(): Unit = {
        println("")
      }
    }

    //2.动态拆入抽象类   直接调用普通方法
    val mysql2 = new Mysql1 with DBTest
    mysql2.toDesk()

  }
}

trait DBOperate {
  def insert(): Unit

}

trait DBStore {
  def toMemory(): Unit
}

trait DBTest{
  def toDesk()={
    println("保存到磁盘")
  }
}
abstract class DBProduce() {
  def printlnName(): Unit
}

/**
 * 声明的时候混入特质,继承类 混入特质
 */
class Mysql extends DBProduce with DBOperate with DBStore {

  override def insert(): Unit = {
    println("Mysql 插入数据")
  }

  override def printlnName(): Unit = {}

  override def toMemory(): Unit = {
    println("")
  }
}

class Mysql1 extends DBOperate {
  override def insert(): Unit = {
    println("Mysql1 插入数据")
  }
}