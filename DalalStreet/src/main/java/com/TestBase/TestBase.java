package com.TestBase;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.log4testng.Logger;

import com.PageLayer.DashboardPage;
import com.PageLayer.LoginPage;
import com.PageLayer.TransactionPage;
import com.Utility.ReadConfig;
import com.Utility.ReadData;
import com.Utility.Util;

public class TestBase 
{
	public static WebDriver driver;
	public LoginPage login;
	public Util util;
	public DashboardPage dash;
	public TransactionPage trans;
	ReadConfig readConfig = new ReadConfig();
	
	@BeforeMethod
	public void setup() throws IOException
	{
		String br = "edge";
		if(br.equalsIgnoreCase("chrome"))
		{
			driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			driver = new EdgeDriver();
		}
		else if (br.equalsIgnoreCase("firefox"))
		{
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please provide correct browser....!");
		}
		
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.get(readConfig.getApplicationURL());
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login = new LoginPage();
		login.enterEmail(ReadData.readData("LoginData", 1, 0));
		login.enterPassword(ReadData.readData("LoginData", 1, 1));
		login.clickOnLogin();
		
		//-----------objects------------------------------
		  
		  util = new Util();
		  dash = new DashboardPage();
		  trans = new TransactionPage(); 
		  
	}
	
	@AfterMethod
	public void tearDown() throws InterruptedException 
	{
		Thread.sleep(3000);
		driver.quit();
	}

}
