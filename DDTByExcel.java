package BasicDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;

import org.apache.poi.EncryptedDocumentException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DDTByExcel {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		//Step 1 : Create Object of FileInputStream constructor & in FileInputStream constructor enter location of excel sheet
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginData.xlsx");
		
		//Step 2 : Call WorkBookFactory class form apache poi & call create(InputStream)
		Workbook wb = WorkbookFactory.create(fis);
		
		//Step 3 : Call a getSheet(String name) & Enter Sheet name
		Sheet sh = wb.getSheet("Sheet1");
		
		//Step 4 : Call getRow(int num) & Enter the row number
		Row rw = sh.getRow(1);
		
		//Step 5 : Call getCell(int cell)
		Cell cl = rw.getCell(1);
		
		//Step 6 : Call getStringCellValue()
		String data = cl.getStringCellValue();
		
		System.out.println(data);
	}
}





