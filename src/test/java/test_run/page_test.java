package test_run;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.junit.Assert.assertEquals;

public class page_test {


    @Test
    public void tests(){
        WebDriver driver = new ChromeDriver();
        driver.get("http://the-internet.herokuapp.com/");
        WebElement mainHeader = driver.findElement(By.className("heading"));
        assertEquals("Welcome to the-internet", mainHeader.getText());
        WebElement h2Header = driver.findElement(By.xpath("//div[@id='content']/h2"));
        assertEquals("Available Examples", h2Header.getText());


        //cliking on link to Add/Remove Elements
        WebElement addRemoveElements = driver.findElement(By.xpath("//li/a[@href='/add_remove_elements/']"));
        addRemoveElements.click();
        //checking the header text
        WebElement addRemoveHeaders = driver.findElement(By.xpath("//div/h3"));
        assertEquals(addRemoveHeaders.getText(), "Add/Remove Elements");
        //adding first element
        driver.findElement(By.tagName("button")).click();
        //adding second element
        driver.findElement(By.tagName("button")).click();
        //deleting two elements
        driver.findElement(By.xpath("//div[@id='elements']/button")).click();
        driver.findElement(By.xpath("//div[@id='elements']/button")).click();


//        driver.quit();
    }
}
