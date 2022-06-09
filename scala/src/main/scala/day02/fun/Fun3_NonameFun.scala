package day02.fun

/**
 * @author wsl
 * @version 2022-04-15-19:23
 *          匿名函数
 */
object Fun3_NonameFun {
  def main(args: Array[String]): Unit = {

    //1.实现计算的功能，可能的功能有 + - *  /
    def cal(f: (Int, Int) => Int, x: Int, y: Int): Int = {
      f(x, y)
    }

    println(cal((i: Int, j: Int) => {
      i + j
    }, 10, 20))
    println(cal((i, j) => i + j, 10, 20))
    println(cal(_ + _, 10, 20))
    println(cal(_ * _, 10, 20))
    println(cal(_ / _, 10, 20))

    //2.把一个任意的数字A通过转换后得到它的2倍
    def fun(x: Int): Int = {
      x * 2
    }

    println(fun(3))

    //3.如果上一题想将数字A转换为任意数据B,转换规则自己定义,该如何声明
    def fun2(num: Int, f: Int => Any) = {
      f(num)
    }

    println(fun2(2, _ * 2))
    println(fun2(2, _.toString))

    //4.过滤指定的参数
    def fun4(words: String, f: String => Boolean): String = {
      var result = ""
      val str = words.split(" ")
      for (word <- str) {  //foreach
        if (f(word)) { //判断返回值是否为true,本题是否以's'开头
          result += word + ","   //如果是，输出
        }
      }
      result.substring(0, result.length - 1) //去掉字符串最后的,
    }

    println(fun4("com atguigu scala shell", _.startsWith("s")))  //scala,shell

  }
}
