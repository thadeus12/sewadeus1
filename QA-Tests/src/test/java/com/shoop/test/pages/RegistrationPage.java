package com.shoop.test.pages;

import com.shoop.test.utility.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.util.UUID;

import static org.junit.Assert.assertTrue;

/**
 * Created by Thadeus.Ssewanyana on 17/03/2016.
 */
public class RegistrationPage extends Driver{
    WebDriverWait wait = new WebDriverWait(Driver.driver,20);
    @FindBy(xpath = "html/body/header/div[2]/div/div[1]/ul/li[1]/a/span/span")
    private WebElement registerLink;
    @FindBy(name = "//input[@name='email'][@type='email']")
    private WebElement userEmail;
    @FindBy(name = "password")
    private WebElement emailpassword;
    @FindBy(css = "span.left-block")
    private WebElement acceptShoopTerms;
    @FindBy(name = "emails_opt_in")
    private WebElement optinToterms;
    @FindBy(css = "button.qp-btn.ng-binding")
    private WebElement regButton;
    @FindBy(css = "h1.greeting-header > span > span.ng-scope")
    private WebElement regWelcomeGreeting;
    @FindBy(css = ".ng-scope:contains('Bonjour')")
    private WebElement welcomeText;



    public void clickOnRegistrationLink(){
        waitForElementDisplay(registerLink);
        registerLink.click();
    }
    public void enterUsernameAndPassWord(){
        waitForElementDisplay(userEmail);
        final String email = UUID.randomUUID().toString() + "@quidco.com";
        userEmail.sendKeys(email);
        emailpassword.sendKeys("Testquality09!");
    }
    public void acceptShoopTermsAndConditions(){
        waitForElementDisplay(optinToterms);
        if( !optinToterms.isSelected());
        optinToterms.click();
    }
    public void validateShoopLatestEmailOffersCheckBoxIsChecked(){
       assertTrue( acceptShoopTerms.isSelected());
    }
    public void clickOnRegisterForFreeButton(){
     regButton.click();


    }
    public void validateNewUserRegistered(){
        waitForElementDisplay(welcomeText);
        assertTrue(welcomeText.isDisplayed());
    }
}

