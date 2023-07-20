package com.anhtester.Bai7_WebDriver;

import com.anhtester.Bai5_locator.BT_LocatorsCRM_LearningLocators;
import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.Cookie;

import java.util.Set;

public class DemoCookies extends BaseTest {

    public static void main(String[] args) {
        createBrowser();

        driver.get("https://crm.anhtester.com/admin/authentication");
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputEmail)).sendKeys("admin@example.com");
        sleep(1);
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).sendKeys("123456");
        sleep(1);
        driver.findElement(By.xpath(BT_LocatorsCRM_LearningLocators.inputPassword)).submit();

        //Get all cookies
        Set<Cookie> cookies = driver.manage().getCookies();
        System.out.println("Cookies là: " + cookies.iterator().next().toString());

        //Get cookies current by name
        String cookiesCurrent = driver.manage().getCookieNamed("sp_session").getValue();
        System.out.println("Current Cookies vừa được get có value là: " + cookiesCurrent);

        closedBrowser();
    }


}
