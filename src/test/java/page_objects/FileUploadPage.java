package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FileUploadPage {
    private WebDriver driver;

    private By FileUploadTabLinkBy = By.cssSelector("a[href='/upload']");
    private By UploadButtonBy = By.id("file-upload");

    private By SubmitButtonBy = By.id("file-submit");


    public FileUploadPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFileUploadTab() {
        WebElement FileUploadTabLink = driver.findElement(FileUploadTabLinkBy);
        FileUploadTabLink.click();
    }
    public void clickFileUpload(){
        WebElement UploadButton = driver.findElement(UploadButtonBy);
        UploadButton.sendKeys("C:\\Users\\Krysia\\Desktop\\Selenium.jpg");
        driver.findElement(SubmitButtonBy).submit();
        if(driver.getPageSource().contains("File Uploaded!")) {
            System.out.println("file uploaded");
        }
        else{
            System.out.println("file not uploaded");
        }
    }
}
