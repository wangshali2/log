package day08.conf

import scala.collection.mutable.ListBuffer

class Task extends Serializable {

  var data:ListBuffer[Int] = null

  var logic:ListBuffer[Int]=>Int = null

  def cal(): Int ={
    logic(data)
  }
}
