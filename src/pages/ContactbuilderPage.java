package pages;

import java.util.ResourceBundle;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

	public class ContactbuilderPage {
		ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

		
		FirefoxDriver driver;
		public ContactbuilderPage(FirefoxDriver driver){
			this.driver=driver;
		}
		

		
		public void dataSource(){
			
			WebDriverWait wait=new WebDriverWait(driver, 70);
			wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath(rb.getString("conBuil_datasource_xpath"))));
			driver.findElementByXPath(rb.getString("conBuil_datasource_xpath")).click();
			
			
		}
		
		public void dataDesigner(){
			
		}

	}



