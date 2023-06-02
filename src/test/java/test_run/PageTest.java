package test_run;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.AddRemovePage;
import page_objects.BasicAuthPage;
import page_objects.HomePage;

import static org.junit.Assert.assertEquals;

public class PageTest {

    private WebDriver driver;
    private AddRemovePage addRemovePage;
    private HomePage homePage;
    private BasicAuthPage basicAuthPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        addRemovePage = new AddRemovePage(driver);
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        basicAuthPage = new BasicAuthPage(driver);
    }

    @Test
    public void home_page_test() {
        assertEquals("Welcome to the-internet", homePage.getMainHeaderText());
        assertEquals("Available Examples", homePage.getH2HeaderText());
    }

    @Test
    public void add_remove_test() {
        addRemovePage.clickAddRemoveTab();
        assertEquals("Add/Remove Elements", addRemovePage.getHeaderText());
        addRemovePage.addElement();
        addRemovePage.addElement();
        addRemovePage.deleteElement();
        addRemovePage.deleteElement();
    }

    @Test
    public void basic_auth_test() {
        basicAuthPage.getUrl();
        assertEquals("Congratulations! You must have the proper credentials.", basicAuthPage.getHeader());
    }


    @After
    public void cleanup() {
        driver.quit();
    }


}
