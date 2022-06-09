package day05.iterable

/**
 * @author wsl
 * @version 2022-04-16-21:32
 *          不可变数组
 */
object Arr_Immutable {
  def main(args: Array[String]): Unit = {

    //创建数组1
    val arr = new Array[Int](6)

    //创建数组2
    val arr0: Array[Int] = Array(11, 22, 33, 44)

    //赋值
    arr(4) = 1
    arr(1) = 2
    arr(2) = 3
    //直接修改值
    arr(2) = 5
    //方法修改值
    arr.update(2, 4)

    //遍历1
    println(arr.mkString(","))
    //遍历2
    for (elem <- arr) {
      print(elem + ".")
    }

    def printx(elem: Int): Unit = {
      print(elem + "-")
    }

    //遍历3
    arr.foreach(printx)
    arr.foreach(x => {
      print(x + "_")
    })
    arr.foreach(print(_)) //匿名函数
    arr.foreach(print)

    //添加新元素 从右到左
    val arrNew: Array[Int] = arr :+ 5
    println(arrNew.mkString(","))
    println(arr == arrNew) //false
    val arrNew2: Array[Int] = 1 +: arr
    println(arrNew2.mkString(","))

    //添加集合
    val arr2: Array[Int] = arr ++: arrNew
    println(arr2 eq arr) //false
    val arr3: Array[Int] = arr ++ arrNew
    println(arr3 eq arr) //false
    println(arr3.mkString("*-", "-", "-*"))
    //合并数组
    val arr4: Array[Int] = Array.concat(arr, arrNew)
    arr4.foreach(print)

    println(arr.min)
    println(arr.max)
    println(arr.toList) //List(0, 2, 4, 4, 0)
    println(arr.toIterable) //WrappedArray(0, 2, 4, 4, 0)

    //多维数组
    val marr: Array[Array[Int]] = Array.ofDim[Int](3, 4)
    marr.foreach(list => list.foreach(print))

    //创建指定范围内的数组
    val arr5: Array[Int] = Array.range(3, 5) //不包括5
    println(arr5.mkString(","))

    //创建并填充指定数量的数组
    val arr6: Array[Int] = Array.fill[Int](5)(1) //5个1
    println(arr6.mkString(","))

    val str = new Array[String](3)
    //在最后添加
    val str1: Array[String] = str.:+("wsl")
    println(str1.mkString(","))
    //在最前添加
    val str2: Array[String] = str.+:("wsl")
    println(str2.mkString(","))


  }
}
