package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import java.util.List;

public class HandleDropdownStatic extends BaseTest {

    public static void main(String[] args) {

        createBrowser();
        driver.get("http://demo.seleniumeasy.com/basic-select-dropdown-demo.html");

        //Handle Dropdown List tĩnh
        Select select = new Select(driver.findElement(By.xpath("//select[@id='select-demo']")));

        System.out.println("Giá trị default là: " + select.getFirstSelectedOption().getText());

        //1.Chọn theo Text
        select.selectByVisibleText("Thursday");
        sleep(1);

        //Kiểm tra chọn đúng giá trị trên chưa
        System.out.println("Giá trị đã chọn là: " + select.getFirstSelectedOption().getText());
        //Assert.assertEquals(select.getFirstSelectedOption().getText(), "Thursday"); //So sánh kết quả thực tế hệ thống chọn có = giá trị mong muốn không.

        //2.Chọn theo index
        select.selectByIndex(2);
        System.out.println("Giá trị đã chọn theo index là: " + select.getFirstSelectedOption().getText());
        sleep(1);

        //3.Chọn theo value
        select.selectByValue("Sunday");
        System.out.println("Giá trị đã chọn là: " + select.getFirstSelectedOption().getText());

        System.out.println("******************************************");

        //Giá trị chọn đc duyệt theo FOR earch (Cải tiến) và In giá trị được chọn ra
        List<WebElement> listOptions = select.getAllSelectedOptions();
        for (WebElement element : listOptions) {
            System.out.println(element.getText());
        }

        System.out.println("******************************************");

        //Mutil select options
        Select selectMultiple = new Select(driver.findElement(By.xpath("//select[@id='multi-select']")));
        selectMultiple.selectByIndex(1);
        selectMultiple.selectByIndex(3);
        selectMultiple.selectByIndex(5);

        //Giá trị chọn đc duyệt theo FOR earch (Cải tiến) và In giá trị được chọn ra
        List<WebElement> listOptionsMultiple = selectMultiple.getAllSelectedOptions();
        for (WebElement element : listOptionsMultiple) {
            System.out.println(element.getText());
        }


        closedBrowser();
    }
}
