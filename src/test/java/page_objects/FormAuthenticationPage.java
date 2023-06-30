package page_objects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class FormAuthenticationPage {
    WebDriver driver;
    private By FormAuthenticationTabLinkBy = By.cssSelector("a[href='/login']");
    private By UsernameBy = By.id("username");
    private By PasswordBy = By.id("password");
    private By LoginButtonBy = By.cssSelector(".radius");
    private By UnsuccessfulLoginAlertBy = By.cssSelector("#flash");

    public FormAuthenticationPage(WebDriver driver) {
        this.driver = driver;
    }

    public void clickFormAuthenticationPage() {
        WebElement FormAuthentication = driver.findElement(FormAuthenticationTabLinkBy);
        FormAuthentication.click();
    }

    public void successfulLogin() {
        WebElement Username = driver.findElement(UsernameBy);
        WebElement Password = driver.findElement(PasswordBy);
        WebElement LoginButton = driver.findElement(LoginButtonBy);
        Username.sendKeys("tomsmith");
        Password.sendKeys("SuperSecretPassword!");
        LoginButton.click();

    }

    public void unsuccessfulLogin() {
        WebElement Username = driver.findElement(UsernameBy);
        WebElement Password = driver.findElement(PasswordBy);
        WebElement LoginButton = driver.findElement(LoginButtonBy);
        Username.sendKeys("Invalid_Login");
        Password.sendKeys("Invalid_Password");
        LoginButton.click();
        WebElement UnsuccessfulLoginAlert = driver.findElement(UnsuccessfulLoginAlertBy);
        boolean UnsuccessfulLoginInfo = UnsuccessfulLoginAlert.isDisplayed();
        if (UnsuccessfulLoginInfo) {
            System.out.println("Wyświetlił się alert");
        } else {
            System.out.println("Brak napisu!");
        }

    }


}
