package com.company.util;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StringUtilTest {

  @Test
  public void testWithoutTrainingSlash_withSlash() {
    String expected = "Text";
    String actual = StringUtil.withoutTrainingSlash("Text/");
    assertEquals(expected, actual);
  }

  @Test
  public void testWithoutTrainingSlash_noSlash() {
    String expected = "Text";
    String actual = StringUtil.withoutTrainingSlash("Text");
    assertEquals(expected, actual);
  }
}
