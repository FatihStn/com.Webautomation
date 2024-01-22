package pages.droppable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Accept_Page extends BasePage {

    @FindBy(id = "draggable-nonvalid-accept")
    private WebElement firstDraggable;

    @FindBy(id = "draggable-accept")
    private WebElement secondDraggable;

    @FindBy(id = "droppable-accept")
    private WebElement acceptDroppable;


    public void moveFirstDraggableToAcceptDroppable(){
        actions.dragAndDrop(firstDraggable , acceptDroppable).perform();
    }

    public void moveSecondDraggableToAcceptDroppable(){
        actions.dragAndDrop(secondDraggable , acceptDroppable).perform();
    }

    public boolean isAcceptDroppableHighLighted(){
        return acceptDroppable.getAttribute("class").contains("highlight");
    }

    public Point getDroppableElementLeftTop(){
        return acceptDroppable.getLocation();
    }
    public Point getDroppableElementRightBelow(){
        return new Point(acceptDroppable.getLocation().getX() + acceptDroppable.getSize().getWidth() ,
                acceptDroppable.getLocation().getY() + acceptDroppable.getSize().getHeight());
    }

    public Point getFirstDraggableElementLeftTop(){
        return firstDraggable.getLocation();
    }

    public Point getFirstDraggableElementRightBelow(){
        return new Point(firstDraggable.getLocation().getX() + firstDraggable.getSize().getWidth() ,
                firstDraggable.getLocation().getY() + firstDraggable.getSize().getHeight());
    }
    public Point getSecondDraggableElementLeftTop(){
        return secondDraggable.getLocation();
    }

    public Point getSecondDraggableElementRightBelow(){
        return new Point(secondDraggable.getLocation().getX() + secondDraggable.getSize().getWidth() ,
                secondDraggable.getLocation().getY() + secondDraggable.getSize().getHeight());
    }
    public String getAcceptDroppableText(){
        return acceptDroppable.getText();
    }



}
