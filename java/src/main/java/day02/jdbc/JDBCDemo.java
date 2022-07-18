package day02.jdbc;

import java.sql.*;

/**
 * ①.Driver接口：是所有驱动程序需要实现的接口。这个接口是提供给数据库厂商使用的，不同数据库厂商提供不同的实现；由驱动程序管理器类(DriverManager)去调用这些Driver实现。
 * Oracle的驱动：oracle.jdbc.driver.OracleDriver
 * mySql的驱动： com.mysql.jdbc.Driver
 * <p>
 * ② DriverManager 管理一组 JDBC 驱动程序的基本服务工具类。构造器：私有化。
 * getConnection(String url,String user,String password) 获取数据库连接对象。
 * <p>
 * ③Connection 接口 无构造器  与特定数据库的连接。
 * 1.close()立即释放资源
 * 2.commit()事务提交
 * 3.rollback()事务回滚
 * 4.createStatement()创建一个执行sql对象
 * 5.prepareStatement(String sql) 创建一个预编译的sql对象
 * 6.setAutoCommit(boolean autoCommit)将自动提交
 * <p>
 *
 * ===================================================================================================
 * <p>
 * JDBC 1。0 开发步骤：用Statement
 * 1. 导入jar包 mysql-connector-java-5.1.36-bin.jar复制到libs,右键add as lib；
 * 2. 注册驱动 Class.forName("com.mysql.jdbc.Driver")   mysql可以省略，其他不可以;
 * 3. 获取数据库连接对象Connection;
 * 4. 获取执行sql的对象 Statement;
 * 5. 定义并初始化SQL(增、删、改);
 * 6. 执行SQL;
 * 7. 释放资源;
 */


public class JDBCDemo {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {

        //2.注册驱动
        Class.forName("com.mysql.jdbc.Driver");
        String url = "jdbc:mysql://172.31.0.81:3306/bigdata";
        String user = "matrix";
        String password = "7xNetworks@C0M";

        //3.获取数据库连接对象
        Connection conn = DriverManager.getConnection(url, user, password);

        //4.获取执行sql的对象 Statement
        Statement state = conn.createStatement();

        //5.定义sql  增、删、改
        state.executeUpdate("insert into wsl (id,name) values(96,'马尔扎哈');");

        //6.执行
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

















