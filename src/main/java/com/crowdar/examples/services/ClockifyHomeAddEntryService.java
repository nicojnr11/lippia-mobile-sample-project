package com.crowdar.examples.services;

import com.crowdar.examples.constants.ClockifyHomeAddEntryConstants;
import org.testng.Assert;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Objects;

import static com.crowdar.core.actions.MobileActionManager.*;
import static java.lang.Integer.parseInt;

public class ClockifyHomeAddEntryService {

    private static int monthInt;

    public static void doManualAddEntry() {
        waitVisibility(ClockifyHomeAddEntryConstants.START_TIME_LOCATOR);
        click(ClockifyHomeAddEntryConstants.START_TIME_LOCATOR);
        Assert.assertTrue(isVisible(ClockifyHomeAddEntryConstants.START_RATE_LOCATOR));

    }

    public static void setStartTime(String hours, String minutes) {
        click(ClockifyHomeAddEntryConstants.START_RATE_LOCATOR);
        scrollTime(hours,minutes);
    }

    public static void setEndTime(String hours, String minutes) {
        click(ClockifyHomeAddEntryConstants.END_RATE_LOCATOR);
        scrollTime(hours, minutes);
    }

    public static void clickSaveAddEntry(){
        click(ClockifyHomeAddEntryConstants.SAVE_BUTTON_LOCATOR);
    }

    public static void setWorkingDescription(String description) {
        setInput(ClockifyHomeAddEntryConstants.WORKING_DESCRIPTION_INPUT_LOCATOR,description);
    }

    public static void setCalendar(String day, String month, String year){
        String calendar = day+" "+month+" "+year;

        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();
        int yearNow  = localDate.getYear();

        int yearInt =  parseInt(year);

        while (!isPresent(ClockifyHomeAddEntryConstants.CALENDAR_LOCATOR.replace("%s",calendar))) {
            if (yearInt < yearNow) {
                    click(ClockifyHomeAddEntryConstants.PREVIUS_MONTH_BUTTON_LOCATOR);
            }else{
                click(ClockifyHomeAddEntryConstants.NEXT_MONTH_BUTTON_LOCATOR);
            }
        }
        click(ClockifyHomeAddEntryConstants.CALENDAR_LOCATOR.replace("%s",calendar));
    }



    private static void scrollTime(String hours, String minutes){
        String hoursExp = getText(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR);
        String minutesExp = getText(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR);

        int minuteInt = parseInt(minutes);
        int min30 = 30;

        int hoursInt = parseInt(hours);
        int hour12 = 12;

        if((hoursInt>=00) && (hoursInt <24)){
        while (!Objects.equals(hours, hoursExp)) {
            if (hoursInt < hour12){
                click(ClockifyHomeAddEntryConstants.HOURS_NEXT_DOWN_BUTTON_LOCATOR);
            }
            if(hoursInt > hour12){
                click(ClockifyHomeAddEntryConstants.HOURS_NEXT_UP_BUTTON_LOCATOR);
            }

            hoursExp = getText(ClockifyHomeAddEntryConstants.TIME_HOURS_INPUT_LOCATOR);
         }
        } else{
            System.out.println("formato de hora incorrecta" + hoursInt);
        }

        if((minuteInt>=00) && (minuteInt <60)) {
            while (!Objects.equals(minutes, minutesExp)) {
                if (minuteInt > min30) {
                    click(ClockifyHomeAddEntryConstants.MINUTES_NEXT_DOWN_BUTTON_LOCATOR);
                }
                if (minuteInt < min30) {
                    click(ClockifyHomeAddEntryConstants.MINUTES_NEXT_UP_BUTTON_LOCATOR);
                }
                minutesExp = getText(ClockifyHomeAddEntryConstants.TIME_MINUTE_INPUT_LOCATOR);
            }
        }else {
                System.out.println("formato de hora incorrecta" + minuteInt);
         }
    }

    public static void clickDiscard() {
        click(ClockifyHomeAddEntryConstants.DISCARD_BUTTON_LOCATOR);
        click(ClockifyHomeAddEntryConstants.DISCARD_DISCARD_BUTTON_LOCATOR);
    }
}
