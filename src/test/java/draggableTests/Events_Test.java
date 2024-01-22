package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.SoftAssertions;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

public class Events_Test extends Hooks {

    @Test
    public void testEventsLink(){

        //Navigate to the link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnEventsLink();

        BrowserUtils.scrollDownWithPageDown();
        //Drag and drop the draggable box four times
        for(int i = 0; i < 4; i++) {
            pages.getEventsPage().dragAndDropDraggable(0, 15);
        }

        BrowserUtils.wait(4);

        //Verify the values on the box
        SoftAssertions softAssertions = new SoftAssertions();
        softAssertions.assertThat("4").isEqualTo(pages.getEventsPage().getNumberFromStartLabelBox());
        softAssertions.assertThat("80").isEqualTo(pages.getEventsPage().getNumberFromDragLabelBox());
        softAssertions.assertThat("4").isEqualTo(pages.getEventsPage().getNumberFromStopLabelBox());
        softAssertions.assertAll();
    }
}
