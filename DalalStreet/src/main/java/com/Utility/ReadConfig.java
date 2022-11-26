package com.Utility;


import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class ReadConfig
{
	Properties pro;
	
	public ReadConfig()
	{
		String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\DalalStreet\\Config\\Config.properties";
		File file = new File(path);
		try 
		{
			FileInputStream fis =new FileInputStream(file);
			pro = new Properties();
			pro.load(fis);
		}
		catch (IOException e) 
		{
			System.out.println("Exception is "+e.getMessage());
			e.printStackTrace();
		}

	
	}
	
	public String getApplicationURL()
	{
		String url = pro.getProperty("url");
		return url;
	}
	
	public String setBrowser()
	{
		pro.getProperty("Browser");
		return setBrowser();
	}

}
