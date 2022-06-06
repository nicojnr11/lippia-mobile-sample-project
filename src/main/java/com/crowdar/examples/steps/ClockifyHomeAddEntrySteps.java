package com.crowdar.examples.steps;

import com.crowdar.core.PageSteps;
import com.crowdar.examples.services.ClockifyHomeAddEntryService;
import com.crowdar.examples.services.ClockifyHomeService;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;

public class ClockifyHomeAddEntrySteps extends PageSteps {


    @And("The user set start time with (.*) hours, (.*) minutes")
    public void theUserSetStartTimeWithHoursMinutes(String hours, String minutes) {
        ClockifyHomeAddEntryService.setStartTime(hours,minutes);
    }

    @And("The user set to manual add entry")
    public void theUserSetToManualAddEntry() {
        ClockifyHomeService.clickAddTimeEntry("Add entry");
        ClockifyHomeAddEntryService.doManualAddEntry();
    }

    @And("The user set end time with (.*) hours, (.*) minutes")
    public void theUserSetEndTimeWithHoursMinutes(String hours, String minutes) {
        ClockifyHomeAddEntryService.setEndTime(hours,minutes);
    }

    @And("The user click in save button")
    public void theUserClickInSaveButton() {
        ClockifyHomeAddEntryService.clickSaveAddEntry();
    }

    @And("The user set (.*) in working description")
    public void theUserSetDescriptionInWorkingDescription(String description) {
        ClockifyHomeAddEntryService.setWorkingDescription(description);
    }

    @And("The user set calendar with day: (.*), month: (.*), year: (.*)")
    public void setCalendar(String day, String month, String year) {
        ClockifyHomeAddEntryService.setCalendar(day,month,year);
    }

    @Then("The user click in discard")
    public void theUserClickInDiscard() {
        ClockifyHomeAddEntryService.clickDiscard();
    }
}
