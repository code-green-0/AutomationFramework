package automationTest.stepDefinition;

import automationTest.pageObject.Helper;
import automationTest.pageObject.InitPageObjects;
import automationTest.pageObject.google.GooglePO;
import cucumber.api.java.en.Given;

public class GoogleSearchTest {

    //initializing helper and POs
    private Helper helper=Helper.getInstance();
    private InitPageObjects initPageObjects=InitPageObjects.getInstance();
    private GooglePO googlePO=initPageObjects.getGooglePO();
    private String appURL=helper.CONFIG_OBJ.getRegionProperty();

    @Given("^User is on Google Homepage$")
    public void launchGogole() throws InterruptedException {

        Thread.sleep(500);
        helper.NAVIGATE_OBJ.hitURL(appURL);
        helper.INPUT_OBJ.enterText(googlePO.getSearchTextBox(),"Java");

    }



}
