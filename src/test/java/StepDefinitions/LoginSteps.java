package StepDefinitions;

import Pages.Locators;
import Utilities.GWD;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class LoginSteps {
    Locators ls = new Locators();
    @Given("Navigate to CampusTechnoStudy")
    public void navigateToCampusTechnoStudy() {
        GWD.getDriver().get("https://campus.techno.study");
        GWD.getDriver().manage().window().maximize();
    }

    @When("User enters username as {string} and password as {string} to log in")
    public void userEntersUsernameAsAndPasswordAsToLogIn(String userN, String passW) {
        ls.findAndSend("username",userN);
        ls.findAndSend("password",passW);
    }
    @And("User clicks login button")
    public void userClicksLoginButton() {
        ls.findAndClick("cooky");
        ls.findAndClick("loginButton");
    }

    @Then("User should login successfully")
    public void userShouldLoginSuccessfully() {
        ls.findAndContainsText("loginSuccess","Merhaba");
    }

    @When("User enters invalid username {string} and or password {string} to log in")
    public void userEntersInvalidUsernameAndOrPasswordToLogIn(String userN, String passW) {
        ls.findAndSend("username",userN);
        ls.findAndSend("password",passW);
    }

    @Then("User should not login")
    public void userShouldNotLogin() {
        ls.findAndContainsText("loginFailure","Invalid ");
    }


}
