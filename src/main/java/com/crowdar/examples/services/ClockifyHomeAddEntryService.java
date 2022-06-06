package com.crowdar.examples.services;

import com.crowdar.core.actions.MobileActionManager;
import com.crowdar.examples.constants.ClockifyHomeAddEntryConstants;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

import static java.lang.Integer.parseInt;

public class ClockifyHomeAddEntryService {

    private static int monthInt;

    public static void doManualAddEntry() {
        MobileActionManager.waitVisibility(ClockifyHomeAddEntryConstants.START_TIME_LOCATOR);
        MobileActionManager.click(ClockifyHomeAddEntryConstants.START_TIME_LOCATOR);
        Assert.assertTrue(MobileActionManager.isVisible(ClockifyHomeAddEntryConstants.START_RATE_LOCATOR));

    }

    public static void setStartTime(String hours, String minutes) {
        MobileActionManager.click(ClockifyHomeAddEntryConstants.START_RATE_LOCATOR);
        scrollTime(hours,minutes);
        //MobileActionManager.setInput(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR,hours);
        //MobileActionManager.setInput(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR,minutes);
    }

    public static void setEndTime(String hours, String minutes) {
        MobileActionManager.click(ClockifyHomeAddEntryConstants.END_RATE_LOCATOR);
        scrollTime(hours, minutes);
        //MobileActionManager.setInput(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR,hours);
        //MobileActionManager.setInput(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR,minutes);
    }

    public static void clickSaveAddEntry(){
        MobileActionManager.click(ClockifyHomeAddEntryConstants.SAVE_BUTTON_LOCATOR);
    }

    public static void setWorkingDescription(String description) {
        MobileActionManager.setInput(ClockifyHomeAddEntryConstants.WORKING_DESCRIPTION_INPUT_LOCATOR,description);
    }

    public static void setCalendar(String day, String month, String year){
        String locatorCalendar = "XPATH://android.view.View[@content-desc=\""+day+" "+month+" "+year+"\"]";

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearNow  = localDate.getYear();

        int yearInt =  parseInt(year);

        while (!MobileActionManager.isPresent(locatorCalendar)) {
            if (yearInt < yearNow) {
                    MobileActionManager.click(ClockifyHomeAddEntryConstants.PREVIUS_MONTH_BUTTON_LOCATOR);
            }else{
                MobileActionManager.click(ClockifyHomeAddEntryConstants.NEXT_MONTH_BUTTON_LOCATOR);
            }
        }
        MobileActionManager.click(locatorCalendar);
    }



    private static void scrollTime(String hours, String minutes){
        String hoursExp = MobileActionManager.getText(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR);
        String minutesExp = MobileActionManager.getText(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR);

        int minuteInt = parseInt(minutes);
        int min30 = 30;

        int hoursInt = parseInt(hours);
        int hour12 = 12;

        while (!Objects.equals(hours, hoursExp)) {
            if (hoursInt < hour12){
                MobileActionManager.click(ClockifyHomeAddEntryConstants.HOURS_NEXT_DOWN_BUTTON_LOCATOR);
            }
            if(hoursInt > hour12){
                MobileActionManager.click(ClockifyHomeAddEntryConstants.HOURS_NEXT_UP_BUTTON_LOCATOR);
            }

            hoursExp = MobileActionManager.getText(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR);
        }

        while(!Objects.equals(minutes, minutesExp)){
            if (minuteInt > min30) {
                MobileActionManager.click(ClockifyHomeAddEntryConstants.MINUTES_NEXT_DOWN_BUTTON_LOCATOR);
            }
            if (minuteInt < min30){
                MobileActionManager.click(ClockifyHomeAddEntryConstants.MINUTES_NEXT_UP_BUTTON_LOCATOR);
            }
            minutesExp = MobileActionManager.getText(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR);
        }
    }

    public static void clickDiscard() {
        MobileActionManager.click(ClockifyHomeAddEntryConstants.DISCARD_BUTTON_LOCATOR);
        MobileActionManager.click(ClockifyHomeAddEntryConstants.DISCARD_DISCARD_BUTTON_LOCATOR);
    }
}
