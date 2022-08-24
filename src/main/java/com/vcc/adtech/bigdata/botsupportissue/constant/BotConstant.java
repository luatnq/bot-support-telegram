package com.vcc.adtech.bigdata.botsupportissue.constant;

import org.springframework.beans.factory.annotation.Value;

public class BotConstant {
  public static class CommandConstant{
    public static String PREFIX_MENTION = "@";
    public static String PREFIX_COMMAND = "/";
    public static String REGEX_SPACE = "-";
    public static String CREATE_ISSUES = "/createissuse";
  }

  public static class MySQLConstant{
    @Value("${app.mysql.user}")
    public static String USER;
    @Value("${app.mysql.pass}")
    public static String PASS;
    @Value("${app.mysql.url}")
    public static String URL;
  }
}
