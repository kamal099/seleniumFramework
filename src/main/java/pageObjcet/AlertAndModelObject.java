package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class AlertAndModelObject {

	WebDriver driver;

	public AlertAndModelObject(WebDriver driver) {
		this.driver = driver;
	}

	By Alert = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]");
	By boostModel = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap Modals')]");
	By singleForm = By.xpath("//a[@href='#myModal0']");
	By saveChnage = By.xpath("//div[@id='myModal0']//a[@class='btn btn-primary'][contains(text(),'Save changes')]");

	// Double Alreat Modal
	By doubleForm = By.cssSelector("a[href='#myModal']");
	By luchModal = By.cssSelector("a[href='#myModal2']");
	By clickClose = By.xpath("//div[@id='myModal2']//a[@class='btn'][contains(text(),'Close')]");
	By clickOnXsing=By.xpath("//div[@id='myModal']//a[@class='btn'][contains(text(),'Close')]");
	// This will click Alert&Model Menu
	public WebElement getAlertMenu() {
		return driver.findElement(Alert);
	}

	// This will click on subMenu Item
	public WebElement subMenu() {
		return driver.findElement(boostModel);
	}

	// this will click single form modal
	public WebElement singleForm() {
		return driver.findElement(singleForm);
	}

	public WebElement saveChange() {
		return driver.findElement(saveChnage);
	}

	// Double Model Form button code
	public WebElement doubleAlret() {
		return driver.findElement(doubleForm);
	}

	public WebElement lanchModal() {
		return driver.findElement(luchModal);
	}

	public WebElement ClickClose() {
		return driver.findElement(clickClose);
	}
	public WebElement ClickX() {
		return driver.findElement(clickOnXsing);
	}
}
