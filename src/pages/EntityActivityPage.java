package pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.firefox.FirefoxDriver;

public class EntityActivityPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

	FirefoxDriver driver;
	public EntityActivityPage(FirefoxDriver driver){
	this.driver=driver;
}
	
	public void clickAvailableTab(){
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		driver.findElementByXPath(".//*[@id='entity-search']/input").sendKeys("mohit sharma");
		
		driver.findElementByXPath(rb.getString("entityactivty_avalabletab_xpath")).click();
		
		
		
	}
	
public void clickSynchronizedTab(){
		
		
	}

}
