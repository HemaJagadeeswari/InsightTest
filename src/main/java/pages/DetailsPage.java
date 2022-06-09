package pages;

import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.event.InputEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.Point;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.coordinates.WebDriverCoordsProvider;
import ru.yandex.qatools.ashot.shooting.RotatingDecorator;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import ru.yandex.qatools.ashot.shooting.ShootingStrategy;
import ru.yandex.qatools.ashot.shooting.ViewportPastingDecorator;
import ru.yandex.qatools.ashot.shooting.cutter.CutStrategy;
import util.TestUtil;

public class DetailsPage extends TestBase{
	private static final String VIEWPORT_MIN_IOS_8_SIM = null;

	private static final String HEADER_IOS_8_MIN = null;

	@FindBy(id="name")
	WebElement ProjectName;
	
	@FindBy(id="number")
	WebElement Number;
	
	@FindBy(id="mui-component-select-ownerEthnicityId")
	WebElement Ethnicity;
	
	@FindBy(id="mui-component-select-ownerGenderId")
	WebElement Gender;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[1]")
	WebElement SiteAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement SiteAddress;
	
	@FindBy(xpath="//*[contains(text(),'Address History')]//following::button[3]")
	WebElement CorporateAddressEdit;
	
	@FindBy(xpath="//*[contains(text(),'Existing Addresses')]//following::div[1]")
	WebElement ExistingCorAddress;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']//following::li[5]//p")
	WebElement CorporateAddress;
	
	@FindBy(id="street1")
	WebElement Street1;
	
	@FindBy(id="street2")
	WebElement Street2;
	
	@FindBy(id="city")
	WebElement City;
	
	@FindBy(id="mui-component-select-country")
	WebElement Country;
	
	@FindBy(id="mui-component-select-state")
	WebElement State;
	
	@FindBy(id="zip")
	WebElement Zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
	WebElement EffectiveDate;
	
	@FindBy(xpath="//input[@id='type']//preceding::div[1]")
	WebElement AddressType;
	
	
	@FindBy(xpath="//div[@id='mui-component-select-type']//following::button[1]//span[1]")
	WebElement Updatebutton;
	
	@FindBy(xpath="//div[@id='mui-component-select-type']//following::button[2]//span[1]")
	WebElement AddressCancelbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancel;
	
	@FindBy(xpath="//*[contains(text(),'Effective')]//following::button[2]")
	WebElement Add;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNew;
	
	@FindBy(xpath="//div[@id='mui-component-select-addr']")
	WebElement ExistingAddresses;
	
	
	@FindBy(xpath="//*[contains(text(),'Scheduled Start')]//following::input[1]")
	WebElement ScheduledStart;
	
	@FindBy(xpath="//*[contains(text(),'Scheduled End')]//following::input[1]")
	WebElement ScheduledEnd;
	
	@FindBy(xpath="//*[contains(text(),'Actual Start')]//following::input[1]")
	WebElement ActualStart;
	
	@FindBy(xpath="//*[contains(text(),'Actual End')]//following::input[1]")
	WebElement ActualEnd;
	
	@FindBy(id="contractAmount")
	WebElement ContractAmount;
	
