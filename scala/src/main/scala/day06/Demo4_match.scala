package day06

/**
 * @author wsl
 * @version 2022-04-26-17:02
 *          循环匹配
 */
object Demo4_match {
  def main(args: Array[String]): Unit = {

    val map = Map("A" -> 1, "B" -> 0, "C" -> 3)
    for ((k, v) <- map) { //直接将map中的k-v遍历出来
      println(k + " -> " + v) //3个
    }
    println("----------------------")

    //遍历value=0的 k-v ,如果v不是0,过滤
    for ((k, 0) <- map) {
      println(k + " --> " + 0) // B->0
    }
    println("----------------------")

    //if v == 0 是一个过滤的条件
    for ((k, v) <- map if v >= 1) {
      println(k + " ---> " + v) // A->1 和 c->33
    }
  }
}
