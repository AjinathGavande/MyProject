package com.utility;

import java.io.File;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.TestBase.TestBase;

public class UtilClass extends TestBase
{

	public String getCurrentURL()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
	static String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\SuiteCRM\\Screenshot\\";
	public static void takesScreenshot(String FileName)
	{
		try
		{
		TakesScreenshot ts = ((TakesScreenshot)driver);
		File src = ts.getScreenshotAs(OutputType.FILE);
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");  
		   LocalDateTime now = LocalDateTime.now();  
		   System.out.println(dtf.format(now));  
		File dse = new File (path+FileName+"$"+System.currentTimeMillis()+".png");
		
			FileHandler.copy(src, dse);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			System.out.println("Please provide correct path.....!");
		}
		
			
	
		
	}
	
	


}
