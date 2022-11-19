package com.Utility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class Util extends TestBase
{
	
	public Util()
	{
		PageFactory.initElements(driver, this);
	}
	public String getCurrentURL()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
	static String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\DalalStreet\\Screenshot\\";
	public static void getScreenshot(String FileName)
	{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		File dse = new File ( path +FileName+"$"+System.currentTimeMillis()+".png");
		
		
		try
		{
			FileHandler.copy(src, dse);
		} 
		catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please provide correct path.......!");
		}
	
	}

}
