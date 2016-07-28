package testCases;

import org.testng.annotations.Test;

import base.Common;

import pages.LoginPage;
import pages.SelectAppPage;

public class SelectAppTestCase extends Common{
	
	@Test
	public void audienceBuilder() {
		
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername("s4_ent2_prod@sfv5.com");
		login.enterPassword("testing3!");
		login.clikSignin();
	
	SelectAppPage sap=new SelectAppPage(driver);
	sap.audienceBuilder();

	
	}	
	}


