package Jan22ndScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;

public class readexcel2 


{
	@Test
	public void readexcel() throws FileNotFoundException, IOException
	{
		XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File("./testdata/login.xlsx")));
		
		System.out.println(wb.getSheet("login").getRow(0).getCell(0).getStringCellValue());
				
		System.out.println(wb.getSheet("login").getRow(2).getCell(0).getStringCellValue());
		
		System.out.println(wb.getSheet("login").getRow(1).getCell(1).getStringCellValue());

}}
