package com.Dao;

import com.model.Article;
import com.model.User;
import com.util.DataBase;

import java.sql.*;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Collection;
import java.util.Date;

public class ArticleDao {
    public Article publishArticle(User user, String title, String content) throws SQLException {
        Date now = new Date();
        DateFormat dateFormat = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String sql = "INSERT INTO article (author_id, title, content, published_at) VALUES (?, ?, ?, ?)";

        try (Connection connection = DataBase.getInstance().getConnection()) {
            try (PreparedStatement statement = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
                statement.setInt(1, user.getId());
                statement.setString(2, title);
                statement.setString(3, content);
                statement.setString(4, dateFormat.format(now));

                statement.executeUpdate();
                try (ResultSet rs = statement.getGeneratedKeys()) {
                    rs.next();
                    int id = rs.getInt(1);

                    return new Article(id, user, title, content, now);
                }
            }
        }
    }

}
