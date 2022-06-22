package com.crowdar.examples.services;

import static com.crowdar.core.actions.MobileActionManager.*;
import com.crowdar.examples.constants.ClockifyLoginConstants;
import org.testng.Assert;

public class ClockifyLoginService {

    public static void isViewClockifyLoaded() {
        waitVisibility(ClockifyLoginConstants.SING_UP_CLOCKIFY_LOCATOR);
        Assert.assertTrue(isVisible(ClockifyLoginConstants.INPUT_LOGIN_LOCATOR),ClockifyLoginConstants.VIEW_NOT_DISPLAYED_MESSAGE);
    }

    public static void doLoginClockify(String email, String pass){
        setInput(ClockifyLoginConstants.INPUT_LOGIN_LOCATOR, email);
        setInput(ClockifyLoginConstants.INPUT_PASSWORD_LOCATOR, pass);
    }

    public static void clickLogin() {
        click(ClockifyLoginConstants.BUTTON_LOGIN_LOCATOR);
    }
}
