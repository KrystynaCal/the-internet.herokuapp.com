package test_run;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import page_objects.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class PageTest {

    private WebDriver driver;
    private AddRemovePage addRemovePage;
    private HomePage homePage;
    private BasicAuthPage basicAuthPage;
    private BrokenImagesPage brokenImagesPage;
    private CheckboxesPage checkboxesPage;
    private ContextMenuPage contextMenuPage;

    @Before
    public void setup() {
        driver = new ChromeDriver();
        addRemovePage = new AddRemovePage(driver);
        driver.get("http://the-internet.herokuapp.com/");
        homePage = new HomePage(driver);
        basicAuthPage = new BasicAuthPage(driver);
        brokenImagesPage = new BrokenImagesPage(driver);
        checkboxesPage = new CheckboxesPage(driver);
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

    @Test
    public void broken_images_test() {
        brokenImagesPage.clickBrokenImagesTab();
        assertEquals(brokenImagesPage.getHeaderText(), "Broken Images");
        Assert.assertTrue("Image 1 is not displayed", brokenImagesPage.isImage1Displayed());
        Assert.assertTrue("Image 2 is not displayed", brokenImagesPage.isImage2Displayed());
        Assert.assertTrue("Image 3 is not displayed", brokenImagesPage.isGoodImageDisplayed());
    }

    @Test
    public void checkboxes_test() {
        checkboxesPage.clickCheckboxesTab();
        Assert.assertTrue(checkboxesPage.isDisplayed());
        checkboxesPage.clickCheckboxes();
    }

    @Test
    public void context_menu_test(){
        contextMenuPage = new ContextMenuPage(driver);
        contextMenuPage.clickContextMenuTab();
        assertTrue(contextMenuPage.isDisplayed());
        contextMenuPage.rightclick();
    }

    @After
    public void cleanup() {
        driver.quit();
    }
}
