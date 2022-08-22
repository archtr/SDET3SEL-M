package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class _08_ActionDropAndDragTest extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://www.dhtmlgoodies.com/scripts/drag-drop-custom/demo-drag-drop-3.html");

        // 1. yöntem
        WebElement oslo= driver.findElement(By.id("box1"));
        WebElement norway= driver.findElement(By.id("box101"));
        Actions aksiyonlar=new Actions(driver);
        Action aksiyon=aksiyonlar.dragAndDrop(oslo,norway).build();
        aksiyon.perform();

        // 2. yöntem
        WebElement seul= driver.findElement(By.id("box5"));
        WebElement kore= driver.findElement(By.id("box105"));
        aksiyon=aksiyonlar.clickAndHold(seul).moveToElement(kore).release().build();
        aksiyon.perform();

        BekleKapat();
    }
}
