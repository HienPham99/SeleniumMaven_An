package com.anhtester.Bai6_Webelement;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionCheck {

    public static void main(String[] args) {
        //khởi tạo browser
        WebDriver driver;
        driver= new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://anhtester.com/");


        //close browser
        driver.quit();

    }
}
