package org.example;

import org.openqa.selenium.By;

public class Checkout extends Utils{

    public void verifybilling(){

       selectFromDropdownByVisibleText(By.id("BillingNewAddress_CountryId"),"United Kingdom");
        typeText(By.id("BillingNewAddress_City"),"Hounslow");
        typeText(By.id("BillingNewAddress_Address1"),"41 Central Ave");
        typeText(By.id("BillingNewAddress_ZipPostalCode"),"TW12QR");
        typeText(By.id("BillingNewAddress_PhoneNumber"),"07951056088");

clickOnElement(By.cssSelector("button.button-1.new-address-next-step-button"));
    }
}
