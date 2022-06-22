package com.crowdar.examples.services;

import static com.crowdar.core.actions.MobileActionManager.*;
import com.crowdar.examples.constants.ClockifySettingConstants;


public class ClockifySettingService {

    public static void switchDarkmode() {
        click(ClockifySettingConstants.SETTING_DARK_MODE_LOCATOR);
    }

    public static void switchShowNotification() {
        click(ClockifySettingConstants.SETTING_SHOW_NOTIFICATIONS_LOCATOR);
    }
}
