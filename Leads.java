package VitgerCRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.ExcelUtil;
import CommonUtil.PropertyFileUtil;
import CommonUtil.WebDriverUtil;

public class Leads {

	WebDriverUtil wutil = new WebDriverUtil();
	PropertyFileUtil putil = new PropertyFileUtil();
	ExcelUtil eutil = new ExcelUtil();
	
	@Test
	public void lead() throws IOException
	{
		WebDriver driver = new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitWait(driver);
		
		driver.get(putil.getDataFromPropertyFile("Url"));
		driver.findElement(By.name("user_name")).sendKeys(putil.getDataFromPropertyFile("Username"));
		driver.findElement(By.name("user_password")).sendKeys(putil.getDataFromPropertyFile("Password"));
		driver.findElement(By.id("submitButton")).click();
		
		//To click on leads 
		driver.findElement(By.linkText("Leads")).click();
		
		//To click on plus icon
		driver.findElement(By.cssSelector("img[alt='Create Lead...']")).click();
		
		//To enter first name
		driver.findElement(By.name("firstname")).sendKeys(eutil.getDataFromExcel("Leads",0, 1));
		
		//To enter Last name
		driver.findElement(By.name("lastname")).sendKeys(eutil.getDataFromExcel("Leads",1, 1));
		
		//To enter compnay name
		driver.findElement(By.name("company")).sendKeys(eutil.getDataFromExcel("Leads",2, 1));
		
		//To Select Checkbox
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		
		//To handle dropdown
		wutil.handleDropdown(driver.findElement(By.id("assign_team")), eutil.getDataFromExcel("Leads", 3, 1));
		
		//To click on save
//		driver.findElement(By.name("button")).click();
		
	}
}
