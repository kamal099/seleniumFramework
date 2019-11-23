package testCases;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import pageObjcet.BoostMobileLoginObject;
import resources.MainClass;

public class BoostConnectDB extends MainClass{
	private static String host="localhost";
	private static String port="3306";
	BoostMobileLoginObject obj;
	
	@BeforeTest
	public void invokeBrowser() throws IOException {
		
		driver=initalizebrowser();
		driver.get(pro.getProperty("urlBoost"));
	}

	@Test
	public  void SetUserData() throws SQLException, InterruptedException {
		Thread.sleep(2000);
		Connection con=DriverManager.getConnection("jdbc:mysql://"+host+":"+port+"/BoostMobile","root","Kamal@Kamal2");
		Statement st = con.createStatement();
		ResultSet rs = st.executeQuery("select *from users where name='hessam'");
		obj= new BoostMobileLoginObject(driver);
		obj.LoginLink().click(); 
		while(rs.next()) {
			obj.sendPhoneNumber().sendKeys(rs.getString("Pnumber"));
			obj.sendPin().sendKeys(rs.getString("pin"));
			}
		Thread.sleep(1000);
		obj.ClinkLoginButton().click();
	}
	
	@AfterTest
	public void Exit() {
		driver.quit();
	}
}
