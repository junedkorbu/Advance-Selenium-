package BasicDDT;

import java.io.IOException;

import CommonUtil.PropertyFileUtil;

public class DDTFormPropertyUtil {

	public static void main(String[] args) throws IOException {
		
		PropertyFileUtil pUtil = new PropertyFileUtil();
		
		System.out.println(pUtil.getDataFromPropertyFile("Femail"));
	}
}




