package com.test.sahaja.pageobjects;

import org.openqa.selenium.By;

public class RegistrationPage extends BasePage {

    By myPersonalInformation = By.cssSelector(".icon-user");
    By firstNameTB = By.name("firstname");
    By currentPwd = By.name("old_passwd");
    By save = By.name("submitIdentity");
    By successMsg = By.cssSelector(".alert-success");
    By backToAccounts = By.cssSelector(".footer_links.clearfix>li:nth-child(1)");

    public void clickPersonalInfoLink() {
        waitForExpectedElement(myPersonalInformation).click();
    }

    public void updateFirstName(String firstName) {
        waitForExpectedElement(firstNameTB).clear();
        waitForExpectedElement(firstNameTB).sendKeys(firstName);
    }

    public String getFirstName(){
        return waitForExpectedElement(firstNameTB).getAttribute("value");
    }

    public void enterCurrentPwd(String pwd) {
        waitForExpectedElement(currentPwd).sendKeys(pwd);
    }

    public void saveChanges() {
        waitForExpectedElement(save).click();
    }

    public String getSuccessMsg() {
        return waitForExpectedElement(successMsg).getText();
    }

    public void clickBackToAccounts() {
        waitForExpectedElement(backToAccounts).click();
    }

}
