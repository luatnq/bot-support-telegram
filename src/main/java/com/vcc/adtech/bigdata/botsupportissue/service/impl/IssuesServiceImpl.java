package com.vcc.adtech.bigdata.botsupportissue.service.impl;

import com.vcc.adtech.bigdata.botsupportissue.connector.MySQLConnector;
import com.vcc.adtech.bigdata.botsupportissue.model.IssuesModel;
import com.vcc.adtech.bigdata.botsupportissue.service.IssuesService;
import com.vcc.adtech.bigdata.botsupportissue.utils.CommonUtils;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.stereotype.Service;

@Service
public class IssuesServiceImpl implements IssuesService {

  private final Logger log = LogManager.getLogger(IssuesServiceImpl.class);

  @Override
  public void createIssues(String text){
      log.info("(createIssues) text of command:{}", text);

      String[] paramIssueArr = CommonUtils.getDataFromText(text);
      System.out.println(paramIssueArr.toString());
      IssuesModel issuesModel = buildModel(paramIssueArr);

      System.out.println(issuesModel.toString());
  }

  public IssuesModel buildModel(String[] paramIssueArr){

      log.info("(buildModel) paramIssueArr:{}", paramIssueArr);

      IssuesModel issuesModel = new IssuesModel();
      issuesModel.setProjectId(Long.parseLong(paramIssueArr[1]));
      issuesModel.setTrackerId(Long.parseLong(paramIssueArr[2]));
      issuesModel.setStatusId(Long.parseLong(paramIssueArr[3]));
      issuesModel.setPriorityId(Long.parseLong(paramIssueArr[4]));
      issuesModel.setSubject(paramIssueArr[5]);
      issuesModel.setDescription(paramIssueArr[6]);
      issuesModel.setAssignedToId(Long.parseLong(paramIssueArr[7]));

      log.info("(buildModel) issuesModel:{}", issuesModel.toString());
      return issuesModel;
  }

}
