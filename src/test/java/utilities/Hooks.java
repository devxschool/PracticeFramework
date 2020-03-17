package utilities;

import cucumber.api.Scenario;
import cucumber.api.java.After;
import drivers.DriverFactory;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;

public class Hooks {

    @After
    public void tearDown(Scenario scenario){
        //CLEAN UP AFTER EVERY TEST, I.E. CLOSING THE DRIVER AFTER EACH SCENARIO
        //TAKE SCREENSHOT IF THE SCENARIO IS FAILING
        try{
            //taking screenshot and adding to the report
            if(scenario.isFailed()){
                final byte[] screenshot = ((TakesScreenshot) DriverFactory.getDriver()).getScreenshotAs(OutputType.BYTES);
                scenario.embed(screenshot, "image/png");
            }
        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        DriverFactory.closeDriver();
    }

}
