package day02.jdbc;

import java.sql.*;

/**
 * ①.Driver 接口
 * 1.java.sql.Driver 接口是所有 JDBC 驱动程序需要实现的接口。这个接口是提供给数据库厂商使用的，不同数据库厂商提供不同的实现；
 * 2.在程序中不需要直接去访问实现了 Driver 接口的类，而是由驱动程序管理器类(java.sql.DriverManager)去调用这些Driver实现。
 * Oracle的驱动：oracle.jdbc.driver.OracleDriver
 * mySql的驱动： com.mysql.jdbc.Driver
 * <p>
 * ② DriverManager
 * 位置：java.sql.DriverManager
 * 解释：管理一组 JDBC 驱动程序的基本服务工具类。
 * 构造器：私有化
 * 方法：public static Connection getConnection(String url,String user,String password) 获取数据库URL的连接的Connection对象。
 * <p>
 * ③Connection 接口 无构造器
 * 位置：java.sql.Connection
 * 解释：与特定数据库的连接。
 * 1.void close()立即释放此 Connection 对象的数据库和 JDBC 资源
 * 2.void commit()事务提交
 * 3.void rollback()事务回滚
 * 4.Statement createStatement()创建一个数据库发送对象Statement来将SQL语句发送到数据库
 * 5.PreparedStatement prepareStatement(String sql)创建一个数据库发送对象prepareStatement来将SQL语句发送到数据库
 * 6.void setAutoCommit(boolean autoCommit)将此连接的自动提交模式设置为给定状态true表示启动自动提交模式
 * <p>
 * ④. Statement(SQL拼接和注入问题) 接口，没有构造器
 * 位置：java.sql.Statement
 * 解释：SQL语句的发送对象，用于执行静态SQL语句(给定好的SQL语句)并返回它所生成结果的对象
 * void close()立即释放此 Statement 对象的数据库和 JDBC 资源
 * ResultSet executeQuery(String sql)向数据库发送查询的方法，返回的是一张表放在set里；
 * int executeUpdate(String sql)向数据库发送增删改的方法，
 * int[] executeBatch()将一批命令提交给数据库来执行，如果全部命令执行成功，则返回更新计数组成的数组
 * <p>
 * ⑤. PreparedStatement  extends Statement
 * 位置：java.sql.PreparedStatement
 * 解释：表示预编译的 SQL 语句的对象,(预编译：准备操作的SQL语句，但是SQL里面数据未定)
 * int executeUpdate() 操作SQL增删改的方法
 * ResultSet executeQuery()造作SQL查询的方法
 * void setObject(int parameterIndex,Object x)使用给定对象设置指定参数的值。第一个参数:将后面的参数添加到第几个?问号处,第二个参数:存入SQL语句中的值
 * void addBatch()将一组参数添加到此 PreparedStatement 对象的批处理命令中
 * <p>
 * ⑥. ResultSet接口
 * 位置：java.sql.ResultSet
 * 解释：表示数据库结果集的数据表
 * executeQuery()获取对象
 * boolean next()将光标从当前位置向前移一行
 * Object getObject(String columnLabel)获取此ResultSet对象指定列的值，参数是数据库表的第几列（从1开始）。
 * <p>
 * ===================================================================================================
 * <p>
 * JDBC开发步骤：用Statement
 * 1.更新操作
 * 1. 将mysql-connector-java-5.1.36-bin.jar复制到libs,右键add as lib；
 * 2. 注册驱动类Class.forName("com.mysql.jdbc.Driver")   mysql可以省略，其他不可以;
 * 3. 通过DriverManager工具类调用静态方法getConnection获取数据库连接对象Connection;
 * 4. 通过Connection对象调用实例方法createStatement()获取SQL语句发送对象Statement;
 * 5. 定义并初始化SQL语句;
 * 6. 通过SQL语句发送对象Statement的实例方法executeUpdate(String sql)向数据库发送SQL语句;
 * 7. 关闭数据库;
 * <p>
 * 2.查询操作
 * 6.通过SQL语句发送对象Statement的实例方法executeQuery(String sql)向数据库发送SQL查询语句
 * 7.因为不知道结果集有多少数据，需要用while循环遍历，结果集.next()为false表示数据结束
 * 8.通过ResultSet实例方法getXXX(int 列)获取数据。
 * 9.关闭数据库
 */


public class JDBCTest1 {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://172.31.0.81:3306/bigdata";
        String user = "matrix";
        String password = "7xNetworks@C0M";

        Connection conn = DriverManager.getConnection(url, user, password);
        Statement state = conn.createStatement();

        //增、删、改
        state.executeUpdate("insert into wsl (id,name) values(96,'马尔扎哈');");

        //查
        ResultSet result = state.executeQuery("select * from wsl;");

        while (result.next()) {
            int id = result.getInt(1);
            String name = result.getString(2);
            int age = result.getInt(3);
            System.out.println(id + ":" + name + ":" + age);
        }


        System.out.println("=================================================");


        //增、删、改
        PreparedStatement ps = conn.prepareStatement("insert into wsl (id,name,age) values (?,?,?);");
        ps.setInt(1, 9);  //第一个？的值
        ps.setString(2, "vcv");
        ps.setInt(3, 20);
        ps.executeUpdate();


        //批处理
        for (int i = 0; i < 9; i++) {
            ps.setInt(1, i);
            ps.setString(2, "vcv_" + i);
            ps.setInt(3, 20);
            ps.addBatch();    //将预编译的SQL存放批处理对象中
        }
        ps.executeBatch();


        //查
        PreparedStatement ps2 = conn.prepareStatement("select * from wsl where id=?");
        ps2.setInt(1, 0);
        ResultSet result2 = ps2.executeQuery();

        while (result2.next()) {
            int id = result2.getInt(1);
            String name = result2.getString(2);
            int age = result2.getInt(3);
            System.out.println(id + ":" + name + ":" + age);
        }

        result2.close();
        result.close();
        state.close();
        ps2.close();
        ps.close();
        conn.close();
    }


}

















