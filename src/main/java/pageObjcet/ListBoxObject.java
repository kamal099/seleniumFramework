package pageObjcet;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class ListBoxObject {
	
	WebDriver driver;
	
	public ListBoxObject(WebDriver driver) {
		this.driver=driver;
	}
	By Alert = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'List Box')]");
	By boostrap=By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Bootstrap List Box')]");
	By ulList=By.xpath("//div[@class='well']//i[@class='glyphicon glyphicon-unchecked']");
	By addItems=By.xpath("//button[@class='btn btn-default btn-sm move-left']");
	
	
	public WebElement clickMenu() {
		return driver.findElement(Alert);
		
	}
	public WebElement boostStrapListBox() {
		return driver.findElement(boostrap);
		
	}
	
	public WebElement ulList() {
		return driver.findElement(ulList);
		
	}
	
	public WebElement AddItems() {
		return driver.findElement(addItems);
		
	}
		
	

}
