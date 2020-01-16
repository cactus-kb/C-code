package com.Servlet;

import com.Dao.UserDao;
import com.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/login")
public class LoginServlet extends HttpServlet {
    private UserDao userDao = new UserDao();
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        //从发送过来的请求中获取用户填写的用户名和密码
        //记得设置编码形式
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        if (username == null || username.isEmpty()) {
            System.out.println("用户名不能为空");
            resp.sendRedirect("/login.html");
            return;
        }
        String password = req.getParameter("password");
        if (password == null || password.isEmpty()) {
            System.out.println("密码不能为空");
            resp.sendRedirect("/login.html");
            return;
        }

        //从持久层获取用户信息
        User user = null;
        try {
            user = userDao.findUserByUsernameAndPassword(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(500, e.getMessage());
        }
        if (user == null) {
            //用户名或者密码错误
            System.out.println("没有这个用户");
            return;
        }

        //把当前登录的用户信息放入session中，”user“是key
        //利用session + cookie做到HTTP协议的会话保持功能
        //这里的HttpSession会自己去设置cookie信息
        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        //登陆成功后，跳转到首页
        resp.sendRedirect(resp.encodeRedirectURL("/profile"));
    }
}
