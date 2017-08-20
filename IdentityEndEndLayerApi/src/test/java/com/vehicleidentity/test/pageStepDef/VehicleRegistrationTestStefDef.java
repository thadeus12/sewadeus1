package com.vehicleidentity.test.pageStepDef;


import com.vehicleidentity.test.pages.VehicleRegistration;
import com.vehicleidentity.test.util.AbstractDriver;
import cucumber.api.java.en.Given;
import com.vehicleidentity.test.pages.LandingPage;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;


public class VehicleRegistrationTestStefDef {
    VehicleRegistration carRegister= PageFactory.initElements(AbstractDriver.driver,VehicleRegistration.class);
LandingPage homePage = new LandingPage();
    @Given("^I go on \"([^\"]*)\" home page$")
    public void i_go_on_home_page(String arg1) throws Throwable {
        homePage.navigateToLandingPage(arg1);

    }

    @When("^I click on the startnow button$")
    public void i_click_on_the_startnow_button() throws Throwable {
        carRegister.clickOnStatNowButton();

    }

    @Then("^I should see \"([^\"]*)\" as page tittle$")
    public void i_should_see_as_page_tittle(String arg1) throws Throwable {

    }

    @Then("^I enter \"([^\"]*)\" Car registration details$")
    public void i_enter_Car_registration_details(String arg1) throws Throwable {
      carRegister.enterVehicleRegistrationNumber(arg1);
    }
    @Then("^I click on the continue button$")
    public void i_click_on_the_continue_button() throws Throwable {
        carRegister.clickContinueButton();
    }

    @Then("^I should see \"([^\"]*)\" \"([^\"]*)\" and\"([^\"]*)\" for vehicle searched$")
    public void i_should_see_and_for_vehicle_searched(String arg1, String arg2, String arg3) throws Throwable {
       carRegister.validateVehicleSearchedDetails(arg1,arg2,arg3);
    }

    @Then("^I select yes check box to continue$")
    public void i_select_yes_check_box_to_continue() throws Throwable {
        carRegister.clickYesThisTheVehicleYouAreLookingFor();

    }
     @Then("^I should see vehicle details and tax rates page$")
    public void i_should_see_vehicle_details_and_tax_rates_page()throws Throwable {
        carRegister.validateViewVehicleDeatailsAndTaxRatesPage();

     }

}



