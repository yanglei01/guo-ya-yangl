package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 12:38
 **/
public class GuoYaLogin extends BaseUI {

  //定位用户名输入框
  @FindBy(xpath = "//input[@id='userName']")
  WebElement username;

  //定位密码输入框
  @FindBy(xpath = "//input[@id='password']")
  WebElement password;

  //定位登录按钮
  @FindBy(xpath = "//input[@id='loginBtn']")
  WebElement loginBtn;

  //登录方法
  public void login() {
    sendKeys(username, "yanglei");
    sendKeys(password,"12981x");
    click(loginBtn);
  }
}