	@FindBy(id="contractHours")
	WebElement ContractHours;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]")
	WebElement Link;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[1]")
	WebElement Cancelbutton;
	
	@FindBy(xpath="//*[contains(text(),'Go to project setup wizard')]//following::button[2]")
	WebElement Savebutton;
	
	@FindBy(xpath="//*[contains(text(),'Configuration')]")
	WebElement ConfigTab;

	@FindBy(xpath="//input[@id='config.projectReportingInterval']//preceding::p[1]")
	WebElement ProjectReportInterval;
	
	@FindBy(xpath="//input[@name='config.projectReportingDay']//preceding::p[1]")
	WebElement ProjectReportDay;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.fiscalYrEndMonth']//child::p")
	WebElement FiscalYearEndMonth;
	
	@FindBy(id="config.fiscalYrEndDay")
	WebElement FiscalYearEndDay;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.manhourReportingInterval']//child::p")
	WebElement ManhourReportingInterval;
	
	@FindBy(xpath="//div[@id='mui-component-select-config.manhourReportingDay']//child::p")
	WebElement ManhourReportingDay;
	
	@FindBy(id="config.manhourReportingPreDueWindow")
	WebElement ManhourReportingPreDueWindow;
	
	
	@FindBy(id="config.manhourReportingPostDueWindow")
	WebElement ManhourReportingPostDueWindow; 
	
	@FindBy(id="mui-component-select-10010")
	WebElement TestProjectLookup;
	
	@FindBy(xpath="//input[@placeholder='Test Scalar 2']")
	WebElement Scalar; 
	
	@FindBy(xpath="//*[contains(text(),'Supported Entity Types')]//following::div[1]")
	WebElement EntityType;
	
	@FindBy(xpath="//*[contains(text(),'Certification')]")
	WebElement Certification;
	
	@FindBy(xpath="//*[contains(text(),'Labor Standard')]")
	WebElement LaborStandard;
	
	@FindBy(xpath="//*[contains(text(),'Track Commitments')]")
	WebElement TrackCommitments;
	
	@FindBy(xpath="(//*[contains(text(),'Subcontractors')])[1]")
	WebElement SubcontractorPageLaunch;
	
	@FindBy(id="mui-component-select-status")
	WebElement ProjectStatus;
	
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement ProjectCloseDate;
	
	@FindBy(xpath="//*[contains(text(),'Turn payroll')]//preceding::input[1]")
	WebElement PayrollLockoutToggle;
	
	@FindBy(xpath="//*[contains(text(),'Configure Date')]")
	WebElement ConfigureDatebutton;
	
	@FindBy(xpath="//*[contains(text(),'Add Single')]")
	WebElement AddSinglebutton;
	
	@FindBy(id="config.lockoutMonthOffset")
	WebElement SelectWindow;
	
	@FindBy(xpath="//*[contains(text(),'Lockout Option')]")
	WebElement DialogHeader;
	
	@FindBy(xpath="//*[contains(text(),'Select configuration')]")
	WebElement InstructionText;
	
	
	@FindBy(id="mui-component-select-payrollLockoutModel")
	WebElement SelectOne;
	
	
	@FindBy(id="lockoutdayOfMonth")
	WebElement DayofMonth;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[2]")
	WebElement PayrollCancelbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[2]//following::span[2]")
	WebElement Applybutton;
	
	@FindBy(xpath="//*[contains(text(),'Keep')]")
	WebElement CheckboxText;
	
	@FindBy(xpath="//*[contains(text(),'Keep')]//preceding::input[1]")
	WebElement CurrentDatesCheckbox;
	
	@FindBy(xpath="(//*[contains(text(),'Add')])[3]")
	WebElement Addbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement SingleDateCancel;
	
	public DetailsPage()
	{
		PageFactory.initElements(Driver,this);
		
	}
	
	public String ValidateProjectNameField()
	{
		return ProjectName.getAttribute("value");
	}
	
	public String ValidateNumberField()
	{
		return Number.getAttribute("value");
	}
	
	public String ValidateProjectStatus()
	{
		return ProjectStatus.getText();
	}
	
	public String ValidateProjectCloseDate()
	{
		return ProjectCloseDate.getText();
	}
	
	public String ValidateEthnicityField()
	{
		return Ethnicity.getText();
	}
	
	
	public String ValidateGenderField()
	{
		return Gender.getText();
	}
	
	
	public String ValidateSiteAddressStreet1()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateSiteAddressStreet2()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Street2.getAttribute("value");
	}
	
	public String ValidateSiteAddresscity()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateSiteAddressCountry()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		Country.click();
		//SiteAddressEdit.click();
		/* List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}*/
			return Country.getText();
	}
	
	public String ValidateSiteAddressState()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		State.click();
		/*List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			for(int l=0;l<=state.size()-1;l++)
			{
				System.out.println(state.get(l).getText());
	}*/
		
		return State.getText();
	}
	
	public String ValidateSiteAddressZip()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateSiteAddressEffectiveDate()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateSiteAddressType()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", SiteAddressEdit);
		//SiteAddressEdit.click();
		AddressType.click();
		
		/*List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			for(int l=0;l<=type.size()-1;l++)
			{
				System.out.println(type.get(l).getText());
	}*/
		return AddressType.getText();
	}
	

	
	public String ValidateCorporateAddressStreet1()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Street1.getAttribute("value");
	}
	
	public String ValidateCorporateAddressStreet2()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Street2.getAttribute("value");
	}
	
	public String ValidateCorporateAddresscity()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return City.getAttribute("value");
	}
	
	public String ValidateCorporateAddressCountry()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		Country.click();
		//SiteAddressEdit.click();
		 /*List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}*/
			return Country.getText();
	}
	
	public String ValidatecCorporateAddressState()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		State.click();
		/*List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			for(int l=0;l<=state.size()-1;l++)
			{
				System.out.println(state.get(l).getText());
	}*/
		
		return State.getAttribute("value");
	}
	
	public String ValidateCorporateAddressZip()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return Zip.getAttribute("value");
	}
	
	public String ValidateCorporateAddressEffectiveDate()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		return EffectiveDate.getAttribute("value");
	}
	
	public String ValidateCorporateAddressType()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		//SiteAddressEdit.click();
		AddressType.click();
		
		/*List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			for(int l=0;l<=type.size()-1;l++)
			{
				System.out.println(type.get(l).getText());
	}*/
		return AddressType.getText();
	}
	
	public String ValidateAddNew()
	{
		return AddNew.getText();
	}
	
	public String ValidateUpdateButton()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		return Updatebutton.getText();
		
	}
	
	public String ValidateCancelButton()
	{
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", CorporateAddressEdit);
		return AddressCancelbutton.getText();
		
	}
	
	public void ValidateNewAddress(String ST1,String ST2,String C,String Co,String STA,String Z,String ED,String AT,String ED1) throws InterruptedException
	{
		AddNew.click();
		Street1.click();
		Street1.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Street1.sendKeys(ST1);
		Street2.click();
		Street2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Street2.sendKeys(ST2);
		City.click();
		City.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	    City.sendKeys(C);
		
		Country.click();
		List<WebElement> country1=Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
		 System.out.println(country1.size());
		for(int m=0;m<country1.size();m++)
		{
	 if(country1.get(m).getText().equals(Co))
	 {
		 country1.get(m).click();
		 }
			}
		   Actions n = new Actions(Driver);
		    n.sendKeys(Keys.ESCAPE).build().perform();   
		State.click();
		 List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
		 System.out.println(state.size());
			
			for(int k=0;k<state.size();k++)
			{
		 if(state.get(k).getText().equals(STA))
		 {
			 state.get(k).click();
			 break;
		 }
			}
			   Actions n1 = new Actions(Driver);
			    n1.sendKeys(Keys.ESCAPE).build().perform();   
		Zip.click();
	    Zip.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Zip.sendKeys(Z);
		EffectiveDate.click();
		EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(ED);
		AddressType.click();
		List<WebElement> type=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
		 System.out.println(type.size());
			
			for(int m=0;m<type.size();m++)
			{
		 if(type.get(m).getText().equals(AT))
		 {
			 type.get(m).click();	
		}
			}
			   Actions n3 = new Actions(Driver);
			    n3.sendKeys(Keys.ESCAPE).build().perform();   
		 AddressCancelbutton.click();
		 AddNew.click();
			Street1.click();
			Street1.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Street1.sendKeys(ST1);
			Street2.click();
			Street2.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Street2.sendKeys(ST2);
			City.click();
			City.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		    City.sendKeys(C);
			
			Country.click();
			List<WebElement> country2=Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[6]//li"));
			 System.out.println(country2.size());
			for(int m1=0;m1<country2.size();m1++)
			{
		 if(country2.get(m1).getText().equals(Co))
		 {
			 country2.get(m1).click();
			 }
				}
			   Actions n4 = new Actions(Driver);
			    n4.sendKeys(Keys.ESCAPE).build().perform();   
			State.click();
			 List<WebElement> state1=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
			 System.out.println(state1.size());
				
				for(int k1=0;k1<state1.size();k1++)
				{
			 if(state1.get(k1).getText().equals(STA))
			 {
				 state1.get(k1).click();
				 break;
			 }
				}
			Zip.click();
		    Zip.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Zip.sendKeys(Z);
			EffectiveDate.click();
			EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EffectiveDate.sendKeys(ED);
			AddressType.click();
			List<WebElement> type1=Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
			 System.out.println(type1.size());
					for(int m2=0;m2<type1.size();m2++)
				{
			 if(type1.get(m2).getText().equals(AT))
			 {
				 type1.get(m2).click();	
			}
				}
					   Actions n5 = new Actions(Driver);
					    n5.sendKeys(Keys.ESCAPE).build().perform();   
		Add.click();
		Thread.sleep(1000);
		Driver.findElement(By.xpath("//*[contains(text(),'"+ST1+"')]//following::button[1]")).click();
		EffectiveDate.click();
		EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(ED1);
		if(Updatebutton.isEnabled())
		{
		Updatebutton.click();
		System.out.println("Field is edited");
		}
		else
		{
			System.out.println("Unable to edit");
			
		}
		Driver.findElement(By.xpath("//*[contains(text(),'"+ST1+"')]//following::button[2]")).click();
		Driver.findElement(By.xpath("//*[contains(text(),'delete')]//following::button[1]")).click();
		Driver.findElement(By.xpath("//*[contains(text(),'"+ST1+"')]//following::button[2]")).click();
		Driver.findElement(By.xpath("//*[contains(text(),'delete')]//following::button[2]")).click();
		if(Driver.findElement(By.xpath("//*[contains(text(),'"+ST1+"')]")).isDisplayed())
				{
			System.out.println("Newly created Address is not deleted");
				}
		else
		{
			System.out.println("Newly created Address was deleted");
		}
		}
			
		
	
	
	
	public String ValidateScheduledStartDate()
	{
		return ScheduledStart.getAttribute("value");
	}
	
	public String ValidateScheduledEndDate()
	{
		return ScheduledEnd.getAttribute("value");
	}
	
	public String ValidateActualStartDate()
	{
		ActualStart.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ActualStart.sendKeys("01/02/2019");
		//ProjectCloseDate.sendKeys("12/31/2025");
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Savebutton);
		return ActualStart.getAttribute("value");	
	}
	
	public String ValidateActualEndDate()
	{
		return ActualEnd.getAttribute("value");
	}
	
	
	public String ValidateTotalContractAmount()
	{
		return ContractAmount.getAttribute("value");
	}
	
	public String ValidateTotalContractHours()
	{
		return ContractHours.getAttribute("value");
	}
	
	public String ValidateSetupLink()
	{
		return Link.getText();
	}
	
	public String ValidateCancelbutton()
	{
		ActualStart.click();
		ActualStart.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor1 = (JavascriptExecutor)Driver;
		executor1.executeScript("arguments[0].click();", Cancelbutton);	
		WebElement D=Driver.findElement(By.xpath("//*[contains(text(),'Go to project setup wizard')]//following::button[1]//child::span"));
		return D.getText();
		
	}
	
	public String ValidateSavebutton()
	{
		ActualStart.click();
		ActualStart.sendKeys("01/02/2019");
		JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Savebutton);	
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Go to project setup wizard')]//following::button[2]//child::span"));
		return S.getText();
	}
	
	
	//Configuration Page
	public String ValidateConfigurationTab()
	{
		ConfigTab.click();
		return ConfigTab.getText();
	
	
	}
	public String ValidateProjectReportInterval()
	{
		ConfigTab.click();
		return ProjectReportInterval.getText();
	
	}
	
	public String ValidateProjectReportDate()
	{
		ConfigTab.click();
		return ProjectReportDay.getText();
	
	}
	
	public String ValidateFiscalYearEndMonth()
	{
		ConfigTab.click();
		return FiscalYearEndMonth.getText();
	
	}
	
	public String ValidateFiscalYearEndDay()
	{
		ConfigTab.click();
		return FiscalYearEndDay.getAttribute("value");
	
	}
	public String ValidateManHoursReportingInterval()
	{
		
		ConfigTab.click();
		return ManhourReportingInterval.getText();
	
	}
	public String ValidateManHoursReportingDay()
	{
		ConfigTab.click();
		return ManhourReportingDay.getText();
	
	}
	public String ValidateManHoursReportingPreDueWindow()
	{
		ConfigTab.click();
		return ManhourReportingPreDueWindow.getAttribute("value");
	
	}
	public String ValidateManHoursReportingPostDueWindow()
	{
		ConfigTab.click();
		return ManhourReportingPostDueWindow.getAttribute("value");
	
	}
	
	public String ValidateTestProjectLookup() throws InterruptedException
	{
		ConfigTab.click();
		Thread.sleep(4000);
		return TestProjectLookup.getText();
	}
	
	public String ValidateProjectScalar()
	{
		ConfigTab.click();
		return Scalar.getAttribute("value");
	
	}
	
