package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class AlertTypes_ShowConfirm_Test extends Hooks {

    @Test
    public void testShowConfirm(){

        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();


        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();


        pages.getAlertTypesPage().clickOnShowConfirmButton();

        BrowserUtils.wait(2);


        String expectedText = "Are you sure?";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");

        BrowserUtils.wait(2);


        pages.getAlertTypesPage().confirmTheAlert();


        String expectedText2 = "Confirmed!";
        String actualText2 = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText2, actualText2, "Wrong Text Prompted !");


        pages.getAlertTypesPage().confirmTheAlert();


        pages.getAlertTypesPage().clickOnShowConfirmButton();

        BrowserUtils.wait(2);


        pages.getAlertTypesPage().cancelTheAlert();
    }
}
