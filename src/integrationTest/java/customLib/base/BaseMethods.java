package customLib.base;

import customLib.base.methods.ClickMethods;
import customLib.base.methods.ConfigurationMethods;
import customLib.base.methods.InputMethods;
import customLib.base.methods.NavigateMethods;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public interface BaseMethods {


    //Driver Instance
    WebDriver DRIVER=DriverUtil.setUp();

    //Wait
    WebDriverWait WAIT=new WebDriverWait(DRIVER,10);

    //ClickMethods Methods Object
    ClickMethods CLICK_OBJ = ClickMethods.getInstance();

    //InputMethods Methods Object
    InputMethods INPUT_OBJ = InputMethods.getInstance();

    //Configuration Methods Object
    ConfigurationMethods CONFIG_OBJ = ConfigurationMethods.getInstance();

    //Navigate Methods Object
    NavigateMethods NAVIGATE_OBJ = NavigateMethods.getInstance();




}
