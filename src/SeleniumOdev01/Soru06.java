package SeleniumOdev01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru06 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement fakeAlert= driver.findElement(By.id("fakealerttest"));
        fakeAlert.click();
        WebElement modaldialog= driver.findElement(By.id("modaldialog"));
        modaldialog.click();
        WebElement ok= driver.findElement(By.id("dialog-ok"));
        ok.click();

        BekleKapat();

    }
}
