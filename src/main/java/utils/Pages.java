package utils;

import pages.Menu.Icons_Page;
import pages.autocomplete.AccentFolding_Page;
import pages.HomePage;
import pages.WebAutomationPage;
import pages.alerts.AlertTypes_Page;
import pages.datepicker.DisplayMultipleMonths_Page;
import pages.datepicker.SelectDateRange_Page;
import pages.draggable.*;
import pages.droppable.Accept_Page;
import pages.droppable.Droppable_DefFunc_Page;
import pages.droppable.RevertDraggablePosition_Page;
import pages.iframe.NestedIframe_Page;
import pages.iframe.NormalIframe_Page;
import pages.progressbar.DownloadDialog_Page;
import pages.resizable.Animate_Page;
import pages.resizable.Resizable_DefFunc_Page;
import pages.resizable.SynchronousResize_Page;
import pages.resizable.Textarea_Page;
import pages.selectable.Selectable_DefFunc_Page;
import pages.selectable.Serialize_Page;

public class Pages {
    private AccentFolding_Page accentFoldingPage;
    private Accept_Page acceptPage;
    private AlertTypes_Page alertTypesPage;

    private Animate_Page animatePage;

    private AutoScrolling_Page autoScrollingPage;

    private ConstrainMovement_Page constrainMovementPage;

    private DisplayMultipleMonths_Page displayMultipleMonthsPage;

    private DownloadDialog_Page downloadDialogPage;

    private Draggable_DefFunc_Page draggableDefFuncPage;

    private Droppable_DefFunc_Page droppableDefFuncPage;
    private Events_Page eventsPage;

    private Handles_Page handlesPage;

    private HomePage homePage;
    private Icons_Page iconsPage;

    private NestedIframe_Page nestedIframePage;
    private NormalIframe_Page normalIframePage;

    private Resizable_DefFunc_Page resizableDefFuncPage;

    private RevertDraggablePosition_Page revertDraggablePositionPage;

    private Selectable_DefFunc_Page selectableDefFuncPage;

    private SelectDateRange_Page selectDateRangePage;
    private Serialize_Page serializePage;
    private SynchronousResize_Page synchronousResizePage;

    private Textarea_Page textareaPage;


    private WebAutomationPage webAutomationPage;
    public Pages() {
        homePage = new HomePage();
        webAutomationPage = new WebAutomationPage();
        draggableDefFuncPage = new Draggable_DefFunc_Page();
        autoScrollingPage = new AutoScrolling_Page();
        droppableDefFuncPage = new Droppable_DefFunc_Page();
        resizableDefFuncPage = new Resizable_DefFunc_Page();
        selectableDefFuncPage = new Selectable_DefFunc_Page();
        nestedIframePage = new NestedIframe_Page();
        alertTypesPage = new AlertTypes_Page();
        animatePage = new Animate_Page();
        constrainMovementPage = new ConstrainMovement_Page();
        handlesPage = new Handles_Page();
        acceptPage = new Accept_Page();
        synchronousResizePage = new SynchronousResize_Page();
        revertDraggablePositionPage = new RevertDraggablePosition_Page();
        textareaPage = new Textarea_Page();
        serializePage = new Serialize_Page();
        normalIframePage = new NormalIframe_Page();
        eventsPage = new Events_Page();
        accentFoldingPage = new AccentFolding_Page();
        iconsPage = new Icons_Page();
        downloadDialogPage = new DownloadDialog_Page();
        displayMultipleMonthsPage = new DisplayMultipleMonths_Page();
        selectDateRangePage = new SelectDateRange_Page();

    }

    public HomePage getHomePage() {
        return homePage;
    }

    public WebAutomationPage getWebAutomationPage() {
        return webAutomationPage;
    }

    public Draggable_DefFunc_Page getDraggableDefFuncPage() {
        return draggableDefFuncPage;
    }

    public AutoScrolling_Page getAutoScrollingPage() {
        return autoScrollingPage;
    }

    public Droppable_DefFunc_Page getDroppableDefFuncPage() {
        return droppableDefFuncPage;
    }

    public Resizable_DefFunc_Page getResizableDefFuncPage(){
        return resizableDefFuncPage;
    }

    public Selectable_DefFunc_Page getSelectableDefFuncPage(){
        return selectableDefFuncPage;
    }

    public NestedIframe_Page getNestedIframePage(){
        return nestedIframePage;
    }

    public AlertTypes_Page getAlertTypesPage(){
        return alertTypesPage;
    }

    public Animate_Page getAnimatePage(){
        return animatePage;
    }

    public ConstrainMovement_Page getConstrainMovementPage(){
        return constrainMovementPage;
    }
    public Handles_Page getHandlesPage(){
        return handlesPage;
    }
    public Accept_Page getAcceptPage(){
        return acceptPage;
    }
    public SynchronousResize_Page getSynchronousResizePage(){
        return synchronousResizePage;
    }
    public RevertDraggablePosition_Page getRevertDraggablePositionPage(){
        return revertDraggablePositionPage;
    }

    public Textarea_Page getTextareaPage(){
        return textareaPage;
    }
    public Serialize_Page getSerializePage(){
        return serializePage;
    }
    public NormalIframe_Page getNormalIframePage(){
        return normalIframePage;
    }
    public Events_Page getEventsPage(){
        return eventsPage;
    }
    public AccentFolding_Page getAccentFoldingPage(){
        return accentFoldingPage;
    }
    public Icons_Page getIconsPage(){
        return iconsPage;
    }
    public DownloadDialog_Page getDownloadDialogPage(){
        return downloadDialogPage;
    }
    public DisplayMultipleMonths_Page getDisplayMultipleMonthsPage(){
        return displayMultipleMonthsPage;
    }
    public SelectDateRange_Page getSelectDateRangePage(){
        return selectDateRangePage;
    }
}
