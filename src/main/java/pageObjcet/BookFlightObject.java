package pageObjcet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BookFlightObject {

	WebDriver driver;

	public BookFlightObject(WebDriver driver) {
		this.driver = driver;
	}

	By clickOnFlight = By.xpath("//div[contains(text(),'FLIGHTS')]");
	By from=By.xpath("//input[@id='flight-departure-airport0']");
	By destination=By.xpath("//input[@id='flight-arrival-airport0']");
	By departNreturn=By.xpath("//input[@placeholder='Departing – Returning']");
	By Date=By.xpath("//div[@class='sc-hmXxxW iAbrJd']");
	
	
	public WebElement clickFlight() {
		return driver.findElement(clickOnFlight);
	}

	public WebElement fromAddres() {
		return driver.findElement(from);
	}
	public WebElement destinationAdress() {
		return driver.findElement(destination);
	}
	public WebElement departNReturn() {
		return driver.findElement(departNreturn);
	}
	public List<WebElement> selectDate() {
		return driver.findElements(Date);
	}
	
}
