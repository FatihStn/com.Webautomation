package alertsTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class AlertTypes_ShowPrompt_Test extends Hooks {

    @Test
    public void testShowPrompt(){


        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();


        pages.getWebAutomationPage().clickOnAlertsLink();

        BrowserUtils.scrollUpWithPageUp();


        pages.getAlertTypesPage().clickOnShowPromptButton();

        BrowserUtils.wait(2);


        String expectedText = "Enter your name:";
        String actualText = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");


        pages.getAlertTypesPage().enterInputIntoAlert("Inar");



        pages.getAlertTypesPage().confirmTheAlert();

        BrowserUtils.wait(2);


        String expectedText2 = "Hello, Inar!";
        String actualText2 = pages.getAlertTypesPage().getTextOfTheAlert();
        Assertions.assertEquals(expectedText, actualText, "Wrong Text Prompted !");


        pages.getAlertTypesPage().confirmTheAlert();


        pages.getAlertTypesPage().clickOnShowPromptButton();


        pages.getAlertTypesPage().cancelTheAlert();


    }
}
