package genericutility;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import com.google.common.io.Files;

public class WebDriverUtility {
	
	public void maximiseWindow(WebDriver driver) {
			driver.manage().window().maximize();
		}
		public void minimiseWindow(WebDriver driver) {
			driver.manage().window().minimize();
		}
		public void WaitForPageLoad(WebDriver driver) {
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		}
			public void HandleDropDown(WebElement element, int index) {
				Select s = new Select(element);
				s.selectByIndex(index);
			}
			public void HandleDropDown(WebElement element, String value ) {
				Select s2 = new Select(element);
				s2.selectByValue(value);
			}
			public void HandleDropDown( String visibletext,WebElement element ) {
			
				Select s3 = new Select(element);
				s3.selectByVisibleText(visibletext);
		}
			public void mouseactions(WebElement Element,WebDriver driver) {
				Actions a=new Actions(driver);
				a.moveToElement(Element).perform();
				
			}
			public void rightclickaction(WebDriver driver) {
				Actions a=new Actions(driver);
				a.contextClick().perform();
				
			}
			public void rightclickaction(WebDriver driver,WebElement element) {
				Actions a=new Actions(driver);
				a.contextClick(element).perform();
			}
			public void doubleckickapplication(WebDriver driver) {
				Actions a=new Actions(driver);
				a.doubleClick().perform();
				
			}
			public void doubleclickwebapplication(WebDriver driver,WebElement element) {
				Actions a=new Actions(driver);
				a.doubleClick(element).perform();
				
			}
			public void draganddrop(WebDriver driver,WebElement src,WebElement dest) {
				Actions a=new Actions(driver);
				a.dragAndDrop(src, dest);
				
			}
			public void switchtoframe(WebDriver driver,int index) {
				driver.switchTo().frame(index);
				
			}
			public void switchframe(WebDriver driver,  String nameid) {
				driver.switchTo().frame(nameid);
			} 
			public void stwicttodefault(WebDriver driver) {
				driver.switchTo().defaultContent();
				
			}
			public void switchtoparent(WebDriver driver) {
				driver.switchTo().parentFrame();
			}
			public void acceptalertpopup(WebDriver driver) {
				driver.switchTo().alert().accept();
			}
			public void dismissalertpopup(WebDriver driver) {
				driver.switchTo().alert().dismiss();
			}
			public void gettextpopup(WebDriver driver) {
				driver.switchTo().alert().getText();
			}
			public void takesscreenshot(WebDriver driver,String  screenshotname ) throws Throwable {
				TakesScreenshot t=(TakesScreenshot)driver;
				File src = t.getScreenshotAs(OutputType.FILE);
				File dest=new File(".\\sereenshot"+screenshotname+ ".png");
				Files.copy(src, dest);
				
			}
			public void scrollhandling(WebDriver driver,String argument) {
				JavascriptExecutor j=(JavascriptExecutor)driver;
				j.executeScript(argument);
				
			}
	//	public String getAlert

	}
	
	


