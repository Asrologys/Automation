package genericutility;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Baseclass {
	@BeforeSuite 
	public void bs()
	{
		Reporter.log("DB Connection");
	}
	@BeforeClass
	public void bc()
	{
		WebDriverManager.edgedriver().setup();
		
	WebDriver driver =new EdgeDriver();
	 driver.get("http://www.localhost:8888/");
	Reporter.log("launch the application",true);
	}
	@BeforeMethod 
	public void	bm() throws Throwable 
	{
		//driver.get("http://localhost:8888/");	
		//Reporter.log("launch the browser",true);
		
PropertyFileUtility putil=new PropertyFileUtility();
String UN=	putil.readDataFromPropertyFile("un");
		//String URl=putil.readDataFromPropertyFile("url");
	   // String UN=putil.readDataFromPropertyFile("un");
String PWD=	putil.readDataFromPropertyFile("pwd");
String URl=	putil.readDataFromPropertyFile("url");

	//driver.findElement(By.xpath("//input[@name='user_name']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@name='user_password']")).sendKeys("admin");
	//driver.findElement(By.xpath("//input[@id='submitButton']")).click();
	}
	
	
	@AfterMethod
	public void am(WebDriver driver)
	{
		
	//driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']")).click();
	driver.findElement(By.xpath("//img[@src='themes/softed/images/user.PNG']"));
		driver.findElement(By.xpath("//a[@href='index.php?module=Users&action=Logout']")).click();
		}
	@AfterClass
	public void ac()
	{
		Reporter.log("close the window");
	}
	
	@AfterSuite
	public void as()
	{
	Reporter.log("DB Disconnection");	
	}
	
}