public void ValidateSupportedEntityTypes() {
	ConfigTab.click();
	EntityType.click();
		
}

public String ValidatePayrollLockoutToggle()
{
	ConfigTab.click();
	return PayrollLockoutToggle.getAttribute("value");

}


public void DetailsPageDDNVerification(String PST,String ET,String G,String EA1,String C1,String C2,String ADT,
		String PRI,String PRD,String PD1,String DA,String SM,String QD,String AM,String APD,String FEM,String MRI,String MRD, String ENTI,String TPL,String PSO) 
{
	//,
	try {
		//ProjectStatus
		 ProjectStatus.click();
		 List<WebElement> PS= Driver.findElements(By.xpath("//div[@id='mui-component-select-status']//following::ul[3]//li"));
			System.out.println(PS.size());
			String[] ar = PST.split("!"); 
			 boolean stFlag; 
			 int Count=0;
		    for(int i=0;i<PS.size();i++)
			{
		    	stFlag = false;
		    	for (String P : ar) 
				   {
		    	
		  if(PS.get(i).getText().equals(P))
		  {
			  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				  System.out.println("Gender value:"+PS.get(i).getText());
				  stFlag=true;
				  Count=Count+1;
				  if(Count==3) 
					{
						 System.out.println("Project Status value: Matches");
					}
				 break;
			  }
			 
			   }
			
			if(!stFlag) 
			{
				System.out.println("Project Status value:"+ PS.get(i).getText());
				System.out.println("Project Status value:Not Matches");
			}
			}
		 	
		    Actions n = new Actions(Driver);
		    n.sendKeys(Keys.ESCAPE).build().perform();   
		    
		    //Ethnicity
	Ethnicity.click();  

	WebDriverWait wait = new WebDriverWait(Driver, 30);
	wait.until(ExpectedConditions.visibilityOfAllElementsLocatedBy(By.xpath("//*[contains(text(),'White - ')]")));
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> E= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerEthnicityId']//following::ul[3]//li"));
	
	System.out.println(E.size());
	String[] arr = ET.split("!"); 
	   boolean strFlag;
	   int count=0;
	   for(int i=0;i<E.size();i++)
		{
	    	strFlag = false;
	    	for (String ETH : arr) 
			   {
	    	
	  if(E.get(i).getText().equals(ETH))
	  {
		  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			  System.out.println("Ethnicity value:"+E.get(i).getText());
			  strFlag=true;
			  count=count+1;
			  if(count==11) 
				{
					 System.out.println("Ethnicity value: Matches");
				}
			 break;
		  }
		 
		   }
		
		if(!strFlag) 
		{
			System.out.println("Ethnicity value:"+ E.get(i).getText());
			System.out.println("Ethnicity value:Not Matches");
		}
		}
   
    //Gender
    Actions action = new Actions(Driver);
    action.sendKeys(Keys.ESCAPE).build().perform();
    Gender.click();
    
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> GE= Driver.findElements(By.xpath("//div[@id='mui-component-select-ownerGenderId']//following::ul[3]//li"));
	System.out.println(GE.size());
	String[] ar1 = G.split("!"); 
	 boolean stFlag1; 
	 int count1=0;
    for(int i=0;i<GE.size();i++)
	{
    	stFlag1 = false;
    	for (String OG : ar1) 
		   {
    	
  if(GE.get(i).getText().equals(OG))
  {
	  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		  System.out.println("Gender value:"+GE.get(i).getText());
		  stFlag1=true;
		  count1=count1+1;
		  if(count1==4) 
			{
				 System.out.println("Gender value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!stFlag1) 
	{
		System.out.println("Gender value:"+ GE.get(i).getText());
		System.out.println("Gender value:Not Matches");
	}
	}
	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Actions AI=new Actions(Driver);
	AI.moveToElement(AddNew).build();
	AI.click(AddNew).perform();
	AddNew.click();
	//Address
	ExistingAddresses.click();
List<WebElement> EA= Driver.findElements(By.xpath("//div[@id='mui-component-select-addr']//following::ul[2]//li"));
System.out.println(EA.size());
String[] a = EA1.split("!"); 
 boolean s; 
 int c=0;
for(int i=0;i<EA.size();i++)
{
	s = false;
	for (String e : a) 
	   {

if(EA.get(i).getText().equals(e))
{
  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	  System.out.println("Existing Address value:"+EA.get(i).getText());
	  s=true;
	  c=c+1;
	  if(c==2) 
		{
			 System.out.println("Existing Address value: Matches");
		}
	 break;
  }
 
   }

if(!s) 
{
	System.out.println("Existing Address value:"+ EA.get(i).getText());
	System.out.println("Existing Address value:Not Matches");
}
}
Actions action1 = new Actions(Driver);
action1.sendKeys(Keys.ESCAPE).build().perform();
Country.click();
List<WebElement> CO= Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
System.out.println(CO.size());
String[] a1 = C1.split("!"); 
boolean s1; 
int c1=0;
for(int i=0;i<CO.size();i++)
{
s1 = false;
for (String e1 : a1) 
   {

if(CO.get(i).getText().equals(e1))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Country value:"+CO.get(i).getText());
  s1=true;
  c1=c1+1;
  if(c1==3) 
	{
		 System.out.println("Country value: Matches");
	}
 break;
}

}

if(!s1) 
{
System.out.println("Country value:"+ CO.get(i).getText());
System.out.println("Country value:Not Matches");
}
}
Actions action2 = new Actions(Driver);
action2.sendKeys(Keys.ESCAPE).build().perform();
State.click();
List<WebElement> ST= Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
System.out.println(ST.size());
String[] a2 = C2.split("!"); 
boolean s2; 
int c2=0;
for(int i=0;i<ST.size();i++)
{
s2 = false;
for (String e2 : a2) 
   {

if(ST.get(i).getText().equals(e2))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("State value:"+ST.get(i).getText());
  s2=true;
  c2=c2+1;
  if(c2==56) 
	{
		 System.out.println("State value: Matches");
	}
 break;
}

}

if(!s2) 
{
System.out.println("State value:"+ ST.get(i).getText());
System.out.println("State value:Not Matches");
}
}

Actions action3 = new Actions(Driver);
action3.sendKeys(Keys.ESCAPE).build().perform();
AddressType.click();
List<WebElement> AT= Driver.findElements(By.xpath("//div[@id='mui-component-select-type']//following::ul[2]//li"));
System.out.println(AT.size());
String[] a3 = ADT.split("!"); 
boolean s3; 
int c3=0;
for(int i=0;i<AT.size();i++)
{
s3 = false;
for (String e3 : a3) 
   {

if(AT.get(i).getText().equals(e3))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Address Type value:"+AT.get(i).getText());
  s3=true;
  c3=c3+1;
  if(c3==4) 
	{
		 System.out.println("Address Type value: Matches");
	}
 break;
}

}

if(!s3) 
{
System.out.println("Address Type value:"+ AT.get(i).getText());
System.out.println("Address Type value:Not Matches");
}
}
Actions CA=new Actions(Driver);
CA.moveToElement(AddressCancel).build();
CA.click(AddressCancel).perform();
AddressCancel.click();

    Actions A=new Actions(Driver);
	A.moveToElement(ConfigTab).build();
	A.click(ConfigTab).perform();
	ConfigTab.click();
ProjectReportInterval.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> PI= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingInterval']//following::ul[2]//li"));
System.out.println(PI.size());
String[] arr2 = PRI.split("!"); 
boolean strFlag2;  
int count2=0;
for(int i=0;i<PI.size();i++)
{
	strFlag2=false;
	for (String P : arr2) 
	   {
	
if(PI.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Interval value:"+PI.get(i).getText());
	  strFlag2=true;
	  count2=count2+1;
	  if(count2==6) 
		{
			 System.out.println("Project Reporting Interval value: Matches");
		}
	 break;
}

 }

if(!strFlag2) {
	System.out.println("Project Reporting Interval value:"+ PI.get(i).getText());
	System.out.println("Project Reporting Interval value:Not Matches");
}
}
Actions action4 = new Actions(Driver);
action4.sendKeys(Keys.ESCAPE).build().perform();
System.out.println("Project Reporting Interval: Weekly");
WebDriverWait wait1 = new WebDriverWait(Driver, 20);
WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDay']"));
wait1.until(ExpectedConditions.elementToBeClickable(ele));
ele.click();
//ProjectReportDate.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> PD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDay']//following::ul[2]//li"));
System.out.println(PD.size());
String[] arr3 = PRD.split("!"); 
boolean strFlag3;  
int count3=0;
for(int i=0;i<PD.size();i++)
{
	strFlag3=false;
	for (String P : arr3) 
	   {

if(PD.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Day value:"+PD.get(i).getText());
	  strFlag3=true;
	  count3=count3+1;
	  if(count3==7) 
		{
			 System.out.println("Above Project Reporting Day value: Matches");
		}
	 break;
}
	   }
	if(!strFlag3) {
		System.out.println("Project Reporting Date value:"+ PI.get(i).getText());
		System.out.println("Above Project Reporting Day value:Not Matches");
	}
	}
Actions action6 = new Actions(Driver);
action6.sendKeys(Keys.ESCAPE).build().perform();
System.out.println("Project Reporting Interval: BiWeekly");
ProjectReportInterval.click();
Driver.findElement(By.xpath("//*[contains(text(),'BiWeekly')]")).click();
WebDriverWait wait2 = new WebDriverWait(Driver, 20);
WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDay']"));
wait2.until(ExpectedConditions.elementToBeClickable(ele1));
ele1.click();

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> BPD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDay']//following::ul[2]//li"));
System.out.println(BPD.size());
String[] arr4 = PD1.split("!"); 
boolean strFlag4;  
int count4=0;
for(int i=0;i<BPD.size();i++)
{
	strFlag4=false;
	for (String P : arr4) 
	   {

if(BPD.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Day value:"+BPD.get(i).getText());
	  strFlag4=true;
	  count4=count4+1;
	  if(count4==7) 
		{
			 System.out.println("Above Project Reporting Day value: Matches");
		}
	 break;
}
	   }
	if(!strFlag4) {
		System.out.println("Project Reporting Date value:"+ BPD.get(i).getText());
		System.out.println("Above Project Reporting Day value:Not Matches");
	}
	}
Actions action7 = new Actions(Driver);
action7.sendKeys(Keys.ESCAPE).build().perform();
System.out.println("Project Reporting Interval: Monthly");
ProjectReportInterval.click();
Driver.findElement(By.xpath("//*[contains(text(),'Monthly')]")).click();
WebDriverWait wait3 = new WebDriverWait(Driver, 20);
WebElement ele2 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']"));
wait3.until(ExpectedConditions.elementToBeClickable(ele2));
ele2.click();

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> PDA= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']//following::ul[2]//li"));
System.out.println(PDA.size());
String[] arr5 = DA.split("!"); 
boolean strFlag5;  
int count5=0;
for(int i=0;i<PDA.size();i++)
{
	strFlag5=false;
	for (String P : arr5) 
	   {
	
if(PDA.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Date value:"+PDA.get(i).getText());
	  strFlag5=true;
	  count5=count5+1;
	  if(count5==28) 
		{
			 System.out.println("Above Project Reporting Date value: Matches");
		}
	 break;
}
	   }
	if(!strFlag5) {
		System.out.println("Project Reporting Date value:"+ PDA.get(i).getText());
		System.out.println("Above Project Reporting Date value:Not Matches");
	}
	}
Actions action8 = new Actions(Driver);
action8.sendKeys(Keys.ESCAPE).build().perform();
System.out.println("Project Reporting Interval: Quarterly");
ProjectReportInterval.click();
Driver.findElement(By.xpath("//*[contains(text(),'Quarterly')]")).click();
WebDriverWait wait5 = new WebDriverWait(Driver, 20);
WebElement ele5 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingStart']"));
wait5.until(ExpectedConditions.elementToBeClickable(ele5));
ele5.click();

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> SM1= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingStart']//following::ul[2]//li"));
System.out.println(SM1.size());
String[] arr6 = SM.split("!"); 
boolean strFlag6;  
int count6=0;
for(int i=0;i<SM1.size();i++)
{
	strFlag6=false;
	for (String P : arr6) 
	   {
	
if(SM1.get(i).getText().equals(P))
{
	System.out.println("Start of Month value:"+SM1.get(i).getText());
	  strFlag6=true;
	  count6=count6+1;
	  if(count6==12) 
		{
			 System.out.println("Above Start of Month value: Matches");
		}
	 break;
}
	   }
	if(!strFlag6) {
		System.out.println("Start of Month value:"+ SM1.get(i).getText());
		System.out.println("Above Start of Month value:Not Matches");
	}
	}
Actions action9 = new Actions(Driver);
action9.sendKeys(Keys.ESCAPE).build().perform();
WebDriverWait wait6 = new WebDriverWait(Driver, 20);
WebElement ele6 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']"));
wait6.until(ExpectedConditions.elementToBeClickable(ele6));
ele6.click();
//ProjectReportDate.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> QPD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']//following::ul[2]//li"));
System.out.println(QPD.size());
String[] arr7 = QD.split("!"); 
boolean strFlag7;  
int count7=0;
for(int i=0;i<QPD.size();i++)
{
	strFlag7=false;
	for (String P : arr7) 
	   {
	
if(QPD.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Date value:"+QPD.get(i).getText());
	  strFlag7=true;
	  count7=count7+1;
	  if(count7==28) 
		{
			 System.out.println("Above Project Reporting Date value: Matches");
		}
	 break;
}
	   }
	if(!strFlag7) {
		System.out.println("Project Reporting Date value:"+ QPD.get(i).getText());
		System.out.println("Above Project Reporting Date value:Not Matches");
	}
	}
Actions action10 = new Actions(Driver);
action10.sendKeys(Keys.ESCAPE).build().perform();
ProjectReportInterval.click();
Driver.findElement(By.xpath("//*[contains(text(),'Annually')]")).click();
WebDriverWait wait7 = new WebDriverWait(Driver, 20);
WebElement ele7 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingStart']"));
wait7.until(ExpectedConditions.elementToBeClickable(ele7));
ele7.click();
//ProjectReportDate.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> ASM= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingStart']//following::ul[2]//li"));
System.out.println(ASM.size());
String[] arr8 = AM.split("!"); 
boolean strFlag8;  
int count8=0;
for(int i=0;i<ASM.size();i++)
{
	strFlag8=false;
	for (String P : arr8) 
	   {

if(ASM.get(i).getText().equals(P))
{
	System.out.println("Start of Month value:"+ASM.get(i).getText());
	  strFlag8=true;
	  count8=count8+1;
	  if(count8==12) 
		{
			 System.out.println("Above Start of Month value: Matches");
		}
	 break;
}
	   }
	if(!strFlag8) {
		System.out.println("Start of Month value:"+ PDA.get(i).getText());
		System.out.println("Above Start of Month value:Not Matches");
	}
	}
Actions action11 = new Actions(Driver);
action11.sendKeys(Keys.ESCAPE).build().perform();
WebDriverWait wait11 = new WebDriverWait(Driver, 20);
WebElement ele8 = Driver.findElement(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']"));
wait11.until(ExpectedConditions.elementToBeClickable(ele8));
ele8.click();

Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> APD1= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.projectReportingDate']//following::ul[2]//li"));
System.out.println(APD1.size());
String[] arr9 = APD.split("!"); 
boolean strFlag9;  
int count9=0;
for(int i=0;i<APD1.size();i++)
{
	strFlag9=false;
	for (String P : arr9) 
	   {
	
if(APD1.get(i).getText().equals(P))
{
	System.out.println("Project Reporting Date value:"+APD1.get(i).getText());
	  strFlag9=true;
	  count9=count9+1;
	  if(count9==28) 
		{
			 System.out.println("Above Project Reporting Date value: Matches");
		}
	 break;
}
	   }
	if(!strFlag9) {
		System.out.println("Project Reporting Date value:"+ APD1.get(i).getText());
		System.out.println("Above Project Reporting Date value:Not Matches");
	}
	}
Actions action12 = new Actions(Driver);
action12.sendKeys(Keys.ESCAPE).build().perform();
FiscalYearEndMonth.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> FM= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.fiscalYrEndMonth']//following::ul[2]//li"));
System.out.println(FM.size());
String[] arr10 = FEM.split("!"); 
boolean strFlag10;  
int count10=0;
for(int i=0;i<FM.size();i++)
{
	strFlag10=false;
	for (String P : arr10) 
	   {

if(FM.get(i).getText().equals(P))
{
	System.out.println("Fiscal Year End Month value:"+FM.get(i).getText());
	  strFlag10=true;
	  count10=count10+1;
	  if(count10==13) 
		{
			 System.out.println("Fiscal Year End Month value: Matches");
		}
	 break;
}
 }

if(!strFlag10) {
	System.out.println("Fiscal Year End Month value:"+ PI.get(i).getText());
	System.out.println("Fiscal Year End Month value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}

Actions action13 = new Actions(Driver);
action13.sendKeys(Keys.ESCAPE).build().perform();
ManhourReportingInterval.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> MP= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.manhourReportingInterval']//following::ul[2]//li"));
System.out.println(MP.size());
String[] arr11 = MRI.split("!"); 
boolean strFlag11;  
int count11=0;
for(int i=0;i<MP.size();i++)
{
	strFlag11=false;
	for (String P : arr11) 
	   {
	
if(MP.get(i).getText().equals(P))
{
	System.out.println("Manhour Reporting Interval value:"+MP.get(i).getText());
	  strFlag11=true;
	  count11=count11+1;
	  if(count11==8) 
		{
			 System.out.println("Manhour Reporting Interval value: Matches");
		}
	 break;
}
 }

if(!strFlag11) {
	System.out.println("Manhour Reporting Interval value:"+ MP.get(i).getText());
	System.out.println("Manhour Reporting Interval value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action14 = new Actions(Driver);
action14.sendKeys(Keys.ESCAPE).build().perform();
ManhourReportingDay.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> MD= Driver.findElements(By.xpath("//div[@id='mui-component-select-config.manhourReportingDay']//following::ul[2]//li"));
System.out.println(MD.size());
String[] arr12 = MRD.split("!"); 
boolean strFlag12;  
int count12=0;
for(int i=0;i<MD.size();i++)
{
	strFlag12=false;
	for (String P : arr12) 
	   {
	
if(MD.get(i).getText().equals(P))
{
	System.out.println("Manhour Reporting Day value:"+MD.get(i).getText());
	  strFlag12=true;
	  count12=count12+1;
	  if(count12==10) 
		{
			 System.out.println("Manhour Reporting Day value: Matches");
		}
	 break;
}
 }

if(!strFlag12) {
	System.out.println("Manhour Reporting Day value:"+ MD.get(i).getText());
	System.out.println("Manhour Reporting Day value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action15 = new Actions(Driver);
action15.sendKeys(Keys.ESCAPE).build().perform();
EntityType.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> ENT= Driver.findElements(By.xpath("//*[contains(text(),'Supported Entity Types')]//following::div[1]//ul//li/p"));
System.out.println(ENT.size());
String[] arr13 = ENTI.split("!"); 
boolean strFlag13;  
int count13=0;
for(int i=0;i<ENT.size();i++)
{
	strFlag13=false;
	for (String P : arr13) 
	   {

if(ENT.get(i).getText().equals(P))
{
	System.out.println("Supported Entity Type value:"+ENT.get(i).getText());
	  strFlag13=true;
	  count13=count13+1;
	  if(count13==15) 
		{
			 System.out.println("Supported Entity Type value: Matches");
		}
	 break;
}
 }

if(!strFlag13) {
	System.out.println("Supported Entity Type value:"+ ENT.get(i).getText());
	System.out.println("Supported Entity Type value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action16 = new Actions(Driver);
action16.sendKeys(Keys.ESCAPE).build().perform();
TestProjectLookup.click();
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
List<WebElement> TP= Driver.findElements(By.xpath("//div[@id='mui-component-select-10010']//following::ul[2]//li"));
System.out.println(TP.size());
String[] arr14 = TPL.split("!"); 
boolean strFlag14;  
int count14=0;
for(int i=0;i<TP.size();i++)
{
	strFlag14=false;
	for (String P : arr14) 
	   {
	
if(TP.get(i).getText().equals(P))
{
	System.out.println("Test Project Lookup value:"+TP.get(i).getText());
	  strFlag14=true;
	  count14=count14+1;
	  if(count14==4) 
		{
			 System.out.println("Test Project Lookup value: Matches");
		}
	 break;
}
 }

if(!strFlag14) {
	System.out.println("Test Project Lookup value:"+ TP.get(i).getText());
	System.out.println("Test Project Lookup value:Not Matches");
}                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                
}
Actions action17 = new Actions(Driver);
action17.sendKeys(Keys.ESCAPE).build().perform();
ConfigureDatebutton.click();
SelectOne.click();

	 	List<WebElement> SO= Driver.findElements(By.xpath("//div[@id='mui-component-select-payrollLockoutModel']//following::ul//li"));
		
		System.out.println(SO.size());
		String[] S = PSO.split("!"); 
		   boolean Flag1;
			int co=0;
	    for(int i=0;i<SO.size();i++)
		{
	   
	    	Flag1 = false;
	    
	    	for (String L : S) 
			   {
	    	
		
			
			  if((SO).get(i).getText().equals(L))
			  {
				  System.out.println("Payroll Lockout value:"+SO.get(i).getText());
				  Flag1=true;
				  co=co+1;
				  if(co==5) 
					{
						 System.out.println("All the Payroll Lockout value: Matches");
					}
				 break; 
				 
			  }
			   
			   }
	    	if(!Flag1) {
	    		System.out.println("Payroll Lockout value:"+ SO.get(i).getText());
	    		System.out.println("Above Payroll Lockout value: Not Matches");
	    	}
			   
		
		}
	}
	catch(Exception E)
	{
		System.out.println(E+"");
	}
} 



public  void ValidatePayrollLockoutImageVerification() throws AWTException, InterruptedException, IOException
{
	
	ConfigTab.click();
    
BufferedImage ExpectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ConfigurationPayroll1.png."));
	WebElement A=Driver.findElement(By.xpath("//*[contains(text(),'Payroll Reporting')]"));
	((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", A);
	
Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
	
	Robot robot = new Robot();
     Rectangle captureRect = new Rectangle( 800, 700);
	Thread.sleep(2000);
	BufferedImage screenFullImage = robot.createScreenCapture(captureRect);
	File outputfile = new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ConfigurationPayroll1.png.");
	ImageIO.write(screenFullImage, "png", outputfile);
	BufferedImage ActualImage= ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ConfigurationPayroll1.png."));
	
	ImageDiffer imgdifferD = new ImageDiffer();

	 ImageDiff imgdiffD = imgdifferD.makeDiff(ExpectedImage, ActualImage);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Details Page:ConfigurationPayroll1 Images are not same");
	}
	else
	{
		System.out.println("Details Page:ConfigurationPayroll1 Images are same");
	}
	WebElement B=Driver.findElement(By.xpath("//*[contains(text(),'Single Date')]"));
    // Javascript executor
    ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", B);
	
BufferedImage expectedImageC2 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ConfigurationPayroll2.png."));

	
	Screenshot ImageScreenshotC2= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotC2.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ConfigurationPayroll2.png"));
	Robot robot1 = new Robot();
    Rectangle captureRect1 = new Rectangle( 800, 700);
	Thread.sleep(2000);
	BufferedImage screenFullImage1 = robot1.createScreenCapture(captureRect1);
	File outputfile1 = new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ConfigurationPayroll2.png.");
	ImageIO.write(screenFullImage1, "png", outputfile1);
	BufferedImage ActualImage1= ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ConfigurationPayroll2.png."));
	



	ImageDiffer imgdifferD1 = new ImageDiffer();

 ImageDiff imgdiffD1 = imgdifferD1.makeDiff(expectedImageC2, ActualImage1);
if(imgdiffD1.hasDiff()==true)
{
	System.out.println("Details Page:ConfigurationPayroll2 Images are not same");
}
else
{
	System.out.println("Details Page:ConfigurationPayroll2 Images are same");
}
}



public void ValidateDefaultLockoutsettings()
{
	ConfigTab.click();
	if(PayrollLockoutToggle.isEnabled())
	{
		System.out.println("Default selection was changed");
	}
	else
	{
		System.out.println("Default selection is seen: Passed");
	}
}

public String ValidateConfigureDateSet()
{
	ConfigTab.click();
	return ConfigureDatebutton.getText();
}

public String ValidateAddSingleDate()
{
	ConfigTab.click();
	return AddSinglebutton.getText();
}

public String ValidateSelectwindow()
{
	ConfigTab.click();
	return SelectWindow.getAttribute("value");
}

public String ValidateDialogName()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return DialogHeader.getText();
} 

public String ValidateDialogInstruction()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return InstructionText.getText();
}



public void ValidateDefaultcheckboxselection()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	if(CurrentDatesCheckbox.isSelected())
	{
		System.out.println("Default selection is changed");
	}
	
	{
		System.out.println("Default selection is seen: Passed");
	}
}

public String ValidateCheckboxText()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return CheckboxText.getText();
}

public String ValidateSelectOne()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return SelectOne.getText();
}

public String ValidateDayofMonth()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return DayofMonth.getAttribute("value");
}

public String ValidateApplybutton()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return Applybutton.getText();
}

public String ValidatePayrollCancelbutton()
{
	ConfigTab.click();
	ConfigureDatebutton.click();
	return PayrollCancelbutton.getText();
}




public String ValidateAddbutton()
{
	ConfigTab.click();
	AddSinglebutton.click();
	return Addbutton.getText();
	
}

public String ValidateSingleDateCancelbutton()
{
	ConfigTab.click();
	AddSinglebutton.click();
	return SingleDateCancel.getText();
	
}

public void DetailsCertifcationImageVerification() throws IOException {
	Certification.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Your Certifications')]")));
	
BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\Certification.png."));

	
	Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotC.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\Certification.png"));
	BufferedImage actualImageC = ImageScreenshotC.getImage();


	ImageDiffer imgdifferD = new ImageDiffer();

   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
if(imgdiffD.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
	
BufferedImage expectedImageP = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\SubCertification.png."));
	WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'American Automatic Sprinkler Company, Inc')]"));
	
      // Javascript executor
      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
      Driver.findElement(By.xpath("//*[contains(text(),'American Automatic Sprinkler Company, Inc')]//preceding::div[1]")).click();
      Driver.findElement(By.xpath("(//*[contains(text(),'DC: CBE (Certified Business Enterprise)')])[2]//preceding::div[1]")).click();
    
      
Screenshot ImageScreenshot1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshot1.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\SubCertification.png"));
	
	BufferedImage actualImageP = ImageScreenshot1.getImage();


	ImageDiffer imgdiffer = new ImageDiffer();

   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImageP, actualImageP);
if(imgdiff.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}

public void DetailsLaborStandardImageVerification() throws IOException {
	LaborStandard.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Shared Documents')]")));
	BufferedImage expectedImageL = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\LaborStandard.png."));

	
	Screenshot ImageScreenshotL= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotL.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\LaborStandard.png"));
	BufferedImage actualImageL = ImageScreenshotL.getImage();


	ImageDiffer imgdifferL = new ImageDiffer();

   ImageDiff imgdiffL = imgdifferL.makeDiff(expectedImageL, actualImageL);
if(imgdiffL.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}

public void DetailsTrackCommitmentsImageVerification() throws IOException {
	TrackCommitments.click();
	WebDriverWait wait4 = new WebDriverWait(Driver, 40);
	wait4.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Commitment Tracking')]")));
	
BufferedImage expectedImageT = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\TrackCommitments.png."));

	
	Screenshot ImageScreenshotT= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshotT.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\TrackCommitments.png"));
	BufferedImage actualImageT = ImageScreenshotT.getImage();


	ImageDiffer imgdifferT = new ImageDiffer();

   ImageDiff imgdiffT = imgdifferT.makeDiff(expectedImageT, actualImageT);
if(imgdiffT.hasDiff()==true)
{
	System.out.println("Images are not same");
}
else
{
	System.out.println("Images are same");
}
}
public SubcontractorPage ValidateSubcontractorPageLaunch() {
	try
	{
	Actions A=new Actions(Driver);
	A.moveToElement(SubcontractorPageLaunch).build();
	A.click(SubcontractorPageLaunch).perform();
	}
	catch(Exception E)
	{
		System.out.println(E);
	}
	 return new SubcontractorPage();
}
}	
