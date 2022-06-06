package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyHomeService {

    public static void isViewClockifyHomeLoaded() {
        MobileActionManager.waitVisibility(ClockifyHomeConstants.TOOL_BAR_HOME_CLOCKIFY_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeConstants.TOOL_BAR_HOME_CLOCKIFY_LOCATOR));
    }

    public static void clickAddTimeEntry(String title) {
        MobileActionManager.click(ClockifyHomeConstants.ADD_TIME_ENTRY_LOCATOR);
    }

    public static void goToSettings() {
        MobileActionManager.click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        MobileActionManager.waitVisibility(ClockifyHomeConstants.SETTING_BUTTON_LOCATOR);
        MobileActionManager.click(ClockifyHomeConstants.SETTING_BUTTON_LOCATOR);
    }

    public static void goToTimeTracker() {
        MobileActionManager.click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        MobileActionManager.waitVisibility(ClockifyHomeConstants.TIME_TRACKER_BUTTON_LOCATOR);
        MobileActionManager.click(ClockifyHomeConstants.TIME_TRACKER_BUTTON_LOCATOR);
    }

    public static void logOut() {
        MobileActionManager.click(ClockifyHomeConstants.NAVIGATION_DRAWER_LOCATOR);
        MobileActionManager.click(ClockifyHomeConstants.LOG_OUT_BUTTON_LOCATOR);
        MobileActionManager.waitVisibility(ClockifyHomeConstants.LOG_OUT_CONFIRM_BUTTON_LOCATOR);
        MobileActionManager.click(ClockifyHomeConstants.LOG_OUT_CONFIRM_BUTTON_LOCATOR);
    }
}
