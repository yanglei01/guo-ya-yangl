package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-18 14:04
 **/
public class TaoBaoHome extends BaseUI {
  //淘宝
 @FindBy(xpath = "//a[contains(text(),'亲，请登录')]")//通过@FindBy注解来定位
  private WebElement loginLink;//存到变量loginLink

  @FindBy(xpath = "//input[@id=\"q\"]")
  private WebElement searchInput;

  @FindBy(xpath = "//button[contains(text(),'搜索')]")
  private WebElement searchButton;


  public void clickLoginLink(){
    click(loginLink);
  }
  public void search(String text){
    sendKeys(searchInput,text);
    click(searchButton);
  }




/*
//京东
  @FindBy(xpath = "//a[contains(text(),'你好，请登录')]")//通过@FindBy注解来定位
  private WebElement loginLink01;//存到变量loginLink

  @FindBy(xpath = "//input[@id=\"key\"]")
  private WebElement searchInput01;

  @FindBy(xpath = "//*[@id=\"search\"]/div/div[2]/button")
  private WebElement searchButton01;

  //封装元素操作方法
  public void clickLoginLink01(){
    click(loginLink01);
  }
  public void search01(String text){
    sendKeys(searchInput01,text);
    click(searchButton01);
  }
*/



}
