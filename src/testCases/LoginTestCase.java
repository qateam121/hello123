package testCases;

import org.testng.annotations.Test;

import base.Common;
import pages.LoginPage;

public class LoginTestCase extends Common{

	@Test
	public void loginMet() {
		LoginPage login = new LoginPage(driver);
		login.enterUsername("stiwari.s4.datasync@sfmc.com");
		login.enterPassword("testing1!");
		login.clikSignin();
	
		
	}
	
	

}
