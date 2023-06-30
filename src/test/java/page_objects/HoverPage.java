package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class HoverPage {
    private WebDriver driver;
    private By HoverTabLinkBy = By.cssSelector("a[href='/hovers']");
    private By firstImgBy = By.cssSelector("#content .figure:first-of-type img");
    private By CaptionUnderFirstImgBy = By.cssSelector("#content .figure a[href='/users/1']");
    private By secondImgBy = By.cssSelector(".example div.figure:nth-of-type(2)");
    private By CaptionUnderSecondImgBy = By.cssSelector(".figcaption a[href='/users/2']");

    public HoverPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickHoverTabLink() {
        WebElement HoverTabLink = driver.findElement(HoverTabLinkBy);
        HoverTabLink.click();
    }


    public void moveHoverFirstImg() {
        Actions actions = new Actions(driver);
        WebElement firstImg = driver.findElement(firstImgBy);
        actions.moveToElement(firstImg).perform();
        WebElement CaptionUnderFirstImg = driver.findElement(CaptionUnderFirstImgBy);
        boolean isDisplayed = CaptionUnderFirstImg.isDisplayed();
        if (isDisplayed) {
            System.out.println("Napis jest wyświetlony po najechaniu hoverem na zdjęcie nr 1.");
        } else {
            System.out.println("Napis nie jest wyświetlony po najechaniu hoverem na zdjęcie nr 1.");
        }
    }

    public void moveHoverSecondImg() {
        Actions actions = new Actions(driver);
        WebElement secondImg = driver.findElement(secondImgBy);
        actions.moveToElement(secondImg).perform();
        WebElement CaptionUnderSecondImg = driver.findElement(CaptionUnderSecondImgBy);
        boolean isDisplayed = CaptionUnderSecondImg.isDisplayed();
        if (isDisplayed){
            System.out.println("Napis jest wyświetlony po najechaniu hoverem na zdjęcie nr 2.");
        } else {
            System.out.println("Napis nie jest wyświetlony po najechaniu hoverem na zdjęcie nr 2.");
        }
    }


}

