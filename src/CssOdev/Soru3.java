package CssOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru3 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.snapdeal.com/");
        WebElement srcbox= driver.findElement(By.cssSelector("[type='text'][name='keyword'][placeholder='Search products & brands']"));
        srcbox.sendKeys("teddy bear");
        Bekle(2);
        WebElement srcbtn= driver.findElement(By.cssSelector("[class='searchTextSpan']"));
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
