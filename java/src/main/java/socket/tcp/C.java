package socket.tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

/**
 * 客户端
 * socket:
 * 解释：实现tcp协议的客户端对应的类
 * 位置：java.net.ServerSocket
 * 构造器： IP，端口号需要
 * <p>
 * public Socket(String host, int port)创建一个流套接字并将其连接到指定主机上的指定端口号。
 * public InputStream getInputStream()返回此套接字的输入流。
 * public OutputStream getOutputStream()返回此套接字的输出流
 * <p>
 * 完成TCP客户端步骤：
 * 1.创建TCP客户端对象Socket，指定服务端的IP地址，服务端的端口号；
 * 2.获取客户端输出流对象；
 * 3.从客户端让服务端开始发送数据；
 * 4.关闭资源
 */
public class C {
    public static void main(String[] args) throws IOException {

        Socket socket = new Socket("127.0.0.1", 9999);

        OutputStream write = socket.getOutputStream();
        write.write("我的世界".getBytes());

        write.close();
        socket.close();

    }
}
