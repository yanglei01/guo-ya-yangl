package com.guoyasoft.gyautotest.ui.testCase.test.testcase;

import static org.openqa.selenium.support.PageFactory.initElements;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoHome;
import com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages.TaoBaoLogin;
import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
import org.testng.annotations.Test;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:59
 **/
public class TestLogin extends BaseUI {
  //淘宝
  /*@Test
  public void testLogin(){
    driver.get("https://www.taobao.com/");
    TaoBaoHome taoBaoHome= PageFactory.initElements(driver,TaoBaoHome.class);//PageFactory初始化页面
    taoBaoHome.clickLoginLink();//每个元素的操作方法
    TaoBaoLogin taoBaoLogin = PageFactory.initElements(driver, TaoBaoLogin.class);
    taoBaoLogin.clickLoginIcon();
    taoBaoLogin.sendKeysLoginUserName("18236792080");
    taoBaoLogin.sendKeysInputPassword("abcd891304");
    taoBaoLogin.clickLoginButton();

    //断言
    boolean actual = driver.getPageSource().contains("我的淘宝");
    Assert.assertEquals(actual,true);

  }*/

    @Test
  public void testIos(){
      driver.get("https://www.taobao.com/");
      TaoBaoLogin taoBaoLogin =PageFactory.initElements(driver,TaoBaoLogin.class);
      taoBaoLogin.sendKeysInputText("手机");
      taoBaoLogin.clickSearch();
      taoBaoLogin.clickIosImg();
      boolean actual = driver.getPageSource().contains("手机淘宝");
      Assert.assertEquals(actual,true);
      sleep(2);
    }

}
