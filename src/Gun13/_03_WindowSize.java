package Gun13;

import Utils.BaseStaticDriver;
import org.openqa.selenium.Dimension;

import java.awt.*;

public class _03_WindowSize extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.youtube.com/");

        driver.manage().window().maximize(); // ekranı tam hale getiriyor
        Bekle(3);

        // ekranı yeni ölçülere göre set etme
        Dimension dimension=new Dimension(516,600);
        driver.manage().window().setSize(dimension);

        BekleKapat();
    }
}
