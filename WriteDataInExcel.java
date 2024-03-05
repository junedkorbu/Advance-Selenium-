package BasicDDT;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;

public class WriteDataInExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginData.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		Sheet sh = wb.getSheet("Sheet1");
		Row rw = sh.createRow(3);
		Cell cl = rw.createCell(0);
		cl.setCellValue("Pune !!!");
		
		FileOutputStream fos = new FileOutputStream("src\\test\\resources\\LoginData.xlsx");
		wb.write(fos);
		
	}
}
