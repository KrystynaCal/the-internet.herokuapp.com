package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class ContextMenuPage {
    private WebDriver driver;

    private By contextmenu_TabBy = By.cssSelector("a[href='/context_menu']");
    private By contentBy = By.cssSelector("#hot-spot");

    public ContextMenuPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickContextMenuTab() {
        WebElement contextmenu_Tab = driver.findElement(contextmenu_TabBy);
        contextmenu_Tab.click();
    }

    public boolean isDisplayed() {
        WebElement content = driver.findElement(contentBy);
        return content.isDisplayed();
    }

    public void rightclick() {
        WebElement content = driver.findElement(contentBy);
        Actions actions = new Actions(driver);
        actions.contextClick(content).perform();
    }

}
