package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.DownloadConfirmObject;
import resources.MainClass;

public class FileDownloadTest extends MainClass {
	
	WebDriverWait wait;
	private static Logger log=LogManager.getLogger(FileDownloadTest.class.getName());
	DownloadConfirmObject dco;
	@BeforeTest
	public void invokebrowser() throws IOException {
		
		driver=initalizebrowser();
		log.info("browser invoked");
		driver.get(pro.getProperty("url"));
		log.info("url sent to browser");
		
		
	}
	
	@Test
	public void DownloadFile() throws InterruptedException {
		
		//driver= new ChromeDriver(os);
		dco= new DownloadConfirmObject(driver);
		dco.clickMenu().click();
		log.info("Navigation Menu cliked");
		dco.clickSubItem().click();
		log.info("Download Link clicked");
		Thread.sleep(1000);
		dco.textBox().sendKeys("This is my First text");
		log.info("Test sent to textfiled");
		dco.create().click();
		log.info(".txt file has been created");
		wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(dco.Downlad()));
		dco.Downlad().click();
		log.info("File downloaded");
		Thread.sleep(1000);
		
	}
	
	@AfterTest
	public void exit()
	{
		driver.quit();
		driver=null;
	}

}
