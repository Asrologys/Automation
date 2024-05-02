package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class CreateNewOrganizationPage {

	//declaration
	
@FindBy(xpath="//input[@class='detailedViewTextBox']") private WebElement OrgName;
@FindBy(xpath="//input[@class='crmbutton small save'][1]") private WebElement SaveBtn;
	

//Initialization
	public CreateNewOrganizationPage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	//
	public WebElement getOrgName() {
		return OrgName;
	}
	public WebElement getSaveBtn() {
		return SaveBtn;
	}
//Utilization	
	
	
//Business Library
public void CreateNewOrganizationPage(String ORGNAME)

{
	 OrgName.sendKeys(ORGNAME);

       SaveBtn.click();
}
	 }





















	