package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
    private WebDriver driver;
    private By mainHeaderBy = By.className("heading");
    private By h2HeaderBy = By.xpath("//div[@id='content']/h2");

    public HomePage(WebDriver driver){
        this.driver = driver;
    }

    public String getMainHeaderText() {
        WebElement mainHeader = driver.findElement(mainHeaderBy);
        return mainHeader.getText();
    }

    public String getH2HeaderText() {
        WebElement h2Header = driver.findElement(h2HeaderBy);
        return h2Header.getText();
    }


//        assertEquals("Welcome to the-internet", mainHeader.getText());
//        WebElement h2Header = driver.findElement(By.xpath("//div[@id='content']/h2"));
//        assertEquals("Available Examples", h2Header.getText());
//    }
}
