package BasicDDT;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;

import CommonUtil.ExcelUtil;

public class DDTFromExcelUtils {

	public static void main(String[] args) throws EncryptedDocumentException, IOException {
		
		ExcelUtil eutil = new ExcelUtil();
		System.out.println(eutil.getDataFromExcel("Sheet1", 1, 1));
		
		eutil.getDataFromExcel("Sheet1", 1, 1);
	}
}
