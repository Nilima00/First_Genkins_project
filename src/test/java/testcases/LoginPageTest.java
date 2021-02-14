package testcases;

import org.openqa.selenium.support.PageFactory;
import org.testng.Assert;
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

	
	  @Test(priority = 2) public void loginpageTitleTest() throws
	  ClassNotFoundException, InterruptedException {
	  loginpageObj.enterUserName("demo@techfios.com");
	  Thread.sleep(3000);
	  loginpageObj.enterPassword("abc123");
	  Thread.sleep(3000);
	  loginpageObj.clickSignInButton(); 
	  String expectedTitle="Dashboard- iBilling";
	  String actualTitle = loginpageObj.getPageTitle();
	  Assert.assertEquals(expectedTitle, actualTitle); }
	 

	@AfterMethod
	public void tearDown() {
		driver.close();
		driver.quit();
	}
}
