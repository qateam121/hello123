package pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class SelectAppPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");
	
	FirefoxDriver driver;
	public SelectAppPage(FirefoxDriver driver){
		this.driver=driver;
	}
	
	public void audienceBuilder(){
		ResourceBundle rb=ResourceBundle.getBundle("elementlocator");
		
	//driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		WebDriverWait wait=new WebDriverWait(driver, 40);
		WebElement element=wait.until(ExpectedConditions.elementToBeClickable(By.xpath(rb.getString("searchapp_audiencebuilder_xpath"))));

	Actions act=new Actions(driver);
	act.moveToElement(driver.findElementByXPath(rb.getString("searchapp_audiencebuilder_xpath"))).perform();
	driver.findElementByXPath(rb.getString("searchapp_contactbuilder_xpath")).click();
	
	}
	
	public void emailApp(){
		
	}

}

