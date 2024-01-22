package pages.draggable;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Events_Page extends BasePage {

    @FindBy(id = "draggable12")
    private WebElement draggableBox;

    @FindBy(id = "event-start")
    private WebElement startLabelBox;

    @FindBy(id = "event-drag")
    private WebElement dragLabelBox;

    @FindBy(id = "event-stop")
    private WebElement stopLabelBox;


    public void dragAndDropDraggable(int xOffSet , int yOffSet){
//        actions.clickAndHold(draggableBox).moveByOffset(xOffSet , yOffSet).release().build().perform();
        actions.dragAndDropBy(draggableBox , xOffSet , yOffSet).perform();

    }

    public String getNumberFromStartLabelBox(){
        return startLabelBox.findElement(By.cssSelector(".count")).getText();
    }
    public String getNumberFromDragLabelBox(){
        return dragLabelBox.findElement(By.cssSelector(".count")).getText();
    }
    public String getNumberFromStopLabelBox(){
        return stopLabelBox.findElement(By.cssSelector(".count")).getText();
    }

}
