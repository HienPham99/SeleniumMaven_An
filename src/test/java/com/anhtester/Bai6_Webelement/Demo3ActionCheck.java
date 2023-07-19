package com.anhtester.Bai6_Webelement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class Demo3ActionCheck {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo browser
        WebDriver driver;
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://anhtester.com/");

        WebElement tagH1= driver.findElement(By.xpath("//h1[normalize-space()='Anh Tester Automation Testing']"));

        boolean checkDisplay = tagH1.isDisplayed();//trả True/false
        System.out.println(checkDisplay);

        driver.get("https://angular-reactive-forms-zvzqvd.stackblitz.io/");

        driver.findElement(By.xpath("//span[normalize-space()='Run this project']")).click();
        WebElement buttonSubmit= driver.findElement(By.xpath("//button[normalize-space()='Submit']"));

        buttonSubmit.isEnabled();

        if (buttonSubmit.isEnabled()==false){
            System.out.println("Trả về là true");
        }else {
            System.out.println("Trả về là false");
        }



        Thread.sleep(2000);
        //close browser
        driver.quit();

    }
}
