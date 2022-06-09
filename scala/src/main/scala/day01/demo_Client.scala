package day01

import java.io.OutputStreamWriter
import java.net.Socket

/**
 * @author wsl
 * @version 2022-04-15-14:36
 */
object demo_Client {
  def main(args: Array[String]): Unit = {

    val socket = new Socket("localhost", 9999)
    val writer = new OutputStreamWriter(socket.getOutputStream)
    writer.write("hello")
    writer.flush()
    writer.close()
  }


}
