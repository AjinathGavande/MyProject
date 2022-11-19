package com.TestLayer;

import org.testng.annotations.Test;

import com.TestBase.TestBase;

public class GetTransactionData extends TestBase
{
	@Test
	public void fetchTransaction() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.clickOnTransaction();
		Thread.sleep(5000);
		//util.javascriptExecutor();
		trans.getTransactionsDetails();
		
	}

}
