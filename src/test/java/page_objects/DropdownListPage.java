package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DropdownListPage {
    private WebDriver driver;
    private By DropdownTabLinkBy = By.cssSelector("a[href='/dropdown'");

    private By dropdown_headerBy = By.id("dropdown");
    private By option1By = By.cssSelector("option[value=\"1\"]");

    public DropdownListPage(WebDriver driver) {
        this.driver = driver;
    }


    public void clickDropdownTab() {
        WebElement DropdownTabLink = driver.findElement(DropdownTabLinkBy);
        DropdownTabLink.click();
    }

    public void clickDropdownHeader() {
        WebElement dropdown_header = driver.findElement(dropdown_headerBy);
        dropdown_header.click();
    }

    public void clickoption1() {
        WebElement option1 = driver.findElement(option1By);
        option1.click();
    }

    public void clickoption2() {
        Select dropdown = new Select(driver.findElement(dropdown_headerBy));
        dropdown.selectByVisibleText("Option 2");
    }


}


