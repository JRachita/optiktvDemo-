package pageobject;

import env.DriverConfiguration;
import io.appium.java_client.MobileBy;
import io.appium.java_client.MobileDriver;
import io.appium.java_client.MobileElement;
import io.cucumber.java.eo.Do;
import org.junit.Assert;
import org.openqa.selenium.By;
import screenobject.guestMode;
import screenobject.movieDetailScreen;
import screenobject.onDemandTab;

import java.net.MalformedURLException;

public class CommonMediator {
    public static MobileDriver<MobileElement> driver;


            static {
                try {
                    DriverConfiguration configuration = DriverConfiguration.getInstance();
                    CommonMediator.driver = configuration.setUpConfiguration();
                } catch (MalformedURLException e) {

                    System.out.println(
                    "The session could not be established. Please check the app capabilities or app name matches proper naming conventions"
                            + e);
            throw new RuntimeException();
        }
    }
    public static void scrollToView(String element) {
                MobileElement androidElement = (MobileElement)driver.findElement(MobileBy.AndroidUIAutomator(
                        "new UiScrollable(new UiSelector().scrollable(true)).setAsVerticalList()" +
                        ".scrollIntoView(new UiSelector().text(\""+ element +"\"))"));
    }
    public static void supportRating(String rating,String ratingText){
                if(rating == "18+" ||  rating == "C8+" ||rating == "E"||rating == "14+"||rating == "G" ||rating == "PG" ||rating == "14A" ||rating == "R"||rating == "18A") {

                    MobileElement element = driver.findElement(By.xpath("//*[@class = 'android.widget.TextView' and @text='"+ ratingText +"']"));
                    Assert.assertEquals(element.getText(), ratingText);
                }
                else{
                    System.out.println("No ratings found");
                }
            }

    public static guestMode guestMode() {
                return new guestMode(driver);
    }

    public static onDemandTab onDemandTab(){
                return new onDemandTab(driver);
    }
    public static movieDetailScreen movieDetailScreen(){
                return new movieDetailScreen(driver);
    }

}



