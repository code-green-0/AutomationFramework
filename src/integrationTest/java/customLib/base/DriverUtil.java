package customLib.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;

public class DriverUtil implements BaseMethods {

    private static WebDriver driver=null;

    public static WebDriver setUp()
    {
        if(driver==null)
        {
            driver = getLocalDriver();
        }
        return driver;
    }

    private static WebDriver getLocalDriver()
    {
        String browser=CONFIG_OBJ.getPropertyValue("Browser");

        switch (browser.toLowerCase())
        {
            case "chrome":
                driver = getChromeDriver();
                break;
            case "firefox":
                System.setProperty("webdriver.gecko.driver","/home/manish/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
            default:
                System.setProperty("webdriver.gecko.driver","/home/manish/Downloads/geckodriver");
                driver = new FirefoxDriver();
                break;
        }



        return  driver;
    }

    private static WebDriver getChromeDriver(){
        System.setProperty("webdriver.chrome.driver",CONFIG_OBJ.getPropertyValue("Chrome_Path"));

        ChromeOptions options = new ChromeOptions();

        options.addArguments("--no-sandbox");
        options.addArguments("--disable-dev-shm-usage");

        driver = new ChromeDriver(options);

        return driver;
    }

}
