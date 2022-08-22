package Gun12;

import Utils.BaseStaticDriver;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.devtools.idealized.Javascript;

import java.util.Base64;

public class _04_Scrollintro extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://triplebyte.com/");

        // javascript komutlarını çalıştırmak için önce js değişkeni tanımlandı
        JavascriptExecutor js=(JavascriptExecutor)driver;

        js.executeScript("window.scrollBy(0,1500)");
        // (0,1500) -> (xy) sayfayı sağa x kadar ve aşağı y kadar kaydırır
        // 1500 px kadar aşağı kaydıracak

        Bekle(2);
        js.executeScript("window.scrollBy(0,-500)");

        BekleKapat();
    }
}
