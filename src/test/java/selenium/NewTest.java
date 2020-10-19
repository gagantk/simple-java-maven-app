package selenium;

import java.io.File;

import org.openqa.selenium.By;		
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxBinary;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.Assert;		
import org.testng.annotations.Test;	
import org.testng.annotations.BeforeTest;	
import org.testng.annotations.AfterTest;
public class NewTest {
	private WebDriver driver;
//	System.setProperty("webdriver.gecko.driver","D:\\Workspace\\demoproject\\src\\lib\\geckodriver.exe");
//	File pathBinary = new File("C:\\Users\\gagatk\\AppData\\Local\\Mozilla Firefox\\firefox.exe");
//	FirefoxBinary firefoxBinary = new FirefoxBinary(pathBinary);   
//	DesiredCapabilities desired = DesiredCapabilities.firefox();
//	FirefoxOptions options = new FirefoxOptions();
//	desired.setCapability(FirefoxOptions.FIREFOX_OPTIONS, options.setBinary(firefoxBinary));
	@Test				
	public void testEasy() {	
		driver.get("http://www.google.com/");  
		String title = driver.getTitle();				 
		Assert.assertTrue(title.contains("Google")); 		
	}	
	@BeforeTest
	public void beforeTest() {
	    driver = new ChromeDriver();  
	}		
	@AfterTest
	public void afterTest() {
		driver.quit();			
	}		
}
