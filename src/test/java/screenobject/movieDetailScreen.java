package screenobject;

import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.appium.java_client.pagefactory.AndroidFindBy;
import org.junit.Assert;
import pageobject.CommonMediator;
import pageobject.ElementInitializer;

public class movieDetailScreen extends ElementInitializer {
    public movieDetailScreen(MobileDriver<MobileElement> driver) {
        super(driver);
    }

    @AndroidFindBy(id = "com.optiktv:id/subText1")
    public MobileElement rating18Text;

    @AndroidFindBy(xpath = "//android.widget.TextView[@text='Movies >' and @index='0']")
            public MobileElement movies;

    public void assertOn18ARating() {
        String movieDetailsText = rating18Text.getText();
        Assert.assertEquals(movieDetailsText.substring(0, 3), "18A");
    }
    public void clickOnMovies(){
        movies.click();
    }

    public void supportRatingForMovies(){
        CommonMediator.supportRating("14A","14A");

    }

}
