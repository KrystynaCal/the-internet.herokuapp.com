package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BrokenImagesPage {
    private WebDriver driver;
    private By brokenImagesTabLinkBy = By.cssSelector(" ul li a[href='/broken_images']");

    private By brokenImagesHeaderBy = By.cssSelector("div.example h3");
    private By brokenImage1By = By.cssSelector("div.example img[src='asdf.jpg']");
    private By brokenImage2By = By.cssSelector("div.example img[src='hjkl.jpg']");
    private By goodImageBy = By.cssSelector("div.example img[src='img/avatar-blank.jpg']");

    public BrokenImagesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickBrokenImagesTab() {
        WebElement brokenImagesTabLink = driver.findElement(brokenImagesTabLinkBy);
        brokenImagesTabLink.click();
    }

    public String getHeaderText() {
        WebElement brokenImagesHeader = driver.findElement(brokenImagesHeaderBy);
        return brokenImagesHeader.getText();
    }

    public boolean isImage1Displayed() {
        WebElement brokenImage1 = driver.findElement(brokenImage1By);
        return brokenImage1.isDisplayed();
    }
    public boolean isImage2Displayed() {
        WebElement brokenImage2 = driver.findElement(brokenImage2By);
        return brokenImage2.isDisplayed();
    }
    public boolean isGoodImageDisplayed() {
        WebElement goodImage = driver.findElement(goodImageBy);
        return goodImage.isDisplayed();
    }


}
