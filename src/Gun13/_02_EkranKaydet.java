package Gun13;

import Utils.BaseStaticDriver;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.*;

import java.io.File;
import java.io.IOException;
import java.util.List;

public class _02_EkranKaydet extends BaseStaticDriver {
    public static void main(String[] args) throws IOException {
        driver.get("https://opensource-demo.orangehrmlive.com/");
        WebElement username= driver.findElement(By.id("txtUsername"));
        username.sendKeys("selim");
        WebElement password= driver.findElement(By.id("txtPassword"));
        password.sendKeys("Kınalı");
        WebElement btnLogin= driver.findElement(By.id("btnLogin"));
        btnLogin.click();

        List<WebElement> spanMessage=driver.findElements(By.id("spanMessage"));
        if (spanMessage.size()>0){ //login olamadın hata ekran görüntüsünü saklayalım
            // Hata ekranını ScreenShot alalım
            System.out.println("Login olamadı. Hata mesajı görüldü");
            // ekran görüntüsünü alalım
            TakesScreenshot ts=(TakesScreenshot) driver; // 1. aşama ekran görüntüsü alma değişkenini tanımladım
            File hafizadakiHali=ts.getScreenshotAs(OutputType.FILE); // 2. aşama saklama tipi seçildi (Dosya) .
            // data(veritabanı) ,(Byte) olarak ta seçilebilirdi
            // hafizadakiHali -> dosya olarak(jpg,png,bmp) kaydedeceğiz.
            FileUtils.copyFile(hafizadakiHali,new File("ekranGoruntuleri/LoginKontrol.png"));
            // hafizadaki ekrandosyasını al bunu verdiğim yola ve isme kaydet
            // jpg,bmp,gif

            // TODO: Ödev buradaki dosya adını zamana bağlı hale getiriniz ki hep üstüne kaydetmesin
            // mesela 20210526111201.jpg gibi


        }


        BekleKapat();
    }
}
