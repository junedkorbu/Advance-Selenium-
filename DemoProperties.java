package BasicDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

public class DemoProperties {

	public static void main(String[] args) throws IOException {
		
		FileInputStream fis = new FileInputStream("src\\test\\resources\\Demo.properties");
		Properties p = new Properties();
		p.load(fis);
		
		System.out.println(p.getProperty("Name"));
		System.out.println(p.getProperty("Dob"));
		System.out.println(p.getProperty("Age"));
		System.out.println(p.getProperty("Add"));
	}
}
