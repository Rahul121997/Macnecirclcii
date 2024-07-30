package RoughPkg;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import Pages.BaseClass;

public class TestClass extends BaseClass {
	

	@BeforeClass
	public void Test() throws IOException
	{
		driver=new ChromeDriver();
		driver.get("https://selectorshub.com/xpath-practice-page/");
		driver.manage().window().maximize();
		
	}
	
	@Test(enabled=false)
	public static void HandleWebTable() throws IOException
	{
		
		TakesScreenshot ts=(TakesScreenshot)driver;
		File file=ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(file,new File("./src/test/java/xyz.jpg"));
		
	}
	@Test()
	public static void Jss()
	{
		driver.findElement(By.id("userName")).getShadowRoot().
		findElement(By.id("kils"));
	}
	@Test(groups="NotSmoke")
	public static void NotSmoke()
	{
		System.out.println("NotSmoke");
	}


	
	

}
