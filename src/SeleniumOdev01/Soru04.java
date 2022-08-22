package SeleniumOdev01;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Soru04 extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("https://testpages.herokuapp.com/styled/index.html");
        Bekle(2);
        WebElement calculate= driver.findElement(By.id("calculate"));
        calculate.click();
        Bekle(2);
        WebElement nmbr1= driver.findElement(By.id("number1"));
        nmbr1.sendKeys("3");
        Bekle(2);
        WebElement nmbr2= driver.findElement(By.id("number2"));
        nmbr2.sendKeys("4");
        Bekle(2);
        WebElement clctebtn= driver.findElement(By.id("calculate"));
        clctebtn.click();
        Bekle(2);
        WebElement answer= driver.findElement(By.id("answer"));
        System.out.println("answer = " + answer.getText());

BekleKapat();

    }
}
