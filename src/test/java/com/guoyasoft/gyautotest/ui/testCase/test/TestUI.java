package com.guoyasoft.gyautotest.ui.testCase.test;

import com.guoyasoft.gyautotest.ui.common.BaseUI;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.interactions.SourceType;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;


/**
 * @program: gy-auto-test
 * @description:
 * @author: Administrator
 * @create: 2018-12-13 10:16
 **/
public class TestUI extends BaseUI {

   @Test
     //文本输入框>
   public  void testTextInput(){
     //打开网址
     driver.get("https://www.taobao.com/");
     //定位页面元素
     WebElement text=driver.findElement(By.xpath("//input[@id='q']"));
      // 清空输入框
      text.clear();
      //网输入框中填值
      text.sendKeys("手机");
      //等待两秒
      sleep(2);
   }
   @Test
   //按钮
   public void testButton(){
     //承接上面的方法
     testTextInput();
     //定位页面元素
     WebElement button = driver.findElement(By.xpath("//button[@class='btn-search tb-bg']"));
     //点击
     click(button);
//     button.click();
     //等待2秒
     sleep(2);
   }
   @Test
   //下拉框
   public void testSelect(){
     driver.get("file:///E:/demo(2).html");
     WebElement select = driver.findElement(By.xpath("//select"));

     Select select1 = new Select(select);

     select1.selectByVisibleText("苹果");//可见的文本
     sleep(2);
     select1.selectByIndex(1);//序号
     sleep(2);
     select1.selectByValue("juzi");//值
     sleep(2);

   }
   @Test
    //超链接
    public void testLink(){

     driver.get("https://www.taobao.com/");

     WebElement link= driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]/a[contains(text(),'女装')]"));
     //点击
     link.click();
     //ctrl + 点击
//     Actions actions = new Actions(driver);
//     actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();
     //shift+点击
     Actions actions = new Actions(driver);
     actions.keyDown(Keys.CONTROL).click(link).keyUp(Keys.CONTROL).perform();

     sleep(2);
   }
    @Test
