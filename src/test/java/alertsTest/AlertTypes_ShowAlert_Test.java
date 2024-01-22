package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class AlertTypes_ShowAlert_Test extends Hooks {

    @Test
    void testShowAlert(){

        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();


        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();


        pages.getAlertTypesPage().clickOnShowAlertButton();

        BrowserUtils.wait(2);


        String expectedText = "This is an alert!";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");

        BrowserUtils.wait(2);

        
        pages.getAlertTypesPage().confirmTheAlert();
    }
}
