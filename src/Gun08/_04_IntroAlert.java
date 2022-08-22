package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
/*
      Interview sorusu
      - Alertleri nasıl kullanırsın ?

      driver.switch().alert() bunula kullanırım.

      komutları;
      accept -> OK, TAMAM butonuna basmamızı sağlıyor.
      dismiss -> CANCEL, HAYIR yani olumsuz butonuna basmamızı sağlıyor.
      gettext -> alertin mesajını alıyoruz.
      SendKeys -> prompt(Alertin giriş kutusu olan hali) , yazı gönderiyoruz.
 */

public class _04_IntroAlert extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://demo.seleniumeasy.com/javascript-alert-box-demo.html");

        WebElement clickme1= driver.findElement(By.cssSelector("[class='btn btn-default']"));
        clickme1.click();
        Bekle(2);

        driver.switchTo().alert().accept();// alert kutucuğuna geçildi ve tamam butonuna basıldı
        Bekle(2);
        // alerti kapattığında sayfaya dönmüş oluyorsun
        BekleKapat();
    }
}
