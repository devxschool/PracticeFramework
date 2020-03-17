package pages;

import drivers.DriverFactory;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.FindBys;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class HomePage {

    WebDriver driver;

    public HomePage() {
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver, this);
    }

    @FindBy(id = "primary-header-flight")
    public WebElement flightButton;

    @FindBy(id = "primary-header-cruise")
    public WebElement cruisesButton;

    @FindBys({@FindBy(xpath = "//a[@class='flex-link']")})
    public List<WebElement> destinations;

    @FindBy (id = "EG-logo")
    public WebElement expediaLogo;

    public void moveToTheBottom(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView(true);", expediaLogo);
    }
}
