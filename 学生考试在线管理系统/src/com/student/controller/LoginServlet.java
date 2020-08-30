package com.student.controller;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.student.DAO.LoginDao;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //获取请求体中的数据
        String username=request.getParameter("username");
        String password=request.getParameter("password");
        String juese=request.getParameter("juese");
        //使用Dao类的方法进行登陆操作，并返回是否成功
        LoginDao dao=new LoginDao();
        int index=dao.login(username,password,juese);
        //将结果返回到响应体中
        PrintWriter pw=response.getWriter();
        if (index==1){
            request.getSession();
            response.sendRedirect("/myWeb/index.jsp");
        }else {
            response.setContentType("text/html;charset=utf-8");
            pw.print(index);
        }


    }

}
