package testCases;

import java.io.IOException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.JavaScriptAlertObject;
import resources.MainClass;

public class JavaScriptAlertTest extends MainClass {

	JavaScriptAlertObject jsa;
	WebDriverWait wait;
	@BeforeTest
	public void invokebrowser() throws IOException {
		driver = initalizebrowser();
		driver.get(pro.getProperty("url"));
	}

	@Test
	public void AlerMessage() throws InterruptedException {

		jsa = new JavaScriptAlertObject(driver);
	//	Thread.sleep(2000);
		jsa.clickMenu().click();
		jsa.JavsScrpt().click();
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(jsa.singleAlret()));
		jsa.singleAlret().click();
		String text = driver.switchTo().alert().getText();
		Assert.assertEquals(text,"I am an alert box!");
		Thread.sleep(1000);
		driver.switchTo().alert().accept();
	}
	
	@Test
	public void AlertBox() throws InterruptedException {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(jsa.confirmBox()));
		//Thread.sleep(1000);
		jsa.confirmBox().click();
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		Thread.sleep(1000);
		alert.dismiss();
		Assert.assertEquals(text, "Press a button!");
	}
	
	@Test
	public void ConfirmBox() throws InterruptedException {
		wait=new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(jsa.confirmBox1()));
		jsa.confirmBox1().click();
		Alert alert = driver.switchTo().alert();
		alert.sendKeys("Hello i got text here");
		Thread.sleep(1000);
		alert.accept();
		
	}
	
	@AfterTest
	public void Exit() {
		driver.quit();
		
	}
}
