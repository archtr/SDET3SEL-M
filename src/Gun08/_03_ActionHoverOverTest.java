package Gun08;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
// 1- https://www.etsy.com/ sitesine gidiniz.
       // 2- Sırasıyla aşağıdaki menu itemlerine gidiniz.
       // Jewellery
       // Necklaces
       // Bib Necklaces

       // 3-En son item e tıklatınız.
       // 4-URL de Bib kelimesinin geçtiğini Assert ile doğrulayınız.

public class _03_ActionHoverOverTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.etsy.com/");

       // List<WebElement> cookiesAccept=driver.findElements(By.cssSelector("[data-gdpr-single-choice-accept='true']"));
       // if (cookiesAccept.size() > 0)
          //  cookiesAccept.get(0).click();  // eğer çerezler çıkarsa bunu kullan

        WebElement jewellery= driver.findElement(By.id("catnav-primary-link-10855"));
        WebElement necklaes= driver.findElement(By.id("side-nav-category-link-10873"));
        WebElement bibnecklaes= driver.findElement(By.id("catnav-l3-10881"));

        Actions aksiyonlar=new Actions(driver);
        aksiyonlar.moveToElement(jewellery).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(necklaes).build().perform();
        Bekle(2);
        aksiyonlar.moveToElement(bibnecklaes).build().perform();
        Bekle(2);
        bibnecklaes.click();
        Bekle(2);

        String url= driver.getCurrentUrl();
        Assert.assertTrue(url.contains("bib"));
        Bekle(2);

        BekleKapat();
    }
}
