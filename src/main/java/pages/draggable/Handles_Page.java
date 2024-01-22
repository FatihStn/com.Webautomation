package pages.draggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Handles_Page extends BasePage {

    @FindBy(id = "draggable13")
    private WebElement firstDraggable;

    @FindBy(css = "#draggable13 p")
    private WebElement firstDraggableHandle;

    @FindBy(id = "draggable14")
    private WebElement secondDraggable;

    @FindBy(css = "#draggable14 .ui-widget-header")
    private WebElement secondDraggableHandle;

    public void dragFirstDraggableFromHandle(int xOffset , int yOffset){
        actions.dragAndDropBy(firstDraggableHandle , xOffset , yOffset).perform();
    }
    public void dragFirstDraggableOutOfHandle(int xOffset , int yOffset){
        actions.moveToElement(firstDraggable , 0 , 40).clickAndHold().moveByOffset(xOffset, yOffset).release().perform();

    }
    public void dragSecondDraggableFromHandle(int xOffset , int yOffset){
        actions.dragAndDropBy(secondDraggableHandle , xOffset , yOffset).perform();
    }

    public Point getLocationOfFirstDraggable(){
        return firstDraggable.getLocation();
    }
    public Point getLocationOfSecondDraggable(){
        return secondDraggable.getLocation();
    }


}
