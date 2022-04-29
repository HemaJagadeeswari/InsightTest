package testcases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import base.TestBase;
import pages.HomePage;
import pages.LoginPage;
public class LoginPageTest extends TestBase{
	LoginPage Loginpage;
	HomePage HomePage;
	
	public LoginPageTest()
	{
		super();
	}
@BeforeMethod
public void setup()
{
	initialization();
	Loginpage=new LoginPage();
	}
	
@Test(priority=0,description="Login Page: Page Title Test")
public void LoginPageTitleTest()
{
	String title=LoginPage.ValidateLoginPageTitle();
	Assert.assertEquals(title,"Welcome to SkillSmart","Home Page Title is not matched");
	}

@Test(priority=1,description="Login Page: Page Image Test" )
public void LoginPageImageVerification() throws IOException
{
Loginpage.LoginPageImageVerification();
}

@Test(priority=2,description="Login Page: Forgot Password Image Test" )
public void ForgotPasswordImageVerification() throws IOException
{
Loginpage.ForgotPasswordImageVerification();
}
//Forgot Password functionality commented as per Kyle "probably want to skip that step in automation, as that does generate a new password and invalidate the old one" dated April 18 2022
//@Test(priority=3,description="Login Page: Forgot Password dialog Test" )
public void ForgotPasswordVerification() throws IOException
{
	Loginpage.ForgotPassword(prop.getProperty("ForgotPassword"));
}

@Test(priority=3,description="Login Page: Login to Application")
public void LoginTest()
{
	
	HomePage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
	
}

@AfterMethod
public void tearDown()
{
	Driver.quit();
}	
}
