package testCases;


import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.InputFormPageObject;
import pageObjcet.LandingPageObject;
import resources.MainClass;

public class LandingpageTest extends MainClass{
	
	InputFormPageObject ip;
	@BeforeTest
	public void InvokeBrowser() throws IOException {
	
			driver=initalizebrowser();
	}
	
	@Test
	public void landingPage() throws InterruptedException {
		driver.get(pro.getProperty("url"));
		LandingPageObject ld= new LandingPageObject(driver);
		ld.clicPractice().click();
		 String check = ld.Check().getText();
		Assert.assertEquals(check,"Demo Home");
		
		Thread.sleep(1000);
		 ip= new InputFormPageObject(driver);
		ip.clickMainPage().click();
		ip.sendMessage().sendKeys("This is my Test Message");
		ip.clickButton().click();
		String text = ip.getTest().getText();
		System.out.println(text);
		
	}
	@Test()
	public void validation() {
		Assert.assertEquals(ip.validation().getText(), "Two Input Fields");
	}
	
	@AfterTest
	public void exit() {
		driver.quit();
		driver=null;
	}

}
