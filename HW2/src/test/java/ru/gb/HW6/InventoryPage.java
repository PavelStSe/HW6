package ru.gb.HW6;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class InventoryPage extends BasePage{
    public InventoryPage(WebDriver driver) {
        super(driver);
    }

    @FindBy (id = "item_3_title_link")
    private WebElement itemSelection;

    public void ClickOnTheTShirt() {
        actions.moveToElement(itemSelection)
                .click()
                .perform();
    }



    //actions.moveToElement(driver.findElement(By.id("item_3_title_link")))
    //        .click(driver.findElement(By.id("item_3_title_link")))
    //        .perform();
}
