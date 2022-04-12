package com.AdactinBase;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import BaseClass.BaseClass;

public class Adactin extends BaseClass
{

	public static void main(String[] args) throws InterruptedException 
	{
		 driver=getBrowers("chrome");		
		   //driver.get("https://adactinhotelapp.com/");
			getUrl("https://adactinhotelapp.com/");
			sleep();
			
			WebElement username1 = driver.findElement(By.name("username"));
			//username1.sendKeys("pmargrat123");
			inputText(username1,"pmargrat123");
			
			WebElement password1 = driver.findElement(By.id("password"));
			//password1.sendKeys("1234@abc");
			inputText(password1, "1234@abc");
			
			WebElement login1 = driver.findElement(By.name("login"));
		   //  login1.click();
			clickButton(login1);
			
			WebElement location = driver.findElement(By.name("location"));
			dropDown(location, "ByValue", "Paris");
			sleep();
			//Select s =new Select(location);
			//s.selectByValue("Paris");
			//Thread.sleep(3000);

			WebElement hotel = driver.findElement(By.name("hotels"));
			dropDown(hotel, "ByValue", "Hotel Sunshine");
			sleep();
			//Select s1 =new Select(hotel);
			//s1.selectByValue("Hotel Sunshine");
			//Thread.sleep(3000);
			
			WebElement roomtype = driver.findElement(By.name("room_type"));
			dropDown(roomtype,"ByValue","Deluxe");
			sleep();
			//Select s2 =new Select(roomtype);
			//s2.selectByValue("Deluxe");
			//Thread.sleep(3000);
		    
		    

			WebElement roomnumbers = driver.findElement(By.id("room_nos"));
			dropDown(roomnumbers, "ByValue", "2 - Two");
			//Select s3 =new Select(roomnumbers);
			//s3.selectByValue("1");
			//Thread.sleep(3000);
			sleep();
			
			WebElement adults = driver.findElement(By.id("adult_room"));
			dropDown(adults, "ByValue", "2 - Two");
			sleep();
			//Select s4 =new Select(adults);
			//s4.selectByValue("2");
			//Thread.sleep(3000);
			
			WebElement children = driver.findElement(By.name("child_room"));
			dropDown(children, "ByIndex", "2");
			sleep();
			//Select s5 =new Select(children);
			//s5.selectByValue("1");
			//Thread.sleep(3000);
			
			
			WebElement search = driver.findElement(By.name("Submit"));
			clickButton(search);
			
			//search.click();
			//Thread.sleep(3000);
			WebElement click = driver.findElement(By.name("radiobutton_0"));
			 //click.click();
			clickButton(click);
			
			 WebElement click1= driver.findElement(By.name("continue"));
		     //click1.click();
			 clickButton(click1);
			 
			 WebElement firstname = driver.findElement(By.name("first_name"));
			// firstname.sendKeys("margrat");
			 inputText(firstname, "margrat");
			 
			 WebElement lastname = driver.findElement(By.name("last_name"));
			// lastname.sendKeys("vinola");
			 inputText(lastname, "vinola");
			 
			 WebElement address = driver.findElement(By.name("address"));
			// address.sendKeys("chennai");
			 inputText(address, "chennai");
			 
			 WebElement card_no = driver.findElement(By.name("cc_num"));
			 //card_no.sendKeys("1234567812345678");
			 inputText(card_no, "1234567812345678");
			 
			 WebElement card = driver.findElement(By.name("cc_type"));
			 dropDown(card, "ByValue", "VISA");
			 sleep();
			 //Select s6 =new Select(card);
			 //s6.selectByValue("VISA");
			 //Thread.sleep(3000);
			 
			 WebElement month = driver.findElement(By.name("cc_exp_month"));
			 dropDown(month, "ByIndex", "5");
			 sleep();
			 //Select s7 =new Select(month);
			 //s7.selectByIndex(5);
			 //Thread.sleep(3000);
			 
			 WebElement year = driver.findElement(By.name("cc_exp_year"));
			 dropDown(year, "ByValue", "2022");
			 sleep();
			 //Select s8 =new Select(year);
			 //s8.selectByValue("2022");
			 //Thread.sleep(3000);
			 
			 WebElement cvv = driver.findElement(By.name("cc_cvv"));
			 inputText(cvv, "123");
			 sleep();
			 //cvv.sendKeys("123");
			 
			 
			 WebElement book = driver.findElement(By.name("book_now"));
			 //book.click();
			 clickButton(book);
			 

	}
}
