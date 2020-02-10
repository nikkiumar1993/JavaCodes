package steps_definitions;

import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import pages.google_pages.GoogleLandingPage;
import utilities.Driver;

public class Google_StepDefs {
    GoogleLandingPage googleLandingPage = new GoogleLandingPage();
    @When("User is on google homepage")
    public void user_is_on_google_homepage() {
     //1-get the google page
        Driver.getDriver().get("https://google.com");

    }

    @Then("User should see title contains Google")
    public void user_should_see_title_contains_Google() {
        // compare the actual title vs expected title
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "Google";
        Assert.assertTrue("Title does not contain expected value!", actualTitle.equals(expectedTitle));

    }
    @When("User types wooden spoon into the search box")
    public void user_types_wooden_spoon_into_the_search_box() {
     googleLandingPage.googleSearchBox.sendKeys("wooden spoon");
    }

    @When("User clicks to search button")
    public void user_clicks_to_search_button() {
    googleLandingPage.googleSearchBtn.click();
    }

    @Then("User should see wooden spoon in the title")
    public void user_should_see_wooden_spoon_in_the_title() {
        String actualTitle = Driver.getDriver().getTitle();
        String expectedTitle = "wooden spoon";
Assert.assertTrue("Actual title and expected title do not match",actualTitle.contains(expectedTitle));
    }
}
