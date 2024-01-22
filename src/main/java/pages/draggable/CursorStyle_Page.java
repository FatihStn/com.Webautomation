package pages.draggable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class CursorStyle_Page extends BasePage {
    @FindBy(id = "draggable9")
    private WebElement firstDraggable;

    @FindBy(id = "draggable10")
    private WebElement secondDraggable;

    @FindBy(id = "draggable11")
    private WebElement thirdDraggable;

//    public void getLocationOfCursor(){
//
//    }
}
