package com.anhtester.Bai6_Webelement;

import com.anhtester.Bai5_locator.BT_LocatorsCRM_LearningLocators;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class DemoWebElementActions {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://crm.anhtester.com/admin/authentication");

        //senkey, click, clear
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputEmail)).clear();
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).clear();

        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputEmail)).sendKeys("admin@example.com");
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).sendKeys("123456");
        Thread.sleep(1000);
        //driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.buttonLogin)).click();
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).submit();



        //Close browser
        driver.quit();


    }
}
