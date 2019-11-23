package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LandingPageObject {
	
	WebDriver driver;
	
	public LandingPageObject(WebDriver driver){
		this.driver=driver;
	}
	
	By practice=By.xpath("//a[@id='btn_basic_example']");
	By Assertt=By.linkText("Demo Home");
	
	
	public WebElement clicPractice() {
		
		return driver.findElement(practice);
	}
	
public WebElement Check() {
		
		return driver.findElement(Assertt);
	}

}
