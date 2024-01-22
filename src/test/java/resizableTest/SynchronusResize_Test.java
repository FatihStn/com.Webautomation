package resizableTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;


public class SynchronusResize_Test extends Hooks {


    @Test
    public void testSynchronusResizeLink(){
        //Open the browser and navigate to the page
        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnResizableLink();
        pages.getWebAutomationPage().clickSynchronusResizeLink();


        int initialWidthResizableBox = pages.getSynchronousResizePage().getWidthOfAlsoResizableBox();
        int initialHeightResizableBox = pages.getSynchronousResizePage().getHeightOfAlsoResizableBox();

        int initialWidthAlsoResizableBox = pages.getSynchronousResizePage().getWidthOfAlsoResizableBox();
        int initialHeightAlsoResizableBox = pages.getSynchronousResizePage().getHeightOfAlsoResizableBox();

        //Drag the resize handle to resize the resizable element
        pages.getSynchronousResizePage().resizeTheResizableBox(50,50);

        int finalWidthResizableBox = pages.getSynchronousResizePage().getWidthOfAlsoResizableBox();
        int finalHeightResizableBox = pages.getSynchronousResizePage().getHeightOfAlsoResizableBox();

        int finalWidthAlsoResizableBox = pages.getSynchronousResizePage().getWidthOfAlsoResizableBox();
        int finalHeightAlsoResizableBox = pages.getSynchronousResizePage().getHeightOfAlsoResizableBox();

        //Verify the resizableBox
        Assertions.assertTrue(initialWidthResizableBox < finalWidthResizableBox);
        Assertions.assertTrue(initialHeightResizableBox < finalHeightResizableBox);

        //Verify the alsoResizableBox
        Assertions.assertTrue(initialWidthAlsoResizableBox < finalWidthAlsoResizableBox);
        Assertions.assertTrue(initialHeightAlsoResizableBox < finalHeightAlsoResizableBox);
    }
}
