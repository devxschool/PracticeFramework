package pages;

import drivers.DriverFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Hotels extends HomePage{

    WebDriver driver;

    public Hotels(){
        driver = DriverFactory.getDriver();
        PageFactory.initElements(driver,this);
    }

    @FindBy (id = "tab-hotel-tab-hlp")
    public WebElement hotelsButton;

    @FindBy (id = "hotel-destination-hlp")
    public WebElement hotelsInputField;

    @FindBy (xpath = "//button[@class='btn-primary btn-action  gcw-submit']")
    public WebElement searchButton;

}
