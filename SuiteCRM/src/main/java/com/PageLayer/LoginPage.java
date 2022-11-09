package com.PageLayer;

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
	
	//----------------obj repo-----------------
	@FindBy (xpath="//input[@type='text']")
	private WebElement username_txtbox;
	
	@FindBy (xpath="//input[@type='password']")
	private WebElement password_txtbox;
	
	@FindBy (xpath="//button[@class='login-button ng-tns-c382-2']")
	private WebElement login_btn;
	
	
	
	//----------------action method-------------
	public void enterUserName()
	{
		username_txtbox.sendKeys("will");  
	}

	public void enterPassword()
	{
		password_txtbox.sendKeys("will");
	}
	
	public void clickOnLogin()
	{
		login_btn.click();
	}
}
