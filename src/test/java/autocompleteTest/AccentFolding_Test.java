package autocompleteTest;

import BaseTest.Hooks;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import utils.BrowserUtils;

import java.util.List;



public class AccentFolding_Test extends Hooks {

    @Test
    public void testAccentFoldingLink(){

        pages.getHomePage().clickOnWebAutomationLink();
        pages.getWebAutomationPage().clickOnAutoCompleteLink();
        pages.getWebAutomationPage().clickOnAccentFoldingLink();


        pages.getAccentFoldingPage().writeText("Jo");
        List<String> names = pages.getAccentFoldingPage().getNameList();


        Assertions.assertTrue(names.get(0).startsWith("Jörn"), "It should be start with Jörn");
        Assertions.assertTrue(names.get(1).startsWith("John"), "It should be start with John");


        pages.getAccentFoldingPage().clearText();
        pages.getAccentFoldingPage().writeText("Jö");
        BrowserUtils.wait(1);
        names = pages.getAccentFoldingPage().getNameList();


        Assertions.assertEquals(1 , names.size() , "There should be only one name");
        Assertions.assertTrue(names.get(0).startsWith("Jörn"), "It should be start with Jörn");

    }

}
