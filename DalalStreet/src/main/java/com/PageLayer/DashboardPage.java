package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class DashboardPage extends TestBase
{
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//----------------obj repo----------
	private By profile_btn = By.xpath("//span[@class='d-none d-xl-inline-block font-size-14 ms-2 me-1']");
	
	private By power_off_btn = By.xpath("//span[text()='Power Off']");
	
	private By transaction_lnk = By.xpath("//a[contains(text(),'Transactions')]");
	
	
	//----------------action methods----
	public void clickOnProfile()
	{
		driver.findElement(profile_btn).click();
	}
	public void clickOnPowerOff()
	{
		driver.findElement(power_off_btn).click();
	}
	public void clickOnTransaction()
	{
		driver.findElement(transaction_lnk).click();
	}


}
