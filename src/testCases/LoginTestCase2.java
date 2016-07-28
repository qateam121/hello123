package testCases;

import java.io.File;
import java.io.IOException;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.Common;
import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;
import pages.LoginPage;

public class LoginTestCase2 extends Common{

	@Test(dataProvider="dp2")
	public void loginMet(String a, String b) throws BiffException, IOException {
		
		LoginPage login = new LoginPage(driver);
		login.enterUsername(a);
		login.enterPassword(b);
		login.clikSignin();
	}
	
	@DataProvider(name="dp1")
	public Object[][] testdata1(){
		
		Object[][] arr={{"username1","password1"},{"username2","password2"},{"username3","password3"}};

		return arr;
	}
	
	@DataProvider(name="dp2")
	public Object[][] testdata2() throws BiffException, IOException{
		File fl=new File("E:\\selenium_nitn\\readwrite.xls");
		Workbook wk=Workbook.getWorkbook(fl);
		Sheet s1=wk.getSheet("Sheet1");
		int r=s1.getRows();
		Object[][] arr=new Object[r][2];
		for(int i=0;i<r;i++){
			Cell c1=s1.getCell(0, i);
			Cell c2=s1.getCell(1, i);
			arr[i][0]=c1.getContents();
			arr[i][1]=c1.getContents();
			
		}
		return arr;
		
	}
	
	

}
