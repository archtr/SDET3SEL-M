package XpathOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru1 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demoqa.com/text-box");
        WebElement fullname= driver.findElement(By.xpath("//*[@id='userName']"));
        fullname.sendKeys("Automation");
        Bekle(1);
        WebElement email= driver.findElement(By.xpath("//*[@id='userEmail']"));
        email.sendKeys("Testing@gmail.com");
        Bekle(1);
        WebElement currentaddress= driver.findElement(By.xpath("//*[@id='currentAddress']"));
        currentaddress.sendKeys("Testing Current Address");
        Bekle(1);
        WebElement permanentaddress= driver.findElement(By.xpath("//*[@id='permanentAddress']"));
        permanentaddress.sendKeys("Testing Permanent Address");
        Bekle(3);
        WebElement submit= driver.findElement(By.xpath("//*[@id='submit']"));
        submit.click();
        Bekle(1);
        WebElement name=driver.findElement(By.xpath("//*[@id='name']"));
        WebElement emailchechk= driver.findElement(By.xpath("//*[@id='email']"));
        if (name.getText().contains("Automation"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        if (emailchechk.getText().contains("Testing"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");


        BekleKapat();
    }
}
