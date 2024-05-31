package LumaTestCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;

import LumaPages.AboutUsPage;
import Pages.BaseClass;

@Listeners(Listensers.MyListener.class)
public class AboutUsTestCase extends BaseClass {

	public  AboutUsPage aup;
	public  FileReader reader;
	public  Properties p;
	public static String path="./src/test/resources/Properties/testdata.properties";

	@BeforeClass(alwaysRun=true)
	public void Start()
	{
		MainRun();
	}

	@Test
	public void ValidateAbouts() throws IOException
	{
		p=new Properties();
		reader=new FileReader(path);
		p.load(reader);
		aup=new AboutUsPage();
		log.info("Click On About Us Link");
		aup.ClickOnAboutUs();
		System.out.println(p.getProperty("AboutValidation"));
		log.info("validate about info text");
		aup.ValidatedAboutUsTexts(p.getProperty("AboutValidation"));
	}
	
	@Test
	public void ValidateContactLuma()
	{
		log.info("click on ClickOnContacctLumaBtn");

		aup.ClickOnContacctLumaBtn();
		log.info("enter   username");

		aup.EnterFullNameTxtBoxs(p.getProperty("username"));
		log.info("enter   email");

		aup.EnterEmailBoxs(p.getProperty("eamil"));
		log.info("enter   phonenumber");

		aup.EnterPhoneNumverBoxs(p.getProperty("phonenumber"));
		log.info("enter  test msg");

		aup.EntercontactingTxtBoxs(p.getProperty("testmsg"));
		log.info("click  on Submit button");

		aup.ClickSubmitBtnLumaConatacts();
		log.info("validate  service request");

		aup.validateLumaServiceRequest(p.getProperty("testexplination"));
	}
	
	@Test
	public void ValidateCoustmerService()
	{
		log.info("Click On About Us Link");
		aup.ClickOnAboutUs();
		log.info("Click On ClickOnCustomerServiceBtn");
		aup.ClickOnCustomerServiceBtn();
		log.info("validate  ValidateCustomerServicevalidationtext");
		aup.ValidateCustomerServicevalidationtext(p.getProperty("coustemrvalidation"));
	}
	@Test
	public void ValidatePrivacyPolicy()
	{
		log.info("Click On About Us Link");

		aup.ClickOnAboutUs();
		log.info("Click On ClickOnLumaPrivacyPolicyBtn");

		aup.ClickOnLumaPrivacyPolicyBtn();
		log.info("validate  ValidateLumaPrivacyPolicyvalidationtext");

		aup.ValidateLumaPrivacyPolicyvalidationtext(p.getProperty("lumaprivacy"));
	}
	
	@AfterClass
	public void TearDown()
	{
		CloseDriver();
	}


}
