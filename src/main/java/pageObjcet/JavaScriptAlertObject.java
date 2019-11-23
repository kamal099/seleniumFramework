package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class JavaScriptAlertObject {
	
	WebDriver driver;
	public JavaScriptAlertObject(WebDriver driver) {
		this.driver=driver;
	}
	//Alert Box WebElements
	By Alert = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]");
	By boostModel = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Javascript Alerts')]");
	By singleAlret=By.xpath("//button[@class='btn btn-default']");
	
	
	
	
	public WebElement clickMenu() {
		return driver.findElement(Alert);
	}
	
	public WebElement JavsScrpt() {
		return driver.findElement(boostModel);
	}
	
	public WebElement singleAlret() {
		return driver.findElement(singleAlret);
	}
	
	//Confirm Box WebElements
	
	By confirm=By.xpath("//button[@class='btn btn-default btn-lg'][contains(text(),'Click me!')]");
	
	public WebElement confirmBox() {
		return driver.findElement(confirm);
	}
	
	
	//Alert Box with Test filed
	
	By confrm=By.xpath("//button[contains(text(),'Click for Prompt Box')]");
	
	public WebElement confirmBox1() {
		return driver.findElement(confrm);
	}
	

}
