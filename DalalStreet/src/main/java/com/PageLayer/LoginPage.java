package com.PageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.TestBase.TestBase;

public class LoginPage extends TestBase
{
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//---------------obj repo-----------------
	@FindBy (xpath="//input[@name='email']")
	private WebElement Email_txtbox;
	
	@FindBy(xpath="//input[@name='password']")
	private WebElement Password_txtbox;
	
	@FindBy(xpath="//button[contains(@type,'submit')]")
	private WebElement Login_btn;
	
	//-------------action method-------------------
	public void enterEmail()
	{
		Email_txtbox.sendKeys("amarwaghmare573@gmail.com");
	}
	
	public void enterPassword()
	{
		Password_txtbox.sendKeys("Test@1234");
	}
	
	public void clickOnLogin()
	{
		Login_btn.click();
	}

}
