package datepickerTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;


public class SelectDateRange_Test extends Hooks {

    @Test
    public void testSelectDateRangeLink(){
        //Open the url and navigate to page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDatePickerLink();
        pages.getWebAutomationPage().clickOnSelectDateRangeLink();

        pages.getSelectDateRangePage().clickFromDateBox();

        //Click next marker 1 times
        pages.getSelectDateRangePage().clickNextMarker();

        //Select "Apr" from dropdown
        pages.getSelectDateRangePage().selectFromDropDown("Apr");

        //Select "04/06/2024" as date from the calendar
        pages.getSelectDateRangePage().selectDay(4 , 6 , 2024);

        SoftAssertions softAssertions = new SoftAssertions();
        //Verify the selected day for from box
        softAssertions.assertThat(pages.getSelectDateRangePage().getDateInFromBox()).as("The selected day is false").isEqualTo("04/06/2024");

        //Click "to datebox"
        pages.getSelectDateRangePage().clickToDateBox();

        //Verify that if prev marker is clickable
        softAssertions.assertThat(pages.getSelectDateRangePage().isPrevMarkerClickable()).as("The button should not be clickable").isFalse();

        //Click on an unselectable day
        pages.getSelectDateRangePage().clickOnUnSelectableDay(3);

        //Verify that if the date is selected
        softAssertions.assertThat(pages.getSelectDateRangePage().getDateInToBox()).as("There should be empty").isEqualTo("");

        softAssertions.assertAll();

    }
}
