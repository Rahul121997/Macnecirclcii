package LumaPages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import Pages.BaseClass;

public class ShopByGender extends BaseClass {


	@FindBy(linkText="WOMEN")
	WebElement WomenShopping;

	@FindBy(linkText="Men")
	WebElement menShopping;

	@FindBy(linkText="Equipment")
	WebElement EquipmentShopping;

	//products
	@FindBy(xpath="//a[contains(@href,'jade-yoga-jacket')]")
	WebElement WomenPrd1;

	@FindBy(xpath="//div[text()='L']")
	WebElement PrdctSize;

	@FindBy(xpath="//a[contains(@href,'/women.html') and contains(@class,'btn') and contains(@class,'btn-primary') and contains(@class,'btn-action')]")
	WebElement ClickOnMainWomenShp;

	@FindBy(xpath="//a[contains(@href,'/men.html') and contains(@class,'btn') and contains(@class,'btn-primary') and contains(@class,'btn-action')]")
	WebElement OnMainmenShp;

	@FindBy(xpath="//div[contains(@class,'-default--12')]/a")
	WebElement BackToHome;



	@FindBy(xpath="//a[contains(@href,'/men/tops.html')]")
	WebElement ClickOnTops;

	@FindBy(xpath="//a[contains(@href,'/men/bottoms.html')]")
	WebElement CliconBtmsBtn;


	@FindBy(xpath="//a[contains(@href,'/men/bottoms/pants/zeppelin')]")
	WebElement BottomsPrd1;

	
	
	
	@FindBy(xpath="//a[contains(@href,'typhon-performance-fleece-lined')]")
	WebElement MenPrd1;

	@FindBy(xpath="//a[contains(@href,'marco-lightweight-active-hoodie.htm')]")
	WebElement MenPrd2;

	@FindBy(xpath="//li/a[contains(@href,'gear.html')]")
	WebElement EquipMentBtn;


	@FindBy(xpath="//p/a[contains(@href,'gear.html')]")
	WebElement GearBtn;

	@FindBy(xpath="//a[contains(@href,'overnight-duffle.html')]")
	WebElement duffleBag;


	@FindBy(xpath="//button[text()='Add to cart']")
	WebElement Addtocart;

	public ShopByGender()
	{
		PageFactory.initElements(driver, this);
	}


	public void ClcikWomenShoppingBtn()
	{
		WebElement WomenShopping1 = wait.until(ExpectedConditions.elementToBeClickable(WomenShopping));
		WomenShopping1.click();
	}

	public void ClickMainWomenShpBtn()
	{
		WebElement ClickOnMainWomenShp1 = wait.until(ExpectedConditions.elementToBeClickable(ClickOnMainWomenShp));

		ClickOnMainWomenShp1.click();
	}

	public void ClcikWomenPrd1()
	{
		WebElement WomenPrd11 = wait.until(ExpectedConditions.elementToBeClickable(WomenPrd1));
		WomenPrd11.click();
	}


	public void ClcikPrdctSize()
	{
		WebElement PrdctSize1 = wait.until(ExpectedConditions.elementToBeClickable(PrdctSize));
		PrdctSize1.click();
	}

	public void BackToHomes()
	{		
		WebElement BackToHome1 = wait.until(ExpectedConditions.elementToBeClickable(BackToHome));
		BackToHome1.click();
	}

	public void ClickmenShoppingbtn() 
	{
		System.out.println("::::::::::::");
		WebElement menShopping1 = wait.until(ExpectedConditions.elementToBeClickable(menShopping));
		menShopping1.click();
	}


	public void ClickOnMainmenShp()
	{
		WebElement ClickOnMainmenShp1 = wait.until(ExpectedConditions.elementToBeClickable(OnMainmenShp));
		ClickOnMainmenShp1.click();
	}
	public void ClickOnTopsBtn()
	{
		WebElement ClickOnTops1 = wait.until(ExpectedConditions.elementToBeClickable(ClickOnTops));
		ClickOnTops1.click();
	}

	public void ClcikMenPrd1()
	{
		WebElement MenPrd11 = wait.until(ExpectedConditions.visibilityOf(MenPrd1));
		MenPrd11.click();
	}

	public void ClickMenPrd2()
	{
		WebElement MenPrd21 = wait.until(ExpectedConditions.visibilityOf(MenPrd2));
		MenPrd21.click();
	}

	public void ClickEquipMentBtn()
	{
		System.out.println(":::dsafdsg");
		WebElement EquipMentBtn1 = wait.until(ExpectedConditions.visibilityOf(EquipmentShopping));
		EquipMentBtn1.click();
	}

	public void ClickEquipmentMainBtn()
	{
		WebElement EquipmentMainBtn1 = wait.until(ExpectedConditions.visibilityOf(GearBtn));
		EquipmentMainBtn1.click();
	}
	public void ClickduffleBag()
	{
		WebElement duffleBag1 = wait.until(ExpectedConditions.visibilityOf(duffleBag));
		duffleBag1.click();
	}
	
	public void ClickonBtmsBtn()
	{
		WebElement CliconBtmsBtn1 = wait.until(ExpectedConditions.elementToBeClickable(CliconBtmsBtn));
		CliconBtmsBtn1.click();
	}
	public void ClickOnBottomsPrd1()
	{
		WebElement BottomsPrd11 = wait.until(ExpectedConditions.elementToBeClickable(BottomsPrd1));
		BottomsPrd11.click();
	}
	public void ClickOnAddtoCart()
	{
		
		WebElement Addtocart1 = wait.until(ExpectedConditions.elementToBeClickable(Addtocart));

		Addtocart.click();
		
	}
}
