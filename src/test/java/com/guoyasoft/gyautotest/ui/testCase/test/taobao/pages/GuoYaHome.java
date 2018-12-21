package com.guoyasoft.gyautotest.ui.testCase.test.taobao.pages;

import com.guoyasoft.gyautotest.ui.common.BaseUI;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.nio.file.Watchable;

/**
 * @Auther: xuepl
 * @Date: 2018/12/19 14:04
 * @Description:
 */
public class GuoYaHome  extends BaseUI {
/*
    @FindBy(xpath = "//a[contains(text(),'课程查询')]")
    private WebElement classSearchLink;
    @FindBy(xpath = "//a[contains(text(),'面试统计')]")
    private WebElement interviewCountLink;
    @FindBy(xpath = "//a[contains(text(),'查询面试')]")
    private WebElement searchInterviewLink;
    @FindBy(xpath = "//iframe")
    private WebElement iframe;//注意iframe

    public void clickClassSearchLink(){
        click(classSearchLink);

    }
    public void clickInterviewCountLink(){
        click(interviewCountLink);

    }
    public void clickSearchInterviewLink(){
        click(searchInterviewLink);

    }
    //因为要用到driver，所以需要传一个driver参数
    public void switchToIframe(WebDriver driver){
        driver.switchTo().frame(iframe);
    }
*/




    @FindBy(xpath = "//a[contains(text(),'作业检查1811A')]")
    private WebElement taskCheck;
    @FindBy(xpath = "//a[contains(text(),'上传总结1811A')]")
    private WebElement uploadSummary;
    @FindBy(xpath = "//a[contains(text(),'面试查询')]")
    private WebElement Interviewenquiry;
    @FindBy(xpath = "//iframe[@id='iframepage']")
    private WebElement iframe;//注意iframe


    public void clicktaskCheck(){
        click(taskCheck);

    }
    public void clickuploadSummary(){
        click(uploadSummary);

    }
    public void clickInterviewenquiry(){
        click(Interviewenquiry);

    }
    //因为要用到driver，所以需要传一个driver参数
    public void switchToIframe(WebDriver driver){
        driver.switchTo().frame(iframe);
    }



}
