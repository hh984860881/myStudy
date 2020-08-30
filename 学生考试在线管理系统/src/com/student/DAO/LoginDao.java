package com.student.DAO;

import com.student.util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class LoginDao {
    public int login(String username,String password,String juese){
        Connection conn=null;
        PreparedStatement ps=null;
        ResultSet rs=null;
        String sql="";
        Integer num=0;
        try {
            conn= DBUtil.getConnection();
            switch (juese){
                case "student":
                    sql="select count(*) from student where userName=? and password=? ";
                    break;

                case "teacher":
                    sql="select count(*) from teacher where userName=? and password=? ";
                    break;
                case "admin":
                    sql="select count(*) from admin where userName=? and password=? ";
                    break;
            }
            ps=conn.prepareStatement(sql);
            ps.setString(1,username);
            ps.setString(2,password);
            rs=ps.executeQuery();
            while (rs.next()){
                num=Integer.valueOf(rs.getString("count(*)"));
                if (num==1){
                    num=1;
                }
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }finally {
            DBUtil.close(conn,ps,rs);
        }
        return num;

    }
}
