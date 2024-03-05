package BasicDDT;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class BasicDDT {

	public static void main(String[] args) throws IOException {
	
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
//		driver.get("https://demoapp.skillrary.com/");
		
		//Step 1 : Create the Object of FIleInputStream & in FIleInputStream constructor enter the path/location of file 
//		FileInputStream fis = new FileInputStream("src\\test\\resources\\SkillraryLoginData.properties");	
		FileInputStream fis = new FileInputStream("src\\test\\resources\\LoginData.xlsx");	
		
		//Setp 2 : Create object of properties 
		Properties p = new Properties();
		
		//Step 3 : Call the load(inputstream) to fetch the location of the external file
		p.load(fis);
		
		//Step 4 : Call the getProperty(String key) to fetch the key 
		String url = p.getProperty("Url");
		String email = p.getProperty("Email");
		String password = p.getProperty("Password");
		
		
		
		driver.get(url);
		
		driver.findElement(By.linkText("LOGIN")).click();
		
		driver.findElement(By.id("email")).sendKeys(email);
		driver.findElement(By.id("password")).sendKeys(password);
	}
}

