

Feature: User is able to find 18A rating movie from OnDemand list by visiting guest mode

  Scenario: User launch the app as guest view mode and finds  18A rating movie from the OnDemand list
    Given user launch the app and enter as guest mode
    And user click on the OnDemand tab
    And user scrolls to look for a movie with 18A rating
    When user click on the 18A rating
    Then user verifies the 18A rating movie is displayed on the movie details page

  @demo
  Scenario: User launch the app as guest view mode and finds  method that supports different rating
    Given user launch the app and enter as guest mode
    And user click on the OnDemand tab
    When user scrolls to look for a movie with rating
    Then user get the requested rating




