package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyLoginService {

    public static void isViewClockifyLoaded() {
        MobileActionManager.waitVisibility(ClockifyLoginConstants.SING_UP_CLOCKIFY_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyLoginConstants.INPUT_LOGIN_LOCATOR),ClockifyLoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void doLoginClockify(String email, String pass){
        MobileActionManager.setInput(ClockifyLoginConstants.INPUT_LOGIN_LOCATOR, email);
        MobileActionManager.setInput(ClockifyLoginConstants.INPUT_PASSWORD_LOCATOR, pass);
    }

    public static void clickLogin() {
        MobileActionManager.click(ClockifyLoginConstants.BUTTON_LOGIN_LOCATOR);
    }
}
