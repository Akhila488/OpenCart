package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObjects.HomePage;
import PageObjects.LoginPage;
import PageObjects.MyAccountPage;
import testBase.BaseClass;

public class TC002_LoginTest extends BaseClass {

	@Test(groups={"Sanity","Master"})
	public void verify_login() {
		logger.info("**** Starting TC_002 LoginTest****");
		try
		{
		

		//HomePage
		HomePage hp= new HomePage(driver);
		hp.clickMyAccount();
		hp.clickLogin();
		
		//Login
		LoginPage lp= new LoginPage(driver);
		lp.setEmail(p.getProperty("email"));
		lp.setPassword(p.getProperty("password"));
		lp.clickLogin();
		
		//MyAccount
		MyAccountPage map= new MyAccountPage(driver);
		boolean targetPage=map.isMyAccountPageExists();
		
		Assert.assertEquals(targetPage,true,"LoginFailed");
		
		}
	catch (Exception e)
		{
		Assert.fail();
		
		}
		logger.info("**** Finished TC_002 LoginTest****");
		
	}

}
