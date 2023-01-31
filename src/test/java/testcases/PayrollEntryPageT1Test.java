package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;

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
import pages.WorkClassesPageT1;
import util.TestUtil;

public class PayrollEntryPageT1Test extends TestBase{
	HomePageT1 homepageT1;
	DashboardPageT1 DashboardpageT1;
	LoginPageT1 LoginpageT1;
	SetupPageT1 SetuppageT1;
	DetailsPageT1 DetailspageT1;
	EmployeeManagementPageT1 EmployeemanagementpageT1;
	WorkClassesPageT1 WorkclassespageT1;
	PayrollEntryPageT1 PayrollEntrypageT1;
	
	public PayrollEntryPageT1Test()
	{
		super();
	}
	@BeforeMethod
	public void setup() throws InterruptedException
	{
		initialization();
		LoginpageT1=new LoginPageT1();
		homepageT1=LoginpageT1.LoginT1(prop.getProperty("UserNameT1"),prop.getProperty("PasswordT1"));
		DashboardpageT1=homepageT1.PageView();
		//Thread.sleep(1000);
		PayrollEntrypageT1= DashboardpageT1.PElaunch();	
		}
	
/*	
	 @Test(priority=0, description="PayrollEntry T1 Page: View All Payroll Left Nav Name Test")
		public void ValidateViewAllPayrollsLeftNav()
		{
			String P=PayrollEntrypageT1.ValidateViewAllPayrollsLeftNav();
			Assert.assertEquals(P,"View All Payroll","View All Payroll Left Nav Name not matching");
		}
		
@Test(priority=1, description="PayrollEntry T1 Page: Create Payroll Left Nav Name Test")
	public void CreatePayrollLeftNavName()
	{
		String C=PayrollEntrypageT1.ValidateCreatePayrollLeftNav();
		Assert.assertEquals(C,"Create Payroll","Create Payroll Left Nav Name not matching");
	}

		@Test(priority=2, description="PayrollEntry T1 Page: Import Payroll Left Nav Name Test")
		public void ImportPayrollLeftNavName()
		{
			String I=PayrollEntrypageT1.ValidateImportPayrollLeftNav();
			Assert.assertEquals(I,"Import Payroll","Import Payroll Left Nav Name not matching");
		}	
		
		@Test(priority=3, description="PayrollEntry T1 Page: Generate WH-347 Left Nav Name Test")
		public void GenerateWH347LeftNavName()
		{
			String I=PayrollEntrypageT1.ValidateGenerateWH347LeftNav();
			Assert.assertEquals(I,"Generate WH-347","Generate WH-347 Left Nav Name not matching");
		}
	
 @Test(priority=4, description="PayrollEntry T1 Page: View All Payroll Tab Name Test")
	public void ValidateViewAllPayrollTabName()
	{
		String P=PayrollEntrypageT1.ValidateViewAllPayrollsTab();
		Assert.assertEquals(P,"VIEW ALL PAYROLL","View All Payroll Tab Name not matching");
	}
	
@Test(priority=5, description="PayrollEntry T1 Page: Create Payroll Tab Name Test")
public void CreateNewPayrollTabName()
{
	String C=PayrollEntrypageT1.ValidateCreatePayrollTab();
	Assert.assertEquals(C,"CREATE PAYROLL","Create Payroll Tab Name not matching");
}

	@Test(priority=6, description="PayrollEntry T1 Page: Import Payroll Tab Name Test")
	public void ImportPayrollTabName()
	{
		String I=PayrollEntrypageT1.ValidateImportPayrollTab();
		Assert.assertEquals(I,"IMPORT PAYROLL","Import Payroll Tab Name not matching");
	}
	

	@Test(priority=7, description="PayrollEntry T1 Page: Generate WH-347 Tab Name Test")
	public void GenerateWH347TabName()
	{
		String I=PayrollEntrypageT1.ValidateGenerateWH347Tab();
		Assert.assertEquals(I,"GENERATE WH-347","Generate WH-347 Tab Name not matching");
	}
	

	@Test(priority=5, description="PayrollEntry T1 Page: Payrolls Page Image Verification")
	public void PayrollysImageVerification() throws IOException, AWTException, InterruptedException
	{
		PayrollEntrypageT1.PayrollsPageImageVerification();
		
	}
	*/

