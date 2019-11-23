package testCases;

import java.io.IOException;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import pageObjcet.BoostMobileLoginObject;
import resources.MainClass;

public class BoostMobileLoginTest extends MainClass {
	BoostMobileLoginObject obj;

	@BeforeTest
	public void invokeBrowser() throws IOException {

		driver = initalizebrowser();
		
	}

	@Test(dataProvider ="UserInformation" )
	public void UserLoginInformation(String number, String pin) throws InterruptedException {

		driver.get(pro.getProperty("urlBoost"));
		Thread.sleep(2000);
		obj = new BoostMobileLoginObject(driver);
		WebDriverWait wait= new WebDriverWait(driver, 10);
		wait.until(ExpectedConditions.elementToBeClickable(obj.LoginLink()));
		obj.LoginLink().click();
		obj.sendPhoneNumber().sendKeys(number);
		obj.sendPin().sendKeys(pin);
		obj.ClinkLoginButton().click();
	}

	@DataProvider
	public Object[][] UserInformation() {

		Object[][] obj = new Object[2][2];
		obj[0][0] = "7573587255";
		obj[0][1] = "1987";
		
		obj[1][0]="7576601027";
		obj[1][1]="1996";
		return  obj;
	}
	@AfterTest
	public void exit() {
		driver.quit();
	//driver=null;
	}
}
