package objectrepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Organizationpage {
	
	
	
	
	//declaration
	@FindBy(xpath = "//img[@src='themes/softed/images/btnL3Add.gif']")private WebElement OrglookupImage;
			
			
	//intialization
	
			public Organizationpage(WebDriver driver) {
				PageFactory.initElements(driver,this);
			}
			
			//utilization
			
			public WebElement getOrglookupImage() {
				return OrglookupImage;
			}

					
	//businesslibrary
			public void clickonOrglookupImage()
			{
				OrglookupImage.click();
			}
}
