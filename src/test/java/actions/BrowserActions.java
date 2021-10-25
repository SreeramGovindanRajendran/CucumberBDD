package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import utils.Browser;

import java.time.Duration;

public class BrowserActions {

    public void launchURL(){
        Browser.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Browser.driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
        Browser.driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        Browser.driver.get("https://opensource-demo.orangehrmlive.com/");
        Browser.driver.manage().window().maximize();
        WebElement loginButton = Browser.driver.findElement(By.cssSelector("#btnLogin"));
        WebElement username = Browser.driver.findElement(RelativeLocator.with(By.name("txtUsername")).above(loginButton));
        WebElement password = Browser.driver.findElement(RelativeLocator.with(By.cssSelector("#txtPassword")).below(username));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
    }
}
