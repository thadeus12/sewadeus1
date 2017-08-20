package com.dvla.gov.uk.suites;

import com.dvla.gov.uk.util.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(tags="smoke-tests",strict = true,
        plugin = {"pretty","html:target/cucumber"},
        monochrome = true,
        glue={"com.dvla.gov.uk","com.dvla.gov.uk.pageStepDef",
        "com.dvla.gov.uk.pages","com.dvla.gov.uk.util"},
       features ={"src/test/resources/com/dvla/gov/uk"}

        )
public class Runner {
    @Before
    public static void setUp() throws IOException{
        System.out.println("start testing");
        AbstractDriver.driver("chrome");


    }

    @After
    public static void tearDown(){
        System.out.println("Quiting browser");


    }

}
