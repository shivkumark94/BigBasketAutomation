package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ValidLogin 
{
	//@FindBy(id="username")
	@FindBy(xpath=".//*[@id='uiv2-loginform']/div[1]/span/input")
	private WebElement username;
	
	//@FindBy(id="password")
	@FindBy(xpath=".//*[@id='password']")
	private WebElement password;
		
	public ValidLogin(WebDriver driver)
	{
	
		super();
		PageFactory.initElements(driver,this);

	}
	
	public void enterusername(String un)
	{
		username.sendKeys(un);
	}
	
	public void enterpassword(String pw)
	{
		password.sendKeys(pw);
	
	}
	
}
