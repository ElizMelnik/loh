package edu.bsuir.test;

import edu.bsuir.driver.WebDriverSingleton;
import org.junit.After;
import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.util.List;

public class TestExample {

    private WebDriver driver = WebDriverSingleton.getInstance();

//    @Test
//    public void shouldGoogleIbaMainPage() {
//        driver.get("https://www.google.by");
//        WebElement searchField = driver.findElement(By.className("gsfi"));
//        searchField.sendKeys("IBA Group");
//        searchField.sendKeys(Keys.RETURN);
//        List<WebElement> results = driver.findElements(By.xpath("//div[@class='rc']//a"));
//        results.get(0).click();
//        Assert.assertEquals("IBA Беларусь", driver.getTitle());
//    }

    @Test
    public void loginTest(){
        driver.get("http://testing.cld.iba.by/web/guest/home");
        WebElement userNameField = driver.findElement(By.xpath("//*[@id=\"_58_login\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"_58_password\"]"));
        userNameField.sendKeys("kabanov@tc.by");
        passwordField.sendKeys("welcome");
        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        Assert.assertEquals("Главная - Конструктор Талантов",driver.getTitle());
    }

    @Test
    public void mainRecr(){
        driver.get("http://testing.cld.iba.by/web/guest/home");
        WebElement userNameField = driver.findElement(By.xpath("//*[@id=\"_58_login\"]"));
        WebElement passwordField = driver.findElement(By.xpath("//*[@id=\"_58_password\"]"));
        userNameField.sendKeys("kabanov@tc.by");
        passwordField.sendKeys("welcome");
        WebElement submit = driver.findElement(By.className("btn"));
        submit.click();
        WebElement userName = driver.findElement(By.xpath("//div[@class = 'float-box']//div//h3"));

        Assert.assertEquals("Александр Евгеньевич Кабанов", userName.getText());
    }

    @After
    public void shutDown() {
        driver.close();
    }

}
