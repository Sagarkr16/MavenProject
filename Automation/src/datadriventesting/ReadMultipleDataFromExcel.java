package datadriventesting;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadMultipleDataFromExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
    FileInputStream fis = new FileInputStream("./Data/testscript.xlsx");
    Workbook wb = WorkbookFactory.create(fis);
    //In order to fetch the last row which is having data
    int count = wb.getSheet("ValidLogin").getLastRowNum();
    System.out.println(count);
    for(int i=1;i<=count;i++) {
    String text = wb.getSheet("ValidLogin").getRow(i).getCell(1).getStringCellValue();
    String text1 = wb.getSheet("ValidLogin").getRow(i).getCell(2).getStringCellValue();
    System.out.println(text+" ---> "+text1);
    }
	}

}
