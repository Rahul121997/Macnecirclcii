package RoughPkg;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.Duration;
import java.util.Set;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import LumaPages.LoginPage;
import LumaPages.LumaCreateAccountPages;
import LumaPages.ShopByGender;
import LumaTestCases.CheckOutItems;
import LumaTestCases.LumaLoginTest;
import Pages.BaseClass;

public class Tests extends BaseClass {

	static LumaLoginTest lp;
	static ShopByGender spg;
	

	@BeforeClass
	public void Test() throws IOException
	{
		MainRun();
		lp=new LumaLoginTest();
		lp.LoginTestR();
		
	}

	@Test
	public void testHelloWorld() throws FileNotFoundException 
	{
		spg=new ShopByGender();
		spg.ClcikWomenShoppingBtn();
		spg.ClickMainWomenShpBtn();
		spg.ClcikWomenPrd1();
		spg.ClcikPrdctSize();
		spg.ClickOnAddtoCart();
		
	}
}









