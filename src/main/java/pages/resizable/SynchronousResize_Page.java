package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class SynchronousResize_Page extends BasePage {

    @FindBy(id = "resizable-synchr-resize")
    private WebElement resizableBox;

    @FindBy(id ="also-synchr-resize")
    private WebElement alsoResizableBox;
    @FindBy(css = "#resizable-synchr-resize > div.ui-icon")
    private WebElement resizableBoxHandle;

    public void resizeTheResizableBox(int xOffset, int yOffset){
        actions.clickAndHold(resizableBoxHandle).moveByOffset(xOffset, yOffset).release().build().perform();
    }
    public int getWidthOfResizableBox(){
        return resizableBox.getSize().getWidth();
    }

    public int getHeightOfResizableBox(){
        return resizableBox.getSize().getHeight();
    }

    public int getWidthOfAlsoResizableBox(){
        return resizableBox.getSize().getWidth();
    }

    public int getHeightOfAlsoResizableBox(){
        return resizableBox.getSize().getHeight();
    }


}
