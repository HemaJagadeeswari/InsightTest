package testcases;

import java.awt.AWTException;
import java.io.IOException;
import java.lang.reflect.Method;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import base.TestBase;
import pages.DashboardPage;
import pages.DetailsPage;
import pages.HomePage;
import pages.LoginPage;
import pages.SubcontractorPage;
import util.TestUtil;

import org.testng.annotations.AfterMethod;
public class DetailsPageTest extends TestBase
{
	HomePage homepage;
	DashboardPage Dashboardpage;
	LoginPage Loginpage;
	DetailsPage Detailspage;
	SubcontractorPage Subcontractorpage;
	
	public DetailsPageTest()
	{
		super();
	}
	@BeforeMethod
	public void setup()
	{
		initialization();
		Loginpage=new LoginPage();
		homepage=Loginpage.Login(prop.getProperty("UserName"),prop.getProperty("Password"));
		Dashboardpage=homepage.Projectselection();
		Detailspage=Dashboardpage.DetailsPageLaunch();
		
		}
		
/*@Test(priority=0,description="Details Page: Project Name Value Test")
	public void ProjectName()
	{
		String ProjectName=Detailspage.ValidateProjectNameField();
		Assert.assertEquals(ProjectName,"Prev. Wage Project - All Features-new","Project Name is not matching");
		}
	
	@Test(priority=1,description="Details Page: Project Number Value Test" )
	public void ProjectNumber()
	{
        String ProjectNumber=Detailspage.ValidateNumberField();
		Assert.assertEquals(ProjectNumber,"Snow-1","Project Number not matched");

		}
	
	@Test(priority=2,description="Details Page:Project Status Value Test")
	public void ProjectStatus()
	{
        String Status=Detailspage.ValidateProjectStatus();
		Assert.assertEquals(Status,"Active - users are able to access the project","Project Status not matched");
		}
	
	@Test(priority=3,description="Details Page:Project Closed Date Value Test")
	public void ProjectClosedDate()
	{
        String CloseDate=Detailspage.ValidateProjectCloseDate();
		Assert.assertEquals(CloseDate,"","Project Closed Date not matched");
		}
	
	@Test(priority=4,description="Details Page:Ethnicity Value Test")
	public void ProjectEthnicity()
	{
        String Ethnicity=Detailspage.ValidateEthnicityField();
		Assert.assertEquals(Ethnicity,"Hispanic or Latino","Ethnicity not matched");
		}
	
	@Test(priority=5,description="Details Page: Gender Value Test")
	public void ProjectGender()
	{
        String ProjectGender=Detailspage.ValidateGenderField();
		Assert.assertEquals(ProjectGender,"Male","Gender not matched");
		}
	
@Test(priority=6,description="Details Page: Site Address Street1 Value Test")
	public void SiteAddressStreet1()
	{
		String Street1=Detailspage.ValidateSiteAddressStreet1();
		Assert.assertEquals(Street1,"7918 Peaceful Par Dr.","Street1 is not matching");
		}
	
	@Test(priority=7,description="Details Page: Site Address Street2 Value Test")
	public void SiteAddressStreet2()
	{
		String Street2=Detailspage.ValidateSiteAddressStreet2();
		Assert.assertEquals(Street2,"","Street2 is not matching");
		}
	@Test(priority=8,description="Details Page: Site Address City Value Test")
	public void SiteAddressCity()
	{
		String City=Detailspage.ValidateSiteAddresscity();
		Assert.assertEquals(City,"Sarasota","City is not matching");
		}
	@Test(priority=9,description="Details Page: Site Address Country Value Test")
	public void SiteAddressCountry()
	{
		String Country=Detailspage.ValidateSiteAddressCountry();
		Assert.assertEquals(Country,"United States","Country is not matching");
		}
	@Test(priority=10,description="Details Page: Site Address State Value Test")
	public void SiteAddressState()
	{
		String State=Detailspage.ValidateSiteAddressState();
		Assert.assertEquals(State,"FL","Site Address State is not matching");
		}
	@Test(priority=11,description="Details Page: Site Address Zip Code  Value Test")
	public void SiteAddressZipCode()
	{
		String Zip=Detailspage.ValidateSiteAddressZip();
		Assert.assertEquals(Zip,"34241","Site Address Zip Code is not matching");
		}
	@Test(priority=12,description="Details Page: Site Address Effective Date Value Test")
	public void SiteAddressEffectiveDate()
	{
		String EffectiveDate=Detailspage.ValidateSiteAddressEffectiveDate();
		Assert.assertEquals(EffectiveDate,"01/01/2000","Site Address Effective Date is not matching");
		}
	@Test(priority=13,description="Details Page: Default Address Type Value Test")
	public void AddressType1()
	{
		String Type1=Detailspage.ValidateSiteAddressType();
		Assert.assertEquals(Type1,"Site Office","Default Address Type is not matching");
		}
	
	@Test(priority=14,description="Details Page: Corporate Address Street1 Value Test")
		public void CorporateAddressStreet1()
		{
			String Street1=Detailspage.ValidateCorporateAddressStreet1();
			Assert.assertEquals(Street1,"7918 Peaceful Par Dr.","Street1 is not matching");
			}
		
		@Test(priority=15,description="Details Page: Corporate Address Street2 Value Test")
		public void CorporateAddressStreet2()
		{
			String Street2=Detailspage.ValidateCorporateAddressStreet2();
			Assert.assertEquals(Street2,"","Street2 is not matching");
			}
		@Test(priority=16,description="Details Page: Corporate Address City Value Test")
		public void CorporateAddressCity()
		{
			String City=Detailspage.ValidateCorporateAddresscity();
			Assert.assertEquals(City,"Sarasota","City is not matching");
			}
		@Test(priority=17,description="Details Page: Corporate Address Country Value Test")
		public void CorporateAddressCountry()
		{
			String Country=Detailspage.ValidateCorporateAddressCountry();
			Assert.assertEquals(Country,"United States","Country is not matching");
			}
		@Test(priority=18,description="Details Page: Corporate Address State Value Test")
		public void CorporateAddressState()
		{
			String State=Detailspage.ValidateSiteAddressState();
			Assert.assertEquals(State,"FL","Site Address State is not matching");
			}
	   @Test(priority=19,description="Details Page: Corporate Address Zip Code  Value Test")
		public void CorporateAddressZipCode()
		{
			String Zip=Detailspage.ValidateCorporateAddressZip();
			Assert.assertEquals(Zip,"34241","Corporate Address Zip Code is not matching");
			}
		@Test(priority=20,description="Details Page: Corporate Address Effective Date Value Test")
		public void CorporateAddressEffectiveDate()
		{
			String EffectiveDate=Detailspage.ValidateCorporateAddressEffectiveDate();
			Assert.assertEquals(EffectiveDate,"01/01/2000","Corporate Address Effective Date is not matching");
			}
		@Test(priority=21,description="Details Page: Default Address Type Value Test")
		public void AddressType2()
		{
			String Type1=Detailspage.ValidateCorporateAddressType();
			Assert.assertEquals(Type1,"Corporate Office","Default Address Type is not matching");
			}
		
		@Test(priority=22,description="Details Page:Address Update button Test")
		public void CorporateAddressUpdatebutton()
		{
			String Street1=Detailspage.ValidateUpdateButton();
			Assert.assertEquals(Street1,"UPDATE","Button name is not matching");
			}
		
		@Test(priority=23,description="Details Page: Address Cancel button Test")
		public void CorporateAddressCancelbutton()
		{
			String Street1=Detailspage.ValidateCancelButton();
			Assert.assertEquals(Street1,"CANCEL","Button name is not matching");
			}
	

	 @Test(priority=24,description="Details Page: Add New button Test")
			public void AddNewbutton()
			{
				String AN=Detailspage.ValidateAddNew();
				Assert.assertEquals(AN,"ADD NEW","Add New button Name is not matching");
				}*/
	 
