package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _06_IntroAlertPart3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme3= driver.findElement(By.cssSelector("[onclick='myPromptFunction()']"));
        clickme3.click();
        Bekle(2);

        System.out.println(driver.switchTo().alert().getText());
        Bekle(2);
        driver.switchTo().alert().sendKeys("selim");
        Bekle(2);
        driver.switchTo().alert().accept();
        Bekle(2);

        WebElement olusantext= driver.findElement(By.id("prompt-demo"));
        Assert.assertTrue(olusantext.getText().contains("selim"));

        BekleKapat();
    }
}
