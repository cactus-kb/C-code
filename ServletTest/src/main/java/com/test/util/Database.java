package com.test.util;

import com.mysql.jdbc.jdbc2.optional.MysqlConnectionPoolDataSource;

import javax.sql.DataSource;

public class Database {
    private static DataSource instance = null;

    static {
        MysqlConnectionPoolDataSource mysqlDataSource = new MysqlConnectionPoolDataSource();
        mysqlDataSource.setServerName("localhost");
        mysqlDataSource.setPort(3306);
        mysqlDataSource.setUser("root");
        mysqlDataSource.setPassword("");
        mysqlDataSource.setDatabaseName("blog");
        mysqlDataSource.setUseSSL(false);
        mysqlDataSource.setCharacterEncoding("utf9");

        instance = mysqlDataSource;
    }

    public static DataSource getInstance() {
        return instance;
    }
}
