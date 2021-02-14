package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import page.LoginPage;

public class LoginPageTest extends TestBase {

	LoginPage loginpageObj;

	@BeforeMethod
	public void setUp() {
		initializeDriver();
		loginpageObj = PageFactory.initElements(driver, LoginPage.class);
	}
	
	@Test
	public void loginTest() throws InterruptedException {
		loginpageObj.enterUserName("demo@techfios.com");
		loginpageObj.enterPassword("abc123");
		loginpageObj.clickSignInButton();
		Thread.sleep(3000);
	}
	
	
	
	
	
	@AfterMethod
	 public void tearDown() {  
	  driver.close();
	  driver.quit();
	 }
}
