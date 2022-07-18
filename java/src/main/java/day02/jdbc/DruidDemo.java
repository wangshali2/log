package day02.jdbc;

import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidPooledConnection;

import java.sql.SQLException;

/**
 * @Author wsl
 * @Date 2021-08-13
 * JDBC 2.0  连接池的好处：
 * 1.设置固定数量的连接对象，可以保证服务器的稳定
 * 2.可以把配置信息独立到文本中，如果修改不要重启服务。
 */
public class DruidDemo {
    public static void main(String[] args) throws SQLException {

        //1.加入依赖
        //2.创建数据库连接池对象
        DruidDataSource dds = new DruidDataSource();
        dds.setDriverClassName("com.mysql.jdbc.Driver");
        dds.setUrl("jdbc:mysql://localhost:3306/db1");
        dds.setUsername("root");
        dds.setPassword("123456");
        dds.setInitialSize(5);//一开始提前申请好5个连接，不够了，重写申请
        dds.setMaxActive(10);//最大连接量
        dds.setMaxWait(1000);//最长连接等待时间

        for (int i = 1; i <= 15; i++) {

            //3.获取数据库连接对象
            DruidPooledConnection conn = dds.getConnection();
            System.out.println(conn);
            conn.close();        //连接后归还
        }
    }
}
