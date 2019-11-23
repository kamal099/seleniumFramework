package testCases;

import java.io.IOException;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.LandingPageObject;
import pageObjcet.SelectDropDownLIst;
import resources.MainClass;

public class DropDownList extends MainClass {
	
	
	@BeforeTest
	public void invokebrowser() throws IOException {
		driver=initalizebrowser();
		
	}
	
	@Test
	public void dropdown() {
		
		driver.get(pro.getProperty("url"));
		LandingPageObject ld= new LandingPageObject(driver);
		ld.clicPractice().click();
		
		SelectDropDownLIst dl= new SelectDropDownLIst(driver);
		dl.clicItem();
	}

	@AfterTest
	public void close() {
		driver.quit();
		driver=null;
	}
}
