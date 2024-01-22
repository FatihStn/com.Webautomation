package droppableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import utils.BrowserUtils;

public class RevertDraggablePosition_Test extends Hooks {


    @Test
    public void testRevertDraggablePositionLink(){

        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDroppableLink();
        pages.getWebAutomationPage().clickOnRevertDraggablePositionLink();

        Point initialFirstDraggablePoint = pages.getRevertDraggablePositionPage().getLocationOfFirstDraggable();
        pages.getRevertDraggablePositionPage().moveFirstDraggableToDroppable();

        BrowserUtils.wait(1);
        Point finalFirstDraggablePoint = pages.getRevertDraggablePositionPage().getLocationOfFirstDraggable();

        Assertions.assertEquals(initialFirstDraggablePoint , finalFirstDraggablePoint , "The element should be revert");

        pages.getRevertDraggablePositionPage().moveSecondDraggableToDroppable();
        Point currentSecondDraggablePoint = pages.getRevertDraggablePositionPage().getLocationOfSecondDraggable();
        BrowserUtils.scrollDownWithPageDown();
        pages.getRevertDraggablePositionPage().moveSecondDraggable(75, 75);
        BrowserUtils.wait(1);
        Point finalSecondDraggablePoint = pages.getRevertDraggablePositionPage().getLocationOfSecondDraggable();

        Assertions.assertEquals(currentSecondDraggablePoint , finalSecondDraggablePoint , "The element should be in droppable box");






    }
}
