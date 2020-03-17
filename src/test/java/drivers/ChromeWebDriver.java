package drivers;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ChromeWebDriver {

    public static WebDriver createChromeDriver(boolean headless){
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();

        options.setHeadless(headless);
        options.addArguments("--start-maximized");
        options.addArguments("--disable-extensions");

        WebDriver driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

        return driver;
    }
}
