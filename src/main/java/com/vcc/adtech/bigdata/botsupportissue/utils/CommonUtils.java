package com.vcc.adtech.bigdata.botsupportissue.utils;

import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.CommandConstant.PREFIX_COMMAND;
import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.CommandConstant.PREFIX_MENTION;
import static com.vcc.adtech.bigdata.botsupportissue.constant.BotConstant.CommandConstant.REGEX_SPACE;

public class CommonUtils {

  public static String getCommandFromText(String text){

    String command = text;
    if (text.contains(PREFIX_MENTION)){
        command = text.split(PREFIX_MENTION)[0].trim();
    }
    if (command.contains(PREFIX_COMMAND)){
      command = command.split(REGEX_SPACE)[0];
    }
    return command;
  }

  public static String[] getDataFromText(String text){
    String command = text;
    if (text.contains(PREFIX_MENTION)){
      command = text.split(PREFIX_MENTION)[0].trim();
    }

    return command.split(REGEX_SPACE);
  }
}
