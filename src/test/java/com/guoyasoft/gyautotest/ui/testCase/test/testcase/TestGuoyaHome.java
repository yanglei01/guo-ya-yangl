package com.guoyasoft.gyautotest.ui.testCase.test.testcase;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.GuoYaHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.GuoYaLogin;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.SearchInterview;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.ShangChuan;
import org.openqa.selenium.Alert;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 11:51
 **/
public class TestGuoyaHome extends BaseUI {

  @Test
  public void testInterview() {
    driver.get("http://www.guoyasoft.com:8080/guoya-client/jsp/user/login.jsp");
    GuoYaLogin guoya = PageFactory.initElements(driver, GuoYaLogin.class);
    guoya.login();
    sleep(2);
    GuoYaHome home = PageFactory.initElements(driver, GuoYaHome.class);
    home.clicktaskCheck();
    home.switchToIframe(driver);
    SearchInterview searchInterview = PageFactory.initElements(driver, SearchInterview.class);
    searchInterview.clickyanglei();
    sleep(5);
    searchInterview.switchTowindous(driver);
    home.clickuploadSummary();
    home.switchToIframe(driver);
    ShangChuan shangchuanwen = PageFactory.initElements(driver, ShangChuan.class);
    shangchuanwen.sendKeysuploadfile("C:\\Users\\Administrator\\Desktop\\木易十三.png");

    shangchuanwen.clickuploadSummary1bt(driver);
    sleep(2);








  }
}
