package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class CheckoutPage extends BasePage {

    private By proceedToCarrier = By.name("processCarrier");
    private By TCsCB = By.xpath("//label[contains(@for, 'cgv')]");
    private By proceedAddress = By.name("processAddress");
    private By payByBankWire = By.xpath("//a[contains(@title, 'Pay by bank wire')]");
    private By signOut =  By.cssSelector(".logout");

    public void clickProcessCarrier() {
        waitForExpectedElement(proceedToCarrier).click();
    }

    public void signout() throws InterruptedException {
        waitForExpectedElement(signOut).click();
        Thread.sleep(3000);
    }

    public void checkTCs() {
        waitForExpectedElement(TCsCB).click();
    }

    public void clickProcessAddress(){
        waitForExpectedElement(proceedAddress).click();
    }

    public Boolean isPaymentOptionAvailable(){
        return waitForExpectedElement(payByBankWire).isDisplayed();
    }

}
