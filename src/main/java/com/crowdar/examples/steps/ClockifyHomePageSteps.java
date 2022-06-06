package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyHomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class ClockifyHomePageSteps extends PageSteps {

    @And("Clockify home page is displayed")
    public void isHomeClockifyisDisplayed() {
        ClockifyHomeService.isViewClockifyHomeLoaded();

    }

    @When("The user go to (.*)")
    public void goToAddTimeEntry(String title) {
        ClockifyHomeService.clickAddTimeEntry(title);
    }

}
