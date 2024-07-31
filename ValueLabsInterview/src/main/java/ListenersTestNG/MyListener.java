package ListenersTestNG;

import java.io.IOException;

import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.Markup;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;

import BasePackage.DriverUtils;

public class MyListener implements ITestListener{



	 ExtentSparkReporter spark=new ExtentSparkReporter("./target/spark.html");
	 ExtentReports report = new ExtentReports();
	 
	
	


	public void onTestStart(ITestResult result) 
	{
		
       System.out.println("starting the "+result.getName());
	}


	public void onTestSuccess(ITestResult result) 
	{
		report.attachReporter(spark);
		ExtentTest test = report.createTest(result.getName()).log(Status.PASS,result.getThrowable());
		report.flush();
		
	}


	public void onTestFailure(ITestResult result) 
	{
		report.attachReporter(spark);
		ExtentTest test = report.createTest(result.getName()).log(Status.FAIL,result.getThrowable());
		try {
			test.addScreenCaptureFromPath(DriverUtils.ScreenShot(), result.getName());
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		report.flush();

		
		
	}


	public void onTestSkipped(ITestResult result) 
	{

	}


	public void onTestFailedButWithinSuccessPercentage(ITestResult result) {

	}


	public void onTestFailedWithTimeout(ITestResult result) {
		
	}


	public void onStart(ITestContext context) {

	}


	public void onFinish(ITestContext context) {


	}
}
