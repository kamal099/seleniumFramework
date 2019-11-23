package testCases;

import java.io.IOException;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.AlertAndModelObject;
import resources.MainClass;

public class AlertMenuTest extends MainClass {

	private static Logger log=LogManager.getLogger(AlertMenuTest.class.getName());
	AlertAndModelObject amo;

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initalizebrowser();
		log.info("Browser invoked");
		driver.get(pro.getProperty("url"));
		log.info("Url sent to browser");
	}

	// This will Open the Alert& Model menu
	@Test
	public void clickMenuItem() throws InterruptedException {

		amo = new AlertAndModelObject(driver);
		amo.getAlertMenu().click();
		log.info("Naivgation Menu clicked");
		amo.subMenu().click();
		log.info("JavaScript Alret Link clicked");
		amo.singleForm().click();
		log.info("Single Alret button clicked");
		Thread.sleep(1000);
		amo.saveChange().click();
		log.info("Alert message save change button clicked");

	}

	//Test Double Modal Form 
	@Test
	public void doubleFormClick() throws InterruptedException {
		// driver.get(pro.getProperty("url"));
		Thread.sleep(1000);
		log.info("multiple Alert Message button clicked");
		amo.doubleAlret().click();
		String text = amo.lanchModal().getText();
		System.out.println(text);
		Thread.sleep(1000);
		amo.lanchModal().click();
		amo.ClickClose().click();
		Thread.sleep(1000);
		amo.ClickX().click();

	}

	@AfterTest
	public void closeBrowser() {
		driver.quit();
		driver=null;
	}
}
