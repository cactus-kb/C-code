package com.Dao;

import com.model.User;
import com.util.DataBase;

import javax.sql.DataSource;
import java.io.IOException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class UserDao {

    public User registerUser(String username, String nickname,  String password) throws SQLException {
       password = encrypted(password);

        String sql = "INSERT INTO user (username, nickname, password) VALUES (?, ?, ?)";

        try (Connection connection = DataBase.getInstance().getConnection()) {
            //Statement.RETURN_GENERATED_KEYS 表示返回插入的自增ID值
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setString(1, username);
                statement.setString(2, nickname);
                statement.setString(3, password);

                statement.executeUpdate();

                try (ResultSet rs = statement.getGeneratedKeys()) {
                    rs.next();
                    int id = rs.getInt(1);
                    return new User(id, username, nickname);
                }

            }
        } catch (SQLException e) {
            //如果是用户名重复异常，属于客户端的问题，特殊处理下
            if (e.getMessage().contains("Duplicate entry")) {
                return null;
            }

            throw e;
        }
    }


    public User findUserByUsernameAndPassword(String username, String password) throws SQLException{
      String sql = "SELECT id, username, nickname FROM user WHERE username = ? AND password = ?";

      try (Connection connection = DataBase.getInstance().getConnection()) {
          try (PreparedStatement statement = connection.prepareStatement(sql)) {
              statement.setString(1, username);
              statement.setString(2, password);

              try (ResultSet rs = statement.executeQuery()) {
                  //因为我们只期望有两种情况：1.有一行 2.一行都没有
                  //所以，通过if 而不需要while 就可以区分出来了
                  if (!rs.next()) {
                      return null;
                  }

                  int id = rs.getInt(1);
                  //username我们有了，不需要取
                  String nickname = rs.getString(3);

                  return new User(id, username, nickname);
              }
          }
      }
    }

    private String encrypted(String password) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            byte[] input = password.getBytes("UTF-8");
            byte[] output = messageDigest.digest(input);
            StringBuilder sb = new StringBuilder();
            for (byte b : output) {
                sb.append(String.format("%02x",b));
            }
            return sb.toString();
        } catch (NoSuchAlgorithmException | IOException e) {
            //理论上永远不应该抛出
            e.printStackTrace();
            return "";
        }
    }
}
