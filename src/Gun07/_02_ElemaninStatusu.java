package Gun07;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class _02_ElemaninStatusu extends BaseStaticDriver {
    public static void main(String[] args) {
        driver.get("http://samples.gwtproject.org/samples/Showcase/Showcase.html#!CwCheckBox");
        WebElement Sali= driver.findElement(By.id("gwt-debug-cwCheckBox-Tuesday-input"));
        System.out.println(Sali.isDisplayed()); // görünüyormu
        System.out.println(Sali.isEnabled()); // aktif mi
        System.out.println(Sali.isSelected()); // seçili mi

        Sali.click();
        Bekle(3);
        System.out.println(Sali.isSelected());

        BekleKapat();
    }
}
