package com.TestBase;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;


import com.PageLayer.LoginPage;
import com.utility.UtilClass;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TestBase 
{
	public static WebDriver driver;
	public static LoginPage login;
	public static UtilClass util;

	@BeforeMethod
	public void setup()
	{
		String br = "chrome";
		if(br.equalsIgnoreCase("Chrome"))
		{
		    WebDriverManager.chromedriver().setup();
		    driver = new ChromeDriver();
		}
		else if (br.equalsIgnoreCase("edge"))
		{
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
		}
		else if (br.equalsIgnoreCase("FireFox"))
		{
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
		}
		else
		{
			System.out.println("Please provide appropriate browser....!");
		}
		    driver.manage().window().maximize();
		    driver.get("https://suite8demo.suiteondemand.com/#/Login");
		    driver.manage().deleteAllCookies();
		    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		    
	//----------------obj creation-----------------------------------------
		    login = new LoginPage();
		    util = new UtilClass();
		    
	//----------------Login test----------------------------------------------
		    login.enterUserName();
		    login.enterPassword();
		    login.clickOnLogin();
		
		
	}

	@AfterMethod
	public void tearDown() throws InterruptedException
	{
		Thread.sleep(3000);
		driver.quit();
	}
}
