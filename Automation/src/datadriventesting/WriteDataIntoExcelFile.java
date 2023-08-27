package datadriventesting;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataIntoExcelFile {

	public static void main(String[] args) throws IOException {
		//Converting excel file into stream of bytes an storing it in fis	
		FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
		//In order to read data from excel file we need to create an object of Workbook interf type
		//To create an object we make use of create method present in workbookFactory class
		//It is a static method which will create and load all the data to workbook object
		Workbook wb = WorkbookFactory.create(fis);
		//From workbook type object first we get the sheet then we get the row and then get the e=
		String text = wb.getSheet("CreateCustomer").getRow(1).getCell(3).getStringCellValue();
	 wb.getSheet("CreateCustomer").getRow(1).getCell(2).setCellValue("Stock");
		System.out.println(text);
		 wb.getSheet("CreateCustomer").getRow(1).getCell(2).setCellValue("Stock");
	FileOutputStream fos = new	FileOutputStream("./Data/testscript.xlsx");
	wb.write(fos);

		}
}
