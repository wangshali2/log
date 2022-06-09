package jdbc;


import com.alibaba.druid.pool.DruidDataSource;
import com.alibaba.druid.pool.DruidDataSourceFactory;

import javax.sql.DataSource;
import java.sql.*;
import java.util.Properties;

/**
 * 封装用德鲁伊连接数据池
 *
 * @author wsl
 * @version 2020-09-26
 * JDBC封装方法
 *
 * <p>
 * 操作数据库的连接类:只有SQL语句和？不同
 */
public class JDBCUtil {

    private static DataSource dds;


    private JDBCUtil() {
    }

    static {
        try {
            Properties pro = new Properties();
            pro.load(JDBCUtil.class.getClassLoader().getResourceAsStream("jdbc.properties"));
            dds = DruidDataSourceFactory.createDataSource(pro);

           // DruidDataSource dds2 = new DruidDataSource();
           // dds2.setUrl("");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static Connection getConn() throws SQLException {
        Connection conn = dds.getConnection();
        return conn;
    }

    public static void close(Connection conn) {
        if (conn == null) {
            throw new RuntimeException("连接对象失败");
        }

        try {
            conn.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void update(String sql, Object... arr) throws SQLException, ClassNotFoundException {
        Connection conn = JDBCUtil.getConnection();
        PreparedStatement ps = conn.prepareStatement(sql);
        //3.填充占位符  sql中占位符的个数与可变形参个数相同,传几个？就set几次

        for (int i = 0; i < arr.length; i++) {
            ps.setObject(i + 1, arr[i]);
        }

        ps.execute();
        JDBCUtil.closeResourse2(conn, ps);

    }


    public static Connection getConnection() throws SQLException, ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "WSL156230");

        return conn;
    }

    public static void closeResourse(Connection conn, Statement st, ResultSet rs) {
        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (rs != null) {
                rs.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }


    public static void closeResourse2(Connection conn, Statement st) {
        if (st == null) {
            throw new RuntimeException("Statement关闭失败");
        }

        try {
            if (st != null) {
                st.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }


    }
}
