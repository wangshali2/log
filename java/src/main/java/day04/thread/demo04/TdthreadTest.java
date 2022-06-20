package day04.thread.demo04;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * @author wsl
 * @version 2020-09-19
 * 线程安全问题的解决方案
 * 1.同步代码块
 * 2.同步方法
 * 3.锁Locked
 * <p>
 * <p>
 * 同步 ：synchronized
 * 线程安全问题的解决方案1
 * 同步代码块：synchronized（锁）{可能存在线程安全的代码}
 * 在同步代码块中的代码同时只能被一条线程执行
 * 锁：同步代码块所在的方法是实例方法还是静态方法
 * 静态方法：当前类.class
 * 实例方法：当前类的对象：this
 * 其他类的对象：对象名字
 * <p>
 * 注意:多个线程必须是一把锁；任何一个类的对象，都可以当锁
 * <p>
 * 格式：synchronized (锁){
 * 可能存在线程安全的代码
 * }
 */
public class TdthreadTest {
    public static void main(String[] args) {
        for (int i0 = 0; i0 < 10; i0++) {
            final int index = i0;
            new Thread(() -> {
                try {
                    Class.forName("com.taosdata.jdbc.rs.RestfulDriver");
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                String jdbcUrl = "jdbc:TAOS-RS://172.31.0.18:6041/test?user=root&password=taosdata";
                Connection conn = null;
                try {
                    conn = DriverManager.getConnection(jdbcUrl);
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                Statement stmt = null;
                try {
                    stmt = conn.createStatement();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
                int start =(1000*index)+1;// index:0=1;index:1=1001;index:2=2001;index:3=3001; index:9=9001
                int end =(1000*(index+1));// index:0=1000;index:1=2000;index:2=3000; index:9=10000
                for (int i = start; i <= end; i++) {
                    String stableName = "stb_" + i;
                    for (int j = 0; j < 200; j++) {
                        String tableName = stableName + "_wsl_tb_" + j;
                        int ct = 0;
                        for (int i1 = 0; i1 < 10000; i1++) {
                            ct++;
                            try {
                                stmt.executeUpdate("INSERT INTO " + tableName + "  VALUES (now, 10.2, 219, 0.32);");
                            } catch (SQLException throwables) {
                                throwables.printStackTrace();
                            }
                        }
                        System.out.println("insert " + tableName + "--->" + ct);
                    }

                }
            }).start();
        }
    }
}
