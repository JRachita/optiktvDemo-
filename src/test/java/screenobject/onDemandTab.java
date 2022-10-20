package screenobject;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import pageobject.CommonMediator;
import pageobject.ElementInitializer;

public class onDemandTab extends ElementInitializer {
    public onDemandTab(MobileDriver<MobileElement> driver) {
        super(driver);
    }
    @AndroidFindBy(accessibility = "On Demand")
    public MobileElement onDemand;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='18A' and @index='4']")
    public MobileElement rating18A;

    public void clickONDemandTab(){
        onDemand.click();
    }
    public void scrollToMovies() {
        CommonMediator.scrollToView("Movies >");
    }
    public void scrollToGetRating(){
        CommonMediator.scrollToView("18A");
    }
    public void clickOnMoviesWith18ARating() {
        rating18A.click();
    }
}
