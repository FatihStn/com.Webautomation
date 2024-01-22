package pages.Menu;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


import java.util.ArrayList;
import java.util.List;

public class Icons_Page extends BasePage {

    @FindBy(xpath = "//ul[@id='menu-w-icons']/li")
    private List<WebElement> selectMenu;


    public void selectByIndex(int index){
        selectMenu.get(index - 1).click();
    }
    public List<String> getSubMenu(int index){
        actions.moveToElement(selectMenu.get(index - 1)).perform();
        List<String> subMenu = new ArrayList<>();
        if(!selectMenu.get(index - 1).findElements(By.cssSelector("ul > li")).isEmpty()) {
            List<WebElement> subMenuElements = selectMenu.get(index - 1).findElements(By.cssSelector("ul > li"));
            subMenu = subMenuElements.stream().map(WebElement::getText).toList();
        }

        return subMenu;
    }
}
