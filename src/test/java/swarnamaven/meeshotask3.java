package swarnamaven;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class meeshotask3 {
	public static void main(String[] args) throws InterruptedException 
	{
        //System.setProperty("webdriver.chrome.driver", "C:\\Users\\91955\\Downloads\\chromedriver-win64\\chromedriver-win64\\chromedriver.exe");
		 WebDriver driver = new ChromeDriver();
		 
		 Thread.sleep(3000);
		 driver.get("https://www.meesho.com");
		
		
}

}
//"C:\Users\91955\Downloads\chromedriver-win64.zip"
//"C:\Users\91955\Downloads\chromedriver-win64\chromedriver-win64\chromedriver.exe"
