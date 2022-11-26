package testLayer;

import org.testng.annotations.Test;

import pageLayer.HomePage2;
import testBase.TestBase;

public class BuyProductTest extends TestBase{
	
	@Test
	public void test()
	{
		HomePage2 home = new HomePage2(driver);
		
		home.clickOnPhonesLink();
		home.clickOnSamsungGalaxyS6();
		home.clickOnAddToCartButton();

	}
	
	

}
