package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.Assert;

public class HomePage extends Utils {

    public void verifyRegisterButtonPresent(){

        //assertEquals() is used to validate two values are equal.
        Assert.assertEquals(getTextFromElement(By.className("ico-register")),"Register","verifyRegistrationButtonPresent");
    }
    public void verifyElectronicPage(){
        Actions actions = new Actions(driver);
        WebElement element = driver.findElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/electronics\"]"));
        actions.moveToElement(element).perform();
        clickOnElement(By.xpath("//ul[@class=\"top-menu notmobile\"]//a[@href=\"/cell-phones\"]"));

    }
    public void clickOnCategoryPage(String category){
        clickOnElement(By.linkText(category));
    }


}
