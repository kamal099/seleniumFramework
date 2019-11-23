package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class InputFormPageObject {

	WebDriver driver;
	public InputFormPageObject(WebDriver driver) {
		this.driver=driver;
	}
	
	By movetoPage=By.xpath("//div[@class='list-group']");
	By message = By.id("user-message");
	By ClickButton = By.xpath("//button[contains(text(),'Show Message')]");
	By grabMessage = By.id("display");
	By Validation = By.xpath("//div[contains(text(),'Two Input Fields')]");

	
	public WebElement clickMainPage() {
		 int size = driver.findElements(movetoPage).size();
		
		 for(int i=0; i<size; i++) {
			 String text = driver.findElements(movetoPage).get(i).getText();
			 if(text.equals("Simple Form Demo")) {
				  return driver.findElement(movetoPage);
			 }
		 }
		 return driver.findElement(movetoPage);
	}
	public WebElement sendMessage() {
		return driver.findElement(message);
	}

	public WebElement clickButton() {
		return driver.findElement(ClickButton);
	}

	public WebElement getTest() {
		return driver.findElement(grabMessage);
	}

	public WebElement validation() {
		return driver.findElement(Validation);
	}

}
