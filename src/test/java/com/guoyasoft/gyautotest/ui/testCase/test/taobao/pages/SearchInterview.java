package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * @Auther: xuepl
 * @Date: 2018/12/19 14:14
 * @Description:
 */
public class SearchInterview extends BaseUI {

    @FindBy(xpath = "//input[@name=\"custmerName\"]")
    private WebElement studentNameInput;

    @FindBy(xpath = "//button[contains(text(),'查询')]")
    private WebElement searchButton;


    public void sendKeysStudentNameInput(String studentName){
        sendKeys(studentNameInput,studentName);
    }
    public void clickSearchButton(){
        click(searchButton);
    }


//作业检查
    @FindBy(xpath = "//img[@id=\"191_img\"]")
    private WebElement yanglei;



    public void clickyanglei(){

        String src = yanglei.getAttribute("src");
        System.out.println("属性src的属性值位:" + src);
        if(!src.contains("tick.jpg")) {
          click(yanglei);
        }
    }
  public void switchTowindous(WebDriver driver){
    driver.switchTo().defaultContent();
  }


}
