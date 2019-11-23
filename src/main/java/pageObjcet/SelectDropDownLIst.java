package pageObjcet;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SelectDropDownLIst {
	
	
	WebDriver driver;
	
	public SelectDropDownLIst(WebDriver driver) {
		this.driver=driver;
	}
	
	By move=By.xpath("//div[@class='list-group']");
	
	public void clicItem() {
		 int size = driver.findElements(move).size();
		
		 for(int i=0; i<size; i++) {
			 String text = driver.findElements(move).get(i).getText();
			 if(text.equals("Select Dropdown List")) {
				  driver.findElement(move).click();
			 }
		 }
		
		 
	}

}
