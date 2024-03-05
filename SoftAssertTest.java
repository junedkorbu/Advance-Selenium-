package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SoftAssertTest {

	@Test
	public void myntraSTF()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
		String url = driver.getCurrentUrl();
//		WebElement stf = driver.findElement(By.cssSelector("input[placeholder='Search for products, brands and more']"));
	    
//		Assert.assertTrue(stf.isDisplayed());
//		Assert.assertTrue(stf.isSelected());
		
//		Assert.assertFalse(stf.);
		
		
		SoftAssert as = new SoftAssert();
		as.assertEquals(url,"https://www.myntra.com/");
		
		
		System.out.println("Execution is completed !!!");
//	    driver.quit();
	    as.assertAll();
	}
}
