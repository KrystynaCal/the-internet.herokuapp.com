package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AddRemovePage {

    private WebDriver driver;
    private By addRemoveTabLinkBy = By.xpath("//li/a[@href='/add_remove_elements/']");
    private By headerBy = By.xpath("//div/h3");
    private By addButtonBy = By.tagName("button");
    private By deleteButtonBy = By.xpath("//div[@id='elements']/button");

    public AddRemovePage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickAddRemoveTab() {
        WebElement addRemoveTabLink = driver.findElement(addRemoveTabLinkBy);
        addRemoveTabLink.click();
    }


    //def add_remove_content_visible(driver_instance):
    //    elem = wait_for_visibility_of_element_id(driver_instance, content)
    //    return elem.is_displayed()

    public String getHeaderText() {
        WebElement header = driver.findElement(headerBy);
        return header.getText();
    }

    public void addElement() {
        WebElement addButton = driver.findElement(addButtonBy);
        addButton.click();
    }

    public void deleteElement() {
        WebElement deleteButton = driver.findElement(deleteButtonBy);
        deleteButton.click();
//        waitUntilInvisibilityOfElementXPath(driver, removeElementButton);
    }
//    private static void waitUntilVisibilityOfElementXPath(WebDriver driver, String xpath) {
//        // Implement waiting for visibility of element using appropriate method or library
//    }

}
