package SeleniumOdev01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru03 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://www.snapdeal.com/");
        WebElement srcbx= driver.findElement(By.id("inputValEnter"));
        srcbx.sendKeys("teddy bear");
        WebElement srcbtn= driver.findElement(By.className("searchformButton"));
        srcbtn.click();
        WebElement results= driver.findElement(By.className("nnn"));
        if(results.getText().contains("results for 'teddy bear'"))
            System.out.println("test passed");
        else
            System.out.println("test failed");

    BekleKapat();
    }
}
