package pages;

import java.util.ResourceBundle;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginPage {
	
	ResourceBundle rb=ResourceBundle.getBundle("elementlocator");

	FirefoxDriver driver;
	public LoginPage(FirefoxDriver driver) {
		this.driver=driver;

	}
	


	public void enterUsername(String username) {
		driver.findElementById(rb.getString("login_username")).sendKeys(username);

	}

	public void enterPassword(String password) {
		driver.findElementById(rb.getString("login_password")).sendKeys(password);

	}

	public void clikSignin() {
		driver.findElementByXPath(rb.getString("login_signil_xpath")).click();

	}

}
