package com.imooc.jdbc.demo01;

import org.junit.Test;
import java.sql.*;


public class JdbcDemo01 {

    @Test
    /*
        JDBC入门程序
     */
    public static void main(String[] args) throws Exception {

        //1、导入驱动jar包
        //2、注册驱动
        Class.forName("com.mysql.jdbc.Driver");// 可以不写
        //3、获取数据库的连接对象
        Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test1", "root", "a68910392");
        //4、定义sql语句
        String sql = "update user set age = 18 where id = 1";
        //5、获取执行sql的对象
        Statement stmt = conn.createStatement();
        //6、来执行sql
        int count = stmt.executeUpdate(sql);
        //7、处理结果
        System.out.println(count);
        //8、释放资源
        stmt.close();
        conn.close();
    }


    }

