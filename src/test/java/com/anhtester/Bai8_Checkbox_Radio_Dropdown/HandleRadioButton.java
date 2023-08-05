package com.anhtester.Bai8_Checkbox_Radio_Dropdown;

import com.anhtester.common.BaseTest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;

public class HandleRadioButton extends BaseTest {

    public static void main(String[] args) {

        createBrowser();

        driver.get("http://demo.seleniumeasy.com/basic-radiobutton-demo.html");

        //Handle Radio
        //Kiểm tra Radio Male đã đc chọn chưa
        boolean checkRadioMale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male: " + checkRadioMale);

        //Kiểm tra Radio Female đã đc chọn chưa
        boolean checkRadioFemale = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female: " + checkRadioFemale);

        //Click radio Male
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).click();

        //Kiểm tra Radio Male sau khi click
        boolean checkRadioMaleAfterSelect = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male after select: " + checkRadioMaleAfterSelect);

        //Click radio Female
        driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).click();

        //Kiểm tra trạng thái hoạt động 2 radio giới tính (Sex) Male và Female
        boolean checkRadioMaleAfterSelect2 = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Male']")).isSelected();
        System.out.println("Male after select 2: " + checkRadioMaleAfterSelect2);
        boolean checkRadioFemaleAfterSelect = driver.findElement(By.xpath("//div[normalize-space()='Radio Button Demo']/following-sibling::div//input[@value='Female']")).isSelected();
        System.out.println("Female after select: " + checkRadioFemaleAfterSelect);

        //Handle multi radio button
        //Kiểm tra các radio buttn đã được click hay chưa (trước khi chọn)
        List<WebElement> listRadio = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio total: " + listRadio.size());

        for (int i = 0; i < listRadio.size(); i++) {
            System.out.println("Radio thứ " + (i + 1) + " :" + listRadio.get(i).isSelected());
        }

        //Click chọn 1 radio btn
        listRadio.get(2).click();//Click chọn radio thứ 3 (tương ứng index 2 trong list)

        //Kiểm tra lại 3 radio sau khi chọn
        List<WebElement> listRadio2 = driver.findElements(By.xpath("//h4[normalize-space()='Age Group :']/following-sibling::label//input"));
        System.out.println("Radio total: " + listRadio2.size());

        for (int i = 0; i < listRadio2.size(); i++) {
            System.out.println("Radio thứ " + (i + 1) + ": " + listRadio2.get(i).isSelected());
        }


        closedBrowser();
    }

}
