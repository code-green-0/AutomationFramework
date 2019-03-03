package automationTest.pageObject;

import automationTest.pageObject.google.GooglePO;
import customLib.base.BaseMethods;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

public class InitPageObjects implements BaseMethods {

    private static InitPageObjects obj=null;
    private GooglePO googlePO=null;


    public static InitPageObjects getInstance()
    {
        if(obj==null)
        {
            obj=new InitPageObjects();
        }
        return obj;
    }
    public GooglePO getGooglePO()
    {
        if(googlePO==null)
        {
            googlePO= new GooglePO();
            PageFactory.initElements(new AjaxElementLocatorFactory(DRIVER,10),googlePO);
        }
        return googlePO;
    }
}
