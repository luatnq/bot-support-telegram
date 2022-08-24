package com.vcc.adtech.bigdata.botsupportissue.connector;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class MySQLConnector {
  public static final Logger logger = LogManager.getLogger(MySQLConnector.class);

  static {
    try {
      Class.forName("com.mysql.jdbc.Driver");
    } catch (ClassNotFoundException e) {
      e.printStackTrace();
      logger.error("can not connect to database!");
    }
  }

  public static Connection getConnection(String url, String username, String password) {
    Connection conn = null;

    try {
      conn = DriverManager.getConnection(url, username, password);
      logger.info("connect to mysql successfully!");
    } catch (SQLException e) {
      e.printStackTrace();
    }

    return conn;
  }
}
