package base;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class Common {

	public FirefoxDriver driver;

	@BeforeMethod
	public void commonMet() {
		System.setProperty("webdriver.chrome.driver", "E:\\selenium_nitn\\chromedriver.exe");
		driver = new FirefoxDriver();
		driver.get("https://mc.s1.qa3.exacttarget.com");
		driver.manage().window().maximize();

	}
	@AfterMethod
	public void aftMet(){
		//driver.quit();
	}

}
