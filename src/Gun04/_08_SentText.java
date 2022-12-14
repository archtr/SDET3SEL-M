package Gun04;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _08_SentText extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://demo.seleniumeasy.com/basic-first-form-demo.html");

        WebElement element=driver.findElement(By.linkText("No, thanks!"));
        element.click();

        WebElement txtbox= driver.findElement(By.id("user-message"));
        txtbox.sendKeys("merhaba selenium");

        WebElement btn=driver.findElement(By.className("btn-default"));
        btn.click();

        WebElement msg=driver.findElement(By.id("display"));
        if(msg.getText().contains("merhaba selenium"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

        BekleKapat();
    }
}
