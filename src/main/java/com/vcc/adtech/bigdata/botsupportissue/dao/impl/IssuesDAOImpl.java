package com.vcc.adtech.bigdata.botsupportissue.dao.impl;

import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.MySQLConstant.PASS;
import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.MySQLConstant.URL;
import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.MySQLConstant.USER;

import com.vcc.adtech.bigdata.botsupportissue.connector.MySQLConnector;
import com.vcc.adtech.bigdata.botsupportissue.dao.IssuesDAO;
import com.vcc.adtech.bigdata.botsupportissue.model.IssuesModel;
import java.sql.Connection;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Repository;

@Repository
public class IssuesDAOImpl implements IssuesDAO {
  Logger log = LogManager.getLogger(IssuesDAOImpl.class);

  public void createIssues(IssuesModel issuesModel){
    log.info("(createIssues) issuesModel:{}", issuesModel);

    Connection conn = null;

    conn = MySQLConnector.getConnection(URL, USER, PASS);

  }

}
