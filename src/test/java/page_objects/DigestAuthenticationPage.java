package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;


public class DigestAuthenticationPage {
    private By clickDigestAuthenticationTabLinkBy = By.cssSelector("a[href='/digest_auth'");
    private WebDriver driver;
    private String username = "admin";
    private String password = "admin";
    private String domain = "the-internet.herokuapp.com/digest_auth";
    private By successfulStatementBy = By.cssSelector(".example p");

    public DigestAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickDigestAuthenticationTab() {
        WebElement clickDigestAuthenticationTabLink = driver.findElement(clickDigestAuthenticationTabLinkBy);
        clickDigestAuthenticationTabLink.click();
    }

    public String sendCridentials() {
        String url = "http://" + username + ":" + password + "@" + domain;
        driver.get(url);
        return url;
    }

    public String getHeader() {
        WebElement successfulStatement = driver.findElement(successfulStatementBy);
        return successfulStatement.getText();
    }
}
