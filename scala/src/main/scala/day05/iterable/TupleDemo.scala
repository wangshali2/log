package day05.iterable

/**
  * @author wsl
  * @version 2020-11-27
  *          Tuple:将多个无关的数据元素封装为一个整体。元素组合，元祖。最多放22个元素
  */
object TupleDemo {
  def main(args: Array[String]): Unit = {
    val tuple: (Int, String, String, Int) = (100, "zs", "bj", 30)

    //通过元素顺序获取元素
    println(tuple._1)
    println(tuple._2)
    println(tuple._3)


    //通过索引获取元素
    println(tuple.productElement(0))
    println(tuple)

    // 如果元组的元素只有两个，那么我们称之为对偶元组，也称之为键值对
    val kv: (String, Int) = ("a", 1)
    val kv1: (String, Int) = "a" -> 1
    println( kv eq kv1 )


  }
}
