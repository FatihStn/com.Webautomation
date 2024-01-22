package draggableTests;

import BaseTest.Hooks;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.Point;
import org.openqa.selenium.support.ui.ExpectedConditions;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ConstrainMovement_Test extends Hooks {


    @Test
    public void testConstraintMovement(){
        //Open the url and navigate to constrain movement link
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnDraggableLink();
        pages.getWebAutomationPage().clickOnDraggableConstrainMovementLink();

        //Drag the first draggable element to the right and drop
        //Verify that the first draggable element does not move
        int initialFirstDragPointX = pages.getConstrainMovementPage().getLocationOfFirstDraggable().getX();
        pages.getConstrainMovementPage().dragFirstDraggable(10, 0);
        int finalFirstDragPointX = pages.getConstrainMovementPage().getLocationOfFirstDraggable().getX();
        assertEquals(initialFirstDragPointX, finalFirstDragPointX , "This element should not be dragged horizantally");

        //Drag the second draggable element to the below and drop
        //Verify that the second draggable element does not move
        int initialSecondDragPointY = pages.getConstrainMovementPage().getLocationOfSecondDraggable().getY();
        pages.getConstrainMovementPage().dragSecondDraggable(0 , 10);
        int finalSecondDragPointY = pages.getConstrainMovementPage().getLocationOfSecondDraggable().getY();
        assertEquals(initialSecondDragPointY , finalSecondDragPointY, "This element should not be dragged vertically");

        //Drag the third draggable element to up and left and drop
        //Verify that the third draggable element does not move
        Point initialThirdDragPoint = pages.getConstrainMovementPage().getLocationOfThirdDraggable();
        pages.getConstrainMovementPage().dragThirdDraggable(-50 , -50);
        Point finalThirdDragPoint = pages.getConstrainMovementPage().getLocationOfThirdDraggable();
        assertEquals(initialThirdDragPoint , finalThirdDragPoint , "The element should not move");

        //Drag the fourth draggable element to up and left and drop
        //Verify that the fourth draggable element in the parent element
        pages.getConstrainMovementPage().dragFourthDraggable(-100 , -100);
        Point fourthDragPoint = pages.getConstrainMovementPage().getLocationOfFourthDraggable();
        Point smallBoxPoint = pages.getConstrainMovementPage().getLocationOfSmallBox();
        assertTrue(smallBoxPoint.getX() < fourthDragPoint.getX());
        assertTrue(smallBoxPoint.getY() < fourthDragPoint.getY());




    }

}
