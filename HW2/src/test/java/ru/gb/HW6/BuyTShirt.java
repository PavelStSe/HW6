package ru.gb.HW6;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BuyTShirt {
    WebDriver driver;

    @BeforeAll
    static void registerDriver() {
        WebDriverManager.chromedriver().setup();
    }
    @BeforeEach
    void initDriver() {
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
    }
    @Test
    void buyTShirtTest() throws InterruptedException {
        new SighInPage(driver).login("standard_user","secret_sauce");
        new InventoryPage(driver).ClickOnTheTShirt();
        new TShirtPage(driver).ClickOnAddToCArtButton();
        new TShirtPage(driver).ClickOnCartButton();
        new CartPage(driver).CheckOutButtonClick();
        new CheckOutInformation(driver).InputCheckOutInfo("Fedor", "Mihailovich", "100200");
        new CheckOutOverviewPage(driver).finishButtonClick();


    }



    @AfterEach
    void tearDown() {
        driver.quit();
    }
}


