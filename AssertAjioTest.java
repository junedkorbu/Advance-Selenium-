package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class AssertAjioTest {

	@Test
	public void ajio()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		
		WebElement stf = driver.findElement(By.name("searchVal"));
		
//		Assert.assertFalse(stf.isEnabled());
		Assert.assertFalse(stf.isSelected());
		System.out.println("Execution is Passed!!!");
	}
}
