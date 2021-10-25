package utils;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Objects;

public class Driver {

	public static WebDriver driver;

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
