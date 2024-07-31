package BasePackage;

import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.time.LocalDateTime;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.net.ssl.HttpsURLConnection;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class DriverUtils extends BaseClass{

	public static JavascriptExecutor js;


	public static void GotoUrl(String Url)
	{
		driver.get(Url);
	}
	public static void Click(WebElement element)
	{
		WebElement relement=Waits.WaitForClickable(element,30);
		relement.click();
	}
	public static void SendKeys(WebElement element,String data)
	{
		WebElement relement=Waits.WaitForVisiabilty(element,30);
		relement.sendKeys(data);
	}
	public static String GetText(WebElement element)
	{
		WebElement relement=Waits.WaitForVisiabilty(element,30);
		return relement.getText();
	}

	public static void SelectDropDown(WebElement element,String locator)
	{
		List<WebElement>elements=Waits.WaitForVisiabiltyofElements(locator,30);
		Map<String,String>map=new HashMap<>();
		for(WebElement e:elements)
		{
			map.put(e.getAttribute("value"),e.getAttribute("value"));
		}
		System.out.println(map);
		Select options=new Select(element);
		if(map.containsKey("lohi"))
		{
			options.selectByValue(map.get("lohi"));
		}

	}


	public static void Js()
	{
		js=(JavascriptExecutor)driver;
	}
	public static void ScrollBy(int x,int y)
	{
		Js();
		js.executeScript("window.scrollBy("+x+","+y+")");
	}

	public static String ScreenShot() throws IOException
	{
		TakesScreenshot sc=(TakesScreenshot)driver;
		File source=sc.getScreenshotAs(OutputType.FILE);
		String FilePath="C:/Users/Rahul/eclipse-workspace/ValueLabsInterview/src/test/resources/ScreenShots/"+Localdate()+".jpg";
		FileUtils.copyFile(source, new File(FilePath));
		return FilePath;

	}
	
	public static boolean BrokenUrl(String url) throws MalformedURLException, IOException
	{
		HttpsURLConnection connection=(HttpsURLConnection)new URL(url).openConnection();
	connection.setRequestMethod("POST");
		connection.connect();
		System.out.println(connection.getResponseCode());
		if(connection.getResponseCode()>=400)
		{
			return true;
		}
		return false;

	}
	
	
	public static String Localdate()
	{
		String date = LocalDateTime.now().toString().replaceAll("[^a-zA-Z0-9-:]", "").replace(":", ";");
		System.out.println(date);
		return date;
	}
	
	public static void DriverQuit()
	{
		driver.quit();
	}


}
