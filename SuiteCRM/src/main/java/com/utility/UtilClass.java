package com.utility;

import com.TestBase.TestBase;

public class UtilClass extends TestBase
{

	public String getCurrentURL()
	{
		String current_url = driver.getCurrentUrl();
		return current_url;
	}
	
}
