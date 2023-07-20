package com.anhtester.Bai7_WebDriver;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

import java.time.Duration;

public class DemoSwitchNewWindow extends BaseTest {

    public static void main(String[] args) {

        createBrowser("firefox");

        //Navigate to a page
        driver.navigate().to("http://anhtester.com/");
        String mainWindow = driver.getWindowHandle();
        System.out.println(mainWindow);

        driver.switchTo().newWindow(WindowType.TAB);// .TAB: mở các domain trên cùng 1 cửa sổ (nhiều tab)
        //driver.switchTo().newWindow(WindowType.WINDOW); //mở nhiều domain trên nhiều cửa sổ khác nhau
        driver.navigate().to("http://www.google.com");

        sleep(2);
        driver.switchTo().window(mainWindow);//chuyển về cửa sỏ được set mặc định ban đầu


        sleep(1);
        closedBrowser();
    }

}
