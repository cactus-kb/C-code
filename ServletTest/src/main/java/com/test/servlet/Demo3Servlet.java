package com.test.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;


public class Demo3Servlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //String location = resp.encodeRedirectURL("http://www.bitedu.vip");
        //resp.sendRedirect(location);
        //resp.setStatus(307);
        //resp.setHeader("Location", location);

        // 对比下和 setStatus 的区别即可
        //resp.sendError(404, "你肯定找不到我");

        /*
        System.out.println("设置状态码");
        resp.setStatus(404);

        System.out.println("设置响应头");
        resp.setContentType("text/html");
        resp.setCharacterEncoding("UTF-8");
        //resp.setHeader("Content-Type", "text/html");
        resp.setHeader("X-Room", "301");
        resp.setIntHeader("X-Count", 18);
        resp.setDateHeader("X-Now", new Date().getTime());

        System.out.println("写入响应体");
        resp.getWriter().println("<h1>我自己写的: 没有这个页面</h1>");
        */
    }


//    @Override
//    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        resp.sendError(404, "Not Found!");
//    }
//
//    @Override
//    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
//        doGet(req, resp);
//    }
}
