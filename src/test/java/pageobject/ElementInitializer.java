package pageobject;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import org.openqa.selenium.support.PageFactory;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import java.time.Duration;


public abstract class ElementInitializer {
    public MobileDriver<MobileElement> driver;

    public ElementInitializer(MobileDriver<MobileElement> driver) {
        this.driver = driver;
        PageFactory.initElements(new AppiumFieldDecorator(driver, Duration.ofSeconds(60)), this);
    }
}

