package CssOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://demoqa.com/text-box");
        WebElement fullname= driver.findElement(By.cssSelector("[type='text'][placeholder='Full Name']"));
        fullname.sendKeys("Automation");
        Bekle(1);
        WebElement email= driver.findElement(By.cssSelector("[type='email'][placeholder='name@example.com']"));
        email.sendKeys("Testing@gmail.com");
        Bekle(1);
        WebElement currentaddress= driver.findElement(By.cssSelector("[rows='5'][cols='20'][placeholder='Current Address']"));
        currentaddress.sendKeys("Testing Current Address");
        Bekle(1);
        WebElement permanentaddress= driver.findElement(By.cssSelector("#permanentAddress"));
        permanentaddress.sendKeys("Testing Permanent Address");
        Bekle(2);
        WebElement submit= driver.findElement(By.cssSelector("#submit"));
        submit.click();
        Bekle(1)
        ;
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
