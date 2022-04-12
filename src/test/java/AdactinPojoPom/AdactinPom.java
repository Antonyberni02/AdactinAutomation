package AdactinPojoPom;

import java.io.IOException;

import BaseClass.BaseClass;
import Helper_File.FileReadManager;
import PomClass.PomClass;

public class AdactinPom extends BaseClass
{
  public static void main(String[] args) throws InterruptedException, IOException
  {
	  driver=getBrowers("chrome");		
	    getUrl(FileReadManager.getInstant_FRM().getInstance_CR().getUrl());
		//getUrl("https://adactinhotelapp.com/");
		sleep();
		
		PomClass pom=new PomClass(driver);
		
		inputText(pom.getInstancelp().getUsername1(),FileReadManager.getInstant_FRM().getInstance_CR().userName());
		inputText(pom.getInstancelp().getPassword1(),FileReadManager.getInstant_FRM().getInstance_CR().passWord());
	    clickButton(pom.getInstancelp().getLogin1());
	    sleep();
	    
	    dropDown(pom.getInstancesp().getLocation(), "ByValue", "Paris");
		sleep();
		
		dropDown(pom.getInstancesp().getHotel(), "ByValue", "Hotel Sunshine");
		sleep();
	
		dropDown(pom.getInstancesp().getRType(),"ByValue","Deluxe");
		sleep();
	
		dropDown(pom.getInstancesp().getRNomrs(), "ByValue", "2 - Two");
		sleep();
		
		dropDown(pom.getInstancesp().getARoom(), "ByValue", "2 - Two");
		sleep();
		

		dropDown(pom.getInstancesp().getCRoom(), "ByIndex", "2");
		sleep();
		
		clickButton(pom.getInstancesp().getSearch());
		
		clickButton(pom.getInstancesp1().getClick());
		clickButton(pom.getInstancesp1().getClick1());
		
		inputText(pom.getInstancebp().getFirstname(), FileReadManager.getInstant_FRM().getInstance_CR().fname());
		 
		 inputText(pom.getInstancebp().getLastname(), FileReadManager.getInstant_FRM().getInstance_CR().lname());
		 inputText(pom.getInstancebp().getAddress(), FileReadManager.getInstant_FRM().getInstance_CR().address());
		 inputText(pom.getInstancebp().getCcnum(), FileReadManager.getInstant_FRM().getInstance_CR().aNum());
		 dropDown(pom.getInstancebp().getCctype(), "ByValue", "VISA");
		 sleep();
		 dropDown(pom.getInstancebp().getExpm(), "ByIndex", "5");
		 sleep();
		 dropDown(pom.getInstancebp().getEyear(), "ByValue", "2022");
		 sleep();
		 inputText(pom.getInstancebp().getCvv(), FileReadManager.getInstant_FRM().getInstance_CR().cvv());
		 sleep();
		 clickButton(pom.getInstancebp().getBook());

	    
	    
}
}
