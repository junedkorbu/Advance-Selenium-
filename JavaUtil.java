package CommonUtil;

import java.util.Random;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class JavaUtil {

	public int getRandomNumber()
	{
		Random r = new Random();
		return r.nextInt(500);
	}
	
	public void mouseHover(WebDriver driver,WebElement ele)
	{
		Actions a = new Actions(driver);
		a.moveToElement(ele);
		a.perform();
	}
}