//搞过了
     //导航栏
   public void  testNavigate(){
     driver.get("https://www.baidu.com/");
     sleep(2);
     driver.get("https://www.jd.com/");
     sleep(2);
     driver.navigate().back();//后退
     sleep(2);
     driver.navigate().forward();//前进
     sleep(2);
     driver.navigate().refresh();//刷新
     sleep(2);
     driver.navigate().to("https://www.taobao.com/");//去往某个网址
  }

   @Test
   //guoya登录
   public void guoYaLogin() {
     //打开网页
     driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/login.jsp");
     sleep(2);
     //定位元素
     WebElement text = driver.findElement(By.xpath("//input[@id='userName']"));
     WebElement pwdText = driver.findElement(By.xpath("//input[@id='password']"));
     WebElement check = driver.findElement(By.xpath("//input[@id='checkCode']"));
     WebElement button = driver.findElement(By.xpath("//input[@id='loginBtn']"));
     //操作
     text.clear();
     text.sendKeys("yanglei");
     sleep(1);
     pwdText.clear();
     pwdText.sendKeys("abcdefg");
     sleep(1);
     check.clear();
     check.sendKeys("12345");
     sleep(1);
     button.click();
     sleep(2);
   }
   @Test
   //guoya 注册
  public void  guoYaSignUp(){
     driver.get("http://www.guoyasoft.com:8080/guoya-medium/jsp/user/signUp.jsp");
     WebElement user = driver.findElement(By.xpath("//input[@id='userName']"));
     WebElement name = driver.findElement(By.xpath("//input[@id='realName']"));
     WebElement pwd = driver.findElement(By.xpath("//input[@id='password']"));
     WebElement pwd2 = driver.findElement(By.xpath("//input[@id='password2']"));
     WebElement phone = driver.findElement(By.xpath("//input[@id='phone']"));
     WebElement age = driver.findElement(By.xpath("//input[@id='age']"));
     WebElement check = driver.findElement(By.xpath("//input[@id='checkCode']"));
     WebElement submit = driver.findElement(By.xpath("//input[@id='submitBtn']"));

     user.clear();
     user.sendKeys("yanglei");
     name.clear();
     name.sendKeys("杨磊");
     pwd.clear();
     pwd.sendKeys("abcdefg");
     pwd2.clear();
     pwd2.sendKeys("abcdefg");
     phone.clear();
     phone.sendKeys("18236792010");
     age.clear();
     age.sendKeys("27");
     check.clear();
     check.sendKeys("1234");
     submit.click();
     sleep(2);

     //弹框
     Alert alert = driver.switchTo().alert();
     //确定
     alert.accept();
     //取消
    /* alert.dismiss();

     alert.getText();
     alert.sendKeys();*/
    sleep(2);//搞过了




   }
    @Test
      //新的标签页窗口打开
      public void testWindowSwitch(){
     driver.get("https://www.taobao.com/");
     driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'女装')]")).click();
     driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'男装')]")).click();
     driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'内衣')]")).click();
     driver.findElement(By.xpath("//li[@aria-label=\"查看更多\"]//a[contains(text(),'鞋靴')]")).click();
      //获取所有窗口的句柄
      Set<String> Handles = driver.getWindowHandles();
      for (String h:Handles){
        driver.switchTo().window(h);

        if (driver.getTitle().contains("淘宝女鞋")){
          break;
        }

      }
    }
    @Test
       //容器
      public void testContainer(){
     //数组
      //声明
     String[] strings={"11","22","333","444"};
     //说明这个容器有四条数据
      //String[] strings1 = new String[4];
     //取用
      strings[0]="555";
      System.out.println(strings[0]);

      //二维数组
     String[][]str2={{"1","2","3","4"},{"11","22","33","44"},{"111","222","333","444"}};
     //二维数组相当于有三个一维数组，一维数组里有四条数据
      //String[][]str21 = new String[3][4];

      System.out.println(str2[1][2]);//下标填值减1(这说明是二维数组的第二个数组，一维数组的第三个数据)

      //新建一个容器
      List<String> list = new ArrayList<String>();
      //往容器最后位置存数据
      list.add("111");
      list.add("222");
      list.add("333");
      //在第二条数据插入"444"（在列表中某个位置存数据）
      list.add(1,"444");

      System.out.println(list.get(0));
      System.out.println(list.get(1));
      System.out.println(list.get(2));
      System.out.println(list.get(3));

      //新建一个容器
      Map<String,String> map = new HashMap<String,String>();

      map.put("姓名","薛鹏垒");
      map.put("性别","男");
      map.put("年龄","22");
      System.out.println(map.get("姓名"));
      /*map.remove("姓名");
      System.out.println(map.get("姓名"));*/

     //新建一个set容器
      Set<String> set = new HashSet<>();

      set.add("1111");
      set.add("1111");
      set.add("1111");
//      set.remove("1111");
      for (String s:set){
        System.out.println(s);
      }

   }
   @Test
     //测试iframe标签内的元素
     public void testIframe(){
     driver.get("http://www.guoyasoft.com:8080/guoya-client-qa/");
     driver.findElement(By.xpath("//a[contains(text(),'查询面试')]")).click();

     WebElement iframe = driver.findElement((By.xpath("(//iframe)[1]")));//通过xpath路径定位这个iframe标签

     driver.switchTo().frame(iframe);//切换到iframe标签内
     driver.findElement(By.xpath("//*[@id=\"form\"]/div[2]/div[4]/button")).click();
     sleep(2);
     driver.switchTo().defaultContent();//切换到默认界面
     sleep(2);

   }

      @Test
      public void testFor(){
      int[] arr = {1, 2, 3, 4, 5, 6, 7, 8,};
     /* for (int i = 0; i <= arr.length-1; i++) {
        System.out.println(arr[i]);
    }*/
    for (int i:arr){System.out.println(i);};
  }
    @Test
    //新建容器然后对元素循环
  public void testForMap(){
     Map<String,String> map = new HashMap<String,String>();
     map.put("姓名","杨磊");
     map.put("性别","男");
     map.put("身高","175");
     map.put("年龄","26");
     for (String key:map.keySet()){
       System.out.print(map.get(key));
       System.out.println();
     }



   }
   @Test
   //99算法
   public void Mu99(){
     for (int i=1;i<=9;i++){
       for (int j=1;j<=i;j++){
        System.out.print(j + " * " + i + " = " + i*j + "\t");
         /*System.out.printf("%d * %d = %2d",j,i,i*j);
         System.out.print("\t");*/
       }
         System.out.println();

     }
   }
   @Test
   //if语句
  public void testIf(){
     int money=1;
     if(money>=2){
       System.out.println("可以买笔");
     }else {
       System.out.println("回家拿钱");
     }

     int yuE = 200;
     int yuEBao =3000;
     int yinHangKa=20000;
     int buy =2000 ;
     if (yuE>=buy){
       System.out.println("余额扣除" +buy);
     }else if (yuEBao>=buy){
       System.out.println("余额宝扣除" +buy);
     }else if (yinHangKa>=buy){
       System.out.println("银行卡扣除" +buy);
     }else {
       System.out.println("扣款失败");//以上都不满足则执行else
     }
   }
   @Test
   //冒泡排序
   public void testSort(){
     int[] arr={17,21,14,32,8,19} ;
     //外层循环
     for (int i =arr.length -1;i>=1;i--){
       //内层循环
       for (int j = 0;j<=i-1;j++){
         if (arr[j]>=arr[j+1]){
           int a=arr[j];
           arr[j] =arr[j+1];
           arr[j+1] =a;
         }
       }
     }
     for (int b:arr){
       System.out.print(b+"\t");
     }
   }

   @Test
   public void testAssert(){
     driver.get("https://www.taobao.com/");
     driver.findElement(By.xpath("//*[@id=\"J_SiteNavLogin\"]/div[1]/div[1]/a[1]")).click();
     sleep(2);
     driver.findElement(By.xpath("//i[@id=\"J_Quick2Static\"]")).click();
     sleep(2);
     WebElement useName = driver.findElement(By.xpath("//input[@id='TPL_username_1']"));
     useName.clear();
     sleep(1);
     useName.sendKeys("18236792080");
     WebElement pwd = driver.findElement(By.xpath("//input[@id='TPL_password_1']"));
     pwd.clear();
     pwd.sendKeys("abcd891304");
     driver.findElement(By.xpath("//button[@id='J_SubmitStatic']")).click();
     boolean actual = driver.getPageSource().contains("我的淘宝");
     Assert.assertEquals(actual,true);
   }










}
