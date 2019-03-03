package automationTest.pageObject.google;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class GooglePO {

    //Google search text
    @FindBy(xpath = "//input[@name='q']")
    WebElement searchTextBox;


    public WebElement getSearchTextBox() {
        return searchTextBox;
    }
}
