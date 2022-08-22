package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.awt.*;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

public class _01_RobotGiris extends BaseStaticDriver {
    public static void main(String[] args) throws AWTException {
        driver.get("https://demo.guru99.com/test/upload/");

        Robot rbt=new Robot();

        rbt.keyPress(KeyEvent.VK_META);
        rbt.keyPress(KeyEvent.VK_TAB);
        rbt.keyRelease(KeyEvent.VK_TAB);
        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_META);

        for(int i=0;i<13;i++){
        rbt.keyPress(KeyEvent.VK_TAB); // Tuşa basıldı down
        rbt.keyRelease(KeyEvent.VK_TAB); // Tuş bırakıldı up
        Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER); // Tuşa basıldı down
        rbt.keyRelease(KeyEvent.VK_ENTER); // Tuş bırakıldı up
        Bekle(5);

        // Stringi hafızaya-clipboard a kopyalama kodu
            StringSelection stringSelection=new StringSelection("123.JPG");
        Toolkit.getDefaultToolkit().getSystemClipboard().setContents(stringSelection,null);
        // verilen stringi clipboard a set ediyor
        Bekle(5);
        rbt.keyPress(KeyEvent.VK_CONTROL);
        rbt.keyPress(KeyEvent.VK_V); // BU İKİ TUŞ ŞU ANDA BASILMIŞ VAZİYETTE , hafızadaki yapıştırıldı
        Bekle(1);
        rbt.keyRelease(KeyEvent.VK_CONTROL);
        rbt.keyRelease(KeyEvent.VK_V); // tuşlar serbest bırakıldı

        for (int i=0;i<2;i++){ // 2 kere tab ile open butonuna ulaştık
            rbt.keyPress(KeyEvent.VK_TAB); // tuşa basıldı down
            rbt.keyRelease(KeyEvent.VK_TAB); // tuş bırakıldı up
            Bekle(1);
        }
        rbt.keyPress(KeyEvent.VK_ENTER); // tuşa basıldı down // enter bastık açılan pencere kapandı
        rbt.keyRelease(KeyEvent.VK_ENTER); // tuş bırakıldı up

        WebElement submitButton= driver.findElement(By.id("submitbutton"));
        submitButton.click(); // submit butonuna bastık

       // BekleKapat();
    }
}
