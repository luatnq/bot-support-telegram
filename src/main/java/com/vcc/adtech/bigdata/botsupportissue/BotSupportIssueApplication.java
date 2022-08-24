package com.vcc.adtech.bigdata.botsupportissue;

import com.vcc.adtech.bigdata.botsupportissue.bot.MyBot;
//import com.vcc.adtech.bigdata.botsupportissuse.bot.NhDarkBot;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.telegram.telegrambots.meta.TelegramBotsApi;
import org.telegram.telegrambots.meta.exceptions.TelegramApiException;
import org.telegram.telegrambots.updatesreceivers.DefaultBotSession;

@SpringBootApplication
public class BotSupportIssueApplication {

  public static void main(String[] args) throws TelegramApiException {
    SpringApplication.run(BotSupportIssueApplication.class, args);

    TelegramBotsApi botsApi = new TelegramBotsApi(DefaultBotSession.class);
    botsApi.registerBot(new MyBot());
  }

}
