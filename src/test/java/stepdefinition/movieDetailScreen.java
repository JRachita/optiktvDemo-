package stepdefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import pageobject.CommonMediator;

public class movieDetailScreen {
    @Then("user verifies the 18A rating movie is displayed on the movie details page")
    public void userVerifiesTheARatingMovieIsDisplayedOnTheMovieDetailsPage() {
        CommonMediator.movieDetailScreen().assertOn18ARating();
    }

    @And("user scrolls to look for a movie with rating")
    public void userScrollsToLookForAMovieWithRating() {
        CommonMediator.onDemandTab().scrollToMovies();
        CommonMediator.movieDetailScreen().clickOnMovies();
    }

    @Then("user get the requested rating")
    public void userGetTheRequestedRating() {
        CommonMediator.movieDetailScreen().supportRatingForMovies();
    }
}
