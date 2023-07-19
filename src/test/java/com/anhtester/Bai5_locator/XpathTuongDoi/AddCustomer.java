package com.anhtester.Bai5_locator.XpathTuongDoi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class AddCustomer {

    public static void main(String[] args) throws InterruptedException {

        //Khởi tạo Browser: Chrome Driver, EdgeDriver, FirefoxDriver
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        //Open web
        driver.get("https://crm.anhtester.com/admin/authentication");
        //admin@example.com/123456

        //Login CRM
        driver.findElement(By.xpath("//input[@id='email']")).sendKeys("admin@example.com");
        driver.findElement(By.xpath("//input[@id='password']")).sendKeys("123456");
        driver.findElement(By.xpath("//button[@type='submit']")).click();

        //Add customer
        driver.findElement(By.xpath("//span[normalize-space()='Customers']")).click();
        Thread.sleep(2000);

        //Click New Customer btn_Lấy theo contains
        driver.findElement(By.xpath("//a[contains(normalize-space(),'New Customer')]")).click();

        driver.findElement(By.xpath("//input[@id='company']")).sendKeys("Merkle");
        Thread.sleep(2000);
        driver.findElement(By.xpath("//input[@id='vat']")).sendKeys("1");
        driver.findElement(By.xpath("//button[contains(normalize-space(),'Save and create')]")).click();
        //driver.findElement(By.xpath("//button[contains(text(),'Save and create')]")).click();
        Thread.sleep(2000);


        //Close web
        driver.quit();

    }


}
