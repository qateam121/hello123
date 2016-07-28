package testCases;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class Class3 {

	public Object[][] testdata2(int r,int c) throws BiffException, IOException{
		File fl=new File("E:\\selenium_nitn\\readwrite.xls");
		Workbook wk=Workbook.getWorkbook(fl);
		
		Sheet s1=wk.getSheet("Sheet1");
		int rows=s1.getRows();
		int col=s1.getColumns();
		Object[][] ob=new Object[rows][col];
		
		for(int i=0;i<rows;i++)
		{
			if(i==r)
			{
			for(int j=0;j<col;j++)
			{
				if(j==c)
				{
					Cell c1=s1.getCell(j, i);
					ob[i][j]=c1.getContents();
					
					
					
				}
			}
				
			}
		}
		return ob;
		
	}
	
}
