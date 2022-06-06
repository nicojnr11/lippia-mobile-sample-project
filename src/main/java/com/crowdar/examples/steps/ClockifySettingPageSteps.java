package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyHomeService;
import com.crowdar.examples.services.ClockifySettingService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;


public class ClockifySettingPageSteps extends PageSteps {

    @And("The user click in dark mode")
    public void setDarkmode(){
        ClockifySettingService.switchDarkmode();
    }

    @And("The user click in show notification")
    public void theUserSetBooleanStatusShowNotificationInShowNotification() {
        ClockifySettingService.switchShowNotification();
    }

    @And("The user go setting page")
    public void theUserGoSettingPage() {
        ClockifyHomeService.goToSettings();
    }

    @Then("The user back to home page")
    public void theUserBackToHomePage() {
        ClockifyHomeService.goToTimeTracker();
    }

    @Then("The user release logout in app")
    public void theUserReleaseLogoutInApp() {
        ClockifyHomeService.logOut();
    }

}
