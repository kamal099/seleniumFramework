package resources;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MainClass {

	/* 
	 * here we initazalie our browser setups 
	 */
	public static WebDriver driver ;
	private static FileInputStream file;
	public static Properties pro;

	public WebDriver initalizebrowser() throws IOException {
		
		pro=new Properties();
		file = new FileInputStream("C:\\Users\\Kamaluddin\\eclipse-workspace\\CucumberProject\\src\\main\\java\\resources\\config.properties");
		pro.load(file);
		String browser = pro.getProperty("browser");
		if (browser.contains("chrome")) {

			ChromeOptions	os= new ChromeOptions();
			System.setProperty("webdriver.chrome.driver", "F:\\Selenium Jar file\\chrome77\\chromedriver.exe");
			String path = System.getProperty("user.dir");
			Map<String, Object> prefs = new HashMap<String, Object>();
			prefs.put("download.default_directory",path);
			os.setExperimentalOption("prefs", prefs);
			driver = new ChromeDriver(os);
		} 
		else if (browser.contains("ff")) {
			System.setProperty("webdriver.gecko.driver", "F:\\Selenium Jar file\\chrome77\\gecko.exe");
			driver = new FirefoxDriver();
		} 
		else {
			System.out.println("Browser Name is Wrong");
		}

		driver.manage().window().maximize();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		return driver;
	}

	public static void takeScreenShot(String name) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Kamaluddin\\eclipse-workspace\\CucumberProject\\Failure testScreenShot\\"+name+"shot.png"));
	
	}
	
	public static void takeScreenShotSkipedTest(String name) throws IOException {
		File src= ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(src, new File("C:\\Users\\Kamaluddin\\eclipse-workspace\\CucumberProject\\Skiped TestScreenShot\\"+name+"shot.png"));
	
	}
}
