package com.vcc.adtech.bigdata.botsupportissue.bot;

import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.CommandConstant.CREATE_ISSUES;

import com.vcc.adtech.bigdata.botsupportissue.service.IssuesService;
import com.vcc.adtech.bigdata.botsupportissue.service.impl.IssuesServiceImpl;
import com.vcc.adtech.bigdata.botsupportissue.utils.CommonUtils;
import org.springframework.beans.factory.annotation.Value;
import org.telegram.telegrambots.bots.TelegramLongPollingBot;
import org.telegram.telegrambots.meta.api.methods.send.SendMessage;
import org.telegram.telegrambots.meta.api.objects.Update;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;

public class MyBot extends TelegramLongPollingBot {

  private IssuesService issuesService = new IssuesServiceImpl();


  @Value("${app.bot.messageBot.username}")
  private String username;

  @Value("${app.bot.messageBot.token}")
  private String token;

  @Override
  public String getBotUsername() {
    return "job_message_bot";
  }

  @Override
  public String getBotToken() {
    return "5546630602:AAFGEREOQqeg9cmWxOnaa8P5d5SZXD80ibw";
  }


  /**
   * project_id
   * tracker_id
   * status_id
   * priority_id
   * subject
   * description
   * category_id
   * fixed_version_id - ID of the Target Versions (previously called 'Fixed Version' and still referred to as such in the API)
   * assigned_to_id - ID of the user to assign the issue to (currently no mechanism to assign by name)
   * parent_issue_id - ID of the parent issue
   * custom_fields - See Custom fields
   * watcher_user_ids - Array of user ids to add as watchers (since 2.3.0)
   * is_private - Use true or false to indicate whether the issue is private or not
   * estimated_hours - Number of hours estimated for issue
   * @param update
   */
  @Override
  public void onUpdateReceived(Update update) {
    System.out.println(update.getMessage().getText());
    String command = CommonUtils.getCommandFromText(update.getMessage().getText());
      SendMessage message = new SendMessage();
      if (command.equals(CREATE_ISSUES)){
        System.out.println(command);
        issuesService.createIssues(update.getMessage().getText());
      }

      message.setChatId(update.getMessage().getChatId());

//    try {
//      execute(message);
//    } catch (TelegramApiException e) {
//      throw new RuntimeException(e);
//    }
  }




}
