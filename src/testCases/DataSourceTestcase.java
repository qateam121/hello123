package testCases;

import org.testng.annotations.Test;

import base.Common;
import pages.ContactbuilderPage;
import pages.DataSourcePage;
import pages.LoginPage;
import pages.SelectAppPage;

public class DataSourceTestcase extends Common{
	
	@Test
	public void clicksynchrinized() throws InterruptedException{
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername("DB500.ent2.s1qa3@v5.com");
		login.enterPassword("testing1!");
		login.clikSignin();
	
	SelectAppPage sap=new SelectAppPage(driver);
	sap.audienceBuilder();
	
	ContactbuilderPage cbp=new ContactbuilderPage(driver);
	cbp.dataSource();
	
	DataSourcePage dsp=new DataSourcePage(driver);
	dsp.clicksynchronizedtab();
		
	}

}
