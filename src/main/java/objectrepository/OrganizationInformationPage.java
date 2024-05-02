package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrganizationInformationPage {
	
		@FindBy(xpath = "//span[@class='dvHeaderText']") private WebElement HeaderTxt;
			

//intialization
	public OrganizationInformationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getHeaderTxt() {
		return HeaderTxt;
	}

	
	//bUSINESS LIBRARY
	
	public String getHeader()
	{
		return HeaderTxt.getText();
	}
	
	}
