package day06

/**
 * @author wsl
 * @version 2022-04-26-17:10
 *
 */
object Demo5_match {
  def main(args: Array[String]): Unit = {

    // 将如下list中的tuple的第二个元素乘以2
    val list = List( ("a", 1), ("b", 2), ("c", 3) )
    //1.常规写法
    list.map(t=>(t._1,t._2*2))

    //2.模式匹配
    val list1 = list.map {
      case ( k, v ) => {  (k, v*2)  }
    }
    println(list1)

    //获取map中的value的第二个元素乘以2的结果
    val map=Map("a"->("aa",1),"b"->("bb",2),"c"->("cc",3))
    //1.常规
    println(map.map(t => (t._1, (t._2._1, t._2._2 * 2))))

    //2.模式匹配
    val map2=map.map{
      case (ok,(ink,inv))=>{(ok,(ink,inv*2))}
    }
    println(map2)
  }
}
