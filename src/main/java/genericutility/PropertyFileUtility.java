package genericutility;

import java.io.FileInputStream;
import java.util.Properties;

public class PropertyFileUtility {
	
	
	public String readDataFromPropertyFile(String Key) throws Throwable {
		
		FileInputStream fis=new FileInputStream(IconstantUtility.propertyfilepath);
		
		Properties p=new Properties();
		p.load(fis);
		return p.getProperty(Key);
}
}
	
	
	
	
	
	
	

