package pages;

import java.awt.AWTException;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import base.TestBase;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

public class PayrollEntryPageT1 extends TestBase{

	
	
	@FindBy(xpath="//*[contains(text(),'Payrolls')]")
	WebElement Payrolls;
	
	@FindBy(xpath="//*[contains(text(),'Create New Payroll')]")
	WebElement CreateNewPayroll;
	
	@FindBy(xpath="//*[contains(text(),'Import Payroll Entry')]")
	WebElement ImportPayrollEntry;
	
	@FindBy(xpath="//*[contains(text(),'Export Payroll Data')]")
	WebElement ExportPayrollEntry;
	
	@FindBy(xpath="//*[contains(text(),'Work Class Mappings')]")
	WebElement WorkClassMapping;
	
	@FindBy(xpath="//*[contains(text(),'WH-347 Generation')]")
	WebElement WH347Generation;
	
	@FindBy(id="mui-component-select-selectedDateRange")
	WebElement SelectPayrollPeriod;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])")
	WebElement Cancel;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')]//following::button[1])[1]")
	WebElement Create;
	
	@FindBy(xpath="(//*[contains(text(),'Delete')])")
	WebElement Delete;
	
	@FindBy(xpath="//*[contains(text(),'Are you')]//following::button[1]")
	WebElement No;
	
	@FindBy(xpath="//*[contains(text(),'Are you')]//following::button[2]")
	WebElement Yes;
	
	
	@FindBy(id="fica")
	WebElement Fica;
	
	@FindBy(id="withholding")
	WebElement Withholding;
	
	@FindBy(id="state")
	WebElement State;
	
	@FindBy(id="local")
	WebElement Local;
	
	@FindBy(id="other")
	WebElement Other;
	
	@FindBy(id="exemptions")
	WebElement Exemptions;
	
	@FindBy(xpath="//*[contains(text(),'Non Project Hours')]//following::div[2]")
	WebElement NonProjectHours;
	
	@FindBy(id="wages")
	WebElement Wages;
	
	@FindBy(xpath="(//*[contains(text(),'Next')])[1]")
	WebElement Next;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement Save;
	
	@FindBy(xpath="(//*[contains(text(),'Edit')])[2]")
	WebElement Edit;
	
	@FindBy(xpath="//*[contains(text(),'Enter Hours')]")
	WebElement EnterHours;
	
	@FindBy(xpath="//*[contains(text(),'Change to')]")
	WebElement ChangeToNoWork;
	
	@FindBy(xpath="//*[contains(text(),'Change to')]//following::button[1]")
	WebElement Sign;
	
	@FindBy(xpath="//*[contains(text(),'Refresh')]")
	WebElement RefreshPayroll;
	
	@FindBy(xpath="//*[contains(text(),'Mark')]")
	WebElement MarkAsFinal;
	
	@FindBy(xpath="//*[contains(text(),'Clear')]")
	WebElement ClearFinalFlag;
	
	@FindBy(id="mui-component-select-selectedPayrollId")
	WebElement PayrollReportPeriod;
	
	@FindBy(xpath="//*[contains(text(),'Save Edit')]")
	WebElement SaveEdit;
	
	@FindBy(xpath="//*[contains(text(),'Cancel Edits')]")
	WebElement CancelEdit;
	
	@FindBy(xpath="//*[contains(text(),'Switch on')]//preceding::input[1]")
	WebElement OJT;
	
	@FindBy(xpath="//*[contains(text(),'Employee Management')]")
	WebElement EmployeeManagement;
		
	@FindBy(xpath="//*[contains(text(),'Work Classes')]//following::div[1]")
	WebElement PayrollEntry;
	
	
	@FindBy(xpath="//*[contains(text(),'Do you')]//following::button[1]")
	WebElement SignNo;
	
	@FindBy(xpath="//*[contains(text(),'Do you')]//following::button[2]")
	WebElement SignYes;
	
	@FindBy(xpath="(//*[contains(text(),'Generate WH-347')])[2]")
	WebElement GenerateWH347;
	
	@FindBy(xpath="//*[contains(text(),'Pay Rate')]")
	WebElement PayRate;
	
	@FindBy(id="mui-component-select-10019")
	WebElement EmployeeAssignment;
	
	@FindBy(xpath="//div[@id='mui-component-select-10019']//following::input[2]")
	WebElement EmployeeFreeText;
	
	
	@FindBy(xpath="//*[contains(text(),'Save & Add New Entry Row')]")
	WebElement SaveEntry;
	
	@FindBy(xpath="//*[contains(text(),'Add New Entry Row')]")
	WebElement AddEntry;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']")
	WebElement SelectType;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']//following::input[2]")
	WebElement PayEffectiveDate;
	
	@FindBy(xpath="//div[@id='mui-component-select-workClassId']//following::input[3]")
	WebElement PayEndDate;
	
	@FindBy(xpath="//input[@id='hourlyRate']")
	WebElement BaseRate;
	
	@FindBy(xpath="//input[@id='otHourlyRate']")
	WebElement OTRate;
	
	@FindBy(xpath="//input[@id='dtHourlyRate']")
	WebElement DTRate;
	
	@FindBy(xpath="//input[@id='fringe']")
	WebElement FringeRate;
	
	@FindBy(xpath="//input[@id='fringe']//following::button[1]")
	WebElement Confirm;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement SaveandClose;
	
	@FindBy(xpath="//*[contains(text(),'Re-sign')]")
	WebElement Resign;
	
	@FindBy(xpath="//div[@id='mui-component-select-selectedExportId']")
	WebElement Exportdropdown;
	
	@FindBy(xpath="//*[contains(text(),'Export')]")
	WebElement Export;
	
	
	
	public PayrollEntryPageT1()
	{
		PageFactory.initElements(Driver,this);
	}
	
	public String ValidatePayrollsTab()
	{
		return Payrolls.getText();
	}

	public String ValidateCreateNewPayrollTab()
	{
		return CreateNewPayroll.getText();
	}
	
	public String ValidateImportPayrollEntryTab()
	{
		return ImportPayrollEntry.getText();
	}
	
	public String ValidateWorkClassMappingTab()
	{
		return WorkClassMapping.getText();
	}
	
	public String ValidateWH347GenerationTab()
	{
		return WH347Generation.getText();
	}
	
	public void PayrollsPageImageVerification() throws IOException, AWTException, InterruptedException
	{

		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\PayrollsPageT1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\PayrollsPageT1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();
		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Payroll Entry T1 Page: Payrolls Page Images are not same");
		}
		else
		{
		System.out.println("Payroll Entry T1 Page: Payrolls Page Images are same");
			}
	}
	public String ValidateEditbutton()
	{
		return Edit.getText();
	}
	
	public String ValidateEnterHoursButton()
	{
		return EnterHours.getText();
	}
	
	public String ValidateChangeToNoWorkButton()
	{
		return ChangeToNoWork.getText();
	}
	
	public String ValidateSignbutton()
	{
		return Sign.getText();
	}
	
	public String ValidateRefreshPayrollbutton()
	{
		return RefreshPayroll.getText();
	}
	
	public String ValidateMarkAsFinalbutton()
	{
		return MarkAsFinal.getText();
	}
	
	public String ValidateClearFinalFlagbutton()
	{
		return ClearFinalFlag.getText();
	}
	
	public String ValidateDeletebutton()
	{
		return Delete.getText();
	}

	
	
	
	public void CreatNewPayrollImageVerification() throws IOException, AWTException
	{
	CreateNewPayroll.click();
		BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\CreateNewPayrollPageT1.png"));
		Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshot.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\CreateNewPayrollPageT1.png"));
		BufferedImage actualImage = ImageScreenshot.getImage();
	ImageDiffer imgdiffer = new ImageDiffer();
		   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
		if(imgdiff.hasDiff()==true)
		{
			System.out.println("Payroll Entry T1 Page: Create New Payroll Images are not same");
		}
		else
		{
		System.out.println("Payroll Entry T1 Page: Create New Payroll Images are same");
			}
	}
	
	public void ValidateManualPayrollCreation(String STP,String Day1,String H1,String OT1,String DT1,String OE,String Day2,String H2,String OT2,
			String DT2,String Day3,String H3,String OT3,String F1,String W1,String S1, String L1,String O1,String E1,String NP1, String WA1,String Day4,
			String H4,String OT4,String DT4,String H5,String OT5,String F3,String W3,String S3,String S) throws InterruptedException
	{
		CreateNewPayroll.click();
		SelectPayrollPeriod.click();
		if(Driver.getPageSource().contains(STP))
		{
	System.out.println("Payroll period is Enabled");
			 List<WebElement> SP=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
		 System.out.println(SP.size());
			for(int k=0;k<SP.size();k++)
			{
				Thread.sleep(1000);
		 if(SP.get(k).getText().contains(STP))
		 {
			 SP.get(k).click();
			 break;
		 }
			}
			
			Thread.sleep(1000);
			Cancel.click();
			if(Payrolls.isDisplayed())
			{
				System.out.println("Payrolls page is loaded");
		    }
		    else
		    {
		    	System.out.println("Payrolls page is not loaded");
		    }
				
			CreateNewPayroll.click();
			SelectPayrollPeriod.click();
			
			 List<WebElement> SP1=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
			 System.out.println(SP1.size());
			 
			 
				for(int k=0;k<SP1.size();k++)
				{
			 if(SP1.get(k).getText().contains(STP))
			 {
				 System.out.println(SP1.get(k).getText());
				 SP1.get(k).click();
				 break;
			 }
				}
				Actions action1 = new Actions(Driver);
			    action1.sendKeys(Keys.ESCAPE).build().perform();
			    Driver.findElement(By.xpath("//*[contains(text(),'Set the record')]//preceding::input[1]")).click();
				Create.click();
				String R=Driver.findElement(By.xpath("//*[contains(text(),'Payroll record')]")).getText();
				String RE="Payroll record is created";
			    if(R.contains(RE))
			    {
			    	System.out.println("Payroll Created: Payroll creation message matches");
			    }
			    else
			    {
			    	System.out.println("Payroll not created: Payroll creation message not matches");
			    }
			    String De=Driver.findElement(By.xpath("//*[contains(text(),'This payroll')]")).getText();
				String Expe="This payroll was set to no work performed. There is nothing to display.";
			    if(De.contains(Expe))
			    	
			    {
			    	System.out.println("No work performed payroll message is matching");
			    }
			    else
			    {
			    	System.out.println("No work performed payroll message is matching");
			    }
			    
			    Delete.click();
				String D=Driver.findElement(By.xpath("//*[contains(text(),'You are')]")).getText();
				String Exp="You are about to permanently delete this payroll. Do you want to proceed?";
			    if(D.contains(Exp))
			    {
			    	System.out.println("Delete Payroll message is matching");
			    }
			    else
			    {
			    	System.out.println("Delete Payroll message is not matching");
			    }
				No.click();
				Delete.click();
				Yes.click();
				CreateNewPayroll.click();
				SelectPayrollPeriod.click();
				 List<WebElement> SP2=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedDateRange']//following::ul[2]//li"));
				 System.out.println(SP2.size());
				 
				 
					for(int k=0;k<SP2.size();k++)
					{
				 if(SP2.get(k).getText().contains(STP))
				 {
					 System.out.println(SP2.get(k).getText());
					 SP2.get(k).click();
					 break;
				 }
					}
					Actions acti = new Actions(Driver);
				    acti.sendKeys(Keys.ESCAPE).build().perform();
				Create.click();
			
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys("25");
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					String ER=Driver.findElement(By.xpath("(//*[contains(text(),'Error')])[3]")).getText();
					String ER1="ERROR";
				    if(ER.contains(ER1))
				    {
				    	System.out.println("More than 24 Hours: Error message is matching");
				    }
				    else
				    {
				    	System.out.println("More than 24 Hours: Error message is not matching");
				    }
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys("dfdf");
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					String ERR1=Driver.findElement(By.xpath("(//*[contains(text(),'Error')])[3]")).getText();
					String ERE1="ERROR";
				    if(ERR1.contains(ERE1))
				    {
				    	System.out.println("Non Numeric Value: Error message is matching");
				    }
				    else
				    {
				    	System.out.println("Non Numeric Value: Error message is not matching");
				    }  
				    String N=Driver.findElement(By.xpath("//*[contains(text(),'NaN')]")).getText();
					String N1="NaN";
				    if(N.contains(N1))
				    {
				    	System.out.println("Non Numeric Value: NaN message is matching");
				    }
				    else
				    {
				    	System.out.println("Non Numeric Value: NaN message is not matching");
				    }  
				    
				    Exemptions.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Exemptions.sendKeys("-5");
					NonProjectHours.click();

					String ERO1=Driver.findElement(By.xpath("(//*[contains(text(),'Error')])[3]")).getText();
					String ERO2="ERROR";
				    if(ERO1.contains(ERO2))
				    {
				    	System.out.println("Exemptions Negative Value: Error message is matching");
				    }
				    else
				    {
				    	System.out.println("Exemptions Negative Value: Error message is not matching");
				    } 
				    Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[1]")).sendKeys(H1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[2]")).sendKeys(OT1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[3]")).sendKeys(DT1);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[7]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::div[7]")).sendKeys(OE);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Thread.sleep(1000);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(H2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(OT2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(DT2);
					Thread.sleep(1000);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[1]")).sendKeys(H3);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(OT3);
					OJT.click();
					Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Fica.sendKeys(F1);
					Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Withholding.sendKeys(W1);
					State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					State.sendKeys(S1);
					Local.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Local.sendKeys(L1);
					Other.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Other.sendKeys(O1);
					Exemptions.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Exemptions.sendKeys(E1);
					NonProjectHours.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					NonProjectHours.sendKeys(NP1);
					Wages.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Wages.sendKeys(WA1);
					if(Driver.getPageSource().contains("Next"))
							{
						System.out.println("There is more employee to add the hours.");	
						Next.click();
					
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[1]")).sendKeys(H4);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[2]")).sendKeys(OT4);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day4+"')]//following::div[3]")).sendKeys(DT4);
					Thread.sleep(1000);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(H5);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));	
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day3+"')]//following::div[2]")).sendKeys(OT5);
					Thread.sleep(1000);
					Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Fica.sendKeys(F3);
					Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Withholding.sendKeys(W3);
					State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					State.sendKeys(S3);
							}
					else
					{
						System.out.println("There is no other employee to add the hours.");
					}
					Save.click();
				Thread.sleep(1000);
					String[] E = S.split("!"); 
					for (String EM : E) 
					   {
					if(Driver.findElement(By.xpath("//*[contains(text(),'"+EM+"')]")).isDisplayed())
					{
						System.out.println("Employee Name matches");	
					}
					else
					{
						System.out.println("Employee Name not matches");
					   }
					   }
					Sign.click();
					
					String SI=Driver.findElement(By.xpath("//*[contains(text(),'You are about')]")).getText();
					String SIM="You are about to sign off on this payroll";
				    if(SI.contains(SIM))
				    {
				    	System.out.println("Sign off message is matching");
				    }
				    else
				    {
				    	System.out.println("Sign off message is not matching");
				    }
				    SignNo.click();
				    Sign.click();
				    SignYes.click();
				    //To do Image Comparison for button disable.
				  MarkAsFinal.click();
				    String MF=Driver.findElement(By.xpath("//*[contains(text(),'Payroll marked')]")).getText();
					String MAF="Payroll marked as final";
					 if(MF.contains(MAF))
					    {
					    	System.out.println("Mark as Final message is matching");
					    }
					    else
					    {
					    	System.out.println("Mark as Final message is not matching");
					    }
				    if(Driver.findElement(By.xpath("//*[contains(text(),' Final')]")).isDisplayed())
				    {
				    	System.out.println("Signed Payroll is marked as Final");
				    }
				    else
				    {
				    	System.out.println("Signed Payroll is not marked as Final");
				    }
				    ClearFinalFlag.click();				    
				    MarkAsFinal.click();
				    GenerateWH347.click();
				    if(Driver.findElement(By.xpath("//*[contains(text(),'Create WH-347 Report')]")).isDisplayed())
				    {
				    	System.out.println("WH-347 Generation page got loaded");
				    }
				    else
				    {
				    	System.out.println("WH-347 Generation page not loaded");
				    }
				  Payrolls.click();
}
		else
		{
			System.out.println("Payroll is disabled");
		}
	}
	
	public void EditPayroll(String PP,String FN1,String Day1,String H1,String OT1,String DT1,String OE
			,String F1,String W1,String S1,String L1,String O1,String E1,String NP1, String WA1,String Day2,
			String HO2,String OTH2,String DTH2,String OEH2,
			String F2,String Name,String JT,String PED,String PD,String BR,String OT,String DT,String FR,
			String Name1,String PName,String PName1, String WC) throws InterruptedException
	{
		
		  

		PayrollReportPeriod.click();	
		List<WebElement> PRP=Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedPayrollId']//following::ul[2]//li"));
		 System.out.println(PRP.size());
			
		 for(int l=0;l<=PRP.size()-1;l++)
			{
				System.out.println(PRP.get(l).getText());
			}
			for(int k=0;k<PRP.size();k++)
			{
		 if(PRP.get(k).getText().contains(PP))
		 {
			 PRP.get(k).click();
			 break;
		 }
			}
			Actions action2 = new Actions(Driver);
		    action2.sendKeys(Keys.ESCAPE).build().perform();
		    Edit.click();
		    String EDT=Driver.findElement(By.xpath("//*[contains(text(),'You are about to edit')]")).getText();
		    String ED="You are about to edit a previously signed payroll. All edits will be tracked. Any existing, signed WH-347 files will be deleted.";
		    if(EDT.contains(ED))
		    {
		    	System.out.println("Edit Payroll message matches");
		    }
		    else
		    {
		    	System.out.println("Edit Payroll message not matches");
		    }
		    Driver.findElement(By.xpath("//*[contains(text(),'You are about to edit')]//following::button[1]")).click();
		    Edit.click();
			Driver.findElement(By.xpath("//*[contains(text(),'You are about to edit')]//following::button[2]")).click();
		    ChangeToNoWork.click(); 
		    String MI=Driver.findElement(By.xpath("//*[contains(text(),'You are changing')]")).getText();
			String M="You are changing an already saved payroll, all edits will be tracked";
			if(M.equals(MI))
			{
				System.out.println("Already saved payroll message matches");
			}
			else
			{
				System.out.println("Already saved payroll message not matches");
			}
			Driver.findElement(By.xpath("//*[contains(text(),'You are changing')]//following::button[1]")).click();
			 ChangeToNoWork.click(); 
			 Driver.findElement(By.xpath("//*[contains(text(),'You are changing')]//following::button[2]")).click();
			 String Re=Driver.findElement(By.xpath("//*[contains(text(),'This payroll was previous')]")).getText();
			 String RS="This payroll was previously signed, all edits are tracked and payroll needs to be resigned";
			 if(Re.equals(RS.toUpperCase()))
			 {
				 System.out.println("Resign message matches");
			 }
			 else 
			 {
				 System.out.println("Resign message not matches");
			 }
			 
			 String NW=Driver.findElement(By.xpath("//*[contains(text(),'This payroll was set')]")).getText();
			 String N="This payroll was set to no work performed. There is nothing to display.";
			 if(NW.equals(N))
			 {
				 System.out.println("No Work Performed message matches");
			 }
			 else 
			 {
				 System.out.println("No Work Performed message not matches");
			 }
		 Edit.click();
		    CancelEdit.click();
		    Edit.click();
		   Driver.findElement(By.xpath("//*[contains(text(),'Change to Work Performed')]")).click();
		   Thread.sleep(1000);
		   Edit.click();
		    Actions A=new Actions(Driver);
		    WebElement NEM=Driver.findElement(By.xpath("//*[contains(text(),'"+FN1+"')]//preceding::div[1]"));
		    A.moveToElement(NEM).build();
		    A.click(NEM).perform();
		 /*   OJT.click();
		    Actions action3 = new Actions(Driver);
		    action3.sendKeys(Keys.ESCAPE).build().perform();*/
		   
	
		    ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", Fica);
		 //   Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).clear();
		   
		    Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).click();
		    Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[1]")).sendKeys(H1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[2]")).sendKeys(OT1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[3]")).sendKeys(DT1);
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[4]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Driver.findElement(By.xpath("//*[contains(text(),'"+Day1+"')]//following::input[4]")).sendKeys(OE);
		Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Fica.sendKeys(F1);
			Withholding.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Withholding.sendKeys(W1);
			State.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			State.sendKeys(S1);
			Local.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Local.sendKeys(L1);
			Other.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Other.sendKeys(O1);
			Exemptions.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Exemptions.sendKeys(E1);
			NonProjectHours.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			NonProjectHours.sendKeys(NP1);
			Wages.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Wages.sendKeys(WA1);
			SaveEdit.click();
			Edit.click();
			EnterHours.click();
				 Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).click();
				  Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[1]")).sendKeys(HO2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[2]")).sendKeys(OTH2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[3]")).sendKeys(DTH2);
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[7]")).sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Driver.findElement(By.xpath("//*[contains(text(),'"+Day2+"')]//following::div[7]")).sendKeys(OEH2);
					Fica.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Fica.sendKeys(F2);
				Thread.sleep(1000);
				JavascriptExecutor exs = (JavascriptExecutor)Driver;
				exs.executeScript("arguments[0].click();",Save );
				Resign.click();
				JavascriptExecutor EMP = (JavascriptExecutor)Driver;
				EMP.executeScript("arguments[0].click();",EmployeeManagement);
				//EmployeeManagement.click();
				Driver.findElement(By.xpath("//*[text()[contains(.,'"+Name1+"')]]//following::input[1]")).click();
				 String OP=Driver.findElement(By.xpath("//*[contains(text(),'This employee has hours')]")).getText();
				 String PR="This employee has hours on 1 or more unsigned payrolls. Removing their assignment will remove them from those payrolls.";
				 if(OP.equals(PR))
				 {
					 System.out.println("Assignment of Employee message matches");
				 }
				 else 
				 {
					 System.out.println("Assignment of Employee message not matches");
				 }
	    No.click();
	    Driver.findElement(By.xpath("//*[text()[contains(.,'"+Name1+"')]]//following::input[1]")).click();
	    Yes.click();
				WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[2]//following::input[1]"));
				Search.sendKeys(Name);
				Thread.sleep(2000);
				Actions Em1=new Actions(Driver);
				WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+Name+"')]]"));
				Em1.moveToElement(Emp1).build();
				Em1.click(Emp1).perform();
				JavascriptExecutor ex = (JavascriptExecutor)Driver;
				ex.executeScript("arguments[0].click();", PayRate);
					JavascriptExecutor xa = (JavascriptExecutor)Driver;
					xa.executeScript("arguments[0].click();", AddEntry);
					//AddEntry.click();
					Thread.sleep(3000);
					JavascriptExecutor x = (JavascriptExecutor)Driver;
					x.executeScript("arguments[0].click();", SelectType);
					Thread.sleep(2000);
					SelectType.click();
					 List<WebElement> J=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
					 System.out.println(J.size());
						for(int l=0;l<=J.size()-1;l++)
						{
							System.out.println(J.get(l).getText());
						}
						for(int k=0;k<J.size();k++)
						{
					 if(J.get(k).getText().equals(JT))
					 {
						 J.get(k).click();
						 break;
					 }
						}
						PayEffectiveDate.click();
						PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						PayEffectiveDate.sendKeys(PED);
						PayEndDate.click();
						PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						PayEndDate.sendKeys(PD);
						BaseRate.click();
						BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						BaseRate.sendKeys(BR);
						OTRate.click();
						OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						OTRate.sendKeys(OT);
						DTRate.click();
						DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						DTRate.sendKeys(DT);
						FringeRate.click();
						FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
						FringeRate.sendKeys(FR);
						JavascriptExecutor c = (JavascriptExecutor)Driver;
						c.executeScript("arguments[0].click();", Confirm);
						JavascriptExecutor sc = (JavascriptExecutor)Driver;
						sc.executeScript("arguments[0].click();", SaveandClose);
						
			    Thread.sleep(1000);
			    JavascriptExecutor PE = (JavascriptExecutor)Driver;
				PE.executeScript("arguments[0].click();", PayrollEntry);
				PayrollReportPeriod.click();	
				Driver.findElement(By.xpath("//*[contains(text(),'"+PP+"')]")).click();
				
				if(Driver.getPageSource().contains("'+PName+'"))
			    {
			    	System.out.println("Turned off Employee is seen");
			    }
			    else
			    {
			    	System.out.println("Turned off Employee is not seen as expected");
			    }
				   Edit.click();
				    RefreshPayroll.click(); 
				    List<WebElement> WN=Driver.findElements(By.xpath("//*[contains(text(),'"+PName1+"')]//following::p[1]"));
					 System.out.println(WN.size());
						
					 for(int l=0;l<=WN.size()-1;l++)
						{
							System.out.println(WN.get(l).getText());
						}
						for(int k=0;k<WN.size();k++)
						{
					 if(WN.get(k).getText().contains(WC))
					 {
						 System.out.println("New Added Workclass is seen for an employee:" +WN.get(k).getText());
						break;
		
					 }
					 else
					 {
						 System.out.println("New Added Workclass is not seen for an employee:" +WN.get(k).getText());
					 }
						}
						    			
	 Sign.click();
	    SignYes.click();
	    //To do Image Comparison for button disable.
	  MarkAsFinal.click();	
	  Actions a2 = new Actions(Driver);
	    a2.sendKeys(Keys.ESCAPE).build().perform();
	    Exportdropdown.click();
		  Driver.findElement(By.xpath("//*[contains(text(),'Foundations')]")).click();
		  Export.click();
		  Thread.sleep(3000);
	  WH347Generation.click();
	}

	public WH347GenerationPageT1 WHGenerationlaunch() throws InterruptedException {
		// TODO Auto-generated method stub
		Thread.sleep(2000);
		WebDriverWait wait = new WebDriverWait(Driver, 80);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'WH-347 Generation')]")));
		WH347Generation.click();
		return new WH347GenerationPageT1();
	}
}
