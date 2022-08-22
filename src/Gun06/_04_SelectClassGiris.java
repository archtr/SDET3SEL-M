package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _04_SelectClassGiris extends BaseStaticDriver {
    public static void main(String[] args) {
        /*
     select class ı
     görünen text ile seçim için: selectByVisibleText
     valueden seçim için        : selectByValue
     sırasından seçim için      : selectByIndex
 */
        driver.get("https://www.amazon.com/");
        WebElement menu= driver.findElement(By.id("searchDropdownBox"));

        Select ddmenu=new Select(menu);
        ddmenu.selectByVisibleText("Books");
        Bekle(2);

        WebElement srcbox= driver.findElement(By.id("nav-search-submit-button"));
        srcbox.click();

        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("amazon")); // doğru adrestemiyiz kontrolü için örnek

BekleKapat();
    }
}
