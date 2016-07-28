package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.firefox.FirefoxDriver;

public class SynchronizedTabPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

	FirefoxDriver driver;
	public SynchronizedTabPage(FirefoxDriver driver){
	this.driver=driver;
}
	public void clicktoEntitiesArea(){
		
		driver.findElementByXPath(rb.getString("synchronizedTab_clickentityArea_xpath")).click();
	}

}
