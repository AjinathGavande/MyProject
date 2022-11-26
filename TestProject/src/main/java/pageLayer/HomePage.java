package pageLayer;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class HomePage {
	
	private WebElement login_lnk;
	private WebElement phone_lnk;
	private WebElement samsung_galaxy_s6;
	private WebElement add_to_cart_btn;
	
	public HomePage(WebDriver driver)
	{
		login_lnk=driver.findElement(By.xpath("//a[@id='login2']"));
		phone_lnk = driver.findElement(By.xpath("//a[contains(text(),'Phones')]"));
		samsung_galaxy_s6 = driver.findElement(By.xpath("//a[contains(text(),'Samsung galaxy s6')]"));
		add_to_cart_btn = driver.findElement(By.xpath("//a[contains(text(),'Add to cart')]"));
	}
	
	public void clickOnLoginLink()
	{
		login_lnk.click();
	}
	
	public void clickOnPhonesLink()
	{
		phone_lnk.click();
	}
	public void clickOnSamsungGalaxyS6()
	{
		samsung_galaxy_s6.click();
	}
	
	public void clickOnAddToCartButton()
	{
		add_to_cart_btn.click();
	}
	

}
