package AdactinPojoPom;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;
import PojoClass.BookingPage;
import PojoClass.LoginPage;
import PojoClass.SearchPage;
import PojoClass.SelectPage;

public class AdactinPojo extends BaseClass
{
	public static void main(String[] args) throws InterruptedException {
		
	
	    driver=getBrowers("chrome");		
	   
		getUrl("https://adactinhotelapp.com/");
		sleep();
		
		LoginPage lp=new LoginPage(driver);
		SearchPage sp=new SearchPage(driver);
		SelectPage sp1=new SelectPage(driver);
		BookingPage bp=new BookingPage(driver);
		
		
		inputText(lp.getUsername1(),"pmargrat123");
		inputText(lp.getPassword1(),"1234@abc");
	    clickButton(lp.getLogin1());
	    
		dropDown(sp.getLocation(), "ByValue", "Paris");
		sleep();
		
		dropDown(sp.getHotel(), "ByValue", "Hotel Sunshine");
		sleep();
	
		dropDown(sp.getRType(),"ByValue","Deluxe");
		sleep();
	
		dropDown(sp.getRNomrs(), "ByValue", "2 - Two");
		sleep();
		
		dropDown(sp.getARoom(), "ByValue", "2 - Two");
		sleep();
		

		dropDown(sp.getCRoom(), "ByIndex", "2");
		sleep();
		
		clickButton(sp.getSearch());
		
		
		clickButton(sp1.getClick());
		clickButton(sp1.getClick1());
		
		 inputText(bp.getFirstname(), "margrat");
		 
		 inputText(bp.getLastname(), "vinola");
		 inputText(bp.getAddress(), "chennai");
		 inputText(bp.getCcnum(), "1234567812345678");
		 dropDown(bp.getCctype(), "ByValue", "VISA");
		 sleep();
		 dropDown(bp.getExpm(), "ByIndex", "5");
		 sleep();
		 dropDown(bp.getEyear(), "ByValue", "2022");
		 sleep();
		 inputText(bp.getCvv(), "123");
		 sleep();
		 clickButton(bp.getBook());
		 


		
	    
	    
	    
	    
	    
	    
	    
	    
	    
	    
	}
}
