package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;

public class HandleDropdownDynamic extends BaseTest {

    public static void main(String[] args) {

        createBrowser();

        driver.get("https://techydevs.com/demos/themes/html/listhub-demo/listhub/index.html");
        sleep(3);

        driver.findElement(By.xpath("(//button[normalize-space()='Search Now']/parent::div)/preceding-sibling::div[1]")).click();
        sleep(1);
        driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys("F");
        sleep(2);
       // driver.findElement(By.xpath("(//span[normalize-space()='Select a Category']/parent::a)/following-sibling::div//input")).sendKeys(Keys.ENTER);

        driver.findElement(By.xpath("//li[normalize-space()='Fitness']")).click();//lấy giá trị theo text
        sleep(5);

        closedBrowser();
    }
}
