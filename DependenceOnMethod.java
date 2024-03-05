package TestNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class DependenceOnMethod {

	@Test
	public void zomato()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/pune");
	}
	
	@Test
	public void facebook()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		
		WebElement login = driver.findElement(By.id("loginbutton"));
		Assert.assertTrue(!login.isEnabled());
	}
	
	@Test(dependsOnMethods = "facebook")
	public void ajio()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
	}
	
	@Test(dependsOnMethods = "facebook")
	public void swiggy()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com/");
	}
}
