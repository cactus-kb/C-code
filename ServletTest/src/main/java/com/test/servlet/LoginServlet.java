package com.test.servlet;

import com.test.dao.UserDao;
import com.test.model.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.sql.SQLException;

@WebServlet("/Login")
public class LoginServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String password = req.getParameter("password");
        UserDao userDao = new UserDao();
        User user = null;
        try {
            user = userDao.findUserByUsernameAndPassword(username, password);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(500, e.getMessage());
            return;
        }
        if (user == null) {
            System.out.println("没有该用户");
            return;
        }
        HttpSession session = req.getSession();
        System.out.println(session.getId());
        session.setAttribute("user", user);
        resp.sendRedirect("/success");
    }
}
