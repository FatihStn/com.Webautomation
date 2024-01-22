package pages.droppable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class RevertDraggablePosition_Page extends BasePage {

    @FindBy(id = "draggable-revert-draggable")
    private WebElement firstDraggable;

    @FindBy(id = "draggable2-revert-draggable")
    private WebElement secondDraggable;

    @FindBy(id = "droppable-revert-draggable")
    private WebElement Droppable;

    public void moveFirstDraggableToDroppable(){
        actions.dragAndDrop(firstDraggable , Droppable).perform();
    }

    public void moveSecondDraggableToDroppable(){
        actions.dragAndDrop(secondDraggable , Droppable).perform();
    }
    public Point getLocationOfFirstDraggable(){
        return firstDraggable.getLocation();
    }
    public Point getLocationOfSecondDraggable(){
        return secondDraggable.getLocation();
    }
    public void moveSecondDraggable(int xOffSet , int yOffSet){
        actions.dragAndDropBy(secondDraggable , xOffSet, yOffSet).perform();
    }




}
