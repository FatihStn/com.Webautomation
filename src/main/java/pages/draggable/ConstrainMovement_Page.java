package pages.draggable;

import org.openqa.selenium.Point;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class ConstrainMovement_Page extends BasePage {
   @FindBy(id = "draggable5")
    private WebElement firstDraggable;

   @FindBy(id = "draggable6")
    private WebElement secondDraggable;

   @FindBy(id = "draggable7")
    private WebElement thirdDraggable;

   @FindBy(id = "draggable8")
    private WebElement fourthDraggable;

   @FindBy(id = "containment-wrapper")
    private WebElement bigBox;

   @FindBy(css = "div[style='width: 120px; height: 120px;']")
    private WebElement smallBox;


   public void dragFirstDraggable(int xOffset , int yOffset){
       actions.dragAndDropBy(firstDraggable, xOffset , yOffset).perform();
   }

   public void dragSecondDraggable(int xOffset , int yOffset){
       actions.dragAndDropBy(secondDraggable , xOffset, yOffset).perform();
   }

   public void dragThirdDraggable(int xOffset , int yOffset){
       actions.dragAndDropBy(thirdDraggable , xOffset , yOffset).perform();
   }

   public void dragFourthDraggable(int xOffset , int yOffset){
       actions.dragAndDropBy(fourthDraggable , xOffset , yOffset).perform();
   }

    public Point getLocationOfFirstDraggable(){
       return firstDraggable.getLocation();
   }
    public Point getLocationOfSecondDraggable(){
        return secondDraggable.getLocation();
    }
    public Point getLocationOfThirdDraggable(){
        return thirdDraggable.getLocation();
    }
    public Point getLocationOfFourthDraggable(){
       return fourthDraggable.getLocation();
    }
    public Point getLocationOfBigBox(){
        return bigBox.getLocation();
    }

    public Point getLocationOfSmallBox(){
        return smallBox.getLocation();
    }




}
