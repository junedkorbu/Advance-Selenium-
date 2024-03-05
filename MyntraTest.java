package TestNG;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class MyntraTest {

	@Test
	public void myntraPage()
	{
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.myntra.com/");
//		System.out.println(driver.getCurrentUrl());
//		System.out.println(driver.getTitle());
		
		if(driver.getCurrentUrl().equals("https://www.myntra.com//"))
		{
			System.out.println("Url is matching");
		}else {
			System.out.println("Url is not matching");
		}
		
		driver.quit();
	}
}



