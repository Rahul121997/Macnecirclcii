package LumaTestCases;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.*;

import LumaPages.LoginPage;
import LumaPages.ShopByGender;
import LumaPages.ShopNowPage;
import Pages.BaseClass;
@Listeners(Listensers.MyListener.class)
public class CheckOutItems extends BaseClass {

	private  LumaLoginTest lp;
	private  ShopByGender cog;
	private  ShopNowPage sps;
	private  FileReader reader;
	private  Properties p;

	

	
	@BeforeClass(alwaysRun = true)
	public void Start() {
		MainRun();
	}

	@Test(priority = 1)
	public void ValidateAddCart() throws IOException {
		lp = new LumaLoginTest();
		lp.LoginTestR();
		p=new Properties();
		reader=new FileReader(AboutUsTestCase.path);
		sps=new ShopNowPage();
		p.load(reader);
		log.info("click on shop now button");
		sps.ClickOnShopNowBtn();
		log.info("click on ClickOnProduct1");

		sps.ClickOnProduct1();
		log.info("click on add to cart button");

		sps.ClickOnAddtocart();
		log.info("validate item in add to cart section");

		sps.ValidateItemAddedInCart(p.getProperty("ValidateCartmsg"));


	}

	@Test(priority = 2)
	public  void ValidateCheckOutButton()
	{
		log.info("click on checkout button in add to cart section");

		sps.ClickOnCheckOutBtnLast();
		log.info("click on checkout button in check out section section");

		sps.ClickOnCheckOutBtnLast1();

		Assert.assertEquals(p.getProperty("checkouturl"),driver.getCurrentUrl());
		log.info(driver.getCurrentUrl());

	}

	@Test(priority = 3)
	public  void EnterCheckOutInfo() throws FileNotFoundException 
	{

		log.info("enter frist name :"+p.getProperty("fname"));
		sps.EnterFname(p.getProperty("fname"));

		log.info("enter last name:"+p.getProperty("lname"));
		sps.EnterLname(p.getProperty("lname"));

		log.info("enter address1:"+p.getProperty("address1"));
		sps.EnterAddress1(p.getProperty("address1"));

		log.info("enter address2:"+p.getProperty("address2"));
		sps.EnterAddress2(p.getProperty("address2"));

		log.info("enter city name:"+p.getProperty("city"));
		sps.EnterCity(p.getProperty("city"));

		log.info("enter NPA :"+p.getProperty("NPA"));
		sps.EnterNPA(p.getProperty("NPA"));

		log.info("enter Country name:"+p.getProperty("Country"));
		sps.SelectCounty(p.getProperty("Country"));

		log.info("enter CardNumber "+p.getProperty("CardNumber"));
		sps.EnterCardNumber(p.getProperty("CardNumber"));


		log.info("enter Expiraydate:"+p.getProperty("Expiraydate"));
		sps.EnterExpryDate(p.getProperty("Expiraydate"));

		log.info("enter CVV :"+p.getProperty("CVV"));
		sps.EnterCVV(p.getProperty("CVV"));

		log.info("enter promocode:"+p.getProperty("promocode"));
		sps.EnterPromoCode(p.getProperty("promocode"));

		log.info("click on  Continue Button ");
		sps.ClickonContinueBtn();

		log.info("click on  Place Order Button");
		sps.ClickOnPlaceOrderButton();


		log.info("validate on  Place Order placed");
		sps.ValidateOrderPalced(p.getProperty("ordermsg"));



	}

	@Test(priority=4)
	public void ValidateRemoveFromCart()
	{ 
		cog=new ShopByGender();
		log.info("click on equipment section");
		cog.ClickEquipMentBtn();
		log.info("click on main equipment");
		cog.ClickEquipmentMainBtn(); 
		log.info("click on  equipment product 1");
		cog.ClickduffleBag();
		log.info("click on add to cart button");
		sps.ClickOnAddtocart(); 
		log.info("click on remove button in add to cart sectoion");
		sps.ClickRemoveFromCartBtn();
		log.info("validate remove from cart section");
		sps.ValidateRemovedFromCart(p.getProperty("emptycartmsg"));
	}

	@AfterClass 
	public void TearDown()
	{ 
		CloseDriver();

	}



}
