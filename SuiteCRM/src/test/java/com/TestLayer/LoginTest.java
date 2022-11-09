package com.TestLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class LoginTest extends TestBase
{
	String expected_url = "https://suite8demo.suiteondemand.com/#/home";
	@Test
	public void loginTest() throws InterruptedException
	{
		Thread.sleep(3000);
		Assert.assertEquals(util.getCurrentURL(),expected_url );
	}


}
