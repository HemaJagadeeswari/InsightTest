package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.Properties;

import org.testng.Assert;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;



import base.TestBase;
import pages.DashboardPageT1;
import pages.DetailsPageT1;
import pages.EmployeeManagementPageT1;
import pages.HomePageT1;
import pages.LoginPageT1;
import pages.PayrollEntryPageT1;
import pages.SetupPageT1;
import pages.WH347GenerationPageT1;
import pages.WorkClassesPageT1;
import util.TestUtil;

public class WH347GenerationPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	EmployeeManagementPageT1 EmployeemanagementpageT1;
	WorkClassesPageT1 WorkclassespageT1;
	PayrollEntryPageT1 PayrollEntrypageT1;
	WH347GenerationPageT1 WH347GenerationpageT1;
	
	public WH347GenerationPageT1Test()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		LoginpageT1=new LoginPageT1();
		homepageT1=LoginpageT1.LoginT1(prop.getProperty("UserNameT1"),prop.getProperty("PasswordT1"));
		//SetuppageT1=homepageT1.PageView();
		Thread.sleep(2000);
		DashboardpageT1=SetuppageT1.PageView1();
		//DetailspageT1=DashboardpageT1.DetailsPageLaunch();
		Thread.sleep(2000);
		EmployeemanagementpageT1=DetailspageT1.EMlaunch();
		Thread.sleep(1000);
		PayrollEntrypageT1=EmployeemanagementpageT1.PElaunch();
		WH347GenerationpageT1=PayrollEntrypageT1.WHGenerationlaunch();
		//WorkclassespageT1=EmployeeF:\SkillSmart\SkillSmart Automation\Workspace\InsightTest\Download\WH347GenerationmanagementpageT1.WClaunch();
	
		}
	
	/*@Test(priority=0, description="WH347Generation T1 Page: WH347Generation Page Image Verification")
	public void PayrollysImageVerification() throws IOException, AWTException, InterruptedException
	{
		WH347GenerationpageT1.WH347GenerationImageVerification();
		
	}
	
	@Test(priority=1, description="WH347Generation T1 Page: Cancel button name Verification")
	public void CancelButton() throws IOException, AWTException, InterruptedException
	{
		String C=WH347GenerationpageT1.ValidateCancelbutton();
		Assert.assertEquals(C,"CANCEL","Cancel Button Name not matching");
		
	}
	
	@Test(priority=2, description="WH347Generation T1 Page: Preview Report button Verification")
	public void PreviewReportButton() throws IOException, AWTException, InterruptedException
	{
		WH347GenerationpageT1.ValidatePreviewReportbutton();
		
	}*/
	
	
	@DataProvider(name="getWHGeneration")
	   public Object[][] getTestDataWHGeneration(Method m)
		{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;	
		}	
	@Test(priority=15,dataProvider="getWHGeneration",description=" WH347Generation T1 Page:WH-347 creation Test")
	public void WHGenerationCreation(String PW,String ST,String CW,String E,String Ex,String R)
	 throws IOException, AWTException, InterruptedException
	{
	
		WH347GenerationpageT1.WH347GenerationCreation(PW,
			ST, CW, E, Ex,R);
	}
	

	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
