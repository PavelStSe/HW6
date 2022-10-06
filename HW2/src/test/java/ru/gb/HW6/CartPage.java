package ru.gb.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CartPage extends BasePage{

    public CartPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "checkout")
    private WebElement CheckOutButton;

    public void CheckOutButtonClick() {
        actions.moveToElement(CheckOutButton).click()
                .perform();
    }
}

//actions.moveToElement(driver.findElement(By.id("checkout")))
//                .click()
//                        .perform();