package socket.udp;

import java.io.IOException;
import java.net.*;
import java.nio.charset.StandardCharsets;

/**
 * 1.创建UDP发送端对象DatagramSocket，空参
 * 2.根据数据包构造器需要创建数据包对象DatagramPacket所需的数据，字节数组，长度，IP地址对象，端口号
 * 3.创建数据包对象
 * 4.将数据包作为参数，调用UDP发送端端对象的send();
 * 5.关闭资源
 * <p>
 * InetAddress
 * 此类表示互联网协议 (IP) 地址。
 * java.net.InetAddress
 * 构造器私有
 * public static InetAddress getLocalHost()返回本地主机。
 * public static InetAddress getByName(String host)在给定主机名的情况下确定主机的 IP 地址。
 * public String getHostAddress()返回 IP 地址字符串（以文本表现形式）。
 * public String getHostName()获取此 IP 地址的主机名。
 */
public class Send {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket();

        byte[] bytes = "哈哈".getBytes();
        int len = bytes.length;
        InetAddress ip = InetAddress.getByName("127.0.0.1");
        DatagramPacket dp = new DatagramPacket(bytes, len, ip, 9999);
        ds.send(dp);

        ds.close();


        InetAddress host = InetAddress.getLocalHost();
        System.out.println(host);  //LAPTOP-2L6J4IS5/192.168.31.123
        System.out.println(host.getHostName());  //LAPTOP-2L6J4IS5
        System.out.println(host.getHostAddress());  //192.168.31.123

        InetAddress name = InetAddress.getByName("www.jd.com");
        System.out.println(name);  //www.jd.com/222.186.184.3
        System.out.println(name.getHostName());  //www.jd.com
        System.out.println(name.getHostAddress());  //222.186.184.3
    }
}
