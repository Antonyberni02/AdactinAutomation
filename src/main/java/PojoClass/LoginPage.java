package PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	public static WebDriver driver;
	@FindBy(name="username")
	private WebElement username1;
	@FindBy(id="password")
	private WebElement password1;
	@FindBy(name="login")
	private WebElement login1;
	//constructor
	public LoginPage(WebDriver driver2)
	{
	 this.driver=driver2;
	 PageFactory.initElements(driver, this);
	}
	//getters and setters
	public WebElement getUsername1() {
		return username1;
	}
	public WebElement getPassword1() {
		return password1;
	}
	public WebElement getLogin1() {
		return login1;
	}
	
	
	

}
