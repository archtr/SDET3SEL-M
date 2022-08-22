package XpathOdev;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement srcbox= driver.findElement(By.xpath("//*[@id='inputValEnter']"));
        srcbox.sendKeys("teddy bear");
        Bekle(2);
        WebElement srcbtn= driver.findElement(By.xpath("//*[@class='searchTextSpan']"));
        srcbtn.click();
        Bekle(3);
        WebElement results= driver.findElement(By.cssSelector("span[class*='nnn']"));

        if (results.getText().contains("We've got"))
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        BekleKapat();



    }
}
