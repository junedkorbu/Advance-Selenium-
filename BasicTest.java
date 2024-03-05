package TestNG;

import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class BasicTest {

	@Test(invocationCount = 3)																															,priority=1)
	public void facebook()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/login/");
		System.out.println("FB");
	}
	
	@Test(priority = 2)
	public void instagram()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
		System.out.println("Insta");
	}
	
	@Test(priority = 3)
	public void ajio()
	{
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://www.ajio.com/");
		System.out.println("Ajio");
	}
	
}
