package com.company.util;

public class StringUtil {
  private StringUtil() {

  }

  public static String withoutTrainingSlash(String text) {
    if (text.endsWith("/")) {
      return text.substring(0, text.length() - 1);
    } else {
      return text;
    }
  }
}
