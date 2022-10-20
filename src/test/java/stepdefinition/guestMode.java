package stepdefinition;
import io.cucumber.java.en.Given;
import pageobject.CommonMediator;

public class guestMode {

    @Given("user launch the app and enter as guest mode")
    public void userLaunchTheAppAndEnterAsGuestMode() {
        CommonMediator.guestMode().clickOnGuestMode();
    }

}
