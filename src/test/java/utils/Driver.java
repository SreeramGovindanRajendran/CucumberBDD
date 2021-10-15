package utils;

import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.Objects;

public class Driver {

	public WebDriver driver;

	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void tearDown() {
		if(Objects.nonNull(driver))
		{
			driver.quit();
		}
	}
}
