package progressbarTest;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;


public class DownloadDialog_Test extends Hooks {

    @Test
    public void testDownloadDialogLink(){
        //Open the url and navigate to Download dialog Link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnProgressBarLink();
        pages.getWebAutomationPage().clickOnDownloadDialogLink();

        //Click the start button
        pages.getDownloadDialogPage().clickOnStartButton();

        //Take two different screenshot
        BrowserUtils.wait(3);
        BrowserUtils.takeScreenShot("Download1.png");
        BrowserUtils.wait(1.5);
        BrowserUtils.takeScreenShot("Download2.png");

        //Verify that the download popup is displayed
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat(pages.getDownloadDialogPage().isDownLoadPopupDisplayed()).isTrue().as("The download popup should be displayed");

        //Click on cancel download button
        pages.getDownloadDialogPage().clickOnCancelDownloadButton();
        //Verify the download popup is closed
        softAssertions.assertThat(pages.getDownloadDialogPage().isDownLoadPopupDisplayed()).isFalse().as("The download popup should not be displayed");

        //Click the start button and click cross button
        pages.getDownloadDialogPage().clickOnStartButton();
        pages.getDownloadDialogPage().clickOnCrossButton();

        //Verify the download popup is closed
        softAssertions.assertThat(pages.getDownloadDialogPage().isDownLoadPopupDisplayed()).isFalse().as("The download popup should not be displayed");
        softAssertions.assertAll();
    }

}
