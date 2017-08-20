package com.deutschebank.test.stepdef;

import com.deutschebank.test.pages.HomePage;
import com.deutschebank.test.util.AbstractDriver;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by sewadeus on 16/08/2017.
 */
public class HomePageStepDef {
HomePage homePage = PageFactory.initElements(AbstractDriver.driver,HomePage.class);

    @Given("^I go to \"([^\"]*)\" home page$")
    public void i_go_to_home_page(String url) throws Throwable {
    homePage.navigateToHomePage(url);


    }

    @When("^I hover the \"([^\"]*)\" tab$")
    public void i_hover_the_tab(String arg1) throws Throwable {

    }

    @When("^I select \"([^\"]*)\" from the dropdown list$")
    public void i_select_from_the_dropdown_list(String arg1) throws Throwable {
        homePage.searchProduct(arg1);

    }

    @Then("^I should be on the accesories page$")
    public void i_should_be_on_the_accesories_page() throws Throwable {
        homePage.validateAccesoriesPageDisplayed();

    }



}
