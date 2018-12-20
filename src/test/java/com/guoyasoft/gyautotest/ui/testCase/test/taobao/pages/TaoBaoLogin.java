package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import javax.xml.xpath.XPath;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:06
 **/
public class TaoBaoLogin extends BaseUI {//把TaoBaoLogin封装成一个类

/* //淘宝
  @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")//通过@FindBy注解来定位
  private WebElement loginLink;//存到变量loginLink

  @FindBy(xpath = "//i[@id=\"J_Quick2Static\"]")
  private WebElement loginIcon;

  @FindBy(xpath = "//input[@id='TPL_username_1']")
  private WebElement loginUserName;

  @FindBy(xpath = "//input[@id='TPL_password_1']")
  private WebElement loginPwd;

  @FindBy(xpath = "//button[@id='J_SubmitStatic']")
  private WebElement loginButton;

  public void clickLoginIcon() {
    click(loginIcon);
  }

  public void sendKeysLoginUserName(String text) {
    sendKeys(loginUserName,text);
  }

  public void sendKeysInputPassword(String text) {
    sendKeys(loginPwd, text);
  }

  public void clickLoginButton() {
    click(loginButton);
  }*/


  @FindBy(xpath = "//input[@id=\"q\"]")
  private WebElement inputText;

  @FindBy(xpath = "//button[text()='搜索']")
  private WebElement search;

  @FindBy(xpath = "//img[@alt=\"苹果 iPhone 8 Plus \"]")
  private  WebElement iosImg;

  public void sendKeysInputText(String text){sendKeys(inputText,text);}
  public void clickSearch(){click(search);}
  public void clickIosImg(){click(iosImg);}



 /* @FindBy(xpath = "//a[contains(text(),'你好，请登录')]")
  private WebElement loginLink01;

  @FindBy(xpath = "//a[contains(text(),'账户登录')]")
  private WebElement loginIcon01;

  @FindBy(xpath = "//input[@id=\"loginname\"]")
  private WebElement loginName01;

  @FindBy(xpath = "//input[@id=\"nloginpwd\"]")
  private WebElement nLoginPwd01;

  @FindBy(xpath = "//a[@id=\"loginsubmit\"]")
  private WebElement loginSubmit01;

  public void clickLoginLink01(){
    click(loginLink01);
  }
  public void clickLoginIcon01(){
    click(loginIcon01);
  }
  public void sendKeysLoginName01(String text){
    sendKeys(loginName01,text);
  }
  public void sendKeysNLoginPwd01(String text){
    sendKeys(nLoginPwd01, text);
  }
  public void clickLoginSubmit01(){
    click(loginSubmit01);
  }*/


}
