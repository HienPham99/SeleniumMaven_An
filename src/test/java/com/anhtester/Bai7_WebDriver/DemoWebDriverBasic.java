package com.anhtester.Bai7_WebDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import java.time.Duration;

public class DemoWebDriverBasic {

    public static void main(String[] args) throws InterruptedException {

        WebDriver driver = new FirefoxDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));

        //Navigate to a page
        driver.navigate().to("http://anhtester.com/");
        driver.findElement(By.xpath("//a[@id='btn-login']")).click();
        Thread.sleep(1000);


        //Điều hướng về lịch sử trang trước đó
        driver.navigate().back();

        //Điều hướng đến trang tiếp theo
        driver.navigate().forward();

        Thread.sleep(2000);

        //Làm mới trang hiện tại
        driver.navigate().refresh();

        //Get title cuủa page
        String title=driver.getTitle();

        //Get current URL
        String url=driver.getCurrentUrl();

        //Get curent page HTML source
        String source=driver.getPageSource();

        System.out.println("Title: "+ title);
        System.out.println("Current URL: "+ url);
        System.out.println("Page source: "+ source);


        driver.quit();




    }
}
