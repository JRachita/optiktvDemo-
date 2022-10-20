package env;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.remote.DesiredCapabilities;
import java.net.MalformedURLException;
import java.net.URL;


public class DriverConfiguration {

    private static DriverConfiguration instance;
    private DriverConfiguration() {

    }
    synchronized public static DriverConfiguration getInstance() throws MalformedURLException {
        if (instance == null) {
            instance = new DriverConfiguration();
        }
        return instance;
        }

    public MobileDriver<MobileElement> setUpConfiguration() throws MalformedURLException {

        DesiredCapabilities capabilities = new DesiredCapabilities();
        capabilities.setCapability("appPackage", "com.optiktv");
        capabilities.setCapability("appActivity", "com.telus.mediaroom.tvx.ui.main.MainActivity");
        capabilities.setCapability("automationName", "UiAutomator2");
        capabilities.setCapability("deviceName", "Pixel 2 API 30");
        capabilities.setCapability("platformVersion", "11");
        capabilities.setCapability("platformName", "Android");
        capabilities.setCapability("newCommandTimeout", "240");
        capabilities.setCapability("maxDuration", "10800");
        capabilities.setCapability("noReset", false);

        MobileDriver<MobileElement> driver = new AndroidDriver<MobileElement>(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);

        return driver;
    }


}


