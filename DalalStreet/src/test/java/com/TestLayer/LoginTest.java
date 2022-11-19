package com.TestLayer;


import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class LoginTest extends TestBase
{
	String expectedurl = "https://www.apps.dalalstreet.ai/dashboard";
	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(util.getCurrentURL(),expectedurl);
			
	}

}
