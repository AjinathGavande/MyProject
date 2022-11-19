package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class TransactionPage extends TestBase
{
	public TransactionPage()
	{
		PageFactory.initElements(driver, this);
	}

	
	
	//-------------obj repo -------------
	
	
	//-------------action method---------
	public void getTransactionsDetails() 
	{
		
		//	String data1 = driver.findElement(By.xpath("//table/thead/tr/th")).getText();
			
		String data;
			for(int k=0;k<=9;k++)
			{
				 data = driver.findElements(By.xpath("//table/tbody/tr/td")).get(k).getText();
				 System.out.print(data+" ");
			}
			System.out.println();
		
	}
	
}
