package com.masteringselenium.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by sewadeus on 03/07/2016.
 */
public class LoginPage {
    @FindBy(css = "sigin_link")
    private WebElement signin_link;
    @FindBy(name = "email")
    private WebElement email;
    @FindBy(name ="password")
    private WebElement password;
    @FindBy(css = "logged_in")
    private WebElement myAccount;

    @FindBy(css = "singin-Button")
    private WebElement signButton;
    public void clickOnSigninLink(){
        signin_link.click();
    }

    public void doDefaultlogin(){
        email.sendKeys("userName");
        password.sendKeys("e_password");
        signButton.click();

    }
    public void enterUsername(String userName){
        email.sendKeys();
    }
    public void enterPassword(String e_password){
        password.sendKeys(e_password);
    }
    public void clickOnSigninButton(){
        signButton.click();
    }
    public void signInuser(){
        if (myAccount.isDisplayed()){
            doDefaultlogin();
        }

    }

}
