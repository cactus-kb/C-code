--CREATE DATABASE blog_2020 CHARSET=utf8mb4;

CREATE TABLE user (
  id INT PRIMARY KEY AUTOINCREMENT,
  username VARCHAR(200) NOT NULL UNIQUE,
  nickname VARCHAR(200) NOT NULL,
  password CHAR(64) NOT NULL
);

CREATE TABLE article (
  id INT PRIMARY KEY AUTOINCREMENT,
  author_id INT NOT NULL,
  title VARCHAR(255) NOT NULL,
  content TEXT NOT NULL,
  published_at DATETIME NOT NULL
);

CREATE TABLE comment (
  id INT PRIMARY KEY AUTOINCREMENT,
  author_id INT NOT NULL,
  article_id INT NOT NULL,
  content VARCHAR(200),
  published_at DATETIME NOT NULL
);

CREATE TABLE user_like_article_relation (
  user_id INT NOT NULL,
  article_id INT NOT NULL,
  PRIMARY KEY (user_id, article_id)
);

-- 用户管理：1. 注册用户: username 重复
INSERT INTO users (username, nickname, password) VALUES (?, ?, ?);

-- 用户管理：2. 用户登陆
SELECT id, username, nickname FROM users WHERE username = ? AND password = ?;
