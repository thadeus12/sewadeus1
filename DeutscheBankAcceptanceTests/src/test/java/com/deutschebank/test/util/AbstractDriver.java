package com.deutschebank.test.util;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxProfile;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.IOException;
import java.util.NoSuchElementException;
import java.util.concurrent.TimeUnit;

/**
 * Created by sewadeus on 16/08/2017.
 */
public class AbstractDriver {
    public static WebDriver driver = null;

    public static void driver(String browsertype) throws IOException {

        if (browsertype.equalsIgnoreCase("firefox") || browsertype.equalsIgnoreCase("")) {
            System.setProperty("webdriver.gecko.driver",  System.getProperty("user.dir") + "\\src\\test\\resources\\browserBinaries\\geckodriver.exe");
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new FirefoxDriver(dc);
        } else {
            if (browsertype.equalsIgnoreCase("chrome")) {

                DesiredCapabilities dc = DesiredCapabilities.chrome();
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\src\\test\\resources\\browserBinaries\\chromedriver.exe");
                driver = new ChromeDriver(dc);
            }
            else {}
            if (browsertype.equalsIgnoreCase("IE")){
                DesiredCapabilities cp = DesiredCapabilities.internetExplorer();
                System.setProperty("webdriver.IE.driver",System.getProperty("user.dir")+"\\src\\test\\resources\\browserBinaries\\IEDriverServer.exe");
                driver= new InternetExplorerDriver(cp);

            }
        }
    }

    public void waitForElementDisplay(final WebElement element) {

        Wait<WebDriver> wait = new FluentWait<WebDriver>(AbstractDriver.driver)
                .withTimeout(60, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(new ExpectedCondition<Boolean>() {
                       @Override
                       public Boolean apply(WebDriver input) {
                           return element.isDisplayed();
                       }
                   }
        );
    }


}
