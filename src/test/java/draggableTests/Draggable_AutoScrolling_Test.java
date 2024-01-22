package draggableTests;

import BaseTest.Hooks;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.Pages;


public class Draggable_AutoScrolling_Test extends Hooks {

    Pages pages = new Pages();

    @Test
    void testAutoScrolling() {
        //1. Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();

        //2. click on the draggable button
        pages.getWebAutomationPage().clickOnDraggableLink();

        //3. click on the auto scrolling button
        pages.getWebAutomationPage().clickOnAutoScrollingLink();

        //4. Drag the first draggable element by 215 pixels to the right
        pages.getAutoScrollingPage().dragFirstDraggableByXOffset(215);

        //5. Drag the third draggable element by -215 pixels to the left
        pages.getAutoScrollingPage().dragThirdDraggableByXOffset(-215);


        //6. Verify that the elements are ordered as "Three", "Two", "One"
        int finalX1 = pages.getAutoScrollingPage().getLocationOfFirstDraggableX();
        int finalX2 = pages.getAutoScrollingPage().getLocationOfSecondDraggableX();
        int finalX3 = pages.getAutoScrollingPage().getLocationOfThirdDraggableX();

        Assertions.assertThat(finalX3).isLessThan(finalX2);
        Assertions.assertThat(finalX2).isLessThan(finalX1);

    }
}
