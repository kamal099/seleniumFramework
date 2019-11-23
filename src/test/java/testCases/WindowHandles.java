package testCases;

import java.io.IOException;
import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import resources.MainClass;

public class WindowHandles extends MainClass{

	@BeforeTest
	public void invokeBrowser() throws IOException {
		driver=initalizebrowser();
		driver.get(pro.getProperty("windowshandle"));
	}
	
	@Test
	public void WindowsHandle() {
		
		driver.findElement(By.id("button1")).click();
		
		String mainwindow = driver.getWindowHandle();
		Set<String> mwindow = driver.getWindowHandles();
		Iterator<String> it = mwindow.iterator();
		while(it.hasNext()) {
			String childwin = it.next();
			if(!mainwindow.equalsIgnoreCase(childwin)) {
			driver.switchTo().window(childwin);
			driver.close();
			}
		}
		driver.switchTo().window(mainwindow);
	}
	@Test
	public void tabWindwsOpen() throws InterruptedException {
		Thread.sleep(5000);
		driver.findElement(By.xpath("//button[contains(text(),'New Browser Tab')]")).click();;
		String Mwindow = driver.getWindowHandle();
		Set<String> pwin = driver.getWindowHandles();
		Iterator<String> it = pwin.iterator();
	while(it.hasNext()) {
		String chidwin = it.next();
		if(!Mwindow.equalsIgnoreCase(chidwin)) {
			driver.switchTo().window(chidwin);
			driver.close();
		}
		
	}
	driver.switchTo().window(Mwindow);
	}
	
	@AfterTest
	public void exit() {
		driver.quit();
	}
}
