package com.vehicleidentity.test.suites;


import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.Before;
import org.junit.runner.RunWith;
import com.vehicleidentity.test.util.AbstractDriver;

import java.io.IOException;

@RunWith(Cucumber.class)
@CucumberOptions(tags="@wip",strict = true,
        plugin = {"pretty","html:target/cucumber"},
        monochrome = true,
        glue={"com.vehicleidentity.test.pageStepDef",
                "com.vehicleidentity.test.util",
                "com.vehicleidentity.test.pages;"},
       features ={"src/test/resource/testfeatures"}

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
