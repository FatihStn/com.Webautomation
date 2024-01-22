package iframeTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class NormalIframe_Test extends Hooks {

    @Test
    public void testNormalIframe(){
        //1. Land on home page
        //2. Click on webautomation link
        pages.getHomePage().clickOnWebAutomationLink();

        BrowserUtils.scrollDownWithPageDown();

        //3.Click on Iframe link
        pages.getWebAutomationPage().clickOnIframeLink();

        BrowserUtils.scrollUpWithPageUp();

        //4.Click on Normal Iframe link
        pages.getWebAutomationPage().clickOnNormalIframeLink();

        //5.Verify that the header text "Inar academy" In iframe
        String expectedHeader = "Inar academy";
        pages.getNormalIframePage().switchToIFrame();
        String actualHeader = pages.getNormalIframePage().getHeaderInFrame();
        Assertions.assertEquals(expectedHeader, actualHeader, "Wrong Header !");

        //6.Verify that the link text "More information..." In frame
        String expectedLinkText = "More information...";
        String actualLinkText = pages.getNormalIframePage().getLinkTextInFrame();
        Assertions.assertEquals(expectedLinkText, actualLinkText, "Wrong Link Text !");

        //7.Verify that the link is "https://www.iana.org/domains/example"
        String expectedLink = "https://www.iana.org/domains/example";
        String actualLink = pages.getNormalIframePage().getLinkInFrame();
        Assertions.assertEquals(expectedLink, actualLink, "Wrong Link !");

    }

}
