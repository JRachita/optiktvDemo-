package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.When;
import pageobject.CommonMediator;

public class onDemand {

    @And("user click on the OnDemand tab")
    public void userClickOnTheOnDemandTab() {
        CommonMediator.onDemandTab().clickONDemandTab();
    }
    @And("user scrolls to look for a movie with 18A rating")
    public void userScrollsToLookForAMovieWithARating() {
        CommonMediator.onDemandTab().scrollToMovies();
        CommonMediator.movieDetailScreen().clickOnMovies();
        CommonMediator.onDemandTab().scrollToGetRating();
    }

    @When("user click on the 18A rating")
    public void userClickOnTheARating (){
        CommonMediator.onDemandTab().clickOnMoviesWith18ARating();
    }

}
