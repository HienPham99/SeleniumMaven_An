package com.anhtester.Bai5_locator;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

import java.time.Duration;

public class LoginCMS {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser: Chrome Driver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open web
        driver.get("https://cms.anhtester.com/login");
        //admin@example.com/123456
        //Định vị các Element trên trang Login CMS
        //1. Textbox Email:
        driver.findElement(By.id("email")).sendKeys("admin@example.com");

        //2. Textbox Password:
        driver.findElement(By.name("password")).sendKeys("123456");

        //4. Link text/Partial link text "Forgot Password"
        //driver.findElement(By.linkText("Forgot password ?")).click();
        //driver.findElement(By.partialLinkText("Forgot")).click();

        //3. btn Login
        driver.findElement(By.tagName("button")).click();

        Thread.sleep(2000);


        //Close web
        driver.quit();

    }

    private static void Driver() {
    }
}
