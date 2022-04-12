package Helper_File;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;

public class Configuration_Reader
{
	public static Properties p;
	public Configuration_Reader() throws IOException
	{
		File f=new File("C:\\Users\\007\\eclipse-workspace\\AdactinBase\\src\\main\\java\\Helper_File\\Configuration.properties");
		FileInputStream fis=new FileInputStream(f);
		p=new Properties();
		p.load(fis);
		
	}
	
	public String getUrl() 
	{
	  String url = p.getProperty("url");
	  return url;
	}
     public String userName()
	{
       String uname = p.getProperty("username");
       return uname; 
	}
     public String passWord() 
     {
		String pword = p.getProperty("password");
		return pword;
     }
     public String fname() 
     {
		String fname = p.getProperty("fname");
		return fname;
     }
     public String lname() 
     {
	   String lname = p.getProperty("lname");
	   return lname;
     }
     public String address() 
     {
		String address = p.getProperty("address");
		return address;
     }
     public String aNum() 
     {
		String number = p.getProperty("Anum");
		return number;
     }
     public String cvv() 
     {
		String cvv = p.getProperty("cvv");
		return cvv;
     }
	
     
	
	
	
	

}
