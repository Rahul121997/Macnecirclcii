package RoughPkg;

import java.io.IOException;
import java.net.MalformedURLException;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import BasePackage.BaseClass;
import BasePackage.DriverUtils;
import Pages.LoginPage;


@Listeners(ListenersTestNG.MyListener.class)
public class RoughClass extends BaseClass{

	public LoginPage login;
	@BeforeClass
	public void StartUp()
	{
		GetDriver();
		DriverUtils.GotoUrl("https://www.saucedemo.com/");
		login=new LoginPage();
	}

	@Test(priority=1)
	public void ValidateLogin()
	{
		login.Login("standard_user", "secret_sauce");
		String acutalmsg=DriverUtils.GetText(login.LoginVliadtion);
		System.out.println(acutalmsg);
		Assert.assertEquals(acutalmsg,"Productss");
	}
	@Test(priority=2)
	public void SelectDropDowns()
	{
		DriverUtils.SelectDropDown(driver.findElement(By.xpath("//select[@class='product_sort_container']")),"//select/option");
		
	}
	@Test(priority=3)
	public void Tc() throws IOException
	{
		
	}
	
	
	@Test(priority=4)
	public void Scrilling() throws MalformedURLException, IOException
	{
		DriverUtils.ScrollBy(0, 300);
		System.out.println(DriverUtils.BrokenUrl("https://hello.com"));
	}
	
	@AfterClass
	public void TearDown()
	{
		DriverUtils.DriverQuit();
	}




}
