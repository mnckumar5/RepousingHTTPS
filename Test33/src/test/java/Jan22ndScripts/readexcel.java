package Jan22ndScripts;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;



public class readexcel
{

@Test
public void readexcel() throws IOException

{

	
	File src4=new File("./testdata/login.xlsx");
	
	FileInputStream fis=new FileInputStream(src4);
	
//	XSSFWorkbook wb
	
	XSSFSheet sh;
	
	XSSFRow r1;
	
	XSSFCell c1;
	
	XSSFWorkbook wb=new XSSFWorkbook(fis);
	
	int sheetCount=wb.getNumberOfSheets();
	
	XSSFSheet sh1=wb.getSheet("login");
	
	int row=sh1.getPhysicalNumberOfRows();
	
	System.out.println("Total rows "+row);
	
	
	XSSFRow r11=sh1.getRow(2);
	
	XSSFCell c11=r11.getCell(1);
	
	System.out.println(c11.getStringCellValue());
	
	
	
}
}

