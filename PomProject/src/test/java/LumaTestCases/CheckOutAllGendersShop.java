package LumaTestCases;

import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import LumaPages.ShopByGender;
import LumaPages.ShopNowPage;
import Pages.BaseClass;
@Listeners(Listensers.MyListener.class)
public class CheckOutAllGendersShop extends BaseClass {

	    private ShopByGender sbg;
	    private LumaLoginTest lg;
	    private ShopNowPage sp;
	    private CheckOutItems coit;
	    private FileReader reader;
	    private Properties p;

	    @BeforeClass(alwaysRun=true)
	    public void Start() throws IOException {
	        MainRun();
	        lg = new LumaLoginTest();
	        lg.LoginTestR();
	        sp = new ShopNowPage(); // Initialize ShopNowPage instance
	        coit = new CheckOutItems(); // Pass ShopNowPage instance to CheckOutItems constructor
	    }

	    @Test(priority=1)
	    public void CheckOutWomenItems() throws IOException {
	        p = new Properties();
	        reader = new FileReader(AboutUsTestCase.path);
	        p.load(reader);
	        sbg = new ShopByGender();
	        sbg.ClcikWomenShoppingBtn();
	        sbg.ClickMainWomenShpBtn();
	        sbg.ClcikWomenPrd1();
	        sbg.ClcikPrdctSize();
	        sbg.ClickOnAddtoCart();
	        coit.ValidateCheckOutButton();
	        coit.EnterCheckOutInfo();
	    }



	@Test(priority=2)
	public void CheckOutMensItems()
	{





	}

	@Test(priority=3)
	public void CheckoutMensItemsBottom()
	{

	}

	@Test(priority=4)
	public void CheckOutEquipmentsItems()
	{


	}



	@AfterClass
	public void TearDown()
	{
		CloseDriver();
	}



}
