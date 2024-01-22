package datepickerTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;


public class DisplayMultipleMonths_Test extends Hooks {

   @Test
   public void testDisplayMultipleMonthsLink(){

       pages.getHomePage().clickOnWebAutomationLink();
       pages.getWebAutomationPage().clickOnDatePickerLink();
       pages.getWebAutomationPage().clickOnDisplayMultipleMonthsLink();


       pages.getDisplayMultipleMonthsPage().clickDateBox();
       for(int i = 0; i < 12; i++){
           pages.getDisplayMultipleMonthsPage().clickNextMarker();
       }
       pages.getDisplayMultipleMonthsPage().selectDay(3 , 5 , 2025);

       SoftAssertions softAssertions = new SoftAssertions();

       softAssertions.assertThat(pages.getDisplayMultipleMonthsPage().getDateFromBox()).as("The date is not equal to selected date").isEqualTo("03/05/2025");


       pages.getDisplayMultipleMonthsPage().clickDateBox();
       softAssertions.assertThat(pages.getDisplayMultipleMonthsPage().getSelectedDate()).as("The date is not equal to selected date").isEqualTo("03/05/2025");


       pages.getDisplayMultipleMonthsPage().clearDateBox();


       pages.getDisplayMultipleMonthsPage().writeDateToBox("03" , "04" , "2024");


       softAssertions.assertThat(pages.getDisplayMultipleMonthsPage().getSelectedDate()).as("The date is not equal to selected date").isEqualTo("03/04/2024");

       softAssertions.assertAll();
   }
}
