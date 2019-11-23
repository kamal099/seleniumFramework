package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.DragAndDropObject;
import resources.MainClass;

public class DragAndDropTest extends MainClass {
	
	private static  DragAndDropObject obj; 
	private static WebDriverWait wait;
	@BeforeTest
	public void invokeBrowser() throws IOException {
		
		driver=initalizebrowser();
		driver.get(pro.getProperty("url"));
	}

	@Test
	public void DrapAndDrop() throws InterruptedException {
		
		obj= new DragAndDropObject(driver);
		obj.clickMenu().click();
		obj.dragdrop().click();
		Actions action= new Actions(driver);
		//wait.until(ExpectedConditions.elementToBeClickable(obj.source()));
		WebElement source = obj.source();
		WebElement target = obj.Target();
		action.dragAndDrop(source, target).build().perform();
		
	}
	@AfterTest
	public void CloseBrowser() {
		driver.quit();
		driver=null;
	}
}
