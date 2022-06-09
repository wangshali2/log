package socket.udp;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

/**
 * DatagramSocket
 * 解释：此类表示用来发送和接收数据报包的套接字
 * 位置：java.net.DatagramSocket
 * 构造器：
 * 发送端构造器:public DatagramSocket()构造数据报套接字并将其绑定到本地主机上任何可用的端口
 * 接收端构造器:public DatagramSocket(int port)创建数据报套接字并将其绑定到本地主机上的指定端口
 * 方法:
 * public void receive(DatagramPacket p)从此套接字接收数据报包。
 * public void send(DatagramPacket p)从此套接字发送数据报包
 * <p>
 * <p>
 * DatagramPacket
 * 解释：此类表示数据报包
 * 位置：java.net.DatagramPacket
 * 构造器：
 * 发送端：public DatagramPacket(byte[] buf,int length,InetAddress address,int port)构造数据报包，用来将长度为 length 的包发送到指定主机上的指定端口号
 * 接收端：public DatagramPacket(byte[] buf,int length)构造 DatagramPacket，用来接收长度为 length 的数据包
 * <p>
 * 方法：
 * public InetAddress getAddress()返回某台机器的 IP 地址
 * public byte[] getData()返回数据缓冲区
 * public int getLength()返回将要发送或接收到的数据的长度
 * <p>
 * <p>
 * UDP程序的步骤：
 * 1.创建UDP接受端对象DatagramSocket,并指定端口号
 * 2.根据数据包构造器需要创建数据包对象DatagramPacket所需的数据，字节数组，长度
 * 3.创建数据包对象
 * 4.将数据包作为参数，调用UDP接受端对象的方法receive（）；
 * 5.解析数据包
 * 6.关闭资源
 */
public class Receive {
    public static void main(String[] args) throws IOException {

        DatagramSocket ds = new DatagramSocket(9999);

        byte[] bytes = new byte[1024];
        int len = bytes.length;
        DatagramPacket dp = new DatagramPacket(bytes, len);

        ds.receive(dp);

        //获取ip
        String ip = dp.getAddress().getHostAddress();
        //获取数据包
        byte[] data = dp.getData();
        int len2 = dp.getLength();
        System.out.println(ip + ":" + new String(data, 0, len2));

        ds.close();

    }
}
