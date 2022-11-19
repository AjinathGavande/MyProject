package com.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

import com.PageLayer.DashboardPage;
import com.PageLayer.LoginPage;
import com.PageLayer.TransactionPage;
import com.Utility.Util;

public class TestBase 
{
	public static WebDriver driver;
	public LoginPage login;
	public Util util;
	public DashboardPage dash;
	public TransactionPage trans;
	
	
	@BeforeMethod
	public void setup()
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
		driver.get("https://www.apps.dalalstreet.ai/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		login = new LoginPage();
		login.enterEmail();
		login.enterPassword();
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
