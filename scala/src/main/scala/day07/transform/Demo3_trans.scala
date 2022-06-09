package day07.transform

/**
 * @author wsl
 * @version 2022-04-28-11:43
 *          隐式类
 *          需求：扩展新功能，不希望改动源代码
 *          1.在源类汇总直接加功能
 *          2.继承扩展功能
 *          3.混入特质
 *          4.声明隐式函数和扩展类
 *          5.声明隐式类
 */
object Demo3_trans {
  def main(args: Array[String]): Unit = {

    //混入特质
    val user = new User1 with UserExtend2
    user.updateNew()
    user.updateNew2()
    user.updateNew3()

  }

  /**
   * 4.隐式类
   * @param user
   * 1.不能放在顶级位置
   * 2.隐式类必须具有主构造函数，且主构造函数包含第一个参数
   */
  implicit class UserExtend3(user: User1){
    def updateNew3(): Unit ={
      println("update data new3  ***")
    }
  }
}


class User1 extends UserExtend {
  def insert(): Unit = {
    println("insert user ....")
  }

  /**
   * 1.直接增加功能
   */
  def update(): Unit = {
    println("update data ...")
  }
}

/**
 * 2.提取扩展功能，User类继承扩展类
 */
class UserExtend {
  def updateNew(): Unit = {
    println("update data new !!!")
  }
}

/**
 * 3.将扩展功能声明成特质，创建对象时混入特质
 */
trait UserExtend2{
  def updateNew2(): Unit = {
    println("update data new2  ~~~~~")
  }
}

