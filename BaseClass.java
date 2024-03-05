package CommonUtil;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

public class BaseClass {
	
  public WebDriver driver = new ChromeDriver();
    
//    void amit()
//    {
//    	System.out.println("Form amit");
//    }
	
	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	ExcelUtil eutil = new ExcelUtil();
	JavaUtil jutil = new JavaUtil();

	@BeforeSuite
	public void bs() {
		System.out.println("Connect to database !!!");
	}
	
	@BeforeClass
	public void bc() throws IOException {
		//@BeforeClass is used to launch the application
		
		wutil.maximize(driver);
		wutil.implicitWait(driver);
		//To launch the application 
		driver.get(putil.getDataFromPropertyFile("Url"));
	}
	
	@BeforeMethod
	public void bm() throws IOException {
		//@Before Method is used to login to the application
		
		String user = putil.getDataFromPropertyFile("Username");
		String pass = putil.getDataFromPropertyFile("Password");
		
		driver.findElement(By.name("user_name")).sendKeys(user);
		driver.findElement(By.name("user_password")).sendKeys(pass);
		driver.findElement(By.id("submitButton")).click();
	}
	
	@AfterMethod
	public void am() throws InterruptedException {
		//@After Method is used to sign out from the application
		//Mouse over on 
		 Thread.sleep(5000);
	    WebElement image= driver.findElement(By.xpath("//img[contains(@src,'themes/softed/images/user.PNG')]"));
	    jutil.mouseHover(driver, image);
	    
	    driver.findElement(By.xpath("//a[text()='Sign Out']")).click();
	
	}
	
	@AfterClass
	public void ac() {
		//@AfterClass is used to close the browser
		driver.quit();
	}
	
	@AfterSuite
	public void as() {
		System.out.println("Disconnect to database !!!");
	}
}
