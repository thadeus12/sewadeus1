package com.vehicleidentity.test.pages;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import com.vehicleidentity.test.util.AbstractDriver;

import static org.junit.Assert.assertTrue;


public class VehicleRegistration extends AbstractDriver {

    @FindBy(css = ".page-header>div>h1")
    private WebElement pageTitle ;
    @FindBy(css = ".button")
    private WebElement button;
    @FindBy(css ="#Vrm")
    private WebElement regField;
    @FindBy(css = ".list-summary-item")
    private WebElement itemSummary;
    @FindBy(css = ".heading-large")
    private WebElement largeHeading;
    @FindBy(xpath = ".//*[@id='pr3']/div/ul/li[1]/span[2]")
    private WebElement regNumber;
    @FindBy(xpath = ".//*[@id='pr3']/div/ul/li[2]/span[2]/strong")
    private WebElement vehichleMake;
    @FindBy(xpath = ".//*[@id='pr3']/div/ul/li[3]/span[2]/strong")
    private WebElement vehichleColor;
    @FindBy(id = "Correct_True")
    private WebElement yes;
    @FindBy(id = "Correct_False")
    private WebElement no;
    @FindBy(xpath = ".//*[@id='content']/div[2]/h1/span")
    private WebElement regMark;
    @FindBy(xpath = ".//*[@id='Search']")
    private WebElement taxRates;



    public void clickOnStatNowButton(){
        waitForElementDisplay(button);
        button.click();
    }
    public void clickContinueButton(){
        waitForElementDisplay(button);
        button.click();
    }
    public void enterVehicleRegistrationNumber(String SearchDetail){
        waitForElementDisplay(regField);
        regField.sendKeys(SearchDetail);
    }

   public void clickYesThisTheVehicleYouAreLookingFor(){
        yes.click();
   }
    public void validateVehicleSearchedDetails(String carNum,String carMake, String carColor){
        waitForElementDisplay(regNumber);
        assertTrue(regNumber.getText().equals(carNum));
        assertTrue(vehichleColor.getText().equals(carColor));
        assertTrue(vehichleMake.getText().equals(carMake));


    }
    public void validateVehicleRegistrationNumber(String regNum){
        assertTrue(regNumber.getText().equals(regNum));
    }
    public void validateVehicleColor(String carColor){
        assertTrue(vehichleColor.getText().equals(carColor));
    }
    public void validateVehicleMake(String vmake){
        assertTrue(vehichleMake.getText().equals(vmake));
    }

    public void validateVehicleHeading(String head){
        waitForElementDisplay(largeHeading);
        assertTrue(largeHeading.getText().equals(head));

    }
   public void validateViewVehicleDeatailsAndTaxRatesPage(){
        waitForElementDisplay(taxRates);
        assertTrue(taxRates.isDisplayed());
   }

}
