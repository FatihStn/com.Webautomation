package BaseTest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.openqa.selenium.support.ui.WebDriverWait;
import utils.Driver;
import utils.Pages;

import java.time.Duration;

public class Hooks {


    private static String browser = Driver.browser;
    protected static Pages pages = new Pages();
    protected static WebDriverWait wait;


    @BeforeAll
    public static void setUp() {
        Driver.getDriver().get("https://InarAcademy:Fk160621.@test.inar-academy.com");
        if (browser.equalsIgnoreCase("firefox")) {
            Driver.getDriver().navigate().refresh();
        }
        wait = new WebDriverWait(Driver.getDriver(), Duration.ofSeconds(10));
    }

    @AfterAll
    public static void tearDown() {
        Driver.closeDriver();
    }

}
