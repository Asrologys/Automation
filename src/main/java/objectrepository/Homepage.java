package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Homepage {
	//declaration
	@FindBy(xpath = "//a[@href='index.php?module=Accounts&action=index']")private WebElement Organizations;
	@FindBy(xpath = "//a[@href='index.php?module=Contacts&action=index']")private WebElement Contacts;
	@FindBy(xpath ="//a[@href='index.php?module=Potentials&action=index']")private WebElement Oppurtunities;
	@FindBy(xpath ="//img[@src='themes/softed/images/user.PNG']")private WebElement Administrator;
	@FindBy(xpath ="//a[@href='index.php?module=Users&action=Logout']")private WebElement Logout;
	
	//intialization
	
	public Homepage(WebDriver driver) {
		PageFactory.initElements(driver,this);
	}
	
	//utilization
	
	public WebElement getOrganizations() {
		return Organizations;
	}
	public WebElement getContacts() {
		return Contacts;
	}

	public WebElement getOppurtunities() {
		return Oppurtunities;
	}
	public WebElement getAdministrator() {
	return Administrator;
	}
	public WebElement getLogout() {
		return Logout;
	}

	//Utilization

	//business logic

public void clickonOrganizationslink()
{
	Organizations.click();
	}
public void clickContactslink()
{
	Contacts.click();
}
public void clickOppurtunitieslink()
{
	Oppurtunities.click();
}

public void clickAdministrator()
{
	Administrator.click();

}

public void LogoutApp()

{
	Logout.click();	
}

}















