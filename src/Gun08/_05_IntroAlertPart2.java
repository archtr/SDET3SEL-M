package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _05_IntroAlertPart2 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme2= driver.findElement(By.cssSelector("[class='btn btn-default btn-lg']"));
        clickme2.click();
        Bekle(2);

        driver.switchTo().alert().dismiss();
        Bekle(2);


        BekleKapat();
    }
}
