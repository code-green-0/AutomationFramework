package customLib.base.methods;

import customLib.base.BaseMethods;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

public class InputMethods implements BaseMethods {

    private static InputMethods obj=null;

    public static InputMethods getInstance()
    {
        if(obj==null)
            obj=new InputMethods();

        return obj;

    }

    public void enterText(WebElement textBox,String text)
    {
        WAIT.until(ExpectedConditions.elementToBeClickable(textBox));
        textBox.sendKeys(text);
    }
}
