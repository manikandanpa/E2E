package test;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class BaseClass {
		public static WebDriver driver;
		//ChromeDriver driver;
	
		@BeforeMethod
		public void LoadBrowser() throws InterruptedException, FileNotFoundException, IOException {
		
		
		if (ConfigFileReader.fileReader("Browser").equalsIgnoreCase("Chrome")) {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.manage().window().maximize();
			driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
			driver.get("https://thetestingworld.com/testings/");
			
		} else if (ConfigFileReader.fileReader("Browser").equalsIgnoreCase("Firefox")) {
	//		driver = new FirefoxDriver();
			System.setProperty("webdriver.gecko.driver", "./Drivers/firefoxdriver.exe");
			driver.get("Application_URL");
		} else {
			
			System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
			driver = new ChromeDriver();
			driver.get("Application_URL");
		}
	}

}
