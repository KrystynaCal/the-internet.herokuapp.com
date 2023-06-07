package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropPage {
    private By clickDragDndDropTabLinkBy = By.cssSelector("a[href='/drag_and_drop']");

    private By Element_ABy  = By.id("column-a");
    private By Element_BBy  = By.id("column-b");
    private WebDriver driver;

    public DragAndDropPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDragDndDropTab(){
        WebElement clickDragDndDropTabLink = driver.findElement(clickDragDndDropTabLinkBy);
        clickDragDndDropTabLink.click();

    }
    public void drag_and_drop(){
        WebElement Element_A = driver.findElement(Element_ABy);
        WebElement Element_B = driver.findElement(Element_BBy);
//        int x = Element_B.getLocation().x;
//        int y = Element_B.getLocation().y;
        Actions act = new Actions(driver);
        act.dragAndDrop(Element_B, Element_A ).build().perform();

    }
}
