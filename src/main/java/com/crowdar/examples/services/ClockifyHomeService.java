package com.crowdar.examples.services;

import static com.crowdar.core.actions.MobileActionManager.*;

import com.crowdar.examples.constants.ClockifyHomeConstants;
import org.testng.Assert;

public class ClockifyHomeService {

    public static void isViewClockifyHomeLoaded() {
        waitVisibility(ClockifyHomeConstants.TOOL_BAR_HOME_CLOCKIFY_LOCATOR);
        Assert.assertTrue(isVisible(ClockifyHomeConstants.TOOL_BAR_HOME_CLOCKIFY_LOCATOR));
    }

    public static void clickAddTimeEntry(String title) {
        click(ClockifyHomeConstants.ADD_TIME_ENTRY_LOCATOR);
    }

    public static void goToSettings() {
        click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        waitVisibility(ClockifyHomeConstants.SETTING_BUTTON_LOCATOR);
        click(ClockifyHomeConstants.SETTING_BUTTON_LOCATOR);
    }

    public static void goToTimeTracker() {
        click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        waitVisibility(ClockifyHomeConstants.TIME_TRACKER_BUTTON_LOCATOR);
        click(ClockifyHomeConstants.TIME_TRACKER_BUTTON_LOCATOR);
    }

    public static void logOut() {
        click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        click(ClockifyHomeConstants.LOG_OUT_BUTTON_LOCATOR);
        waitVisibility(ClockifyHomeConstants.LOG_OUT_CONFIRM_BUTTON_LOCATOR);
        click(ClockifyHomeConstants.LOG_OUT_CONFIRM_BUTTON_LOCATOR);
    }
}
