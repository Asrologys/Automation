package vtigerpractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import genericutility.Baseclass;
import genericutility.ExcelFileUtility;
import genericutility.JavaUtility;
import genericutility.PropertyFileUtility;
import io.github.bonigarcia.wdm.WebDriverManager;
import objectrepository.CreateNewOrganizationPage;
import objectrepository.Homepage;
import objectrepository.Loginpage;
import objectrepository.OrganizationInformationPage;
import objectrepository.Organizationpage;

public class orgpage  extends Baseclass
{
//public static void main(String[] args) throws Throwable {
//	test annotation followed by non static method
	@Test
	public void script() throws Throwable
	{
		
	//create object for all poms
    PropertyFileUtility putil=new PropertyFileUtility();
	JavaUtility  jutil=new JavaUtility();
	ExcelFileUtility eutil = new ExcelFileUtility();
	
	//launch the browser
	//WebDriver driver = new EdgeDriver();
	//driver.get(URL);

	String URl=	putil.readDataFromPropertyFile("url");
    String UN=	putil.readDataFromPropertyFile("un");
    String PWD=	putil.readDataFromPropertyFile("pwd");
    
  //  WebDriverManager.firefoxdriver().setup();
    WebDriver driver=new EdgeDriver();
	driver.get(URl);
	
	Thread.sleep(1000);
   // System.out.print(URl);
   // System.out.print(UN);
   // System.out.print(PWD);
    Loginpage lp = new  Loginpage(driver);
    lp.loginintoapp(UN, PWD);
     //click on org link
    
    Homepage hp=new  Homepage(driver);
    //hp.clickContactslink();
    hp.clickonOrganizationslink();
    Thread.sleep(3000);
    
    
    //click on lookup img
     Organizationpage op=new  Organizationpage(driver);
     op.clickonOrglookupImage();
     Thread.sleep(1000);
    
    //get orgname from excel
    String ORG= eutil.readdatafromExcelFileUtility("Sheet1", 0, 0);
    CreateNewOrganizationPage pp=new CreateNewOrganizationPage(driver);
    
     //random class
    pp.CreateNewOrganizationPage(ORG+jutil.getrandomnumber());
    Thread.sleep(3000);
   
    //orginf page
    OrganizationInformationPage op3=new OrganizationInformationPage(driver);
    Thread.sleep(3000);
    op3.getHeaderTxt();
   hp.LogoutApp();
    }
	}

/*
 // int r=jutil.getrandomNum();
pp. CreateNewOrganizationPage(ORG);

//ORGANIZATION INF PAGE
OrganizationInformationPage  og=new  OrganizationInformationPage(driver);
  og.getHeaderTxt(); */
