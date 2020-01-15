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

@WebServlet("/register")
public class RegisterServlet extends HttpServlet{
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setCharacterEncoding("UTF-8");
        String username = req.getParameter("username");
        String nickname = req.getParameter("nickname");
        String password = req.getParameter("password");

        UserDao userDao = new UserDao();
        User user;

        try {
            user = userDao.registerUser(username, nickname, password);
        } catch (SQLException e) {
            e.printStackTrace();
            resp.sendError(500, e.getMessage());
            return;
        }

        HttpSession session = req.getSession();
        session.setAttribute("user", user);

        resp.sendRedirect("/success");
    }
}
