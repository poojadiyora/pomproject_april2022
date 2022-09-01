package util;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.BeforeMethod;

public class Browsefactory1 {

	static WebDriver driver;
	static String browser;
    static String url;

	public static void readingconfig() {
		// inputStrem//BufferedReader //FileReader// Scanner

		try {
			InputStream input = new FileInputStream("src\\main\\java\\config\\config.properties");
			Properties prop = new Properties();
			prop.load(input);
			browser = prop.getProperty("browser");
			url = prop.getProperty("url");

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	// http://www.techfios.com/billing/?ng=admin/
	
	@BeforeMethod
	public static WebDriver init() {
	readingconfig();
	if(browser.equalsIgnoreCase( "chrome") ){
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\diyor\\selenium\\class3\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
	}else if (browser.equalsIgnoreCase("firefox")){
		System.setProperty("webdriver.gecko.driver", "C:\\Users\\diyor\\selenium\\pompro\\driver1\\geckodriver.exe");
	    driver = new FirefoxDriver();
	}
		driver.manage().deleteAllCookies();
		driver.get(url);
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		return driver;

	}


	public static void teardown() throws InterruptedException {
//		Thread.sleep(5000);
		driver.close();
		driver.quit();
	}
}
