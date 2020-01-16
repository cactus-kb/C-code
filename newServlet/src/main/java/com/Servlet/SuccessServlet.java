package com.Servlet;

import com.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/profile")
public class SuccessServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
       resp.setContentType("text/html");
       resp.setCharacterEncoding("UTF-8");
       PrintWriter writer = resp.getWriter();
        HttpSession session = req.getSession();
        User user = (User) session.getAttribute("user");
        if (user == null) {
            System.out.println("从没有登陆过");
            writer.println("<h1>用户未登录</h1>");
        } else {
            System.out.println(user);
            writer.printf("<h1>%d</h1>%n", user.getId());
            writer.printf("<h2>%s</h2>%n", user.getUsername());
            writer.printf("<h3>%s</h3>%n", user.getNickname());
        }
    }
}
