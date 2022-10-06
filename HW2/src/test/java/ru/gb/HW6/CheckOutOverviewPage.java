package ru.gb.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CheckOutOverviewPage extends  BasePage{
    public CheckOutOverviewPage(WebDriver driver) {
        super(driver);
    }
    @FindBy (id = "finish")
    private WebElement finishButton;

    public void finishButtonClick(){
        actions.moveToElement(finishButton).click()
                .perform();
    }
}
//actions.moveToElement(driver.findElement(By.id("finish")))
//                .click()
//                        .perform();