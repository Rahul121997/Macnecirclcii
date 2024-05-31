package LumaPages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import Pages.BaseClass;

public class ShopNowPage extends BaseClass{

	@FindBy(xpath="//a[text()='Shop Now']")
	WebElement shopNowBtn;

	@FindBy(xpath="//a[contains(@href,'zing-jump-rope')]")
	WebElement product1;

	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement Addtocart;


	@FindBy(xpath="//div[normalize-space(text())='sub-total:']")
	WebElement itemincart;

	@FindBy(xpath="//a[text()='Checkout']")
	WebElement checkout;
	
	@FindBy(xpath="//a[text()='Check Out']")
	WebElement checkOutspc;


	@FindBy(xpath="//input[@id='form-text-260762246']")
	WebElement fname;


	@FindBy(xpath="//input[@id='form-text-1038908588']")
	WebElement lname;


	@FindBy(xpath="//input[@id='form-text-1872431321']")
	WebElement Address1;


	@FindBy(xpath="//input[@id='form-text-1872431322']")
	WebElement Address2;

	@FindBy(xpath="//input[@id='form-text-1526463330']")
	WebElement City;

	@FindBy(xpath="//input[@id='form-text-1711786644']")
	WebElement NPA;

	@FindBy(xpath="//select[@id='form-options-417181665']")
	WebElement country;

	@FindBy(xpath="//input[@id='form-text-479928090']")
	WebElement  CardNumber;


	@FindBy(xpath="//input[@id='form-text-674626439']")
	WebElement  ExpryDate;

	@FindBy(xpath="//input[@id='form-text-265155513']")
	WebElement  CVV;

	@FindBy(xpath="//input[@id='form-text-80701706']")
	WebElement  Promocode;

	@FindBy(xpath="//button[@id='form-button-1573303396']")
	WebElement  ContinueBtn;

	@FindBy(xpath="//button[text()='Place order']")
	WebElement  PlaceOrderButton;


	@FindBy(xpath="//span[text()='Order No.']")
	WebElement  OrderIdText;


	@FindBy(xpath="//div[@id='orderid']/span/following-sibling::a")
	WebElement  UniqueOrderId;

	@FindBy(xpath="//div[@class='we-Cart-headerLeft']/a/i[@class='we-Icon we-Icon--close']")
	WebElement  CloseCart;


	@FindBy(xpath="//li/div[@class='we-Cart']/a[@class='we-Cart-button']")
	WebElement  OpenCart;
	
	@FindBy(xpath="//button[@class='btn btn-default btn-icon']")
	WebElement  RemoveFromCartBtn;
	
	@FindBy(xpath="//div[text()='The cart is empty.']")
	WebElement  ValidRemovedCartTestTex;
	

	public ShopNowPage()
	{
		
		PageFactory.initElements(driver, this);
	}
	public void ClickOnShopNowBtn()
	{
		WebElement shopNowBtn1 = wait.until(ExpectedConditions.visibilityOf(shopNowBtn));
		shopNowBtn1.click();
	}

	public void ClickOnProduct1()
	{
		WebElement product = wait.until(ExpectedConditions.visibilityOf(product1));
		product.click();

	}
	public void ClickOnAddtocart()
	{
		WebElement Addtocartq = wait.until(ExpectedConditions.visibilityOf(Addtocart));
		Addtocartq.click();

	}
	public void ValidateItemAddedInCart(String ExpectedMsg)
	{
		WebElement itemincart1 = wait.until(ExpectedConditions.visibilityOf(itemincart));
		String ActualMsg=itemincart1.getText();
		Assert.assertEquals(ActualMsg, ExpectedMsg);

	}
	public void ClickOnCheckOutBtnLast()
	{
		System.out.println("2ng last");
		WebElement checkOut11= wait.until(ExpectedConditions.visibilityOf(checkout));
		checkOut11.click();
	}

	public void ClickOnCheckOutBtnLast1() {
		WebElement checkOut1=wait.until(ExpectedConditions.visibilityOf(checkOutspc)); 
		checkOut1.click(); 
	}


	public void EnterFname(String Fname)
	{
		WebElement fname1= wait.until(ExpectedConditions.visibilityOf(fname));
		fname1.sendKeys(Fname);
	}


	public void EnterLname(String Lname)
	{

		lname.sendKeys(Lname);
	}

	public void EnterAddress1(String address1)
	{

		Address1.sendKeys(address1);
	}


	public void EnterAddress2(String address2)
	{

		Address2.sendKeys(address2);
	}

	public void EnterCity(String city)
	{

		City.sendKeys(city);
	}

	public void EnterNPA(String nap)
	{

		NPA.sendKeys(nap);
	}

	public void SelectCounty(String Country)
	{
		Select options=new Select(country);
		options.selectByValue(Country);
	}

	public void EnterCardNumber(String cardnumber)
	{

		CardNumber.sendKeys(cardnumber);
	}
	public void EnterExpryDate(String exprydate)
	{

		ExpryDate.sendKeys(exprydate);
	}

	public void EnterCVV(String cvv)
	{
		CVV.sendKeys(cvv);
	}

	public void EnterPromoCode(String code)
	{
		Promocode.sendKeys(code);
	}
	public void ClickonContinueBtn()
	{
		WebElement ContinueBtn1= wait.until(ExpectedConditions.elementToBeClickable(ContinueBtn));
		ContinueBtn1.click();
	}
	public void ClickOnPlaceOrderButton()
	{
		WebElement PlaceOrderButton1= wait.until(ExpectedConditions.visibilityOf(PlaceOrderButton));
		PlaceOrderButton1.click();
	}

	public void ValidateOrderPalced(String Ordermsg)
	{
		WebElement OrderIdText1= wait.until(ExpectedConditions.visibilityOf(OrderIdText));
		String ExpectedOrdermsg=OrderIdText1.getText();
		Assert.assertEquals(Ordermsg, ExpectedOrdermsg);
		String oderidtet=UniqueOrderId.getText();
		System.out.println(oderidtet);
	}
	public void CloseCart()
	{
		WebElement CloseCart1= wait.until(ExpectedConditions.visibilityOf(CloseCart));
		CloseCart1.click();
	}
	public void OpenCartBtn()
	{
		WebElement OpenCart1= wait.until(ExpectedConditions.visibilityOf(OpenCart));
		OpenCart1.click();
	}
	public void ClickRemoveFromCartBtn()
	{
		WebElement RemoveFromCartBtn1= wait.until(ExpectedConditions.visibilityOf(RemoveFromCartBtn));
		RemoveFromCartBtn1.click();
	}
	
	public void ValidateRemovedFromCart(String RemovedFromCartest)
	{
		WebElement ValidRemovedCartTestTex1= wait.until(ExpectedConditions.visibilityOf(ValidRemovedCartTestTex));
		String Expectedmsg=ValidRemovedCartTestTex1.getText();
		System.out.println(Expectedmsg);
		Assert.assertEquals(Expectedmsg, RemovedFromCartest);
	}

	
	
}
