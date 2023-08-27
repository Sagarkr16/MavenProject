package datadriventesting;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class AnotherWayofReadData {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
		//In order to read data from excel file we need to create an object of Workbook interf type
		Workbook wb = WorkbookFactory.create(fis);
//		String text = wb.getSheet("CreateCustomer").getRow(1).getCell(0).getStringCellValue();
//		String text1 = wb.getSheet("CreateCustomer").getRow(1).getCell(2).getStringCellValue();
		Sheet s = wb.getSheet("CreateCustomer");
		Row r = s.getRow(1);
		Cell c = r.getCell(2);
		String text = c.getStringCellValue();
		System.out.println(text);
	}

}
