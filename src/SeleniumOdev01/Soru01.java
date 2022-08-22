package SeleniumOdev01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru01 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");
        WebElement fullname= driver.findElement(By.id("userName"));
        fullname.sendKeys("Automation");
        WebElement email= driver.findElement(By.id("userEmail"));
        email.sendKeys("Testing@gmail.com");
        WebElement currentAddress= driver.findElement(By.id("currentAddress"));
        currentAddress.sendKeys("Testing Current Address");
        WebElement permanentAddress= driver.findElement(By.id("permanentAddress"));
        permanentAddress.sendKeys("Testing Permanent Address");
        WebElement submitbtn= driver.findElement(By.id("submit"));
        submitbtn.click();

        if (fullname.getText().contains("Automation"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        if (email.getText().contains("Testing"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
