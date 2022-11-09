package com.utility;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class ListenersSetup implements ITestListener
{

	@Override
	public void onFinish(ITestContext context) 
	{
		
	}

	@Override
	public void onStart(ITestContext context)
	{

	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult result)
	{
		
	}

	@Override
	public void onTestFailedWithTimeout(ITestResult result)
	{
			
	}

	@Override
	public void onTestFailure(ITestResult result) 
	{
		UtilClass.takesScreenshot(result.getName());
	}

	@Override
	public void onTestSkipped(ITestResult result) 
	{
		
	}

	@Override
	public void onTestStart(ITestResult result) 
	{
		
	}

	@Override
	public void onTestSuccess(ITestResult result) 
	{
	      UtilClass.takesScreenshot(result.getName());
    }

}
