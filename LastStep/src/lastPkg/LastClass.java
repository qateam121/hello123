package lastPkg;

import org.testng.annotations.Test;
import java.awt.Frame;
import java.util.concurrent.TimeUnit;

import org.jboss.netty.channel.FixedReceiveBufferSizePredictorFactory;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LastClass {
	
	FirefoxDriver f;
	@BeforeMethod
	public void betmet(){
		f=new FirefoxDriver();
		f.get("https://mc.s1.qa3.exacttarget.com");
		f.manage().window().maximize();
		
	}
	
	@Test
	public void lastMet() throws InterruptedException, FindFailed{
		
		f.findElementById("username").sendKeys("mohit_ent2.s1qa3.v5@etsf.com");
		f.findElementById("password").sendKeys("testing3!");
		f.findElementByXPath("//input[@value='Login']").click();
		f.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		Actions act=new Actions(f);
		act.moveToElement(f.findElementByXPath("//div[@class='mc-app-switcher-container']/ul[1]/li[2]/ul[1]/li[4]/div[1]/span[1]")).perform();
		f.findElementByXPath("//span[text()='Contact Builder']").click();
		f.findElementByXPath("//span[text()='Data Sources']").click();
		
		//f.switchTo().frame(1);
		f.switchTo().frame("canvas-e3640f97-1328-48ed-b3d5-03ca7c0d2e12");
		f.findElementByXPath("//div[@class='text-center']/div[1]/label[2]/input[1]").click();
		
		f.findElementByXPath("//div[@class='data-source-header']/div[1]/strong[1]").click();
		
		f.findElementByXPath("//div[@class='repeater-header text-center']/div[1]/label[2]").click();
		Thread.sleep(500);
		
		try{
		
		f.findElementByXPath("//input[@type='search']").sendKeys("user");
		
		f.findElementByXPath("//div[@id='entity-search']/span[1]/button[1]").click();
		Thread.sleep(10000);
		
		f.findElementByXPath("//div[@class='card']/div[2]/button[1]").click();
				
		f.switchTo().activeElement();
		f.findElementByXPath("//div[@class='repeater-viewport']/div[1]/div[1]/div[1]/table[1]/thead[1]/tr[1]/th[1]/div[1]/input[1]").click();
		f.findElementById("btnNext").click();
		f.findElementById("btnSave").click();
		
		}
		catch(Exception e){
			
			System.out.println("AdditionalNumber is already sync");
			
		}
		
f.findElementByXPath("//div[@class='repeater-header text-center']/div[1]/label[1]").click();
		
		Screen screen=new Screen();
		Pattern ptrn=new Pattern("C:\\Users\\kmohit\\Desktop\\sikuliinage\\ok.PNG");
		
		screen.doubleClick(ptrn);
		//screen.click(ptrn);
		//String s1=f.findElementByXPath("").getText();
		
		
		
		
	
		
	}

}
