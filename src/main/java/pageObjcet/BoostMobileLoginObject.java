package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BoostMobileLoginObject {

	WebDriver driver;

	public BoostMobileLoginObject(WebDriver driver) {
		this.driver = driver;
	}

	By clickLogin = By.linkText("Sign In");
	By phoneNumber = By.id("phoneID");
	By pin = By.id("pinID");
	By clickSingin = By.xpath("//button[@class='btn standard btn-primary']");

	public WebElement LoginLink() {

		return driver.findElement(clickLogin);
	}

	public WebElement sendPhoneNumber() {

		return driver.findElement(phoneNumber);
	}

	public WebElement sendPin() {

		return driver.findElement(pin);
	}

	public WebElement ClinkLoginButton() {

		return driver.findElement(clickSingin);
	}
}
