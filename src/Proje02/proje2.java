package Proje02;

import Utils.BaseStaticDriver;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;

public class proje2 extends BaseStaticDriver {
    public static void main(String[] args) {

        driver.get("http://a.testaddressbook.com/sign_in");
        WebElement email = driver.findElement(By.id("session_email"));
        email.sendKeys("aa@abc.com");
        WebElement password = driver.findElement(By.id("session_password"));
        password.sendKeys("grup10");
        WebElement signInBtn = driver.findElement(By.name("commit"));
        signInBtn.click();
        WebElement addressBtn = driver.findElement(By.xpath("//*[text()='Addresses']"));
        addressBtn.click();
        WebElement newAdd = driver.findElement(By.linkText("New Address"));
        newAdd.click();
        WebElement firstName = driver.findElement(By.id("address_first_name"));
        firstName.sendKeys("Fernando");
        WebElement lastName = driver.findElement(By.id("address_last_name"));
        lastName.sendKeys("Torres");
        WebElement ad1 = driver.findElement(By.id("address_street_address"));
        ad1.sendKeys("Anfield Rd");
        WebElement ad2 = driver.findElement(By.id("address_secondary_address"));
        ad2.sendKeys("Anfield");
        WebElement city = driver.findElement(By.id("address_city"));
        city.sendKeys("Liverpool");
        WebElement state = driver.findElement(By.id("address_state"));
        Actions a = new Actions(driver);
        Action a1 = a.click(state).sendKeys(Keys.DOWN).sendKeys(Keys.DOWN)
                .sendKeys(Keys.DOWN).sendKeys(Keys.DOWN).sendKeys(Keys.ENTER).build();
        a1.perform();
        Bekle(1);
        WebElement zipCode = driver.findElement(By.name("address[zip_code]"));
        zipCode.sendKeys("L4 0TH");
        WebElement choseCountry = driver.findElement(By.id("address_country_us"));
        choseCountry.click();
        Bekle(1);
        WebElement birthday = driver.findElement(By.id("address_birthday"));
        birthday.sendKeys("03/20/1984");
        WebElement age = driver.findElement(By.id("address_age"));
        age.sendKeys("36");
        WebElement website = driver.findElement(By.id("address_website"));
        website.sendKeys("https://www.google.com/");
        WebElement phoneNo = driver.findElement(By.id("address_phone"));
        phoneNo.sendKeys("8625747878");
        Bekle(1);
        WebElement climbing = driver.findElement(By.id("address_interest_climb"));
        climbing.click();
        WebElement dancing = driver.findElement(By.id("address_interest_dance"));
        dancing.click();
        WebElement note = driver.findElement(By.id("address_note"));
        note.sendKeys("Never Back Down");
        WebElement createAd = driver.findElement(By.name("commit"));
        createAd.click();
        WebElement verifyFirstName = driver.findElement(By.cssSelector("[data-test='first_name'"));
        Assert.assertTrue(verifyFirstName.getText().contains("Fernando"));
        WebElement verifyLastName = driver.findElement(By.cssSelector("[data-test='last_name'"));
        Assert.assertTrue(verifyLastName.getText().contains("Torres"));
        Bekle(1);
        WebElement addressBack = driver.findElement(By.cssSelector("[data-test='addresses']"));
        addressBack.click();
        WebElement editAdd = driver.findElement(By.cssSelector("[data-test^='edit-19']"));
        editAdd.click();
        WebElement reWriteName = driver.findElement(By.id("address_first_name"));
        reWriteName.clear();
        reWriteName.sendKeys("Peter");
        WebElement reWriteLastName = driver.findElement(By.id("address_last_name"));
        reWriteLastName.clear();
        reWriteLastName.sendKeys("Crouch");
        WebElement updateBtn = driver.findElement(By.cssSelector("[data-disable-with='Update Address']"));
        updateBtn.click();
        WebElement verifyFirstName2 = driver.findElement(By.cssSelector("[data-test='first_name']"));
        Assert.assertTrue(verifyFirstName2.getText().contains("Peter"));
        WebElement verifyLastName2 = driver.findElement(By.cssSelector("[data-test='last_name']"));
        Assert.assertTrue(verifyLastName2.getText().contains("Crouch"));
        Bekle(1);
        WebElement addressBack2 = driver.findElement(By.cssSelector("[data-test='addresses']"));
        addressBack2.click();
        WebElement destroy = driver.findElement(By.cssSelector("[data-test^='destroy-19']"));
        destroy.click();
        driver.switchTo().alert().accept();
        WebElement verify = driver.findElement(By.className("container"));
        Assert.assertFalse(verify.getText().contains("Peter"));


        BekleKapat();
    }
}
