package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.Select;
import pages.BasePage;

import java.util.List;

public class SelectDateRange_Page extends BasePage {

    @FindBy(id = "from-selectDateRange")
    private WebElement fromDateBox;

    @FindBy(id = "to-selectDateRange")
    private WebElement toDateBox;

    @FindBy(xpath = "//a[@title='Next']")
    private WebElement nextMarker;

    @FindBy(xpath = "//a[@title='Prev']")
    private WebElement prevMarker;

    @FindBy(xpath = "//select[@class='ui-datepicker-month']")
    private WebElement monthDropDown;

    @FindBy(xpath = "//td[@data-event='click']")
    private List<WebElement> selectableDays;

    @FindBy(xpath = "//span[@class='ui-state-default']")
    private List<WebElement> unSelectableDays;

    public void clickFromDateBox(){
        fromDateBox.click();
    }
    public void clickToDateBox(){
        toDateBox.click();
    }

    public void writeFromDateBox(String month , String day , String year){
        fromDateBox.sendKeys(month + "/" + day + "/" + year);
    }

    public void writeToDateBox(String month , String day , String year){
        toDateBox.sendKeys(month + "/" + day + "/" + year);
    }

    public void clearFromDateBox(){
        fromDateBox.clear();
    }
    public void clearToDateBox(){ toDateBox.clear();
    }

    public void selectDay(int month , int day , int year){
        for(int i = 0; i < selectableDays.size(); i++){
            if(selectableDays.get(i).getAttribute("data-month").equals((month - 1) + "") &&
                    selectableDays.get(i).getAttribute("data-year").equals(year + "") &&
                    selectableDays.get(i).findElement(By.tagName("a")).getAttribute("data-date").equals(day + "")){
                selectableDays.get(i).click();
            }
        }
    }

    public void clickNextMarker(){
        nextMarker.click();
    }
    public void clickPrevMarker(){
        prevMarker.click();
    }

    public String getSelectedDate(){
        String month = "";
        String year = "";
        String day = "";
        for(int i = 0; i < selectableDays.size(); i++){
            if (selectableDays.get(i).findElement(By.tagName("a")).getAttribute("aria-current").equals("true")){
                month = selectableDays.get(i).getAttribute("data-month");
                year = selectableDays.get(i).getAttribute("data-year");
                day = selectableDays.get(i).findElement(By.tagName("a")).getAttribute("data-date");
            }
        }
        month = (Integer.parseInt(month) + 1) + "";
        if(Integer.parseInt(month) < 10){
            month = 0 + month;
        }
        if(Integer.parseInt(day) < 10){
            day = 0 + day;
        }
        return month + "/" + day + "/" + year;
    }

    public String getSelectedDateFromBox(){
        return getSelectedDate();
    }
    public String getSelectedDateToBox(){
        return getSelectedDate();
    }

    public String getDateInFromBox(){
        return fromDateBox.getAttribute("value");
    }

    public String getDateInToBox(){
        return toDateBox.getAttribute("value");
    }
    public void clickOnUnSelectableDay(int day){
        for(int i = 0; i < unSelectableDays.size(); i++){
            if(unSelectableDays.get(i).getText().equals(day + "")){
                actions.moveToElement(unSelectableDays.get(i)).click().perform();
            }
        }
    }

    public void selectFromDropDown(String month){
        Select select = new Select(monthDropDown);
        select.selectByVisibleText(month);
    }

    public boolean isNextMarkerClickable(){
        return !(nextMarker.getAttribute("class").contains("disabled"));
    }
    public boolean isPrevMarkerClickable(){
        return !(prevMarker.getAttribute("class").contains("disabled"));
    }
}
