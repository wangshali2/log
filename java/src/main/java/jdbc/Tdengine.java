package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @Author wsl
 * @Date 2021-10-13
 * @Description
 * @Version 1.0
 * <p>
 * 1.hosts配置
 * 2.不同版本的url不同
 */
public class Tdengine {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {


        Class.forName("com.taosdata.jdbc.rs.RestfulDriver");
        String jdbcUrl = "jdbc:TAOS-RS://172.31.0.220:6041/test?user=root&password=taosdata"; //在url里写了库默认就是用这个库
        Connection conn = DriverManager.getConnection(jdbcUrl);
        Statement stmt = conn.createStatement();
        stmt.executeUpdate("use _dGVzdF9zaHVhaQ");
        stmt.executeUpdate("show tables");
        // 1.create database
      //  stmt.executeUpdate("create database if not exists test");
        // 2.use database
      //  stmt.executeUpdate("use test");
        //3.create stable
      //  stmt.executeUpdate("CREATE STABLE stb  (ts timestamp, current float, voltage int, phase float) TAGS (location binary(64), groupId int);");
        //4.create table
      //  stmt.executeUpdate("create table if not exists  tb USING stb TAGS (1, 1);");
        //5.插入数据
      //  stmt.executeUpdate("INSERT INTO stb_4418_wsl_tb_88  VALUES (now, 10.2, 219, 0.32)");
        //6.批插入
      //  stmt.addBatch("INSERT INTO stb_4418_wsl_tb_88  VALUES (now, 10.2, 219, 0.32);");
      //  stmt.executeBatch();

    }
}
