package SeleniumOdev01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru02 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        WebElement userName=driver.findElement(By.id("username"));
        userName.sendKeys("ttechno@gmail.com");
        WebElement password=driver.findElement(By.id("password"));
        password.sendKeys("techno123.");
        WebElement signin=driver.findElement(By.id("log-in"));
        signin.click();

        WebElement time=driver.findElement(By.id("time"));
        if(time.getText().contains("Your nearest branch closes in: 30m 5s"))
            System.out.println("test passed");
        else
            System.out.println("test failed");


        BekleKapat();

    }
}
