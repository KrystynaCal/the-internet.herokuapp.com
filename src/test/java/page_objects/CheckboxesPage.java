package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class CheckboxesPage {
    private WebDriver driver;
    private By checkboxes_TabBy = By.cssSelector("a[href='/checkboxes']");
    private By all_checkboxesBy = By.cssSelector("#checkboxes");
    private By checkbox_1By = By.xpath("//*[@id=\"checkboxes\"]/input[1]");
    private By checkbox_2By = By.xpath("//*[@id=\"checkboxes\"]/input[2]");

    public CheckboxesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickCheckboxesTab() {
        WebElement checkboxes_Tab = driver.findElement(checkboxes_TabBy);
        checkboxes_Tab.click();
    }

    public boolean isDisplayed() {
        WebElement all_checkboxes = driver.findElement(all_checkboxesBy);
        return all_checkboxes.isDisplayed();
    }

    public void clickCheckboxes() {
        WebElement checkbox_1 = driver.findElement(checkbox_1By);
        WebElement checkbox_2 = driver.findElement(checkbox_2By);
        checkbox_1.click();
        checkbox_2.click();
    }
}
