package VitgerCRM;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.BaseClass;
import CommonUtil.ExcelUtil;
import CommonUtil.JavaUtil;
import CommonUtil.PropertyFileUtil;
import CommonUtil.WebDriverUtil;

public class OrganizationTestNG extends BaseClass {

//	public WebDriver driver;
//	BaseClass cla = new BaseClass();
	
	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	ExcelUtil eutil = new ExcelUtil();
	JavaUtil jutil = new JavaUtil();
	
	@Test
	public void organizationTest() throws IOException, InterruptedException
	{
		/*WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
		wutil.maximize(driver);
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wutil.implicitWait(driver);
		
		//To read data from Property File
		driver.get(putil.getDataFromPropertyFile("Url"));
		driver.findElement(By.name("user_name")).sendKeys(putil.getDataFromPropertyFile("Username"));
		driver.findElement(By.name("user_password")).sendKeys(putil.getDataFromPropertyFile("Password"));
		
		//To read data from Excel File
//		driver.get();
//		driver.findElement(By.name("user_name")).sendKeys(eutil.getDataFromExcel("Organiztions", 0, 1));
//		driver.findElement(By.name("user_password")).sendKeys(eutil);
		
		
	    driver.findElement(By.id("submitButton")).click();
	    */
		
	    //To click on organization 
	    driver.findElement(By.linkText("Organizations")).click();
	    driver.findElement(By.cssSelector("img[alt='Create Organization...']")).click();
	    
	   //To read data from Excel File
	    //Enter Organization name
	    driver.findElement(By.name("accountname")).sendKeys(eutil.getDataFromExcel("Organizations", 0, 1)+jutil.getRandomNumber());
	    //In Assign to click on group 
	    driver.findElement(By.xpath("(//input[@name='assigntype'])[2]")).click();	
	    
	    //Select value from dropdown
//	    Select s = new Select(driver.findElement(By.name("assigned_group_id")));
//	    s.selectByVisibleText(eutil.getDataFromExcel("Organizations", 1, 1));
	    
	   
	  //Select value from dropdown
	    wutil.handleDropdown(driver.findElement(By.name("assigned_group_id")), eutil.getDataFromExcel("Organizations", 1, 1));  
	    driver.findElement(By.xpath("(//input[@name='button'])[3]")).click();
	    
	    //Mouse over on 
	   /* WebElement image= driver.findElement(By.xpath("//img[contains(@src,'themes/softed/images/user.PNG')]"));
	    jutil.mouseHover(driver, image);
	    
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	    */
	}
}
