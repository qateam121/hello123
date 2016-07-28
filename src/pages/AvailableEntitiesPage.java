package pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;

public class AvailableEntitiesPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

	FirefoxDriver driver;
	public AvailableEntitiesPage(FirefoxDriver driver){
	this.driver=driver;
}
	


	public void user() throws FindFailed, InterruptedException{
		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
			
			driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("User");
			driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
			driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
			driver.switchTo().activeElement();
			
			String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
			String ss2="Synchronize Entity";
			if(ss1.equalsIgnoreCase(ss2)){
				System.out.println(ss1+" text verify");
			}
			else{
				System.out.println(ss1+" text not present");
			}
			driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
			driver.findElementById(rb.getString("activeelement_next_xpath")).click();
			driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
			ClickOK cok=new ClickOK(driver);
			cok.myOk();
			
			String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
			System.out.println("hello ss3");
			driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
			System.out.println(ss3);
			String ss4="Entity Added";
			
			
			if(ss3.equalsIgnoreCase(ss4)){
				
				System.out.println("Entity Added successfully");
			}
			
			else{
				
				System.out.println("Entity not Added. i have some kind of issue in my script");
			}
			
		Thread.sleep(50000);
		
		String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss5);
		String ss6="View Synchronized Entities";
		if(ss5.equalsIgnoreCase(ss6)){
			
			System.out.println("Entity sync successfully");
		}
		
		else{
			
			System.out.println("Entity is not sync successfully");
		}	
			
		}
	
	
	


	public void additionalNumber() throws FindFailed, InterruptedException{

	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
	
	driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("AdditionalNumber");
	driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
	driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
	driver.switchTo().activeElement();
	
	String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
	String ss2="Synchronize Entity";
	if(ss1.equalsIgnoreCase(ss2)){
		System.out.println(ss1+" text verify");
	}
	else{
		System.out.println(ss1+" text not present");
	}
	driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
	driver.findElementById(rb.getString("activeelement_next_xpath")).click();
	driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
	ClickOK cok=new ClickOK(driver);
	cok.myOk();
	
	String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
	System.out.println("hello ss3");
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss3);
	String ss4="Entity Added";
	
	
	if(ss3.equalsIgnoreCase(ss4)){
		
		System.out.println("Entity Added successfully");
	}
	
	else{
		
		System.out.println("Entity not Added. i have some kind of issue in my script");
	}
	
Thread.sleep(50000);

String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
System.out.println(ss5);
String ss6="View Synchronized Entities";
if(ss5.equalsIgnoreCase(ss6)){
	
	System.out.println("Entity sync successfully");
}

else{
	
	System.out.println("Entity is not sync successfully");
}	
	
}
	
	
public void businessProcess() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("BusinessProcess");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		Thread.sleep(1000);
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		String ss4="successfully added to your account. You may access the entity once mapping completes";
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	String ss6="synccomplete_successSync_xptah";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is sync successfully");
	}	
		
	}

public void callCenter() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("CallCenter");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		Thread.sleep(1000);
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		String ss4="Entity Added";
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	String ss6="synccomplete_successSync_xptah";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is sync successfully");
	}	
		
	}

public void attachment() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("Attachment");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		Thread.sleep(1000);
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println(ss3);
		String ss4="Entity Added";
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is sync successfully");
	}	
		
	}



public void dandBCompany() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("DandBCompany");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println("hello ss3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss3);
		String ss4="Entity Added";
		
		
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is not sync successfully");
	}	
		
	}


public void lead() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("Lead");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println("hello ss3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss3);
		String ss4="Entity Added";
		
		
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is not sync successfully");
	}	
		
	}

public void contact() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("Contact");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println("hello ss3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss3);
		String ss4="Entity Added";
		
		
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is not sync successfully");
	}	
		
	}


public void syncCase() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("Case");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println("hello ss3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss3);
		String ss4="Entity Added";
		
		
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is not sync successfully");
	}	
		
	}


public void account() throws FindFailed, InterruptedException{
	driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
		
		driver.findElementByXPath(rb.getString("AvailableEntities_textsearch_xpath")).sendKeys("Account");
		driver.findElementByXPath(rb.getString("AvailableEntities_searchclick_xpath")).click();
		driver.findElementByXPath(rb.getString("AvailableEntities_clicksynchronize_xpath")).click();
		driver.switchTo().activeElement();
		
		String ss1=driver.findElementByXPath(rb.getString("activeelement_textverify_xpath")).getText();
		String ss2="Synchronize Entity";
		if(ss1.equalsIgnoreCase(ss2)){
			System.out.println(ss1+" text verify");
		}
		else{
			System.out.println(ss1+" text not present");
		}
		driver.findElementByXPath(rb.getString("activeelement_selectall_xpath")).click();
		driver.findElementById(rb.getString("activeelement_next_xpath")).click();
		driver.findElementById(rb.getString("activeelement_save&sync_xpath")).click();
		ClickOK cok=new ClickOK(driver);
		cok.myOk();
		
		String ss3=driver.findElementByXPath(rb.getString("syncComplete_entityadded_xpath")).getText();
		System.out.println("hello ss3");
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		System.out.println(ss3);
		String ss4="Entity Added";
		
		
		if(ss3.equalsIgnoreCase(ss4)){
			
			System.out.println("Entity Added successfully");
		}
		
		else{
			
			System.out.println("Entity not Added. i have some kind of issue in my script");
		}
		
	Thread.sleep(50000);
	
	String ss5=driver.findElementByXPath(rb.getString("synccomplete_successSync_xptah")).getText();
	driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
	System.out.println(ss5);
	String ss6="View Synchronized Entities";
	if(ss5.equalsIgnoreCase(ss6)){
		
		System.out.println("Entity sync successfully");
	}
	
	else{
		
		System.out.println("Entity is not sync successfully");
	}	
		
	}





	
	
	
}
