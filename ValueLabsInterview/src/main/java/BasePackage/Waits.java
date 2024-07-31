package BasePackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Waits extends BaseClass{
	
public static WebDriverWait wait;
	
	public static void Wait(int time)
	{
		 wait=new WebDriverWait(driver,Duration.ofSeconds(time));
	}
	
	public static WebElement WaitForVisiabilty(WebElement element,int time)
	{
		Wait(time);
		WebElement relement=wait.until(ExpectedConditions.visibilityOf(element));
		return element;	
	}
	
	public static WebElement WaitForClickable(WebElement element,int time)
	{
		Wait(time);
		WebElement relement=wait.until(ExpectedConditions.elementToBeClickable(element));
		return relement;
	}
	public static List<WebElement> WaitForVisiabiltyofElements(String locator,int time)
	{
		Wait(time);
		List<WebElement> relement=wait.until(ExpectedConditions.visibilityOfAllElements(driver.findElements(By.xpath(locator))));
		return relement;
		
	}

}
