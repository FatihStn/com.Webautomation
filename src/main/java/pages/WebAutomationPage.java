package pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;


public class WebAutomationPage extends BasePage {

    @FindBy(linkText = "Draggable")
    private WebElement draggableLink;

    @FindBy(linkText = "Default Functionality")
    private WebElement defaultFunctionalityLink;

    @FindBy(linkText = "Auto Scrolling")
    private WebElement autoScrollingLink;

    @FindBy(linkText = "Droppable")
    private WebElement droppableLink;

    @FindBy(linkText = "Resizable")
    private WebElement resizableLink;

    @FindBy(linkText = "Selectable")
    private WebElement selectableLink;

    @FindBy(linkText = "Iframe")
    private WebElement iframeLink;

    @FindBy(linkText = "Nested Iframe")
    private WebElement nestedIframeLink;

    @FindBy(linkText = "Alerts")
    private WebElement alertsLink;

    @FindBy(linkText = "Animate")
    private WebElement animateLink;

    @FindBy(linkText = "Constrain Movement")
    private WebElement constrainMovementLink;

    @FindBy(linkText = "Handles")
    private WebElement handlesLink;

    @FindBy(linkText = "Accept")
    private WebElement acceptLink;

    @FindBy(linkText = "Synchronus Resize")
    private WebElement synchronusResizeLink;

    @FindBy(linkText = "Revert draggable position")
    private WebElement revertDraggablePositionLink;

    @FindBy(linkText = "Textarea")
    private WebElement textAreaLink;

    @FindBy(linkText = "Serialize")
    private WebElement serializeLink;

    @FindBy(linkText = "Normal Iframe")
    private WebElement normalIframeLink;

    @FindBy(linkText = "Events")
    private WebElement eventsLink;

    @FindBy(linkText = "Autocomplete")
    private WebElement autoCompleteLink;

    @FindBy(linkText = "Accent Folding")
    private WebElement accentFoldingLink;

    @FindBy(linkText = "Menu")
    private WebElement menuLink;

    @FindBy(linkText = "Icons")
    private WebElement iconsLink;

    @FindBy(linkText = "Progress Bar")
    private WebElement progressBarLink;

    @FindBy(linkText = "Download Dialog")
    private WebElement downloadDialogLink;

    @FindBy(linkText = "Datepicker")
    private WebElement datePickerLink;

    @FindBy(linkText = "Display Multiple Months")
    private WebElement displayMultipleMonthsLink;

    @FindBy(linkText = "Select Date Range")
    private WebElement selectDateRangeLink;



    public void clickOnDraggableLink() {
        draggableLink.click();
    }

    public void clickOnDraggableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }

    public void clickOnDroppableDefaultFunctionalityLink() {
        defaultFunctionalityLink.click();
    }
    public void clickOnDroppableLink() {
        droppableLink.click();
    }

    public void clickOnAutoScrollingLink() {
        autoScrollingLink.click();
    }

    public void clickOnResizableLink(){
        resizableLink.click();
    }

    public void clickOnResizableDefaultFuncLink(){
        defaultFunctionalityLink.click();
    }

    public void clickOnSelectableLink(){
        selectableLink.click();
    }

    public void clickOnDefaultFunctionality(){
        defaultFunctionalityLink.click();
    }

    public void clickOnIframeLink(){
        iframeLink.click();
    }

    public void clickOnNestedIframe(){
        nestedIframeLink.click();
    }

    public void clickOnAlertsLink(){
        alertsLink.click();
    }

    public void clickOnAnimateLink(){
        animateLink.click();
    }

    public void clickOnDraggableConstrainMovementLink() {
      constrainMovementLink.click();
    }

    public void clickOnDraggableHandlesLink() {
        handlesLink.click();
    }
    public void clickOnAcceptLink(){
        acceptLink.click();
    }
    public void clickSynchronusResizeLink(){
        synchronusResizeLink.click();
    }
    public void clickOnRevertDraggablePositionLink(){
        revertDraggablePositionLink.click();
    }

    public void clickOnTextAreaLink(){
        textAreaLink.click();
    }

    public void clickOnSerializeLink(){
        serializeLink.click();
    }

    public void clickOnNormalIframeLink(){
        normalIframeLink.click();
    }
    public void clickOnEventsLink(){
        eventsLink.click();
    }
    public void clickOnAutoCompleteLink(){
        autoCompleteLink.click();
    }
    public void clickOnAccentFoldingLink(){
        accentFoldingLink.click();
    }
    public void clickOnMenuLink(){
        menuLink.click();
    }
    public void clickOnIconLink(){
        iconsLink.click();
    }
    public void clickOnProgressBarLink(){
        progressBarLink.click();
    }
    public void clickOnDownloadDialogLink(){
        downloadDialogLink.click();
    }
    public void clickOnDatePickerLink(){
        datePickerLink.click();
    }
    public void clickOnDisplayMultipleMonthsLink(){
        displayMultipleMonthsLink.click();
    }
    public void clickOnSelectDateRangeLink(){
        selectDateRangeLink.click();
    }




}
