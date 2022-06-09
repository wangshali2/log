package day06

/**
 * @author wsl
 * @version 2022-04-26-14:45
 *          匹配对象实际就是匹配对象的属性值，可以通过apply()方法构建对象。
 *          模式匹配对象时默认会调用unapply()获取对象的属性值进行比对。
 */
object Demo2_match {
  def main(args: Array[String]): Unit = {
    println(describe(true))
    println(describe2(List(1, 2, 3)))
    println(describe2(Array(1, 2, 3)))
    println(describe2(Array('a', 'b'))) //something else
    println(describe3(List(1, 2, 3))) //something else
    println(describe3(List(1, 2, 3, 5, 6, 7))) //something else

    //匹配Array
    for (arr <- Array(Array(0), Array(1, 0), Array(0, 1, 0), Array(1, 1, 0), Array(1, 1, 0, 1), Array("hello", 90))) { // 对一个数组集合进行遍历
      val result = arr match {
        case Array(0) => "0" //匹配Array(0) 这个数组
        case Array(x, y) => x + "," + y //匹配有两个元素的数组，然后将将元素值赋给对应的x,y
        case Array(0, _*) => "以0开头的数组" //匹配以0开头和数组
        case _ => "something else"
      }
      println("result = " + result)
    }

    //匹配list
    for (list <- Array(List(0), List(1, 0), List(0, 0, 0), List(1, 0, 0), List(88))) {
      val result = list match {
        case List(0) => "0" //匹配List(0)
        case List(x, y) => x + "," + y //匹配有两个元素的List
        case List(0, _*) => "0 ..."
        case _ => "something else"
      }

      println(result)
    }

    //匹配元祖
    for (tuple <- Array((0, 1), (1, 0), (1, 1), (1, 0, 2))) {
      val result = tuple match {
        case (0, _) => "0 ..." //是第一个元素是0的元组
        case (y, 0) => "" + y + "0" // 匹配后一个元素是0的对偶元组
        case (a, b) => "" + a + " " + b
        case _ => "something else" //默认
      }
      println(result)
    }

    //匹配对象
    val user: User = User("zhangsan", 11)
    val result = user match {
      case User("zhangsan", 11) => "yes"
      case _ => "no"
    }

  }

  /**
   * 匹配常量
   *
   * @param x
   * @return
   */
  def describe(value: Any) = value match {
    case 5 => "Int five"
    case "hello" => "String hello"
    case true => "Boolean true"
    case '+' => "Char +"
  }

  /**
   * 匹配类型
   *
   * @param x
   * @return
   */
  def describe2(x: Any) = x match {
    case i: Int => "Int"
    case s: String => "String hello"
    case m: List[_] => "List" //_在泛型中表示任意类型，模式匹配的时候不考虑泛型
    case c: Array[Int] => "Array[Int]" //特殊：数组的泛型实际上数组的类型
    case someThing => "something else " + someThing // case _ =>
  }

  /**
   * 匹配list
   *
   * @param list
   */
  def describe3(list: Any) = list match {
    case first :: second :: rest => println(first + "-" + second + "-" + rest)
    case _ => println("something else")
  }

}


class User(val name: String, val age: Int)

object User {
  def apply(name: String, age: Int): User = new User(name, age)

  def unapply(user: User): Option[(String, Int)] = {
    if (user == null)
      None
    else
      Some(user.name, user.age)
  }
}
