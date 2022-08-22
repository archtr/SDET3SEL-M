package Gun10;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

/*
Senaryo
1-  https://www.demoblaze.com/index.html  siteyi açınız.
2- Samsung galaxy s6  linkine tıklayınız.
3- Sepete ekleyiniz.
4- Daha Sonra PRODUCT STORE yazısına tıklatarak ana ekrana geri dönününz
 */
public class _04_WaitSoru extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.demoblaze.com/index.html");
        WebElement galaxys6= driver.findElement(By.linkText("Samsung galaxy s6"));
        galaxys6.click();

        WebElement addCart= driver.findElement(By.cssSelector("[onclick='addToCart(1)']"));
        addCart.click();

        wait.until(ExpectedConditions.alertIsPresent());
        driver.switchTo().alert().accept();

        WebElement mainPage= driver.findElement(By.id("nava"));
        mainPage.click();


        BekleKapat();
    }
}
