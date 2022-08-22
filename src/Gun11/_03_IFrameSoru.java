package Gun11;
/*
   1-driver.get("http://chercher.tech/practice/frames"); sayfasına gidiniz.
   2-Inputa ülke adı yazınız
   3-CheckBox ı çekleyiniz.
   4-Select in 4.elemanını seçiniz.
 */

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _03_IFrameSoru extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://chercher.tech/practice/frames");
        driver.switchTo().frame(0); // frame 1
        WebElement input= driver.findElement(By.cssSelector("b[id='topic']~input"));
        input.sendKeys("Türkiye");

        driver.switchTo().frame(0); // frame1 in içinde frame3 geçiş yaptım
        WebElement checkbox= driver.findElement(By.id("a"));
        checkbox.click();

        driver.switchTo().defaultContent(); // ilk ana sayfaya geri dön
        //driver.switchTo().parentFrame(); bu şekilde 2 kere geri gelerekte ana sayfaya dönebilirdim
        //driver.switchTo().parentFrame();
        driver.switchTo().frame(1); // frame2
        WebElement menu= driver.findElement(By.id("animals"));
        Select ddmenu=new Select(menu);
        ddmenu.selectByIndex(ddmenu.getOptions().size()-1); // son elemanı seçtik

        // 4. elemanı böyle de bulabilirdik
        //Actions aksiyonlar=new Actions(driver);
        //Action aksiyon = aksiyonlar.sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).build();
        //aksiyon.perform();

        //aksiyon = aksiyonlar.sendKeys(Keys.ENTER).build();
        //aksiyon.perform();

        BekleKapat();
    }
}
