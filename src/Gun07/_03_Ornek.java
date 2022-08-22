package Gun07;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _03_Ornek extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.facebook.com/");
        WebElement kaydol= driver.findElement(By.cssSelector("[id*='u_0_0']"));
        kaydol.click();
        WebElement adin= driver.findElement(By.cssSelector("[id*='_b_']"));
        adin.sendKeys("selim");
        WebElement soyadin= driver.findElement(By.cssSelector("[id*='_d_']"));
        soyadin.sendKeys("kinali");
        Bekle(2);

        WebElement eposta2= driver.findElement(By.cssSelector("[id*='_j_']"));
        Assert.assertFalse(eposta2.isDisplayed());

        WebElement eposta= driver.findElement(By.cssSelector("[id*='_g_']"));
        eposta.sendKeys("selimqatester@gmail.com");
        Bekle(2);

        eposta2.sendKeys("selimqatester@gmail.com");
        System.out.println("eposta2.isDisplayed() = " + eposta2.isDisplayed());
        System.out.println("eposta2.isEnabled() = " + eposta2.isEnabled());





        BekleKapat();
    }
}
