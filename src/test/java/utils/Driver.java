package utils;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Driver {

	public WebDriver driver;
	
	public void init() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}
	
	public void tearDown() {
		if(driver!=null)
		driver.quit();
	}
}
