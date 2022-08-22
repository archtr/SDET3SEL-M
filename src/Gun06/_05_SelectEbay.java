package Gun06;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class _05_SelectEbay extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.ebay.com/");
        WebElement menu= driver.findElement(By.id("gh-cat"));

        Select ddmenu=new Select(menu);
        ddmenu.selectByValue("14339");
        Bekle(2);

        WebElement srcbtn= driver.findElement(By.id("gh-btn"));
        srcbtn.click();

        Assert.assertTrue(driver.getCurrentUrl().contains("ebay"));

        BekleKapat();
    }
}
