package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DownloadConfirmObject {
	
	WebDriver driver;
	public DownloadConfirmObject(WebDriver driver) {
		this.driver=driver;
	}
	//Alret& Modal Menu // Sub Menu File Download
	
	By Alert = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Alerts & Modals')]");
	By boostModel = By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'File Download')]");
	By textfiled=By.xpath("//textarea[@id='textbox']");
	By create=By.xpath("//button[@id='create']");
	By Download=By.xpath("//a[@id='link-to-download']");
	
	public WebElement clickMenu() {
		return driver.findElement(Alert);
	}
	public WebElement clickSubItem() {
		return driver.findElement(boostModel);
	}
	public WebElement textBox() {
		return driver.findElement(textfiled);
	}
	public WebElement create() {
		return driver.findElement(create);
	}
	public WebElement Downlad() {
		return driver.findElement(Download);
	}

}
