package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;

public class StatusCodesPage {
    WebDriver driver;
    public int res;
    public int res301;
    public int res404;
    public int res500;

    private By statusCodeTabLinkBy = By.cssSelector("a[href='/status_codes']");
    private By statusCodes200TabLinkBy = By.cssSelector("a[href='status_codes/200']");
    private By statusCodes301TabLinkBy = By.cssSelector("a[href='status_codes/301']");
    private By statusCodes404TabLinkBy = By.cssSelector("a[href='status_codes/404']");
    private By statusCodes500TabLinkBy = By.cssSelector("a[href='status_codes/500']");

    public StatusCodesPage(WebDriver driver) {
        this.driver = driver;
    }

    public void click_statusCodeTabLink() {
        WebElement statusCodeTab = driver.findElement(statusCodeTabLinkBy);
        statusCodeTab.click();
    }

    public void clickStatusCodes200TabLink() throws IOException {
        WebElement statusCodes200TabLink = driver.findElement(statusCodes200TabLinkBy);
        statusCodes200TabLink.click();
        HttpURLConnection cont = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/200").openConnection();
        cont.setRequestMethod("HEAD");
        cont.connect();
        res = cont.getResponseCode();
    }

    public int getRes() {
        return res;
    }

    public int getRes301() {
        return res301;
    }

    public int getRes404() {
        return res404;
    }

    public int getRes500() {
        return res500;
    }

    public void clickStatusCodes301TabLink() throws IOException {
        WebElement statusCodes301TabLink = driver.findElement(statusCodes301TabLinkBy);
        statusCodes301TabLink.click();
        HttpURLConnection cont = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/301").openConnection();
        cont.setRequestMethod("HEAD");
        cont.connect();
        res301 = cont.getResponseCode();
    }

    public void clickStatusCodes404TabLink() throws IOException {
        WebElement statusCodes404TabLink = driver.findElement(statusCodes404TabLinkBy);
        statusCodes404TabLink.click();
        HttpURLConnection cont = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/404").openConnection();
        cont.setRequestMethod("HEAD");
        cont.connect();
        res404 = cont.getResponseCode();
    }

    public void clickStatusCodes500TabLink() throws IOException {
        WebElement statusCodes500TabLink = driver.findElement(statusCodes500TabLinkBy);
        statusCodes500TabLink.click();
        HttpURLConnection cont = (HttpURLConnection) new URL("https://the-internet.herokuapp.com/status_codes/500").openConnection();
        cont.setRequestMethod("HEAD");
        cont.connect();
        res500 = cont.getResponseCode();
    }


}
