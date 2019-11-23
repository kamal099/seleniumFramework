package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class DragAndDropObject {
	
	WebDriver driver;
	
	public DragAndDropObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By meunItem = By.xpath("//a[@class='dropdown-toggle'][contains(text(),'Others')]");
	By dragAndDrop=By.xpath("//ul[@class='dropdown-menu']//a[contains(text(),'Drag and Drop')]");
	By source=By.xpath("//span[contains(text(),'Draggable 1')]");
	By target=By.cssSelector("#mydropzone");
	
	
	public WebElement clickMenu() {
		return driver.findElement(meunItem);
		
	}
	public WebElement dragdrop() {
		return driver.findElement(dragAndDrop);
		
	}
	
	public WebElement source() {
		return driver.findElement(source);
	}
	public WebElement Target() {
		return driver.findElement(target);	
	}

}
