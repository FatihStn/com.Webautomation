package pages.progressbar;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import pages.BasePage;

public class DownloadDialog_Page extends BasePage {

    @FindBy(id = "downloadButton-download-dialog")
    private WebElement startButton;

    @FindBy(css = "#dialog-container-download-dialog > div")
    private WebElement downloadPopup;

    @FindBy(css = "#dialog-container-download-dialog > div > div > div > button")
    private WebElement cancelDownloadButton;

    @FindBy(css = "#dialog-container-download-dialog > div > div > button")
    private WebElement crossButton;

    public void clickOnStartButton(){
        startButton.click();
    }

    public void clickOnCancelDownloadButton(){
       cancelDownloadButton.click();
    }
    public void clickOnCrossButton(){
        crossButton.click();
    }
    public boolean isDownLoadPopupDisplayed(){
        return downloadPopup.isDisplayed();
    }

}
