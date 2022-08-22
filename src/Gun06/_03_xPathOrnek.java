package Gun06;

import Utils.BaseStaticDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import java.util.List;
import org.junit.Assert;


public class _03_xPathOrnek extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("https://www.saucedemo.com/");
        Bekle(2);
        WebElement username= driver.findElement(By.id("user-name"));
        username.sendKeys("standard_user");
        Bekle(2);
        WebElement password= driver.findElement(By.id("password"));
        password.sendKeys("secret_sauce");
        Bekle(2);
        WebElement loginbutton= driver.findElement(By.id("login-button"));
        loginbutton.click();
        Bekle(2);
        WebElement saucelabs= driver.findElement(By.xpath("//div[text()='Sauce Labs Backpack']"));
        saucelabs.click();
        Bekle(2);
        WebElement addCart= driver.findElement(By.id("add-to-cart-sauce-labs-backpack"));
        addCart.click();
        Bekle(2);
        WebElement back= driver.findElement(By.id("back-to-products"));
        back.click();
        Bekle(2);
        WebElement BoltTShirt= driver.findElement(By.xpath("//div[text()='Sauce Labs Bolt T-Shirt']"));
        BoltTShirt.click();
        Bekle(2);
        WebElement addCart2=driver.findElement(By.id("add-to-cart-sauce-labs-bolt-t-shirt"));
        addCart2.click();
        Bekle(2);
        WebElement sepet= driver.findElement(By.xpath("//a[@class='shopping_cart_link']"));
        sepet.click();
        Bekle(2);
        WebElement checkout= driver.findElement(By.id("checkout"));
        checkout.click();
        Bekle(2);
        WebElement firstname= driver.findElement(By.id("first-name"));
        firstname.sendKeys("selim");
        Bekle(2);
        WebElement lastname= driver.findElement(By.id("last-name"));
        lastname.sendKeys("kinali");
        Bekle(2);
        WebElement postcode= driver.findElement(By.id("postal-code"));
        postcode.sendKeys("54100");
        Bekle(2);
        WebElement continou= driver.findElement(By.id("continue"));
        continou.click();
        Bekle(2);
        // //*[@class='inventory_item_price'](1) 2. eleman bulunup listeye nasıl eklenir
        List <WebElement> price1= driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

        double toplam=0;
        for (WebElement e:price1
             ) {
            System.out.println("e.getText() = " + e.getText());
            toplam+=Double.parseDouble(e.getText().substring(1));
        }
        System.out.println("toplam = " + toplam);

        // double çevirme işlemleri ayrı bir  metod yardımıyla regex kullanılarak yapılacak
        WebElement webAltToplam= driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
        System.out.println("webAltToplam.getText() = " + webAltToplam.getText());
        double altToplam=Double.parseDouble(webAltToplam.getText().substring(13));
        System.out.println("altToplam = " + altToplam);

        if (toplam==altToplam)
            System.out.println("Test Passed");
        else
            System.out.println("Test Failed");

        Assert.assertTrue(toplam==altToplam);




        BekleKapat();
    }
}
    //(//*[@class='inventory_item_price'])[1]
   // List<WebElement> ucretler=driver.findElements(By.xpath("//*[@class='inventory_item_price']"));

   // double toplam=0;
       // for(WebElement e: ucretler) {
         //       System.out.println("e.getText() = " + e.getText());
           //     toplam += Double.parseDouble(e.getText().substring(1));
             //   }
               // System.out.println("toplam = " + toplam);

                // double çevirme işlemleri ayrı bir metod yardımıyla regex ile yapılacak
               // WebElement webAltToplam=driver.findElement(By.xpath("//*[@class='summary_subtotal_label']"));
               // System.out.println(webAltToplam.getText());
             //   double altToplam = Double.parseDouble(webAltToplam.getText().substring(13));
               // System.out.println("altToplam = " + altToplam);

            //    if (toplam == altToplam)
              //  System.out.println("test passed");
                //else
               // System.out.println("test failed");
