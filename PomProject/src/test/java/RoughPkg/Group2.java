package RoughPkg;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Optional;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



public class Group2 {
	
	@Parameters("browser")
	@Test
	public void Hello(@Optional("strfrom optinoal") String str)
	{
		System.out.println(str);
	}
	
	@Test(groups= {"smoke"},enabled=false)
	public void Hello1()
	{
		System.out.println("smoke1");
	}
	
	@Test(groups= {"smoke"})
	public void Hello2()
	{
		System.out.println("smoke2");
	}
	@Test(groups= {"sanity"})
	public void Hello3()
	{
		System.out.println("smoke3");
		
	}
	@Test
	public void Hello4()
	{
		System.out.println("Hello4");
	}
	
	

}
