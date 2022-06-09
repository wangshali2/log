package day01

import java.io.{BufferedReader, InputStreamReader}
import java.net.{ServerSocket, Socket}

/**
 * @author wsl
 * @version 2022-04-15-14:36
 *          用的还是java的io
 */
object demo_Server {
  def main(args: Array[String]): Unit = {


    val server = new ServerSocket(9999)
    println("等待客户端连接")
    val socket: Socket = server.accept()
    val reader = new BufferedReader(new InputStreamReader(socket.getInputStream, "UTF_8"))
    var s: String = ""
    var flag = true
    while (flag) {
      s = reader.readLine()
      if (s != null) {
        println("客户端发送消息：" + s)
      } else {
        flag = false
      }

      reader.close()
      socket.close()
    }
  }
}
