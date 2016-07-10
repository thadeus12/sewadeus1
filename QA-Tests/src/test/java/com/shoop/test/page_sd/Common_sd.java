package com.shoop.test.page_sd;

import com.shoop.test.pages.HomePage;
import com.shoop.test.pages.MerchantSearch;
import com.shoop.test.utility.Driver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sewadeus on 16/03/2016.
 */
public class Common_sd {
    HomePage homePage = new HomePage();

   MerchantSearch merchantSearch = PageFactory.initElements(Driver.driver,MerchantSearch.class);


    @Given("^I go to shoop home page\"$")
    public void i_go_to_shoop_home_page() throws Throwable {
        homePage.navigateToHomePage();
    }




    @When("^I enter merchant name as \"([^\"]*)\"into search$")
    public void i_enter_merchant_name_as_into_search(String arg1) throws Throwable {
       merchantSearch.enteMerchantNameToSearch(arg1);
    }

    @Then("^I should see name of \"([^\"]*)\" and own  best rates displayed$")
    public void i_should_see_name_of_and_own_best_rates_displayed(String arg1) throws Throwable {
       merchantSearch.validateSearchedResultsAndOwnBestRates(arg1);
    }






}
