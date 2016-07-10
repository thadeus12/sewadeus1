package com.shoop.test.pages;

import com.shoop.test.utility.Driver;

/**
 * Created by Thadeus on 16/03/2016.
 */
public class HomePage extends Driver{

    public void navigateToHomePage(){
        driver.get(CONFIG.getProperty("HomePageUrl"));
        System.out.println(driver.getTitle());

    }


}
