package pages;

import org.openqa.selenium.firefox.FirefoxDriver;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;

public class ClickOK {
	
	FirefoxDriver driver;
	public ClickOK(FirefoxDriver driver){
	this.driver=driver;
}
	
	public void myOk() throws FindFailed{
	
	Screen screen=new Screen();
	Pattern ptrn=new Pattern("C:\\Users\\Amit Sharma\\Desktop\\sikuli_image\\ok.PNG");
	screen.doubleClick(ptrn);
	
}
}
