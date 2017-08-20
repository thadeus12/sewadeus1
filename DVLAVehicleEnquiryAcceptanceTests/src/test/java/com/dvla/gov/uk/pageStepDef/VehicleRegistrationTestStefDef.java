package com.dvla.gov.uk.pageStepDef;

import com.dvla.gov.uk.pages.LandingPage;
import com.dvla.gov.uk.pages.VehicleRegistration;
import com.dvla.gov.uk.util.AbstractDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

import static org.junit.Assert.assertTrue;


public class VehicleRegistrationTestStefDef {

LandingPage homePage = new LandingPage();
    @Given("^I go on \"([^\"]*)\" home page$")
    public void i_go_on_home_page(String arg1) throws Throwable {
        homePage.navigateToLandingPage(arg1);

    }

    @When("^I click on the startnow button$")
    public void i_click_on_the_startnow_button() throws Throwable {

    }

    @Then("^I should see page tittle as \"([^\"]*)\"$")
    public void i_should_see_page_tittle_as(String arg1) throws Throwable {

    }

    @Then("^I enter \"([^\"]*)\" Car registration details$")
    public void i_enter_Car_registration_details(String arg1) throws Throwable {

    }

    @Then("^I should see vehicle registration details page$")
    public void i_should_see_vehicle_registration_details_page() throws Throwable {

    }




}



