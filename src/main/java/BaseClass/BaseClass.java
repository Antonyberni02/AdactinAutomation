package BaseClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {
	
public static WebDriver driver;//null driver
	
	public static WebDriver getBrowers(String browser) {
		if (browser.equalsIgnoreCase("chrome"))
		{
			System.setProperty("webdriver.chrome.driver","C:\\Users\\007\\eclipse-workspace\\AdactinBase\\Driver\\chromedriver.exe");
		     driver =new ChromeDriver();
		
		}
		else if(browser.equalsIgnoreCase("fireFox")) {
			System.setProperty("webdriver.gecko.driver","C:\\Users\\007\\eclipse-workspace\\Project\\Driver\\geckodriver.exe");
		     driver =new FirefoxDriver();

			}
		driver.manage().window().maximize();
		return driver;
	}
		
		public static void getUrl(String Url)
		  {
			
	    driver.get(Url);
		  }
		
		public static void clickButton(WebElement element)
		{
			element.click();

		}
		
		public static void inputText(WebElement element,String value ) 
		{
			element.sendKeys(value);

		}
		public void close()
		{
			driver.close();
		}
		
		//dropdown
		
		//webelement
		//type
		//value
		public static void dropDown(WebElement element,String type,String value) 
		    {
		
		    Select s = new Select(element);
		
		     if (type.equalsIgnoreCase("VisibleText")) 
		     {
			 s.selectByValue(value);
		     }
		 
		     else if (type.equalsIgnoreCase("ByValue")) 
		     {
			
		     s.selectByVisibleText(value);
		     }
		     else if (type.equalsIgnoreCase("ByIndex"))
		     {
		      int i = Integer.parseInt(value);
		      s.selectByIndex(i);	
		     }
		 

		}
	   public static void quit()
	   {
		   driver.quit();
	   }
	   public static void refresh() 
	   {
		driver.navigate().refresh();

	   }
	   public static void back() {
		driver.navigate().back();

	   }
	   public static void forward() {
		   driver.navigate().forward();

	    }
	   public static void navigateTo(String url ) 
	   {
		   driver.navigate().to(url);

	   }
	   //javaScriptExecutor
	   public static void JavaScriptExe(WebElement element) throws InterruptedException 
	   {
		   JavascriptExecutor js=(JavascriptExecutor) driver;
		   Thread.sleep(3000);
		   js.executeScript("window.scrollBy(0,-1000);");
		   Thread.sleep(3000);
		   js.executeScript("arguments[0].scrollIntoView();", element);
		   Thread.sleep(3000);
		   js.executeScript("window.scrollBy(0,2000);" );
		   
	   }	   
		public static void sleep() throws InterruptedException
		{
			Thread.sleep(3000);
		}
		public static void implicitWait() 
		{
			driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		}
		public static void maximize() 
		{
		
            driver.manage().window().maximize();
		}
		}
		

	
	
		
	


