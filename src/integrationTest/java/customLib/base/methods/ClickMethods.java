package customLib.base.methods;


import customLib.base.BaseMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;


public class ClickMethods implements BaseMethods {

    private static ClickMethods obj=null;

    public static ClickMethods getInstance()
    {
        if(obj==null)
            obj=new ClickMethods();

        return obj;

    }

    public void click(WebElement element)
    {
        WAIT.until(ExpectedConditions.elementToBeClickable(element));
        element.click();
    }
}
