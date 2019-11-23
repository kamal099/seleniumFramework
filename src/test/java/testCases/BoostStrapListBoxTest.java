package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.ListBoxObject;
import resources.MainClass;

public class BoostStrapListBoxTest extends MainClass {

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver = initalizebrowser();
		driver.get(pro.getProperty("url"));
	}

	@Test
	public void BootStrapLstBox() throws InterruptedException {

		ListBoxObject lbo = new ListBoxObject(driver);
		lbo.clickMenu().click();
		lbo.boostStrapListBox().click();
		Thread.sleep(1000);
		lbo.ulList().click();
		lbo.AddItems().click();

	}
	@AfterTest
	public void ExitBrowser() {
		driver.quit();
		driver=null;
	}

}
