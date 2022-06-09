package socket.tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;

/**
 * ServerSocket
 * 解释：实现tcp协议的服务端对应的类
 * 位置：java.net.ServerSocket
 * 构造器：public ServerSocket(int port)创建绑定到特定端口的服务器套接字，协议和Ip地址不需要
 * 端口号0-65535
 * public Socket accept()侦听并接受到此套接字的连接
 * <p>
 * 完成TCP服务端步骤：
 * 1.创建TCP服务端对象ServerSocket，指定端口号；
 * 2.让服务端处于监听状态，获取客户端对象；
 * 3.获取客户端输入流对象，堆获取到的客户端对象进行解析
 * 4.关闭资源
 */
public class S {
    public static void main(String[] args) throws IOException {

        ServerSocket ss = new ServerSocket(9999);

        InputStream reader = ss.accept().getInputStream();

        byte[] b=new byte[1024];
        int len;
        while ((len = reader.read(b)) != -1) {
            System.out.println(new String(b,0,len));
        }

        reader.close();
        ss.close();
    }
}
