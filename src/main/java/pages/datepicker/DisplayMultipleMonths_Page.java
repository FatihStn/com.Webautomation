package pages.datepicker;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;


import java.util.List;

public class DisplayMultipleMonths_Page extends BasePage {

    @FindBy(id = "datepicker-multiple-months")
    private WebElement dateBox;

    @FindBy(id = "ui-datepicker-div")
    private WebElement datePicker;

    @FindBy(xpath = "//span[text()='Next']")
    private WebElement nextMarker;

    @FindBy(xpath = "//span[text()='Prev']")
    private WebElement prevMarker;

    @FindBy(xpath = "//td[@data-event='click']")
    private List<WebElement> selectableDays;


    public void clickDateBox(){
        dateBox.click();
    }
    public void writeDateToBox(String month , String day , String year){
        dateBox.sendKeys(month + "/" + day + "/" + year);
    }
    public void clearDateBox(){
        dateBox.clear();
    }

    public void selectDay(int month , int day , int year){
        for(int i = 0; i < selectableDays.size(); i++){
            if(selectableDays.get(i).getAttribute("data-month").equals((month - 1) + "") &&
                    selectableDays.get(i).getAttribute("data-year").equals(year + "") &&
                    selectableDays.get(i).findElement(By.tagName("a")).getAttribute("data-date").equals(day + "")){
                selectableDays.get(i).click();
                break;
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
                break;
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

    public String getDateFromBox(){
        return dateBox.getAttribute("value");
    }





}
