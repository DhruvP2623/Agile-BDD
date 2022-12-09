package org.example;

import org.openqa.selenium.By;
import org.testng.Assert;

public class Confirmorder extends Utils{
String regMsg = "Thank you";
String regMsg2 = "Your order has been successfully processed!";
    public void verifyConfirmOrder(){


        waitForElementToBeVisible(By.cssSelector("button.button-1.confirm-order-next-step-button"),10);
        clickOnElement(By.cssSelector("button.button-1.confirm-order-next-step-button"));

        Assert.assertEquals(regMsg,"Thank you");
Assert.assertEquals(regMsg2,"Your order has been successfully processed!");


    }
}
