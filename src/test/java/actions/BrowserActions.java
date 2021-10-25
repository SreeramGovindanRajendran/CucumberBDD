package actions;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.locators.RelativeLocator;
import utils.Driver;

import java.time.Duration;

public class BrowserActions {
    Driver dr = new Driver();

    public void launchURL(){
        dr.init();
        Driver.driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        Driver.driver.manage().timeouts().scriptTimeout(Duration.ofMinutes(1));
        Driver.driver.manage().timeouts().pageLoadTimeout(Duration.ofMinutes(2));
        Driver.driver.get("https://opensource-demo.orangehrmlive.com/");
        Driver.driver.manage().window().maximize();
        WebElement loginButton = Driver.driver.findElement(By.cssSelector("#btnLogin"));
        WebElement username = Driver.driver.findElement(RelativeLocator.with(By.name("txtUsername")).above(loginButton));
        WebElement password = Driver.driver.findElement(RelativeLocator.with(By.cssSelector("#txtPassword")).below(username));
        username.sendKeys("Admin");
        password.sendKeys("admin123");
        loginButton.click();
        dr.tearDown();
    }
}
