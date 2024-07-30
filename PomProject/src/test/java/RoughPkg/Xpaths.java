package RoughPkg;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.BaseClass;

public class Xpaths extends BaseClass {
	
	
	@BeforeClass
	public void Test() throws IOException
	{
	
		
		 ChromeOptions ops=new ChromeOptions();
		 Map<String, Object> prefs = new HashMap<>();
	        prefs.put("profile.default_content_setting_values.cookies", 1); // 1 to allow cookies
	        ops.setExperimentalOption("prefs", prefs);
		driver=new ChromeDriver(ops);
		driver.get("https://www.amazon.com/");
		driver.manage().window().maximize();

	}

	@Test
	public static void Amzin()
	{
		 driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).
		  sendKeys("s22ultra");
		  driver.findElement(By.id("nav-search-submit-button")).click();
		List<WebElement>ls=  driver.findElements(By.xpath("//i[@class='a-icon a-icon-checkbox']"));
		for(WebElement l:ls)
		{
			wait.until(ExpectedConditions.elementToBeSelected(l));
			
			if(l!=null)
			{
				if(l.isSelected()!=true);
				{
					
					l.click();
				}
				
			}
			
		}


	}
}
