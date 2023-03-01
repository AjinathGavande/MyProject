package com.utilities;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.io.FileHandler;

import com.testBase.TestBase;

public class UtilClass extends TestBase
{

	public static void takeSS(String FileName)
	{
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		String path = "D:\\GitHub\\DemoRepo04JuneMB\\MyProject\\MyProject\\SwagLabDataProvider\\ScreenShot";
		File dse = new File(path+ FileName  +".png");
		try {
			FileHandler.copy(src, dse);
		} catch (IOException e) {
			e.printStackTrace();
		}

	}
}
