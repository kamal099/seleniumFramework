package testCases;

import java.io.IOException;

import org.testng.ITestListener;
import org.testng.ITestResult;

import resources.MainClass;

public class Myliseners implements ITestListener  {
	public  void onTestFailure(ITestResult result) {
	    
		try {
			MainClass.takeScreenShot(result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	  }
	 public  void onTestSkipped(ITestResult result) {
			try {
				MainClass.takeScreenShotSkipedTest(result.getName());
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		 
		  }


}
