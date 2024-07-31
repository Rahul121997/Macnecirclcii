package Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import BasePackage.BaseClass;
import BasePackage.DriverUtils;

public class LoginPage extends BaseClass {
	
	
	@FindBy(id="user-name")
	WebElement username;
	

	@FindBy(id="password")
	WebElement password;
	
	@FindBy(id="login-button")
	WebElement LoginButton;
	
	@FindBy(xpath="//span[.='Products']")
	public WebElement LoginVliadtion;
	
	public LoginPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void EnterUsername(String userName)
	{
		DriverUtils.SendKeys(username, userName);
		
	}
	public void EnterPassword(String passWord)
	{
		DriverUtils.SendKeys(password, passWord);

	}
	public void ClickOnLoginButton()
	{
		
		DriverUtils.Click(LoginButton);
	}
	
	public void Login(String userName,String Password)
	{
		EnterUsername(userName);
		EnterPassword(Password);
		ClickOnLoginButton();
	}
	
	
	

}
