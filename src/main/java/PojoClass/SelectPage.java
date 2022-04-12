package PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectPage 
{
	
public static WebDriver driver;
 @FindBy(name="radiobutton_0")
 private WebElement click;
 @FindBy(name="continue")
 private WebElement click1;
public SelectPage(WebDriver driver2)  
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getClick() {
	return click;
}
public WebElement getClick1() {
	return click1;
}
	
}
