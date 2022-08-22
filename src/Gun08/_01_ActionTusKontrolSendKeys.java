package Gun08;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _01_ActionTusKontrolSendKeys extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://demoqa.com/auto-complete");
        WebElement element1= driver.findElement(By.id("autoCompleteSingleInput"));

        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.moveToElement(element1). // kutucuğa gittim
                click(). // tıklattım
                keyDown(Keys.SHIFT). // shifte bastım
                sendKeys("a"). // shifte basılıyken küçük a yazdım yani büyük A yazdım
                keyUp(Keys.SHIFT). // shiftten elimi kaldırdım
                sendKeys("hmet"). // kalanı küçük harf girdik
                build();
        Bekle(2);
        aksiyon.perform();
        Bekle(2);

        BekleKapat();

    }
}
