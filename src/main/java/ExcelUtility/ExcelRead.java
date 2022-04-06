package ExcelUtility;

import java.io.File; 
import java.io.FileInputStream;


import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;


public class ExcelRead 
{
	 public static  String GetData(String path,int rowno,int colno)
	   {
		   String data1="";
		  try 
		  {
		  
			  //Create an object of File class to open xlsx file
			File src= new File(path);
			
			//Create an object of FileInputStream class to read excel file
		    FileInputStream fis=new FileInputStream(src);
		    
		  //Creating workbook instance that refers to .xls file
		    XSSFWorkbook  wb=new XSSFWorkbook (fis);
		    
		  //Creating a Sheet object using the sheet Name
		    XSSFSheet  sheet=wb.getSheetAt(0);
		    
		  //Create a row,column object to retrieve row at index 
		    data1=sheet.getRow(rowno).getCell(colno).getStringCellValue();
		    System.out.println(data1);
		
		  } 
		  
		  catch (Exception e) 
		  {
			
			System.out.println("Issue in GetData method"+e);
		  }
		   
		   return data1;
		
	   }
}
