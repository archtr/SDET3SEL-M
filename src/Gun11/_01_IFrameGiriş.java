package Gun11;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_IFrameGiriş extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://chercher.tech/practice/frames");

        driver.switchTo().frame(0); // frame 1

        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().parentFrame(); // geldiği yere geri dön (1 basamak geri dön)
        driver.switchTo().defaultContent(); // ilk ana sayfaya geri dön



        BekleKapat();
    }
}
