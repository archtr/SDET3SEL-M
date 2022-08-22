package XpathOdev;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru4 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        WebElement calculate= driver.findElement(By.xpath("//*[@id='calculate']"));
        calculate.click();
        Bekle(1);
        WebElement number1= driver.findElement(By.xpath("//*[@id='number1']"));
        number1.sendKeys("3");
        Bekle(1);
        WebElement number2= driver.findElement(By.xpath("//*[@id='number2']"));
        number2.sendKeys("5");
        Bekle(1);
        WebElement calbtn= driver.findElement(By.xpath("//*[@id='calculate']"));
        calbtn.click();
        Bekle(1);
        WebElement result=driver.findElement(By.xpath("//*[@id='answer']"));
        System.out.println("result.getText() = " + result.getText());


        BekleKapat();


    }
}
