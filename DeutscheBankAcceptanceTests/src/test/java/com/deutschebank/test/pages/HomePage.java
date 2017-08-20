package com.deutschebank.test.pages;

import com.deutschebank.test.util.AbstractDriver;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;

import static com.deutschebank.test.util.AbstractDriver.*;
import static org.junit.Assert.assertTrue;

/**
 * Created by sewadeus on 16/08/2017.
 */
public class HomePage extends AbstractDriver {
    Actions builder = new Actions(driver);

    @FindBy(css = "#etsy-logo>a")
    private WebElement tittle;
    @FindBy(css = "#catnav-primary-link-2938")
    private WebElement clothingAccesoriesCategoryTab;
    @FindBy(css = "#category-nav-side-nav-3090-link")
    private WebElement accesories;
    @FindBy(css = ".float-left>h1")
     private WebElement accesoriesPage;



    public void navigateToHomePage(String url){
        driver.get(url);
        pageTittle();

    }

    public void pageTittle(){
        waitForElementDisplay(tittle);
        assertTrue(tittle.isDisplayed());

    }

    public void searchProduct(String productCat){
        waitForElementDisplay(clothingAccesoriesCategoryTab);
        builder.click(clothingAccesoriesCategoryTab).
                moveToElement(accesories).
                click().build().perform();


    }
public void validateAccesoriesPageDisplayed(){
        waitForElementDisplay(accesoriesPage);
        assertTrue(accesoriesPage.isDisplayed());

}



}
