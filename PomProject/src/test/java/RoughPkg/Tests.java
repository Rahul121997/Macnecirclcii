package RoughPkg;

import java.io.IOException;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LumaPages.ShopByGender;
import LumaTestCases.LumaLoginTest;
import Pages.BaseClass;

public class Tests extends BaseClass {

	static LumaLoginTest lp;
	static ShopByGender spg;
	

	@BeforeClass
	public void Test() throws IOException
	{
		driver=new ChromeDriver();
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		driver.manage().window().maximize();
		
	}

	
	  @Test public void testHelloWorld() throws IOException {
	  
	  Map<Integer,WebElement>map=new HashMap<>();
	  
	  
	  driver.findElement(By.xpath("//input[@aria-label='Search Amazon.in']")).
	  sendKeys("s22ultra");
	  driver.findElement(By.id("nav-search-submit-button")).click();
	  List<WebElement> price=driver.findElements(By.className("a-price-whole"));
	  
	  for(WebElement e:price) {
	  map.put(Integer.parseInt(e.getText().replace(",","")),e);
	  
	  
	  }
	  
	  int max=0;
	  
	  for(Map.Entry<Integer,WebElement>entry:map.entrySet()) {
	  if(max==0||max>entry.getKey()) { max=entry.getKey(); } }
	  map.get(max).click(); }
	 
	@Test
	public void HandlWebTable()
	{
		int cols=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr")).size();
		int row=driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th")).size();
		System.out.println("row count :"+row);
		System.out.println("col count :"+cols);
		for(int i=1;i<=row;i++)
		{
			for(int j=1;j<=cols-1;j++)
			{
				String data1=driver.findElement(By.xpath("//table[@id='customers']/tbody/tr["+(j+1)+"]/td["+i+"]")).getText();
				System.out.println(data1+i+":"+j);
			}
			
		}
		
		
	}
	
}









