package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.Alert;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-21 14:33
 **/
public class ShangChuan extends BaseUI {

  @FindBy(xpath = "//input[@id=\"postFild\"]")
  private WebElement uploadfile;
  @FindBy(xpath = "//input[@id=\"uploadFileBtn\"]")
  private WebElement uploadSummary1bt;

  public void sendKeysuploadfile(String filepath) {
    sendKeys(uploadfile, filepath);

  }
  public void clickuploadSummary1bt(WebDriver driver){
    click(uploadSummary1bt);
    Alert alert = driver.switchTo().alert();
    alert.accept();
    //alert.dismiss();

  }

}
