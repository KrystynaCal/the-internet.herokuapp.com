package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasicAuthPage {
    private WebDriver driver;
    private String username = "admin";
    private String password = "admin";
    private String domain = "the-internet.herokuapp.com/basic_auth";
    private By successful_statementBy = By.cssSelector("div.example p");
    //window popup for authentication
    //There are possibly three different ways:
    //-Passing credentials in the URL
    //-Using AutoIt tool
    //-Using ChromeDevTools Protocols API (introduced in Selenium 4)
    public BasicAuthPage(WebDriver driver) {
        this.driver = driver;
    }
    public String getUrl() {
        String url = "http://" + username + ":" + password + "@" + domain;
        driver.get(url);
        return url;
    }
    public String getHeader() {
        WebElement successful_statement = driver.findElement(this.successful_statementBy);
        return successful_statement.getText();
    }


}
