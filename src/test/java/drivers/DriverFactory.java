package drivers;

import org.openqa.selenium.WebDriver;
import utilities.ConfigReader;

public class DriverFactory {
    // Driver factory will create us a driver that we specify in the configurations.properties file.
    private static WebDriver driver;

    public static WebDriver getDriver(){
        boolean headless = Boolean.parseBoolean(ConfigReader.getProperty("headless"));

        if(driver==null){
            switch(ConfigReader.getProperty("browser")){
                case "firefox":
                    driver = FirefoxWebDriver.createFirefoxDriver(headless);
                    break;
                default:
                    driver = ChromeWebDriver.createChromeDriver(headless);
                    break;
            }
        }
        return driver;
    }

    public static void closeDriver(){
        if(driver == null){
            return;
        }
        driver.close();
        driver.quit();
        driver = null;
    }

}
