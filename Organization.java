package VitgerCRM;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import CommonUtil.PropertyFileUtil;
import CommonUtil.WebDriverUtil;

public class Organization {

	PropertyFileUtil putil = new PropertyFileUtil();
	WebDriverUtil wutil = new WebDriverUtil();
	
	@Test
	public void organizationTest() throws IOException
	{
		WebDriver driver = new ChromeDriver();
//		driver.manage().window().maximize();
//		wutil.maximize();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		wutil.implicitWait();
		driver.get(putil.getDataFromPropertyFile("Url"));
		driver.findElement(By.name("user_name")).sendKeys(putil.getDataFromPropertyFile("Username"));
		driver.findElement(By.name("user_password")).sendKeys(putil.getDataFromPropertyFile("Password"));
	    driver.findElement(By.id("submitButton")).click();
	    driver.findElement(By.linkText("Organizations")).click();
	}
}