	@DataProvider(name="NewAddress")
		public Object[][] getTestData1(Method m)
		{
		System.out.println("Expected Value");
			Object data[][]=TestUtil.getTestData(sheetName,m.getName());
			return data;        	
		}
	 
	 @Test(priority=25,dataProvider="NewAddress",description="Details Page: Adding,Editing and Deleting a New Address")
		public void NewAddressCreation(String ST1,String ST2,String C,String Co,String STA,String Z,String ED,String AT,String ED1) throws InterruptedException
		{
			Detailspage.ValidateNewAddress(ST1, ST2, C, Co, STA, Z, ED, AT, ED1);
		
			}
 
	 
 /* @Test(priority=25 ,description="Details Page: Scheduled Start Date Value Test")
	public void ScheduledStartDate()
	{
        String ScheduledStartDate=Detailspage.ValidateScheduledStartDate();
		Assert.assertEquals(ScheduledStartDate,"10/01/2021","Scheduled Start Date not matched");
		}
	
	@Test(priority=26,description="Details Page: Scheduled End Date Value Test")
	public void ScheduledEndDate()
	{
        String ScheduledEndDate=Detailspage.ValidateScheduledEndDate();
		Assert.assertEquals(ScheduledEndDate,"03/31/2023","Scheduled End Date not matched");
		}
	
    @Test(priority=27,description="Details Page: Actual Start Date Value Test")
	public void ActualStartDate()
	{
        String ActualStartDate=Detailspage.ValidateActualStartDate();
		Assert.assertEquals(ActualStartDate,"01/02/2019","Actual Start Date not matched");
		}
	
@Test(priority=28,description="Details Page: Actual End Date Value Test")
	public void ActualEndDate()
	{
        String ActualEndDate=Detailspage.ValidateActualEndDate();
		Assert.assertEquals(ActualEndDate,"","Actual End Date not matched");
		}
	
	@Test(priority=29,description="Details Page: Total Contract Amount Value Test")
	public void TotalContractAmount()
	{
        String TotalContractAmount=Detailspage.ValidateTotalContractAmount();
		Assert.assertEquals(TotalContractAmount,"500,000.00","Total Contract Amount not matched");
		}
	
	@Test(priority=30,description="Details Page: Total Contract Hours Value Test")
	public void TotalContractHours()
	{
		String TotalContractHours=Detailspage.ValidateTotalContractHours();
		Assert.assertEquals(TotalContractHours,"50","Total Contract Hours not matched");
		}
	
	@Test(priority=31,description="Details Page: Go To Project Setup Wizard link Name Test")
	public void SetupLink()
	{
		String SetupLink=Detailspage.ValidateSetupLink();
		Assert.assertEquals(SetupLink,"GO TO PROJECT SETUP WIZARD","Link not matched");
}
	@Test(priority=32,description="Cancel button Name Test")
	public void Cancelbutton()
	{
			String Cancel=Detailspage.ValidateCancelbutton();
			Assert.assertEquals(Cancel,"CANCEL","Button Text not matched");
		}		
	@Test(priority=33,description="Details Page: Save button Name Test")
	public void Savebutton()
	{
			String Save=Detailspage.ValidateSavebutton();
			Assert.assertEquals(Save,"SAVE","Button Text not matched");
		}
	
	
	//Configuration Page
	@Test(priority=34,description="Details Page: Configuration Tab Name Test")
	public void ConfigurationTab()
	{
		String ConfigurationTab=Detailspage.ValidateConfigurationTab();
		Assert.assertEquals(ConfigurationTab,"CONFIGURATION","Configuration Tab name is not matched");
	}
	
	@Test(priority=35,description="Configuration Page: Project Report Interval Value Test")
	public void ProjectReportInterval()
	{
		
		String ProjectReportInterval=Detailspage.ValidateProjectReportInterval();
		Assert.assertEquals(ProjectReportInterval,"Weekly","Value not matched");
	
	}
	
	@Test(priority=36,description="Configuration Page: Project Report Date Value Test")
	public void ProjectReportDate()
	{
		
		String ProjectReportDate=Detailspage.ValidateProjectReportDate();
		Assert.assertEquals(ProjectReportDate,"Monday","Value not matched");
	}
	
	@Test(priority=37,description="Configuration Page: Fiscal Year End Month Value Test")
	public void FiscalYearEndMonth()
	{
		
		String FiscalYearEndMonth=Detailspage.ValidateFiscalYearEndMonth();
		Assert.assertEquals(FiscalYearEndMonth,"December","Value not matched");
	}
	@Test(priority=38,description="Configuration Page: Fiscal Year End Day Value Test")
	public void FiscalYearEndDay()
	{
		
		String FiscalYearEndDay=Detailspage.ValidateFiscalYearEndDay();
		Assert.assertEquals(FiscalYearEndDay,"31","Value not matched");
	}
	
	@Test(priority=39,description="Configuration Page: Man Hours Reporting Interval Value Test")
	public void ManHoursReportingInterval()
	{
		
		String ManHoursReportingInterval=Detailspage.ValidateManHoursReportingInterval();
		Assert.assertEquals(ManHoursReportingInterval,"Weekly","Value not matched");
	}
	
	@Test(priority=40,description="Configuration Page: Man Hours Reporting Day Value Test")
	public void ManHoursReportingDay()
	{
		
		String ManHoursReportingDay=Detailspage.ValidateManHoursReportingDay();
		Assert.assertEquals(ManHoursReportingDay,"Friday","Value not matched");
	}
	@Test(priority=41,description="Configuration Page: Man Hours Reporting Pre Due Window Value Test")
	public void ManHoursReportingPreDueWindow()
	{
		
		String ValidateManHoursReportingPreDueWindow=Detailspage.ValidateManHoursReportingPreDueWindow();
		Assert.assertEquals(ValidateManHoursReportingPreDueWindow,"6","Value not matched");
	
	}
	
	@Test(priority=42,description="Configuration Page: Man Hours Reporting Post Due Window Value Test")
	public void ManHoursReportingPostDueWindow()
	{
		
		String ManHoursReportingPostDueWindow=Detailspage.ValidateManHoursReportingPostDueWindow();
		Assert.assertEquals(ManHoursReportingPostDueWindow,"14","Value not matched");
	
	}
	
	@Test(priority=43,description="Configuration Page: Project Scalar Value Test")
	public void ProjectScalar()
	{
		String ProjectScalar=Detailspage.ValidateProjectScalar();
		Assert.assertEquals(ProjectScalar,"45","Value not matched");
	
	}
	
	@Test(priority=44,description="Configuration Page: Supported Entity Types Value Test")
	public void SupportedEntityTypes() 
	{
		
			Detailspage.ValidateSupportedEntityTypes();	
			}
	
   @Test(priority=45,description="Configuration Page: Test Project Lookup Value Test")
	public void TestProjectLookup() throws InterruptedException
	{
		String ProjectLookup=Detailspage.ValidateTestProjectLookup();
		Assert.assertEquals(ProjectLookup,"Vertical Construction","Value not matched");
	}
	
	
	
	@Test(priority=46,description="Configuration Page: Payroll Lockout Image Test")
public void ConfigurationPayrollLockoutImageVerification() throws IOException, AWTException, InterruptedException {
		
Detailspage.ValidatePayrollLockoutImageVerification();
		}

@Test(priority=47,description="Configuration Page: Payroll Lockout Toggle Test")
	public void PayrollLockoutToggle() {
		
		Detailspage.ValidateDefaultLockoutsettings();
		
		}
@Test(priority=48,description="Configuration Page: Configure Data Set Button Name Test")
public void ConfigureDateSet()
{
	
	String C=Detailspage.ValidateConfigureDateSet();
	Assert.assertEquals(C,"CONFIGURE DATE SET","Configure Data Set Button Name not matched");
}

@Test(priority=49,description="Configuration Page: Add Single Date Button Name Test")
public void AddSingleDateButton()
{
	
	String A=Detailspage.ValidateAddSingleDate();
	Assert.assertEquals(A,"ADD SINGLE DATE","Add Single Date Button Name not matched");
}

@Test(priority=50,description="Configuration Page: Select Window Value Test")
public void DefaultSelectwindow()
{
	String SW=Detailspage.ValidateSelectwindow();
	Assert.assertEquals(SW,"1","Select Window Value not matched");
}

@Test(priority=51,description="Configuration Page: Payroll Lockout Option Dialog Name Test")
public void DailogHeaderName()
{
	String D=Detailspage.ValidateDialogName();
	Assert.assertEquals(D,"Select Payroll Lockout Option","Payroll Lockout Option Dialog Name not matched");
}

@Test(priority=52,description="Configuration Page: Payroll Lockout Instruction Text Test")
public void InstructionText()
{
	String IT=Detailspage.ValidateDialogInstruction();
	Assert.assertEquals(IT,"Select configuration options, then click apply to generate date options","Payroll Lockout Instruction Text not matched");
}

@Test(priority=53,description="Configuration Page: Select Window Value Test")
public void DefaultPayrollOptionCheckbox()
{
	Detailspage.ValidateDefaultcheckboxselection();
}

@Test(priority=54,description="Configuration Page: Payroll Lockout Checkbox Text Test")
public void PayrollCheckboxText()
{
	String CT=Detailspage.ValidateCheckboxText();
	Assert.assertEquals(CT,"Keep currently selected dates","Payroll Lockout Checkbox Text not matched");
}

@Test(priority=55,description="Configuration Page: Select One Test")
public void DefaultSelectOne()
{
	String SO=Detailspage.ValidateSelectOne();
	Assert.assertEquals(SO,"Day Of Month","Payroll Lockout Toggle Value not matched");
}

@Test(priority=56,description="Configuration Page: Day Of Month value Test")
public void DayofMonth()
{
	String DM=Detailspage.ValidateDayofMonth();
	Assert.assertEquals(DM,"1","Day Of Month Value not matched");
}

@Test(priority=57,description="Configuration Page: Apply Button Name Test")
public void Applybutton()
{
	String AB=Detailspage.ValidateApplybutton();
	Assert.assertEquals(AB,"APPLY","Apply Button Name not matched");
}

@Test(priority=58,description="Configuration Page: Cancel Button Name Test")
public void PayrollCancelbutton()
{
	String CB=Detailspage.ValidatePayrollCancelbutton();
	Assert.assertEquals(CB,"CANCEL","Cancel Button Name not matched");
}



@Test(priority=59,description="Configuration Page: Add Button Name Test")
public void SingleDateAddbutton()
{
	String A=Detailspage.ValidateAddbutton();
	Assert.assertEquals(A,"ADD","Add Button Name not matched");
}

@Test(priority=60,description="Configuration Page: Single Date Cancel Button Name Test")
public void SingleDateCancelbutton()
{
	String C=Detailspage.ValidateSingleDateCancelbutton();
	Assert.assertEquals(C,"CANCEL","Single Date Cancel Button Name not matched");
}
		
	 
@DataProvider(name="getDetailsPageData")
	public Object[][] getTestDataBaseline2(Method m)
	{
	System.out.println("Expected Value");
		Object data[][]=TestUtil.getTestDataBaseline(SheetName1,m.getName());
	
		return data;        	
	}
	@Test(priority=61,dataProvider="getDetailsPageData",description="Details Page: Dropdown Value Test")
	public void DetailsPageDropdownVerification(String PST,String ET,String G,String EA1,String C1,String C2,String ADT,
			String PRI,String PRD, String PD1,String DA,String SM,String QD,String AM,String APD,String FEM,String MRI,String MRD, String ENTI,String TPL,String PSO) {
		
		Detailspage.DetailsPageDDNVerification(PST,ET, G,EA1,C1,C2,ADT,PRI,PRD,PD1,DA,SM,QD,AM,APD,FEM,MRI,MRD,ENTI,TPL,PSO);
		}
@Test(priority=62,description="Details Page: Certification view Image Verification")
	public void CertificationImageVerification() throws IOException {
		
		Detailspage.DetailsCertifcationImageVerification();
		}
	
	@Test(priority=63,description="Details Page: Labor Standard view Image Verification")
	public void LaborStandardImageVerification() throws IOException {
		
		Detailspage.DetailsLaborStandardImageVerification();
		}
	
	@Test(priority=64,description="Details Page: Track Commitments view Image Verification")
	public void TrackCommitmentsImageVerification() throws IOException {
		
		Detailspage.DetailsTrackCommitmentsImageVerification();
		}
	
	@Test(priority=65,description="Configuration Page: Subcontractors Page Selection Test")
	public void SubcontractorPageLaunch() {
		
		Subcontractorpage=Detailspage.ValidateSubcontractorPageLaunch();
		}
	*/
@AfterMethod
	public void tearDown()
	{
		Driver.quit();
}
}
