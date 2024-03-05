package VitgerCRM;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.xmlbeans.impl.xb.xsdschema.ListDocument.List;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import CommonUtil.ExcelUtil;
import CommonUtil.JavaUtil;
import CommonUtil.ListenerImplementation;
import CommonUtil.PropertyFileUtil;
import CommonUtil.WebDriverUtil;

@Listeners(ListenerImplementation.class)
public class Contacts {
	
	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	ExcelUtil eutil = new ExcelUtil();
	JavaUtil jutil = new JavaUtil();

	@Test
	public void contacts() throws IOException, InterruptedException
	{
		WebDriver driver = new ChromeDriver();
		wutil.maximize(driver);
		wutil.implicitWait(driver);
		
		//To read data from Property File
		driver.get(putil.getDataFromPropertyFile("Url"));
		driver.findElement(By.name("user_name")).sendKeys(putil.getDataFromPropertyFile("Username"));
		driver.findElement(By.name("user_password")).sendKeys(putil.getDataFromPropertyFile("Password"));
		driver.findElement(By.id("submitButton")).click();
		  
		//To click on Contacts
		driver.findElement(By.linkText("Contacts")).click();
		
		//To click on plus icon
		driver.findElement(By.cssSelector("img[alt='Create Contact...']")).click();
		
		//Enter first name
		driver.findElement(By.name("firstname")).sendKeys(eutil.getDataFromExcel("Contacts", 0, 1));
		
		//Enter last name
		driver.findElement(By.name("lastname")).sendKeys(eutil.getDataFromExcel("Contacts", 1, 1));
		
		//To fail test script
		String actualUrl = driver.getCurrentUrl();
		String expectedUrl = "http://localhost:8888/pune.index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing";
		Assert.assertEquals(actualUrl,expectedUrl);
		
		//To click radio button
		driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();
		
		//Select Team Selling from dropdown
		WebElement dropdown = driver.findElement(By.name("assigned_user_id"));
//		eutil.getDataFromExcel("Contacts", 2, 1)
//		wutil.handleDropdown(dropdown,"Team Selling");	
		
		//To click on plus icon from Organization name
		driver.findElement(By.xpath("(//img[@alt='Select'])[1]")).click();
		
		wutil.switchWindow(driver, "http://localhost:8888/index.php?module=Accounts&action=Popup&popuptype=specific_contact_account_address&form=TasksEditView&form_submit=false&fromlink=&recordid=");
		 
		 //To enter organization name
		 driver.findElement(By.id("search_txt")).sendKeys(eutil.getDataFromExcel("Contacts", 3, 1));
		 
		 driver.findElement(By.name("search")).click();
		 
		 //Select Organization name
		 driver.findElement(By.id("1")).click();
		 
		 //To transfer the control from Child window to parent window
		 wutil.switchWindow(driver, "http://localhost:8888/index.php?module=Contacts&action=EditView&return_action=DetailView&parenttab=Marketing");
		 
		 
//		JavascriptExecutor js = (JavascriptExecutor) driver;
//		
//		js.executeScript("window.scrollTo(0,document.body.scrollHeight)");
//		
//		driver.findElement(By.cssSelector("input[name='imagename']")).click();
		
		 //To click on Save button
		 driver.findElement(By.name("button")).click();
		 
		 wutil.screenshot(driver,"Contacts Log Out");
		 
		 Thread.sleep(5000);
		    //Mouse over on 
		    WebElement image= driver.findElement(By.xpath("//img[contains(@src,'themes/softed/images/user.PNG')]"));
		    jutil.mouseHover(driver, image);
		    
		    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
		
	}
	
	
	
}
