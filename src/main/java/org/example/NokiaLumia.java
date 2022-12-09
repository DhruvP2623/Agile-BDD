package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class NokiaLumia extends Utils{
    public void verfyNokiaLumia(){
        Actions actions = new Actions(driver);

        clickOnElement(By.id("add-to-cart-button-20"));
        waitForElementToBeVisible(By.xpath("//span[@class=\"close\"]"),10);
        clickOnElement(By.xpath("//span[@class=\"close\"]"));
        WebElement element1 = driver.findElement(By.className("cart-label"));
        actions.moveToElement(element1).perform();
        waitForElementToBeVisible(By.cssSelector("button.button-1.cart-button"),10);
        clickOnElement(By.cssSelector("button.button-1.cart-button"));

    }
}
