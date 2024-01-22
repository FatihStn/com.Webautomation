package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Textarea_Test extends Hooks {


    @Test
    public void testTextAreaLink(){

        //Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        pages.getWebAutomationPage().clickOnTextAreaLink();

        //Clear and write the text area
        pages.getTextareaPage().clearTextArea();
        pages.getTextareaPage().writeTextArea("This is a test writing");

        //Verify the text that is written
        Assertions.assertEquals("This is a test writing" , pages.getTextareaPage().getTextFromTextArea());

        //Get initial width and height
        int initialWidthTextArea = pages.getTextareaPage().getWidthOfTextArea();
        int initialHeightTextArea = pages.getTextareaPage().getHeightOfTextArea();

        //Drag the resize handle to resize the text area
        pages.getTextareaPage().resizeTextArea(75, 100);

        //Get final width and height
        int finalWidthTextArea = pages.getTextareaPage().getWidthOfTextArea();
        int finalHeightTextArea = pages.getTextareaPage().getHeightOfTextArea();

        //Verify that the text area has been resized
        Assertions.assertTrue(finalWidthTextArea > initialWidthTextArea , "The element should be wider");
        Assertions.assertTrue(finalHeightTextArea > initialHeightTextArea , "The element should be higher");

    }
}
