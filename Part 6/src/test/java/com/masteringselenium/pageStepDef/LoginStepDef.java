package com.masteringselenium.pageStepDef;

import com.masteringselenium.pages.LoginPage;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sewadeus on 03/07/2016.
 */
public class LoginStepDef {
    LoginPage login = PageFactory.initElements(this driver, LoginPage.class);


    @Given("^I go to shoop home Page$")
    public void i_go_to_shoop_home_Page() throws Throwable {
        login.clickOnSigninLink();

    }

    @When("^I click on the login link$")
    public void i_click_on_the_login_link() throws Throwable {
        login.clickOnSigninLink();

    }

    @When("^I enter my username and password$")
    public void i_enter_my_username_and_password() throws Throwable {
        login.enterPassword();
        login.enterUsername(a);

    }

    @When("^I click on the login button$")
    public void i_click_on_the_login_button() throws Throwable {

        login.clickOnSigninButton();

    }




}
