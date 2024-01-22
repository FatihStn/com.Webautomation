package pages.autocomplete;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

import java.util.List;

public class AccentFolding_Page extends BasePage {

    @FindBy(id = "developer-accentFolding")
    private WebElement inputBox;

    @FindBy(css = "#ui-id-40 > li > div")
    private List<WebElement> nameList;

    public void writeText(String text){
        inputBox.sendKeys(text);
    }
    public void clearText(){
        inputBox.clear();
    }
    public List<String> getNameList(){
       return nameList.stream().map(WebElement::getText).toList();
    }

}
