package Helper_File;

import java.io.IOException;

public class FileReadManager 
{
	//private
	private FileReadManager() 
	{
		
	}
	//static
	public static FileReadManager getInstant_FRM()
	{
		FileReadManager helper =new FileReadManager();
		return helper;
	}
	//non-static method
	public Configuration_Reader getInstance_CR() throws IOException
	{
		Configuration_Reader reader=new Configuration_Reader();
		return reader;
	}
		

	
	
	
	
	
	
	
	

}
