package com.shoop.test.page_sd;

import com.shoop.test.pages.RegistrationPage;
import com.shoop.test.utility.Driver;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Thadeus Ssweanyana on 3/17/2016.
 */
public class Registration_Sd {
    RegistrationPage reg = PageFactory.initElements(Driver.driver,RegistrationPage.class);

    @When("^I click on the register link$")
    public void i_click_on_the_register_link() throws Throwable {
       reg.clickOnRegistrationLink();
    }

    @When("^I enter my email and password$")
    public void i_enter_my_email_and_password() throws Throwable {
        reg.enterUsernameAndPassWord();
    }

    @When("^I accept shoop terms and conditions$")
    public void i_accept_shoop_terms_and_conditions() throws Throwable {
        reg.acceptShoopTermsAndConditions();
    }

    @When("^I click on the register for free button$")
    public void i_click_on_the_register_for_free_button() throws Throwable {
        reg.clickOnRegisterForFreeButton();
    }
    @When("^I click on to accept latest email offers$")
    public void i_click_on_to_accept_latest_email_offers() throws Throwable {
       reg.validateShoopLatestEmailOffersCheckBoxIsChecked();
    }

    @Then("^I should be registered as new user$")
    public void i_should_be_registered_as_new_user() throws Throwable {
       reg.validateNewUserRegistered();
    }

}
