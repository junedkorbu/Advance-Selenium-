package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertExample {

	@Test
	public void myntra()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String aurl = driver.getCurrentUrl();
		
		Assert.assertEquals(aurl, "https://www.myntra.com/hsjs");
		
		System.out.println("Execution is passed !!!");
		driver.quit();
	}
	
	@Test
	public void myntraSTF()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		
		WebElement stf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	    
//		Assert.assertTrue(stf.isDisplayed());
//		Assert.assertTrue(stf.isSelected());
		
//		Assert.assertFalse(stf.);
		
		System.out.println("Execution is completed !!!");
	    driver.quit();
	
	}
}