	/*@Test(priority=6, description="PayrollEntry T1 Page: Edit button Name Test")
	public void Editbutton()
	{
		String E=PayrollEntrypageT1.ValidateEditbutton();
		Assert.assertEquals(E,"EDIT","Edit button Name not matching");
	}
	
	@Test(priority=7, description="PayrollEntry T1 Page: Enter Hours Button Name Test")
	public void EnterHoursName()
	{
		String EH=PayrollEntrypageT1.ValidateEnterHoursButton();
		Assert.assertEquals(EH,"ENTER HOURS","Enter Hours button Name not matching");
	}
	
	//@Test(priority=8, description="PayrollEntry T1 Page: Change To No Work Button Name Test")
	public void ChangeToNoWorkbuttonName()
	{
		String C=PayrollEntrypageT1.ValidateChangeToNoWorkButton();
		Assert.assertEquals(C,"CHANGE TO NO WORK","Change To No Work Button Name not matching");
	}
	
	//@Test(priority=9, description="PayrollEntry T1 Page: Sign button Name Test")
	public void SignbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateSignbutton();
		Assert.assertEquals(I,"SIGN","Sign button Name not matching");
	}
	
	@Test(priority=10, description="PayrollEntry T1 Page: Refresh button Name Test")
	public void RefreshPayrollButtonName()
	{
		String I=PayrollEntrypageT1.ValidateRefreshPayrollbutton();
		Assert.assertEquals(I,"REFRESH PAYROLL","Refresh button Name not matching");
	}
	
	//@Test(priority=11, description="PayrollEntry T1 Page: Mark As Final Button Name Test")
	public void MarkAsFinalbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateMarkAsFinalbutton();
		Assert.assertEquals(I,"MARK AS FINAL","Mark A Final button Name not matching");
	}
	
	//@Test(priority=12, description="PayrollEntry T1 Page: Clear Final Flag Button Name Test")
	public void ClearFinalFlagbuttonName()
	{
		String I=PayrollEntrypageT1.ValidateClearFinalFlagbutton();
		Assert.assertEquals(I,"CLEAR FINAL FLAG","WH 347 Generation Tab Name not matching");
	}
	
	@Test(priority=13, description="PayrollEntry T1 Page: Delete Button Name Test")
	public void DeleteButtonName()
	{
		String I=PayrollEntrypageT1.ValidateDeletebutton();
		Assert.assertEquals(I,"DELETE","Delete Button Name not matching");
	}
	//@Test(priority=14, description="PayrollEntry T1 Page: Manual Payroll Entry Verification")
		public void CreateNewPayrollImageVerification() throws IOException, AWTException
		{
			PayrollEntrypageT1.CreatNewPayrollImageVerification();
			
		}*/
	
/*@DataProvider(name="getManualPayroll")
	   public Object[][] getTestDataManualPayroll(Method m)
		{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;	
		}	
	@Test(priority=15,dataProvider="getManualPayroll",description="PayrollEntry T1 Page:Manual Payroll creation Test")
	public void ManualPayrollCreation(String STP,String ENW,String Day1,String H1,String OT1,String DT1,String OE,String Day2,String H2,String OT2,
			String DT2,String Day3,String H3,String OT3,String F1,String W1,String S1, String L1,
			String O1,String E1,String NP1, String WA1,String Day4,String H4,String OT4,String DT4,String H5,String OT5,String F3,String W3,String S3,String S)
	 throws IOException, AWTException, InterruptedException
	{
		PayrollEntrypageT1.ValidateManualPayrollCreation(STP,ENW,Day1,H1,OT1,DT1,OE,Day2,H2,OT2,
				DT2,Day3,H3,OT3,F1,W1,S1,L1,O1,E1,NP1,WA1,Day4,H4,OT4,DT4,H5,OT5,F3,W3,S3,S);
	}	*/
	
	/*@DataProvider(name="getEditManualPayroll")
	   public Object[][] getTestDataEditManualPayroll(Method m)
	
	
	{
			Object data[][]=TestUtil.getTestData(sheetName, m.getName());
			System.out.println(m.getName());
			return data;
			
		}
	@Test(priority=16,dataProvider="getEditManualPayroll",description="PayrollEntry T1 Page:Edit Manual Payroll Test")
	public void EditManualPayroll(String PP,String FN1,String Day1,String H1,String OT1,String DT1,String OE
			,String F1,String W1,String S1,String L1,String O1,String E1,String NP1, String WA1,String Day2,
			String HO2,String OTH2,String DTH2,String OEH2,
			String F2,String Name,String JT,String PED,String PD,String BR,String OT,String DT,String FR,
			String Name1,String PName1,String PName,String WC)
	 throws IOException, AWTException, InterruptedException
	{
		PayrollEntrypageT1.EditPayroll(PP,FN1,Day1,H1,OT1,DT1,OE
				,F1, W1,S1,L1,O1,E1,NP1, WA1,Day2,
				HO2,OTH2,DTH2,OEH2,
				 F2,Name, JT, PED,PD,BR,OT, DT,FR,
				Name1,PName1,PName,WC);
	}*/
	@Test(priority=18, description="PayrollEntry T1 Page: Manual Payroll Entry Verification")
	public void WHGenerationPageLaunch() throws InterruptedException
	{
		PayrollEntrypageT1.WHGenerationlaunch();
		
	}
	
	@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
