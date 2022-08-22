package Gun05;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _01_CssSelectorOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://formsmarts.com/form/yu?mode=h5");
        Bekle(2);
        WebElement business= driver.findElement(By.cssSelector("[id$='4586_0']"));
        business.click();
        Bekle(2);
        WebElement dropdown= driver.findElement(By.cssSelector("[id='u_1fG_4588']"));
        dropdown.click();
        Bekle(2);
        WebElement optionLine= driver.findElement(By.cssSelector("[value='Online Advertising']"));
        optionLine.click();
        Bekle(2);
        WebElement buttoned= driver.findElement(By.cssSelector("[value='Every Day']"));
        buttoned.click();
        Bekle(2);
        WebElement goodratio= driver.findElement(By.cssSelector("[type='radio'][value='Good']"));
        goodratio.click();
        Bekle(2);
        WebElement howlong= driver.findElement(By.cssSelector("[id='u_1fG_4597']"));
        howlong.click();
        Bekle(2);
        WebElement secenek4= driver.findElement(By.cssSelector("[id='u_1fG_4597']>:nth-child(4)"));
        secenek4.click();
        goodratio.click(); // açılan dropdown kapansın diye herhangi bir yere tıklattık
        Bekle(2);


BekleKapat();
    }
}
