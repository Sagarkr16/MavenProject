package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class ReadDataFromExcel {

	public static void main(String[] args) throws IOException {
	//Converting excel file into stream of bytes an storing it in fis	
	FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
	//In order to read data from excel file we need to create an object of Workbook interf type
	Workbook wb = WorkbookFactory.create(fis);
	String text = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getStringCellValue();
	String text1 = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
	System.out.println(text);
	System.out.println(text1);

	}

}