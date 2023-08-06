package resources;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base{

	public Properties prop;
	public static WebDriver driver;

	public WebDriver openBrowser() throws IOException {

		prop = new Properties();
		String propertiesPath = System.getProperty("user.dir") + "\\src\\main\\java\\resources\\data.properties";
		FileInputStream fis = new FileInputStream(propertiesPath);
		prop.load(fis);

		String browserName = prop.getProperty("browser");

		if (browserName.equalsIgnoreCase("chrome")) {
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();

		} else if (browserName.equalsIgnoreCase("firefox")) {

			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();

		} else if (browserName.equalsIgnoreCase("IE")) {

			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();

		}
		// maximize window
		driver.manage().window().maximize();

		// PageLoadTimeout code
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// code to delete all cookies
		driver.manage().deleteAllCookies();
		
		

		return driver;

	}

}
