package Helper;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelreader 

{
	
	
	public static Object[][] getDataFromSheet(String sheetName)
	{
		
		System.out.println("************ Loading Data From Excel *******************");
		
		Object [][] arr=null;
		
		try 
		{
			// load excel 
			XSSFWorkbook wb=new XSSFWorkbook(new FileInputStream(new File(System.getProperty("user.dir")+"/testdata/login.xlsx")));
			
		// load sheet	
		   XSSFSheet sheet=wb.getSheet(sheetName);
		   
		   // get rows
		   int row=sheet.getPhysicalNumberOfRows();
		   
		   // get columns
		   int column=sheet.getRow(0).getPhysicalNumberOfCells();
		   
		   // create array based on rows and column from excel
		   arr=new Object[row][column];
		   
		   // transport from excel to 2D object array
		   for(int i=0;i<row;i++)
		   {
			   	for(int j=0;j<column;j++)
			   	{
			   		
			   		arr[i][j]=wb.getSheet(sheetName).getRow(i).getCell(j).getStringCellValue();
			   	}
		   }
		  
			
		} catch (FileNotFoundException e) 
		
		{
			System.out.println("Could not find the file "+e.getMessage());
		} catch (IOException e) {
			
			System.out.println("Could not load the file "+e.getMessage());
		}
		
		return arr;
		
	}}
	