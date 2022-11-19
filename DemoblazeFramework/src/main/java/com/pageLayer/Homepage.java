package com.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.testBase.TestBase;

public class Homepage extends TestBase {
	public Homepage()
	{
		PageFactory.initElements(driver, this);
	}
	//------------- Obj repo -----------------
	
	@FindBy (xpath="//body[contains(@class,'')]")
	private WebElement loginbtn;
	
	@FindBy(xpath="//body[@class='modal-open']']")
	private WebElement username_txtbox;
	
	@FindBy(xpath="(//input[@type='password'])[2]")
	private WebElement password_txtbox;
	
	@FindBy(xpath="//button[contains(@onclick,'logIn()')]")
	private WebElement login_btn;
	
	//--------------Action methods------------
	public void clickToLoginButton()
	{
		loginbtn.click();
	}
	
	public void enterUserName()
	{
		username_txtbox.sendKeys("will");
	}
	public void enterPassword()
	{
		password_txtbox.sendKeys("will");
	}
	public void clickOnLoginButton()
	{
		login_btn.click();
	}
}
