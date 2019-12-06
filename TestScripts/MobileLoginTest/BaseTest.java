package MobileLoginTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by Angelo on 12/4/2019.
 *
 * uid: 8AKY0MFM2
 */
public class BaseTest
{
    private WebDriver driver;
    private WebDriverWait wait;

    public void BaseTest()throws MalformedURLException
    {
        //The DesiredCapabilites that will be sent to the Appium server
        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("app", "C:\\Users\\Angelo\\Documents\\Healthie.apk");
        // Java package of the Android app you want to run- Ex:
        capabilities.setCapability("appPackage", "com.healthie.app.healthie");
        // Activity name for the Android activity you want to launch from your
        capabilities.setCapability("appActivity", "com.example.rayacevedo.healthie.Splash");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "Pixel 3 XL");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("platformVersion", "10");

        driver = new RemoteWebDriver(new URL("http://0.0.0.0:4723/wd/hub"), capabilities);
        wait = new WebDriverWait(driver, 5);
    }

}
