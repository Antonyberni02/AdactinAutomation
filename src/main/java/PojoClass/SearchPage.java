package PojoClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {
	
	public static WebDriver driver;
	
	@FindBy(name="location")
	private WebElement location;
	
	@FindBy(name="hotels")
	private WebElement hotel;
	
	@FindBy(name="room_type")
	private WebElement RType;
	
	@FindBy(id="room_nos")
	private WebElement RNomrs;
	
	@FindBy(id="adult_room")
	private WebElement ARoom;
	
	@FindBy(name="child_room")
	private WebElement CRoom;
	
	@FindBy(name="Submit")
	private WebElement search;
	
	public SearchPage(WebDriver driver2)  
	{
		this.driver=driver2;
		PageFactory.initElements(driver, this);
	}

	public WebElement getLocation() {
		return location;
	}

	public WebElement getHotel() {
		return hotel;
	}

	public WebElement getRType() {
		return RType;
	}

	public WebElement getRNomrs() {
		return RNomrs;
	}

	public WebElement getARoom() {
		return ARoom;
	}

	public WebElement getCRoom() {
		return CRoom;
	}

	public WebElement getSearch() {
		return search;
	}

	
	
	
	
	
	
	
	

}
