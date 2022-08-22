package CssOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demo.applitools.com/");
        WebElement username= driver.findElement(By.cssSelector("[type='text'][placeholder='Enter your username']"));
        username.sendKeys("ttechno@gmail.com");
        Bekle(1);
        WebElement password= driver.findElement(By.cssSelector("[type='password'][placeholder='Enter your password']"));
        password.sendKeys("techno123.");
        Bekle(1);
        WebElement signin= driver.findElement(By.cssSelector("#log-in"));
        signin.click();
        Bekle(1);
        WebElement time= driver.findElement(By.cssSelector("#time"));
        if (time.getText().contains("in: 30m 5s"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();
    }
}
