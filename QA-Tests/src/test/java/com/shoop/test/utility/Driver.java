package com.shoop.test.utility;

import com.shoop.test.helper.Constants;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Properties;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import static com.shoop.test.helper.Constants.*;

/**
 * Created by Thadeus Ssewanyana on 16/03/2016.
*/



public abstract class Driver {

    public static WebDriver driver = null;
    public static Properties CONFIG=null;
    private  static final String operatingSystem = System.getProperty("os.name").toUpperCase();
    private static final String systemArchitecture = System.getProperty("os.arch");
    private static Logger LOGGER = Logger.getLogger("InfoLogging");

    public void getEnvironmentInfo() throws IOException {
        LOGGER.info(("Current Operating System: " + operatingSystem));
        LOGGER.info("Current Architecture: " + systemArchitecture);
        LOGGER.info("Current Browser Selection: " + CONFIG.getProperty("Browser"));
    }


    public static void initialize() throws IOException {

        CONFIG = new Properties();
        FileInputStream fp = new FileInputStream(System.getProperty("user.dir") + "/src/Config.properties");
        CONFIG.load(fp);

        if (CONFIG.getProperty("Browser").equalsIgnoreCase("firefox") ){
            DesiredCapabilities dc = new DesiredCapabilities();
            driver = new FirefoxDriver(dc);
        } else {
            if (CONFIG.getProperty("Browser").equalsIgnoreCase("chrome")) {
                DesiredCapabilities dc = DesiredCapabilities.chrome();
                if (operatingSystem.contains("WINDOWS")) {
                    dc.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
                    HashMap<String, String> chromePreferences = new HashMap<String, String>();
                    chromePreferences.put("profile.password_manager_enabled", "false");
                    System.setProperty("webdriver.chrome.driver",chromeWindowsdriver);
                } else if (operatingSystem.contains("MAC")) {
                    dc.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
                    HashMap<String, String> chromePreferences = new HashMap<String, String>();
                    chromePreferences.put("profile.password_manager_enabled", "false");
                    System.setProperty("webdriver.chrome.driver",chromeMacdriver);
                } else if (operatingSystem.contains("LINUX")) {
                    dc.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
                    HashMap<String, String> chromePreferences = new HashMap<String, String>();
                    chromePreferences.put("profile.password_manager_enabled", "false");
                    System.setProperty("webdriver.chrome.driver",chromeLinuxdriver );
                }else if (operatingSystem.contains("Centos")) {
                    dc.setCapability("chrome.switches", Arrays.asList("--no-default-browser-check"));
                    HashMap<String, String> chromePreferences = new HashMap<String, String>();
                    chromePreferences.put("profile.password_manager_enabled", "false");
                    System.setProperty("webdriver.chrome.driver",chromeCentosdriver);
                }
                System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+ Constants.chromeLinuxdriver);
                driver = new ChromeDriver(dc);

            }

        }

    }

    public void waitForElementDisplay(final WebElement element) {
        Wait<WebDriver> wait = new FluentWait<WebDriver>(Driver.driver)
                .withTimeout(30, TimeUnit.SECONDS)
                .pollingEvery(3, TimeUnit.SECONDS)
                .ignoring(NoSuchElementException.class);
        wait.until(input -> element.isDisplayed());
    }

}

