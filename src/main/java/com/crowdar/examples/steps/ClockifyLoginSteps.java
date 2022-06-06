package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyLoginService;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClockifyLoginSteps extends PageSteps {

    @Given("Clockify app is displayed")
    public void isAppClockifyisDisplayed(){
        ClockifyLoginService.isViewClockifyLoaded();
    }

    @When("The user logs in the application clockify with: (.*), (.*)")
    public void theUserLogsInTheApplicationClockifyWithEmailPassword(String email, String pass) {
        ClockifyLoginService.doLoginClockify(email,pass);
    }

    @Then("The user click in login button")
    public void theUserClickInLoginButton() {
        ClockifyLoginService.clickLogin();
    }
}
