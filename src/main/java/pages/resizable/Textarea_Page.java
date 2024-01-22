package pages.resizable;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class Textarea_Page extends BasePage {

    @FindBy(id = "resizable-text-area-res")
    private WebElement textArea;

    @FindBy(css = ".ui-wrapper > .ui-icon")
    private WebElement handle;

    public void writeTextArea(String text){
        textArea.sendKeys(text);
    }
    public void resizeTextArea(int xOffSet , int yOffSet){
        actions.dragAndDropBy(handle , xOffSet , yOffSet).perform();
    }

    public String getTextFromTextArea(){
        return textArea.getAttribute("value");
    }
    public void clearTextArea(){
        textArea.clear();
    }
    public int getWidthOfTextArea(){
        return textArea.getSize().getWidth();
    }
    public int getHeightOfTextArea(){
        return textArea.getSize().getHeight();
    }

}
