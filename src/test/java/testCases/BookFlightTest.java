package testCases;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.BookFlightObject;
import resources.MainClass;

public class BookFlightTest extends MainClass{
	private static WebDriverWait wait;
	BookFlightObject obj;
	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver=initalizebrowser();
		driver.get(pro.getProperty("urltravel"));
		
	}
	
	@Test
	public void setFlightData() throws InterruptedException {
		 obj= new BookFlightObject(driver);
		wait= new WebDriverWait(driver, 20);
		wait.until(ExpectedConditions.elementToBeClickable(obj.clickFlight()));
		obj.clickFlight().click();
		wait.until(ExpectedConditions.visibilityOf(obj.fromAddres()));
		Actions ac=new Actions(driver);
		ac.doubleClick(obj.fromAddres());
		obj.fromAddres().sendKeys("fsdfdsfdsfdsfdsfdfds");
		obj.departNReturn().click();
		Thread.sleep(1000);
		int size = obj.selectDate().size();
		for(int i=0;i<size;i++) {
			String text = driver.findElements(By.xpath("//div[@class='sc-hmXxxW iAbrJd']")).get(i).getText();
			if(text.equalsIgnoreCase("28")) {
				driver.findElements(By.xpath("//div[@class='sc-hmXxxW iAbrJd']")).get(i).click();
				break;
			}
			System.out.println(text);
		}
		
	}
	@Test
	public void ReturnDate() throws InterruptedException {
		Thread.sleep(2000);
		BookFlightObject obj= new BookFlightObject(driver);
		// Return Date click
		int size1 = obj.selectDate().size();
		for(int i=0;i<size1;i++) {
			String text = driver.findElements(By.xpath("//div[@class='sc-hmXxxW iAbrJd']")).get(i).getText();
			if(text.equalsIgnoreCase("15")) {
				driver.findElements(By.xpath("//div[@class='sc-hmXxxW iAbrJd']")).get(i).click();
				break;
			}
			System.out.println(text);
		}
	}

}
