package automationTest.runner;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
import customLib.base.DriverUtil;
import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.openqa.selenium.WebDriver;

@RunWith(Cucumber.class)
@CucumberOptions(plugin = {"pretty"},
        glue = "automationTest.stepDefinition",
        features = "integrationTest/resources/features",
        //tags = "",
        dryRun = false,
        monochrome = true)

public class TestRunner {


    private static WebDriver driver=null;
    @BeforeClass
    public static void initialization()
    {
        DriverUtil.setUp();
    }

    @AfterClass()
    public static void cleanUp()
    {
        if(driver!=null)
        {
            driver.quit();
            driver=null;
        }
    }


}
