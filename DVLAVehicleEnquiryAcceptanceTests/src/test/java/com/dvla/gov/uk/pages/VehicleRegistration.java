package com.dvla.gov.uk.pages;

import com.dvla.gov.uk.util.AbstractDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import static org.junit.Assert.assertTrue;

/**
 * Created by sewadeus on 19/08/2017.
 */
public class VehicleRegistration extends AbstractDriver {

    @FindBy(css = ".page-header>div>h1")
    WebElement pageTitle ;
    @FindBy(css = ".button")
    WebElement button;
    @FindBy(id ="Vrm")
    WebElement regField;
    @FindBy(css = ".list-summary-item")
    WebElement itemSummary;



    public void clickOnStatNowButton(){
        waitForElementDisplay(button);
        button.click();
    }
    public void clickContinueButton(){
        waitForElementDisplay(button);
        button.click();
    }
    public void enterVehicleDetails(String SearchDetail){
        waitForElementDisplay(regField);
        regField.sendKeys(SearchDetail);



    }

    public void validateVechicleSearchedDetails(String searchDetails){
        waitForElementDisplay(itemSummary);
        assertTrue(itemSummary.getText().equals(searchDetails));

    }


}
