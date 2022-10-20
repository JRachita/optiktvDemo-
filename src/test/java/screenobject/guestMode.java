package screenobject;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobject.ElementInitializer;

public class guestMode extends ElementInitializer {
    public guestMode(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.optiktv:id/enter_guest_mode")
    public MobileElement guestMode;
    public void clickOnGuestMode(){
        guestMode.click();
    }
}
