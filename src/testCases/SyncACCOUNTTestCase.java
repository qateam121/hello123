package testCases;

	import org.sikuli.script.FindFailed;
	import org.testng.annotations.Test;

	import base.Common;
	import pages.AvailableEntitiesPage;
	import pages.ContactbuilderPage;
	import pages.DataSourcePage;
	import pages.EntityActivityPage;
	import pages.LoginPage;
	import pages.SelectAppPage;
	import pages.SynchronizedTabPage;

	public class SyncACCOUNTTestCase extends Common{
		
		
		@Test
		public void synxAdditionalNumbermet() throws InterruptedException, FindFailed{
			
			
			LoginPage login = new LoginPage(driver);
			login.enterUsername("stiwari.s4.datasync@sfmc.com");
			login.enterPassword("testing1!");
			login.clikSignin();
		
		SelectAppPage sap=new SelectAppPage(driver);
		sap.audienceBuilder();
		
		ContactbuilderPage cbp=new ContactbuilderPage(driver);
		cbp.dataSource();
		
		DataSourcePage dsp=new DataSourcePage(driver);
		dsp.clicksynchronizedtab();
		
		SynchronizedTabPage stp=new SynchronizedTabPage(driver);
		stp.clicktoEntitiesArea();
		
		EntityActivityPage eap=new EntityActivityPage(driver);
		eap.clickAvailableTab();
		//Thread.sleep(500);
		
		AvailableEntitiesPage aep=new AvailableEntitiesPage(driver);
		aep.additionalNumber();
				
			
		}

	}
