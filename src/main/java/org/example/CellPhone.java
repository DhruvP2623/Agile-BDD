package org.example;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class CellPhone extends Utils{

public void verifyCellPhonePage(){

    Utils.assertCurrentUrl("cell-phones");
    clickOnElement(By.linkText("Nokia Lumia 1020"));


}
}
