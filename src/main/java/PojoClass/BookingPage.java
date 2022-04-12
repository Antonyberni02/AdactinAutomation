package PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BookingPage 

{
  public static WebDriver driver;
  @FindBy(name="first_name")
  private WebElement firstname;
  @FindBy(name="last_name")
  private WebElement lastname;
  @FindBy(name="address")
  private WebElement address;
  @FindBy(name="cc_num")
  private WebElement ccnum;
  @FindBy(name="cc_type")
  private WebElement cctype;
  @FindBy(name="cc_exp_month")
  private WebElement expm;
  @FindBy(name="cc_exp_year")
  private WebElement eyear;
  @FindBy(name="cc_cvv")
  private WebElement cvv;
  @FindBy(name="book_now")
  private WebElement book;
public BookingPage(WebDriver driver2) 
{
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public WebElement getFirstname() {
	return firstname;
}
public WebElement getLastname() {
	return lastname;
}
public WebElement getAddress() {
	return address;
}
public WebElement getCcnum() {
	return ccnum;
}
public WebElement getCctype() {
	return cctype;
}
public WebElement getExpm() {
	return expm;
}
public WebElement getEyear() {
	return eyear;
}
public WebElement getCvv() {
	return cvv;
}
public WebElement getBook() {
	return book;
}
  
  
  
}
