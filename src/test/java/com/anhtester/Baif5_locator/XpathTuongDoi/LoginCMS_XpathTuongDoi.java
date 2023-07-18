package com.anhtester.Baif5_locator.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class LoginCMS_XpathTuongDoi {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser: Chrome Driver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open web
        driver.get("https://crm.anhtester.com/admin/authentication");
        //admin@example.com/123456

        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        Thread.sleep(2000);



        //Close web
        driver.quit();

    }

    }
