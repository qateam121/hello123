package testCases;

import org.testng.annotations.Test;

import base.Common;
import pages.ContactbuilderPage;
import pages.LoginPage;
import pages.SelectAppPage;

public class ContactBuilderTestCase extends Common{
	
	@Test
	public void contactBuildermet(){
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername("s4_ent2_prod@sfv5.com");
		login.enterPassword("testing3!");
		login.clikSignin();
	
	SelectAppPage sap=new SelectAppPage(driver);
	sap.audienceBuilder();
	
	ContactbuilderPage cbp=new ContactbuilderPage(driver);
	cbp.dataSource();

	}

}
