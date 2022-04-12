package PomClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

import PojoClass.BookingPage;
import PojoClass.LoginPage;
import PojoClass.SearchPage;
import PojoClass.SelectPage;

public class PomClass //pageObjectManager
{
	
  public static WebDriver driver;
  private LoginPage lp;
  private SearchPage sp;
  private SelectPage sp1;
  private BookingPage bp;
  
  public PomClass(WebDriver driver2)
  {
	this.driver=driver2;
	PageFactory.initElements(driver, this);
}
public LoginPage getInstancelp()
  {
	 lp=new LoginPage(driver);
	 return lp;

   }
  public SearchPage getInstancesp()
  {
	  sp=new SearchPage(driver);
	  return sp;
	}
  public SelectPage getInstancesp1()
  {
	sp1=new SelectPage(driver);
	return sp1;

  }
  public BookingPage getInstancebp() 
  {
	bp=new BookingPage(driver);
	return bp;

  }
  
}
