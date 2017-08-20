package com.deutschebank.test.suite;

import com.deutschebank.test.util.AbstractDriver;
import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import java.io.IOException;

/**
 * Created by sewadeus on 16/08/2017.
 */


@RunWith(Cucumber.class)
@CucumberOptions(tags="@wip", strict=true,
        plugin= {"pretty","html:target/cucumber"},
        monochrome = true,
        glue = { "com.deutschebank.test.suite",
                "com.deutschebank.test.suite"},
        features={"src/test/resources/testFeatures"}
)
public class Runner {

    @BeforeClass
    public static void setUp() throws IOException {
        System.out.println("Starting testing");
        AbstractDriver.driver("chrome");
        AbstractDriver.driver.manage().window().maximize();

    }

    @AfterClass
    public static void tearDown() {
        System.out.println("Quiting browser");
        AbstractDriver.driver.quit();
    }

}
