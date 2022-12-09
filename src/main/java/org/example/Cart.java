package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Cart extends Utils{
    public void verifycartButton(){

        driver.findElement(By.className("qty-input")).sendKeys(Keys.BACK_SPACE);
        driver.findElement(By.className("qty-input")).sendKeys("2");
        clickOnElement(By.id("updatecart"));
        clickOnElement(By.id("termsofservice"));
        clickOnElement(By.id("checkout"));
    }
}
