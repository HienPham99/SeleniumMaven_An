package com.anhtester.Bai6_Webelement;

import com.anhtester.Bai5_locator.BT_LocatorsCRM_LearningLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo6ActionGet {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        String headerPage = driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.headersLoginPage)).getText();
        System.out.println(headerPage);

        String buttonLogin = driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.buttonLogin)).getCssValue("color");
        System.out.println(buttonLogin);

        String buttonLoginAttribute = driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.buttonLogin)).getAttribute("type");
        System.out.println(buttonLoginAttribute);

        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputEmail)).sendKeys("admin@example.com");
        System.out.println("Email value: "+driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputEmail)).getAttribute("value"));

        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).sendKeys("123456");
        System.out.println("Password value: "+driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).getAttribute("value"));
        Thread.sleep(1000);


        driver.get("https://anhtester.com/login");

        Thread.sleep(20000);
        System.out.println("Văn bản gợi ý: "+ driver.findElement(By.xpath("//input[@name='email']")).getAttribute("placeholder"));


        Thread.sleep(2000);
        driver.quit();
    }
}
