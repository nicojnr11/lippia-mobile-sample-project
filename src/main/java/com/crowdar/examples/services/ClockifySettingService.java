package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeConstants;
import com.crowdar.examples.constants.ClockifySettingConstants;
import org.testng.Assert;

public class ClockifySettingService {

    public static void switchDarkmode() {
        MobileActionManager.click(ClockifySettingConstants.SETTING_DARK_MODE_LOCATOR);
    }

    public static void switchShowNotification() {
        MobileActionManager.click(ClockifySettingConstants.SETTING_SHOW_NOTIFICATIONS_LOCATOR);
    }
}
