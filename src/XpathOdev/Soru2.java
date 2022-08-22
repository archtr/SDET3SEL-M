package XpathOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.applitools.com/");
        WebElement username= driver.findElement(By.xpath("//*[@id='username']"));
        username.sendKeys("ttechno@gmail.com");
        Bekle(1);
        WebElement password= driver.findElement(By.xpath("//*[@id='password']"));
        password.sendKeys("techno123.");
        Bekle(1);
        WebElement signin= driver.findElement(By.xpath("//*[@id='log-in']"));
        signin.click();
        Bekle(1);
        WebElement time= driver.findElement(By.xpath("//*[@id='time']"));
        if (time.getText().contains("in: 30m 5s"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();



    }
}
