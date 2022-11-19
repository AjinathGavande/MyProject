import org.testng.Assert;
import org.testng.annotations.Test;

import com.pageLayer.Homepage;
import com.utility.UtilClass;

public class HomePageTest {

	String expected_url = "https://demoblaze.com/index.html";
	@Test
	public void verifyLoginTest() throws InterruptedException
	{
		Homepage login = new Homepage();
		UtilClass util = new UtilClass();
		login.clickOnLoginButton();
		login.enterUserName();
		login.enterPassword();
		login.clickOnLoginButton();
		Thread.sleep(3000);
		String actual_url = util.getUrl();
		Assert.assertEquals(actual_url, expected_url);
	}
}
