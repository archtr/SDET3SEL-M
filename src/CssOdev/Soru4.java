package CssOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.cssSelector("#calculate"));
        calculate.click();
        Bekle(1);
        WebElement number1= driver.findElement(By.cssSelector("[type='text'][name='number1']"));
        number1.sendKeys("3");
        Bekle(1);
        WebElement number2= driver.findElement(By.cssSelector("[type='text'][name='number2']"));
        number2.sendKeys("5");
        Bekle(1);
        WebElement calbtn= driver.findElement(By.cssSelector("[type='submit'][value='Calculate']"));
        calbtn.click();
        Bekle(1);
        WebElement result=driver.findElement(By.cssSelector("#answer"));
        System.out.println("result.getText() = " + result.getText());


        BekleKapat();
    }
}
