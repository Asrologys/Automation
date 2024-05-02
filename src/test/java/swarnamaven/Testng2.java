package swarnamaven;

import org.testng.Reporter;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;
public class Testng2 
{
	@BeforeSuite
	public void bs() {
		Reporter.log("Database connection",true);
	}
		@AfterSuite
public void as()
{
Reporter.log("Database disconnection",true);
	}

@BeforeClass
public void bc()
{
	Reporter.log("launch the browser",true);
}
@AfterClass
public void ac()
{
	Reporter.log("close the browser",true);
}
@BeforeMethod
public void bm()
{
	Reporter.log("loginto application",true);
}
@AfterMethod
public void am()
{
Reporter.log("logout application",true);	
}
@Test
public void tstannotation()
{
Reporter.log("flow of annotationa",true);	
}
	
}
















