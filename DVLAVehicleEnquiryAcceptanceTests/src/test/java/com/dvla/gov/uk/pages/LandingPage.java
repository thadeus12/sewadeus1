package com.dvla.gov.uk.pages;

import com.dvla.gov.uk.util.AbstractDriver;

/**
 * Created by sewadeus on 19/08/2017.
 */
public class LandingPage extends AbstractDriver {

    public void navigateToLandingPage(String url){
        driver.get(url);


    }
     String PageTitleText="Get vehicle information from DVLA";
    public void verifyPageTitle(String pageTitle){
        driver.getTitle().contains(PageTitleText);
    }

}
