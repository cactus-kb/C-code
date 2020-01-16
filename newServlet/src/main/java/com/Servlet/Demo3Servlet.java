package com.Servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Date;

@WebServlet("/demo3")
public class Demo3Servlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        /*
        System.out.println("设置状态码");
        resp.setStatus(400);
        //resp.setStatus(400,"客户端错误");
        System.out.println("设置响应头");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        resp.setHeader("X-Room", "301");
        resp.setIntHeader("X-Count", 18);

        System.out.println("写入响应体");
        resp.getWriter().println("<h1>我自己写的：没有这个界面</h>");

        */

       // resp.sendError(404,"找不到");

        String location = resp.encodeRedirectURL("https://www.baidu.com");
        resp.sendRedirect(location);
    }
}
