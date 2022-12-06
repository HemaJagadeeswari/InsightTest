package pages;
import base.TestBase;
import io.github.bonigarcia.wdm.WebDriverManager;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;
import util.TestUtil;

import java.awt.AWTException;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.awt.image.BufferedImage;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;

//import com.sun.corba.se.spi.orbutil.fsm.Action;
import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;
public class EmployeeManagementPageT1 extends TestBase{

	@FindBy(xpath="(//*[contains(text(),'Details')])")
	WebElement DetailsPage;
	
	@FindBy(xpath="(//*[contains(text(),'Employee Management')])[1]")
	WebElement EmployeeManagement;

	@FindBy(xpath="(//*[contains(text(),'Employees')])[5]")
	WebElement EmployeesTab;
	
	
	@FindBy(xpath="(//*[contains(text(),'Employees')])[1]")
	WebElement Employees;
	
	@FindBy(xpath="(//*[contains(text(),'View All Employees')])[2]")
	WebElement ViewAllEmployees;
	
	@FindBy(xpath="(//*[contains(text(),'View All Employees')])")
	WebElement ViewAllEmployeesLeftNav;
	
	@FindBy(xpath="(//*[contains(text(),'Add Employee')])[2]")
	WebElement AddEmployee;
	
	@FindBy(xpath="(//*[contains(text(),'Add Employee')])[1]")
	WebElement AddEmployeeLeftNav;
	
	@FindBy(xpath="(//*[contains(text(),'1099')])[1]//preceding::div[1]")
	WebElement ImportEmployeesLeftNav;
	
	
	@FindBy(xpath="(//*[contains(text(),'View All Employees')])[1]")
	WebElement EmployeesTitle;
	
	@FindBy(xpath="(//*[contains(text(),'Add/Edit')])[1]")
	WebElement AddEmployeeTitle;
	
	@FindBy(xpath="//*[contains(text(),'Import Employees')][1]")
	WebElement ImportEmployeesTitle;
	
	@FindBy(xpath="(//*[contains(text(),'Import Employees')])[2]")
	WebElement ImportEmployee;
	
	@FindBy(xpath="//*[contains(text(),'Undo')]")
	WebElement UndoChanges;
	
	@FindBy(xpath="//*[contains(text(),'Setup')]")
	WebElement Setup;
	
	@FindBy(xpath="//*[contains(text(),'Manage Project')]")
	WebElement ManageProject;
	
	@FindBy(xpath="//*[contains(text(),'Attention')]//following::select[1]")
	WebElement AttentionSelect;
	
	@FindBy(xpath="//*[contains(text(),'Attention')]//following::select[2]")
	WebElement Validated;

	@FindBy(xpath="//*[contains(text(),'Attention')]//following::select[3]")
	WebElement AssignedToProject;
	
	@FindBy(xpath="//*[contains(text(),'On Project')]//preceding::input[1]")
	WebElement Active;
	
	
	@FindBy(id="firstName")
	WebElement FirstName;
	
	@FindBy(name="middleInitial")
	WebElement MiddleInitial;
	
	@FindBy(id="lastName")
	WebElement LastName;
	
	@FindBy(id="ssn")
	WebElement SSN;
	
	@FindBy(id="employeeId")
	WebElement EmployeeId;
	
	@FindBy(id="mui-component-select-genderId")
	WebElement GenderId;
	
	@FindBy(id="mui-component-select-ethnicityId")
	WebElement EthnicityId;
	
	@FindBy(xpath="//*[contains(text(),'Veteran Status')]//preceding::input[1]")
	WebElement VeteranStatusToggle;
	
	@FindBy(id="phone")
	WebElement Phone;
	
	@FindBy(xpath="(//*[contains(text(),'Address History')])[1]")
	WebElement AddressHistory;
	
	@FindBy(xpath="//*[contains(text(),'Add New')]")
	WebElement AddNew;
	
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
	
	@FindBy(id="mui-component-select-province")
	WebElement Province;
	
	
	@FindBy(id="zip")
	WebElement Zip;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement EffectiveDate;
	
	@FindBy(xpath="//input[@id='type']//preceding::div[1]")
	WebElement AddressType;
	
	@FindBy(xpath="//*[contains(text(),'Effective')]//following::button[2]")
	WebElement Add;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[1]")
	WebElement AddressCancel;
	
	@FindBy(xpath="(//*[contains(text(),'Update')])")
	WebElement AddressUpdate;
	
	@FindBy(xpath="(//*[contains(text(),'Work Info')])[1]")
	WebElement WorkInfo;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement HireDate;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
	WebElement DateTerminated;
	
	@FindBy(id="mui-component-select-employmentStatusId")
	WebElement EmployeeStatus;
	
	@FindBy(id="apprenticeNumber")
	WebElement ApprenticeNumber;
	
	@FindBy(xpath="//*[contains(text(),'Union')]")
	WebElement Union;
	
	@FindBy(xpath="//*[contains(text(),'Add Member')]")
	WebElement AddMembershipbutton;
	
	@FindBy(xpath="//*[contains(text(),'Select a Union')]//following::div[2]")
	WebElement SelectUnion;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[1]")
	WebElement StartDate;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]")
	WebElement EndDate;
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])[2]//following::button[2]")
	WebElement DeleteIcon;
	
	
	@FindBy(xpath="//*[contains(text(),'Custom Fields')]")
	WebElement CustomField;
	
	@FindBy(id="mui-component-select-10011")
	WebElement EmployeeType;
	
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
	
	@FindBy(xpath="(//*[contains(text(),'Action')]//following::button[1])[2]")
	WebElement Edit;
	
	@FindBy(xpath="//input[@id='fringe']//following::button[2]")
	WebElement Delete;
	
	@FindBy(xpath="//*[contains(text(),'Validations')]")
	WebElement Validations;
	
	@FindBy(xpath="//*[contains(text(),'Add Validation Documents')]")
	WebElement AddValidationDocument;
	
	@FindBy(xpath="//*[contains(text(),'Add Document Row')]")
	WebElement AddDocumentRow;
	
	@FindBy(xpath="//*[contains(text(),'Click to select, or drop here')]")
	WebElement Drophere;
	
	
	@FindBy(xpath="(//input[@placeholder='mm/dd/yyyy'])")
	WebElement Expires;
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']//following::button[2]")
	WebElement ValidationConfirm;
	
	@FindBy(xpath="//*[contains(text(),'Actions')]//following::button[1]")
	WebElement ValidationEdit;
	
	
	@FindBy(xpath="//input[@placeholder='mm/dd/yyyy']//following::button[3]")
	WebElement ValidationDelete;
	
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[1]")
	WebElement Save;
	
	@FindBy(xpath="(//*[contains(text(),'Save')])[2]")
	WebElement SaveandClose;
	
	
	@FindBy(xpath="(//*[contains(text(),'Name')])[1]//following::input[1]")
	WebElement NameField;
	
	@FindBy(xpath="(//*[contains(text(),'Address')])[2]//following::button[1]")
	WebElement EditAddress;
	
	@FindBy(xpath="(//*[contains(text(),'Address')])[2]//following::button[2]")
	WebElement DeleteAddress;

	@FindBy(xpath="//*[contains(text(),'Create a new')]")
	WebElement CreateExcelLayout;
	
	@FindBy(id="name")
	WebElement LayoutName;
	
	@FindBy(xpath="//*[contains(text(),'Undo')]")
	WebElement Undobutton;
	
	@FindBy(xpath="//*[contains(text(),'Go Back')]")
	WebElement GoBackbutton;
	
	@FindBy(id="mui-component-select-mapTo")
	WebElement To;
	
	@FindBy(id="hasHeaderRow")
	WebElement Header;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[1]")
	WebElement ASelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[2]")
	WebElement BSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[3]")
	WebElement CSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[4]")
	WebElement DSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[5]")
	WebElement ESelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[6]")
	WebElement FSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[7]")
	WebElement GSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[8]")
	WebElement HSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[9]")
	WebElement ISelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[10]")
	WebElement JSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[11]")
	WebElement KSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[12]")
	WebElement LSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[13]")
	WebElement MSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[14]")
	WebElement NSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[15]")
	WebElement OSelectValue;
	
	@FindBy(xpath="(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[16]")
	WebElement PSelectValue;
	
	@FindBy(xpath="//*[contains(text(),'Create')]")
	WebElement Createbutton;
	
	@FindBy(xpath="//div[@id='mui-component-select-selectedImportId']")
	WebElement SelectLayout;
	
	@FindBy(xpath="//*[contains(text(),'View/edit')]")
	WebElement ViewEdit;
	
	@FindBy(xpath="//a[@href='files/skillsmart-employee-template.xlsx']")
	WebElement DownloadFile;
	
	@FindBy(xpath="(//*[contains(text(),'Cancel')])[3]")
	WebElement Cancel;
	
	@FindBy(xpath="//*[contains(text(),'Test Import')]")
	WebElement TestImportbutton;
	
	@FindBy(xpath="(//*[contains(text(),'Test Import')])//following::button[1]")
	WebElement Importbutton;
	
	@FindBy(xpath="//*[contains(text(),'Delete Employee')]")
	WebElement DeleteEmployee;
	
	@FindBy(xpath="//*[contains(text(),'Select Contract')]//following::button[1]")
	WebElement AccountIcon;
	
	@FindBy(xpath="//*[contains(text(),'Logout')]")
	WebElement Logout;
	
	@FindBy(xpath="//*[contains(text(),'Payroll Entry')]")
	WebElement PayrollEntry;
	
	public EmployeeManagementPageT1()
	{
		PageFactory.initElements(Driver,this);
	}
	
	public String ValidateViewAllEmployeesLeftNav()
	{
		return ViewAllEmployeesLeftNav.getText();
	}
	
	public String ValidateAddEmployeeLeftNav()
	{
		return AddEmployeeLeftNav.getText();
	}
	
	public String ValidateImportEmployeeleftNav() throws InterruptedException
	{
         Thread.sleep(1000);
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", ImportEmployeesLeftNav);
	      System.out.println(ImportEmployeesLeftNav.getText());
		return ImportEmployeesLeftNav.getText();
	}
		
	public String ValidateEmployeesTab()
	{
		return EmployeesTab.getText();
	}
	
	public String ValidateAddEmployeeTab()
	{
		return AddEmployee.getText();
	}
	
	public String ValidateImportEmployeeTab()
	{
		return ImportEmployee.getText();
	}
	
	
	
	//title verification
	public String ValidateEmployeesPageTitleName() throws InterruptedException
	{
		String S=Driver.findElement(By.xpath("(//*[contains(text(),'View All Employees')])[1]")).getText();
		return S;
	}
	
	public String ValidateAddEmployeePageTitleName() throws InterruptedException
	{
		AddEmployee.click();
	    String t2= Driver.getTitle();
		return t2;
	}
	
	public String ValidateImportEmployeesPageTitleName() throws InterruptedException
	{
          AddEmployee.click();
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", ImportEmployeesLeftNav);
		ImportEmployeesLeftNav.click();
		Thread.sleep(1000);
		String t3= Driver.getTitle();
		return t3;
	}
	
	
	
	public  void ValidateEmployeeManagementImageVerification() throws AWTException, InterruptedException, IOException
	{
		
		
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\EmployeeManagement.png."));

		
		Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotC.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\EmployeeManagement.png."));
		BufferedImage actualImageC = ImageScreenshotC.getImage();


		ImageDiffer imgdifferD = new ImageDiffer();

	   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Employee Management: Images are not same");
	}
	else
	{
		System.out.println("Employee Management: Images are same");
	}
		}
	
	public  void ValidateEmployeeViewImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		Thread.sleep(1000);
		AddEmployee.click();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Information')]")));
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\EmployeeView1.png."));

		
		Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotC.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\EmployeeView1.png."));
		BufferedImage actualImageC = ImageScreenshotC.getImage();


		ImageDiffer imgdifferD = new ImageDiffer();

	   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Add Employee-Employee view1: Images are not same");
	}
	else
	{
		System.out.println("Add Employee-Employee view1: Images are same");
	}
		
		BufferedImage expectedImageC1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\EmployeeView2.png."));

		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Save')]"));
		
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
				Screenshot ImageScreenshotC1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC1.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\EmployeeView2.png."));
				BufferedImage actualImageC1 = ImageScreenshotC1.getImage();


				ImageDiffer imgdifferD1 = new ImageDiffer();

			   ImageDiff imgdiffD1 = imgdifferD1.makeDiff(expectedImageC1, actualImageC1);
			if(imgdiffD1.hasDiff()==true)
			{
				System.out.println("Add Employee-Employee view2: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Employee view2: Images are same");
			}
		}
	
	public  void ValidateAddressHistoryViewImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		AddEmployee.click();
		AddressHistory.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\AddressHistory.png."));

		
				Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\AddressHistory.png."));
				BufferedImage actualImageC = ImageScreenshotC.getImage();


				ImageDiffer imgdifferD = new ImageDiffer();

			   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
			if(imgdiffD.hasDiff()==true)
			{
				System.out.println("Add Employee-Address History: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Address History: Images are same");
			}
		AddNew.click();
		
		BufferedImage expectedImageC1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\AddressHistoryFields.png."));

		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Cancel')]"));
		
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
		Screenshot ImageScreenshotC1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotC1.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\AddressHistoryFields.png."));
		BufferedImage actualImageC1 = ImageScreenshotC1.getImage();


		ImageDiffer imgdifferD1 = new ImageDiffer();

	   ImageDiff imgdiffD1 = imgdifferD1.makeDiff(expectedImageC1, actualImageC1);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Add Employee-Address History Field: Images are not same");
	}
	else
	{
		System.out.println("Add Employee-Address History Field: Images are same");
	}
		
		
		}
	
	public  void ValidateWorkInfoImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		
		AddEmployee.click();
		WorkInfo.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WorkInfo.png."));

		
				Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WorkInfo.png."));
				BufferedImage actualImageC = ImageScreenshotC.getImage();


				ImageDiffer imgdifferD = new ImageDiffer();

			   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
			if(imgdiffD.hasDiff()==true)
			{
				System.out.println("Add Employee-Work Info: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Work Info: Images are same");
			}
	}
	
	
	public  void ValidatePayRatesImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		
		AddEmployee.click();
		PayRate.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\PayRates.png."));

		
		Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotC.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\PayRates.png."));
		BufferedImage actualImageC = ImageScreenshotC.getImage();


		ImageDiffer imgdifferD = new ImageDiffer();

	 ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
	if(imgdiffD.hasDiff()==true)
	{
		System.out.println("Add Employee-Pay Rates: Images are not same");
	}
	else
	{
		System.out.println("Add Employee-Pay Rates: Images are same");
	}
		WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'Row')]"));
		
	      // Javascript executor
	      ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
		BufferedImage expectedImageC1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\PayRates1.png."));

		
				Screenshot ImageScreenshotC1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC1.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\PayRates1.png."));
				BufferedImage actualImageC1 = ImageScreenshotC1.getImage();


				ImageDiffer imgdifferD1 = new ImageDiffer();

			  ImageDiff imgdiffD1 = imgdifferD1.makeDiff(expectedImageC1, actualImageC1);
			if(imgdiffD1.hasDiff()==true)
			{
				System.out.println("Add Employee-Pay Rates: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Pay Rates: Images are same");
			}
	}
	
	public  void ValidateUnionImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		
		AddEmployee.click();
		Union.click();
		AddMembershipbutton.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\Union.png."));

		
				Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\Union.png."));
				BufferedImage actualImageC = ImageScreenshotC.getImage();


				ImageDiffer imgdifferD = new ImageDiffer();

			   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
			if(imgdiffD.hasDiff()==true)
			{
				System.out.println("Add Employee-Union: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Union: Images are same");
			}
	}
	
	
	public  void ValidateValidationsmageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		
		AddEmployee.click();
		Validations.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\Validations.png."));

		
				Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\Validations.png."));
				BufferedImage actualImageC = ImageScreenshotC.getImage();


				ImageDiffer imgdifferD = new ImageDiffer();

			   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
			if(imgdiffD.hasDiff()==true)
			{
				System.out.println("Add Employee-Validations: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Validations: Images are same");
			}
	}
	
	public  void ValidateCustomFieldsImageVerification() throws AWTException, InterruptedException, IOException
	{
		WebDriverWait wait = new WebDriverWait(Driver, 70);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		AddEmployee.click();
		CustomField.click();
		BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\CustomFields.png."));

		
				Screenshot ImageScreenshotC= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
				ImageIO.write(ImageScreenshotC.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\CustomFields.png."));
				BufferedImage actualImageC = ImageScreenshotC.getImage();


			ImageDiffer imgdifferD = new ImageDiffer();

			   ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
			if(imgdiffD.hasDiff()==true)
			{
				System.out.println("Add Employee-Custom Fields: Images are not same");
			}
			else
			{
				System.out.println("Add Employee-Custom Fields: Images are same");
			}
	}
	
	//New Navigation change-IN 4911
	public void ValidateUndobutton() throws InterruptedException, AWTException
	{
		Thread.sleep(5000);
		WebDriverWait w1 = new WebDriverWait(Driver, 100);
		w1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Add Employee')])[2]")));
		AddEmployee.click();
		FirstName.click();
		Thread.sleep(1000);
		FirstName.sendKeys("Anish");
		UndoChanges.click();
		if(Driver.getPageSource().contains("Anish"))
{
		System.out.println("Entered value is not cleared");
	}
	else
	{
		System.out.println("Entered value is cleared");
	}
		//AddEmployee.click();
		GenderId.click();
		Driver.findElement(By.xpath("//*[contains(text(),'Female')]")).click();
		WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'Manage Project')]"));
	    // Javascript executor
	  ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S1);
		ManageProject.click();
		Setup.click();
		Robot robot = new Robot();

		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(1000);
		String Expected="Error missing fields. Unable to save changes";
		String S=Driver.findElement(By.xpath("//*[contains(text(),'changes')]")).getText();
		if(S.contains(Expected))
		{
			
			     System.out.println("Required field alert matches");
				}
			   else
			   {
			    System.out.println("Required field alert not matches");
			   }
		JavascriptExecutor exe2 = (JavascriptExecutor)Driver;
		exe2.executeScript("arguments[0].click();", AddEmployeeLeftNav);
			//AddEmployeeLeftNav.click();
			FirstName.click();
			FirstName.sendKeys("Anish");
			WebElement S2=Driver.findElement(By.xpath("//*[contains(text(),'Manage Project')]"));
		    // Javascript executor
		  ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S2);
			Setup.click();
			robot.keyPress(KeyEvent.VK_TAB);
			robot.keyRelease(KeyEvent.VK_TAB);

			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);
			Thread.sleep(2000);
			if(Driver.findElement(By.xpath("(//*[contains(text(),'Project Details')])[2]")).isDisplayed())
			{
				System.out.println("Project Details page got loaded");
			}
			else
			{
				System.out.println("Project Details page is not loaded");
			}
		Driver.navigate().back();
		if(Driver.findElement(By.xpath("(//*[contains(text(),'Employee Mgmt')])[2]")).isDisplayed())
		{
			System.out.println("Add/Edit Employee view got loaded");
		}
		else
		{
			System.out.println("Add/Edit Employee view is not loaded");
	}
		Thread.sleep(1000);
		Driver.navigate().forward();
		if(Driver.findElement(By.xpath("(//*[contains(text(),'Project Details')])[2]")).isDisplayed())
		{
			System.out.println("Project Details page got loaded");
		}
		else
		{
			System.out.println("Project Details page is not loaded");
		}
	}
	
	public void AddEmployee(String fn,String Mi, String Ln,String S,String Ed, String GE,String ET,String Ph,
			String SS1,String SS2, String SC,String SCO, String SS, String SZ, String SE, String ESE1, String S1,String S2, String SC1,String SCO1, String St, String SZ1, String SE1,String HD,String DDT,String ES,String AN,
			String UA,String SD,String ED,String UA1,String SD1,String ED1,String ET1,String A,String EF,
			String JT,String PED,String PD,String BR,String OT,String DT,String FR,String JT1,String PED1,String PD1,
			String BR1,String OT1,String DT1,String FR1,String Exp,String Exp1) throws InterruptedException, IOException {
      Thread.sleep(9000);
		WebDriverWait wait = new WebDriverWait(Driver, 110);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Add Employee')]")));
		AddEmployee.click();
		
		//Verifying Duplicate Message
		
		JavascriptExecutor exe1 = (JavascriptExecutor)Driver;
		exe1.executeScript("arguments[0].click();", FirstName);
		FirstName.sendKeys(fn);
		JavascriptExecutor exe2 = (JavascriptExecutor)Driver;
		exe2.executeScript("arguments[0].click();", MiddleInitial);
		MiddleInitial.sendKeys(Mi);
		JavascriptExecutor exe4 = (JavascriptExecutor)Driver;
		exe4.executeScript("arguments[0].click();", LastName);
		LastName.sendKeys(Ln);
		JavascriptExecutor exe5 = (JavascriptExecutor)Driver;
		exe5.executeScript("arguments[0].click();", SSN);
		SSN.sendKeys(S);
		JavascriptExecutor exe6 = (JavascriptExecutor)Driver;
		exe6.executeScript("arguments[0].click();", EmployeeId);
		EmployeeId.sendKeys(Ed);
		//EmployeeId.sendKeys(Keys.TAB);
		Phone.click();
		if(Driver.getPageSource().contains("Warning: duplicate found")){
			System.out.println("Employee is duplicate");
		
		BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\DuplicateMessage.png."));

		
		Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		
		Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
		ImageIO.write(ImageScreenshotS.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\DuplicateMessage.png"));
		BufferedImage actualImageS = ImageScreenshotS.getImage();


	ImageDiffer imgdifferS = new ImageDiffer();

	   ImageDiff imgdiffS = imgdifferS.makeDiff(expectedImageS, actualImageS);
	if(imgdiffS.hasDiff()==true)
	{
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("Images are same");
	}
		UndoChanges.click();
		AccountIcon.click();
		Logout.click();
		}
		else
		{
			System.out.println("Employee is not duplicate");
			
//Verifying the Existing Employee
			Thread.sleep(1000);
			if(Driver.getPageSource().contains("located")){
				System.out.println("Employee Already Exist");	
			WebElement Transition1=Driver.findElement(By.xpath("//*[contains(text(),'We have located')]"));
				String UI=Transition1.getText();
			System.out.println(UI);
			String St1="We have located this employee in our Database and have pre-populated some fields for you.";
				if(St1.equals(UI))
				{
					System.out.println("Soft Alert Matches");
					Thread.sleep(3000);
					WebDriverWait t=new WebDriverWait(Driver, 40);
					WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
					t.until(ExpectedConditions.elementToBeClickable(ele1));
					ele1.click();
					WebDriverWait wait12 = new WebDriverWait(Driver, 40);
					 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
					 System.out.println(G.size());
						for(int i=0;i<G.size();i++)
						{
							System.out.println(G.get(i).getText());
					 if(G.get(i).getText().equals(GE))
					 {
						 G.get(i).click();
						 break;
						 }
						}
						 Actions action = new Actions(Driver);
						    action.sendKeys(Keys.ESCAPE).build().perform();
						WebDriverWait wait1 = new WebDriverWait(Driver, 20);
						WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
						wait1.until(ExpectedConditions.elementToBeClickable(ele));
						ele.click();
						//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
					List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));
					 System.out.println(E.size());
						for(int i=0;i<E.size();i++)
						{
							System.out.println(E.get(i).getText());
					 if(E.get(i).getText().equals(ET))
					 {
				 		 E.get(i).click();
						break;
						 }
						}
						JavascriptExecutor ex = (JavascriptExecutor)Driver;
						ex.executeScript("arguments[0].click();", PayRate);
						EmployeeAssignment.click();
						 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
						 System.out.println(EmpAssign.size());
							for(int l=0;l<=EmpAssign.size()-1;l++)
							{
								System.out.println(EmpAssign.get(l).getText());
							}
							for(int k=0;k<EmpAssign.size();k++)
							{
						 if(EmpAssign.get(k).getText().equals(A))
						 {
							 EmpAssign.get(k).click();
							 break;
						 }
							}
							AddEntry.click();
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
								Confirm.click();
								Thread.sleep(1000);
								JavascriptExecutor R = (JavascriptExecutor)Driver;
								R.executeScript("arguments[0].click();", PayRate);
								JavascriptExecutor ex1 = (JavascriptExecutor)Driver;
								ex1.executeScript("arguments[0].click();", Edit);
								Thread.sleep(1000);
								JavascriptExecutor j = (JavascriptExecutor)Driver;
								j.executeScript("arguments[0].click();", Delete);
								Thread.sleep(2000);
								JavascriptExecutor t1 = (JavascriptExecutor)Driver;
								t1.executeScript("arguments[0].click();", AddEntry);
								SelectType.click();
								 List<WebElement> J1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
								 System.out.println(J1.size());
									for(int l=0;l<=J1.size()-1;l++)
									{
										System.out.println(J1.get(l).getText());
									}
									for(int k=0;k<J1.size();k++)
									{
								 if(J1.get(k).getText().equals(JT1))
								 {
									 J1.get(k).click();
									 break;
								 }
									}
									PayEffectiveDate.click();
									PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									PayEffectiveDate.sendKeys(PED1);
									PayEndDate.click();
									PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									PayEndDate.sendKeys(PD1);
									BaseRate.click();
									BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									BaseRate.sendKeys(BR1);
									OTRate.click();
									OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									OTRate.sendKeys(OT1);
									DTRate.click();
									DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									DTRate.sendKeys(DT1);
									FringeRate.click();
									FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									FringeRate.sendKeys(FR1);
									Confirm.click();
									Validations.click();
									//AddValidationDocument.click();
									AddDocumentRow.click();
									Drophere.click();
									String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
									try {
										Robot robot = new Robot();
										StringSelection Selection = new StringSelection(strSel);
										Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
											robot.setAutoDelay(2000);                                                                                
											robot.keyPress(KeyEvent.VK_CONTROL);
											robot.keyPress(KeyEvent.VK_V);
											robot.keyRelease(KeyEvent.VK_CONTROL);
											robot.keyRelease(KeyEvent.VK_V);
											robot.keyPress(KeyEvent.VK_ENTER);
											robot.keyRelease(KeyEvent.VK_ENTER);		
											
										} catch (AWTException e1) {
											// TODO Auto-generated catch block
											e1.printStackTrace();
									}
									Expires.click();
									Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
									Expires.sendKeys(Exp);
									ValidationConfirm.click();
									JavascriptExecutor te1 = (JavascriptExecutor)Driver;
									te1.executeScript("arguments[0].click();", Save);
					//System.out.println(UI);
				}
			}
			
			//Adding a New Employee
			
				else
				{
					System.out.println("Employee is not an Existing");
					
		if(Active.isSelected())	
		{
			System.out.println("On Project Toggle is selected");
		}
		else
		{
			System.out.println("On Project Toggle is not selected");
		}
		WebDriverWait t= new WebDriverWait(Driver, 40);
		WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
		t.until(ExpectedConditions.elementToBeClickable(ele1));
		ele1.click();
		WebDriverWait wait12 = new WebDriverWait(Driver, 40);
		 List<WebElement> G=Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
		 System.out.println(G.size());
			for(int i=0;i<G.size();i++)
			{
				System.out.println(G.get(i).getText());
		 if(G.get(i).getText().equals(GE))
		 {
			 G.get(i).click();
			 break;
			 }
			}
			 Actions action = new Actions(Driver);
			    action.sendKeys(Keys.ESCAPE).build().perform();
			WebDriverWait wait1 = new WebDriverWait(Driver, 20);
			WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
			wait1.until(ExpectedConditions.elementToBeClickable(ele));
			ele.click();
			//WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		List<WebElement> E=Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));
		 System.out.println(E.size());
			for(int i=0;i<E.size();i++)
			{
				System.out.println(E.get(i).getText());
		 if(E.get(i).getText().equals(ET))
		 {
			 E.get(i).click();
			break;
			 }
			}
		
		JavascriptExecutor executor5 = (JavascriptExecutor)Driver;
		executor5.executeScript("arguments[0].click();", Phone);
		Phone.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Phone.sendKeys(Ph);
		VeteranStatusToggle.click();
		//Address History
		AddressHistory.click();
		AddNew.click();
		Street1.click();
		Street1.sendKeys(SS1);
		AddressCancel.click();
		AddNew.click();
		Street1.click();
		Street1.sendKeys(SS1);
		Street2.click();
		Street2.sendKeys(SS2);
		City.click();
		City.sendKeys(SC);
		Country.click();
		 List<WebElement> country=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country.size());
			for(int l=0;l<=country.size()-1;l++)
			{
				System.out.println(country.get(l).getText());
	}
			for(int i=0;i<country.size();i++)
			{
		 if(country.get(i).getText().equals(SCO))
		 {
			 country.get(i).click();
			 }
			}
			State.click();
			 List<WebElement> state=Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
			 System.out.println(state.size());
				for(int l=0;l<=state.size()-1;l++)
				{
					System.out.println(state.get(l).getText());
				}
				for(int k=0;k<state.size();k++)
				{
			 if(state.get(k).getText().equals(SS))
			 {
				 state.get(k).click();
				 break;
			 }
				}
				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			JavascriptExecutor executor9 = (JavascriptExecutor)Driver;
			executor9.executeScript("arguments[0].click();", Zip);	
			WebDriverWait wai = new WebDriverWait(Driver, 40);
			WebElement ele10 = Driver.findElement(By.xpath("//input[@id='zip']"));
			wai.until(ExpectedConditions.elementToBeClickable(Zip));
			//Zip.click();
		Zip.sendKeys(SZ);
		JavascriptExecutor executor7 = (JavascriptExecutor)Driver;
		executor7.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(SE);
	    Add.click();
	    EditAddress.click();
	    JavascriptExecutor e7 = (JavascriptExecutor)Driver;
		e7.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(ESE1);
		Add.click();
		AddNew.click();
		//AddNew.click();
		Street1.click();
		Street1.sendKeys(S1);
		Street2.click();
		Street2.sendKeys(S2);
		City.click();
		City.sendKeys(SC1);
		Country.click();
		 List<WebElement> country1=Driver.findElements(By.xpath("//div[@id='menu-country']//following::ul//li"));
		 System.out.println(country1.size());
			for(int l=0;l<=country1.size()-1;l++)
			{
				System.out.println(country1.get(l).getText());
	}
			for(int i=0;i<country1.size();i++)
			{
		 if(country1.get(i).getText().equals(SCO1))
		 {
			 country1.get(i).click();
			 }
			}
			Province.click();
			 List<WebElement> state1=Driver.findElements(By.xpath("//div[@id='mui-component-select-province']//following::ul[2]//li"));
			 System.out.println(state1.size());
				for(int l=0;l<=state1.size()-1;l++)
				{
					System.out.println(state1.get(l).getText());
				}
				for(int k=0;k<state1.size();k++)
				{
			 if(state1.get(k).getText().equals(St))
			 {
				 state1.get(k).click();
				 break;
			 }
				}
				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			/*JavascriptExecutor exec = (JavascriptExecutor)Driver;
			exec.executeScript("arguments[0].click();", Zip;*/
			
				JavascriptExecutor executor10 = (JavascriptExecutor)Driver;
				executor10.executeScript("arguments[0].click();", Zip);	
				WebDriverWait wi = new WebDriverWait(Driver, 40);
				//WebElement ele10 = Driver.findElement(By.xpath("//input[@id='zip']"));
				wi.until(ExpectedConditions.elementToBeClickable(Zip));
				//Zip.click();
				Thread.sleep(1000);
			Zip.sendKeys(SZ1);
		JavascriptExecutor ex = (JavascriptExecutor)Driver;
		ex.executeScript("arguments[0].click();", EffectiveDate);
		 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		EffectiveDate.sendKeys(SE1);
	    Add.click();
	    //Work Info
	    WorkInfo.click();
	    JavascriptExecutor xe = (JavascriptExecutor)Driver;
		xe.executeScript("arguments[0].click();", HireDate);
	    HireDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		HireDate.sendKeys(HD);
		WebDriverWait wi1 = new WebDriverWait(Driver, 40);
		wi1.until(ExpectedConditions.elementToBeClickable(DateTerminated));
		DateTerminated.click();
		// DateTerminated.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		 Thread.sleep(1000);
		 DateTerminated.sendKeys(DDT);
		EmployeeStatus.click();
		 List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
		 System.out.println(EmpSta.size());
			for(int l=0;l<=EmpSta.size()-1;l++)
			{
				System.out.println(EmpSta.get(l).getText());
			}
			for(int k=0;k<EmpSta.size();k++)
			{
		 if(EmpSta.get(k).getText().equals(ES))
		 {
			 EmpSta.get(k).click();
			 break;
		 }
			}
		ApprenticeNumber.sendKeys(AN);
		//Union
		Union.click();
		AddMembershipbutton.click();
		SelectUnion.click();
		Thread.sleep(1000);
		 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
		 System.out.println(U.size());
			for(int l=0;l<=U.size()-1;l++)
			{
				System.out.println(U.get(l).getText());
			}
			for(int k=0;k<U.size();k++)
			{
		 if(U.get(k).getText().equals(UA))
		 {
			 U.get(k).click();
			 break;
		 }
			}
			StartDate.click();
			StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			StartDate.sendKeys(SD);
			EndDate.click();
			EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EndDate.sendKeys(ED);
			DeleteIcon.click();
			Thread.sleep(1000);
			AddMembershipbutton.click();
			SelectUnion.click();
			List<WebElement> U1=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
			System.out.println(U1.size());
			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			for(int n=0;n<=U1.size()-1;n++)
			{
				
			System.out.println(U1.get(n).getText());
			}


			if(Driver.findElement(By.xpath("//li/p[contains(text(),'"+UA1+"')]")).isDisplayed())
			{
			Driver.findElement(By.xpath("//li/p[contains(text(),'"+UA1+"')]")).click(); 
			//System.out.println("Success");
			}
				StartDate.click();
				StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				StartDate.sendKeys(SD1);
				EndDate.click();
				EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				EndDate.sendKeys(ED1);
				CustomField.click();
				EmployeeType.click();
				 List<WebElement> E1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
				 System.out.println(E1.size());
					for(int l=0;l<=E1.size()-1;l++)
					{
						System.out.println(E1.get(l).getText());
					}
					for(int k=0;k<E1.size();k++)
					{
				 if(E1.get(k).getText().equals(ET1))
				 {
					 E1.get(k).click();
					 break;
				 }
					}

		//PayRates
		//PayRate.click();
		JavascriptExecutor ex1 = (JavascriptExecutor)Driver;
		ex1.executeScript("arguments[0].click();", PayRate);
		EmployeeAssignment.click();
		 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
		 System.out.println(EmpAssign.size());
			for(int l=0;l<=EmpAssign.size()-1;l++)
			{
				System.out.println(EmpAssign.get(l).getText());
			}
			for(int k=0;k<EmpAssign.size();k++)
			{
		 if(EmpAssign.get(k).getText().equals(A))
		 {
			 EmpAssign.get(k).click();
			 break;
		 }
			}
			
			
			JavascriptExecutor F = (JavascriptExecutor)Driver;
			F.executeScript("arguments[0].click();", EmployeeFreeText);
			//EmployeeFreeText.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			Thread.sleep(1000);
			EmployeeFreeText.sendKeys(EF);
			JavascriptExecutor tee1 = (JavascriptExecutor)Driver;
			tee1.executeScript("arguments[0].click();", Save);
			JavascriptExecutor Ja1 = (JavascriptExecutor)Driver;
			Ja1.executeScript("arguments[0].click();", PayRate);
			//SaveEntry.click();
			Thread.sleep(2000);
			JavascriptExecutor Ad1 = (JavascriptExecutor)Driver;
			Ad1.executeScript("arguments[0].click();", AddEntry);
			//AddEntry.click();
			Thread.sleep(3000);
			JavascriptExecutor xe3 = (JavascriptExecutor)Driver;
			xe3.executeScript("arguments[0].click();", SelectType);
			Thread.sleep(4000);
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
				Confirm.click();
				Thread.sleep(1000);
				JavascriptExecutor Ja2 = (JavascriptExecutor)Driver;
				Ja2.executeScript("arguments[0].click();", PayRate);
				JavascriptExecutor ex2 = (JavascriptExecutor)Driver;
				ex2.executeScript("arguments[0].click();", Edit);
				Thread.sleep(1000);
				JavascriptExecutor j = (JavascriptExecutor)Driver;
				j.executeScript("arguments[0].click();", Delete);
				Thread.sleep(2000);
				JavascriptExecutor t1 = (JavascriptExecutor)Driver;
				t1.executeScript("arguments[0].click();", AddEntry);
				SelectType.click();
				 List<WebElement> J1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
				 System.out.println(J1.size());
					for(int l=0;l<=J1.size()-1;l++)
					{
						System.out.println(J1.get(l).getText());
					}
					for(int k=0;k<J1.size();k++)
					{
				 if(J1.get(k).getText().equals(JT1))
				 {
					 J1.get(k).click();
					 break;
				 }
					}
					PayEffectiveDate.click();
					PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					PayEffectiveDate.sendKeys(PED1);
					PayEndDate.click();
					PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					PayEndDate.sendKeys(PD1);
					BaseRate.click();
					BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					BaseRate.sendKeys(BR1);
					OTRate.click();
					OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					OTRate.sendKeys(OT1);
					DTRate.click();
					DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					DTRate.sendKeys(DT1);
					FringeRate.click();
					FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					FringeRate.sendKeys(FR1);
					Confirm.click();
					Validations.click();
					Thread.sleep(1000);
					//*AddValidationDocument.click();
					JavascriptExecutor Js1 = (JavascriptExecutor)Driver;
					Js1.executeScript("arguments[0].click();", AddDocumentRow);
					//AddDocumentRow.click();
					Drophere.click();
					String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp);
					ValidationConfirm.click();
					Thread.sleep(3000);
					Actions ac = new Actions(Driver);
					ac.moveToElement(ValidationEdit).build();
					ac.click(ValidationEdit).perform();
					ValidationDelete.click();
					Thread.sleep(1000);
						JavascriptExecutor te1 = (JavascriptExecutor)Driver;
					te1.executeScript("arguments[0].click();", AddDocumentRow);
					Thread.sleep(2000);
					//AddValidationDocument.click();
				
					//AddDocumentRow.click();
					ValidationConfirm.click();
					String I=Driver.findElement(By.xpath("//*[contains(text(),'upload')]")).getText();
					String US="Please upload a file before saving";
					if(I.contains(US))
					{
						System.out.println("Transition Message matches");
					}
					else
					{
						System.out.println("Transition Message not matches");
					}
					Thread.sleep(2000);
					Drophere.click();
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							/*robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							//robot.keyPress(KeyEvent.VK_ENTER);*/
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp1);
					ValidationConfirm.click();
					WebDriverWait i = new WebDriverWait(Driver, 90);
					i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
			    	Thread.sleep(3000);
					JavascriptExecutor te2 = (JavascriptExecutor)Driver;
					te2.executeScript("arguments[0].click();", Save);
					
				}
		}
	}
	
	public void ValidateAddEmployee(String FL,String fn,String Mi, String Ln,String S,String Ed, String GE,String ET,String Ph,
			String SS1,String SS2, String SC,String SCO, String SS, String SZ, String SE) throws InterruptedException
	{
		
		WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[2]"));
		Search.sendKeys(FL);
		Actions Em1=new Actions(Driver);
		WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]"));
		Em1.moveToElement(Emp1).build();
		Em1.click(Emp1).perform();
		FirstName.click();
		String FN=FirstName.getAttribute("value");
		if(FN.equals(fn))
		{
			System.out.println("First Name Matches");
		}
		else
		{
			System.out.println("First Name not Matches");
		}
		String MN=MiddleInitial.getAttribute("value");
		if(MN.equals(Mi))
		{
			System.out.println("Middle Initial Matches");
		}
		else
		{
			System.out.println("Middle Initial not Matches");
		}
		String LN=LastName.getAttribute("value");
		if(LN.equals(Ln))
		{
			System.out.println("Last Name Matches");
		}
		else
		{
			System.out.println("Last Name not Matches");
		}
		SSN.click();
		String SN=SSN.getAttribute("value");
		if(SN.equals(S))
		{
			System.out.println("SSN Matches");
		}
		else
		{
			System.out.println("SSN not Matches");
		}
		String EM=EmployeeId.getAttribute("value");
		EmployeeId.click();
		if(EM.equals(Ed))
		{
			System.out.println("EmployeeID Matches");
		}
		else
		{
			System.out.println("EmployeeID not Matches");
			
		}
		String G=GenderId.getText();
		if(G.equals(GE))
		{
			System.out.println("Gender Matches");
		}
		else
		{
			System.out.println("Gender not Matches");
			
		}
		String ETH=EthnicityId.getText();
		if(ETH.equals(ET))
		{
			System.out.println("Ethnicity Matches");
		}
		else
		{
			System.out.println("Ethnicity not Matches");
			
		}
		String PH=Phone.getAttribute("value");
		if(PH.equals(Ph))
		{
			System.out.println("Phone Matches");
		}
		else
		{
			System.out.println("Phone not Matches");
			
		}
			
		AddressHistory.click();
		Driver.findElement(By.xpath("//*[contains(text(),'"+SS1+"')]//following::button[1]")).click();		
		//EditAddress.click();
		Street1.click();
		String ST1=Street1.getAttribute("value");
		if(ST1.equals(SS1))
		{
			System.out.println("Address: Street1 Matches");
		}
		else
		{
			System.out.println("Address:Street1 not Matches");
		}
		Street2.click();
		String ST2=Street2.getAttribute("value");
		if(ST2.equals(SS2))
		{
			System.out.println("Address:Street2 Matches");
		}
		else
		{
			System.out.println("Address:Street2 not Matches");
			
		}
		City.click();
		String C=City.getAttribute("value");
		if(C.equals(SC))
		{
			System.out.println("Address:City Matches");
		}
		else
		{
			System.out.println("Address:City not Matches");
			
		}
		Actions A=new Actions(Driver);
		WebElement W=Driver.findElement(By.xpath("//input[@id='country']"));
		A.moveToElement(W).build();
		A.click(W).perform();
		
		String CO=W.getAttribute("value");
		if(CO.equals(SCO))
		{
			System.out.println("Address:Country Matches");
		}
		else
		{
			System.out.println("Address:Country not Matches");
			
		}
		Thread.sleep(1000);
		WebElement W1=Driver.findElement(By.xpath("//input[@id='state']"));
		A.moveToElement(W1).build();
		A.click(W1).perform();
		//Driver.findElement(By.xpath("//input[@id='state']")).click();
		String Sta=W1.getAttribute("value");
		if(Sta.equals(SS))
		{
			System.out.println("Address:State Matches");
		}
		else
		{
			System.out.println("Address:State not Matches");
			
		}
		Zip.click();
		
		String Z=Zip.getAttribute("value");
		if(Z.equals(SZ))
		{
			System.out.println("Address:Zip Code Matches");
		}
		else
		{
			System.out.println("Address:Zip Code not Matches");
			
		}
	EffectiveDate.click();
		
		String EED=EffectiveDate.getAttribute("value");
		if(EED.equals(SE))
		{
			System.out.println("Address:Effective Date Matches");
		}
		else
		{
			System.out.println("Address:Effective Date not Matches");
			
		}
		AddressCancel.click();
		
	}
	
	
	public void EditAddEmployee(String FL,String fn,String ESE1,String HD,String DDT,String ES,String SD,String ED,String ET1, String A,
			String JT,String PED,String PD,String BR,String OT,String DT,String FR,
			String Exp,String FND ) throws InterruptedException, IOException
	{
		
		WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[2]"));
		Search.sendKeys(FL);
		Thread.sleep(2000);
		Actions Em1=new Actions(Driver);
		WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]"));
		Em1.moveToElement(Emp1).build();
		Em1.click(Emp1).perform();
		//Driver.findElement(By.xpath("//*[contains(text(),'On Project')]//preceding::input[1]")).click();
		JavascriptExecutor exe1 = (JavascriptExecutor)Driver;
		exe1.executeScript("arguments[0].click();", FirstName);
		Thread.sleep(1000);
		FirstName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		Thread.sleep(1000);
		FirstName.sendKeys(fn);
		Driver.findElement(By.xpath("//*[contains(text(),'Veteran')]//preceding::input[1]")).click();
		AddressHistory.click();
		Thread.sleep(1000);
		EditAddress.click();
		 JavascriptExecutor e1 = (JavascriptExecutor)Driver;
			e1.executeScript("arguments[0].click();", EffectiveDate);
			 EffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EffectiveDate.sendKeys(ESE1);
			AddressUpdate.click();
		
		//WorkInfo
		 WorkInfo.click();
		    HireDate.click();
		    HireDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			HireDate.sendKeys(HD);
			DateTerminated.click();
			DateTerminated.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			 Thread.sleep(1000);
			 DateTerminated.sendKeys(DDT);
			Thread.sleep(2000);
			EmployeeStatus.click();
			 List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
			 System.out.println(EmpSta.size());
				for(int l=0;l<=EmpSta.size()-1;l++)
				{
					System.out.println(EmpSta.get(l).getText());
				}
				for(int k=0;k<EmpSta.size();k++)
				{
			 if(EmpSta.get(k).getText().equals(ES))
			 {
				 EmpSta.get(k).click();
				 break;
			 }
				}
				
			//Union
			Union.click();
			//AddMembershipbutton.click();
		/*	SelectUnion.click();
			 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
			 System.out.println(U.size());
				for(int k=0;k<U.size();k++)
				{
			 if(U.get(k).getText().equals(UA))
			 {
				 U.get(k).click();
				 break;
			 }
				}*/
				StartDate.click();
				StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				StartDate.sendKeys(SD);
				EndDate.click();
				EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				EndDate.sendKeys(ED);
				Thread.sleep(1000);
				CustomField.click();
				EmployeeType.click();
				 List<WebElement> E1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
				 System.out.println(E1.size());
					for(int l=0;l<=E1.size()-1;l++)
					{
						System.out.println(E1.get(l).getText());
					}
					for(int k=0;k<E1.size();k++)
					{
				 if(E1.get(k).getText().equals(ET1))
				 {
					 E1.get(k).click();
					 break;
				 }
					}
			//PayRates
			//PayRate.click();
			JavascriptExecutor ex = (JavascriptExecutor)Driver;
			ex.executeScript("arguments[0].click();", PayRate);
			EmployeeAssignment.click();
			 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
			 System.out.println(EmpAssign.size());
				for(int l=0;l<=EmpAssign.size()-1;l++)
				{
					System.out.println(EmpAssign.get(l).getText());
				}
				for(int k=0;k<EmpAssign.size();k++)
				{
			 if(EmpAssign.get(k).getText().equals(A))
			 {
				 EmpAssign.get(k).click();
				 break;
			 }
				}
				Thread.sleep(3000);
				//SaveEntry.click();
				AddEntry.click();
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
					Confirm.click();
					Thread.sleep(1000);
						Validations.click();
						//AddValidationDocument.click();
						ValidationEdit.click();
						Expires.click();
						Thread.sleep(1000);
						Expires.sendKeys(Keys.BACK_SPACE);
						Thread.sleep(1000);
						Expires.sendKeys(Exp);
						
						//AddValidationDocument.click();
						
						ValidationConfirm.click();
						WebDriverWait i = new WebDriverWait(Driver, 60);
						i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
						Save.click();
				    	Thread.sleep(3000);
				    	Driver.findElement(By.xpath("(//*[contains(text(),'Employees')])[4]")).click();
						WebDriverWait wai = new WebDriverWait(Driver, 60);
						wai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()[contains(.,'"+FND+"')]]")));
						WebElement Search1=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[2]"));
						Search1.sendKeys(FND);
						Actions Em2=new Actions(Driver);
						WebElement Emp2=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FND+"')]]"));
						Em2.moveToElement(Emp2).build();
						Em2.click(Emp2).perform();
						DeleteEmployee.click();
						Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[1]")).click();
	}
public void EmployeeManagementDDNVerification(String SL,String AT, String V, String AP,String DGE,String DE, String DC1,String ST1,String ST2,String W,
		String L,String SU,String T) throws InterruptedException
{
	
	Thread.sleep(9000);
	Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[1]")).click();
	Driver.findElement(By.xpath("//*[contains(text(),'Out of Compliance')]")).click();
	Driver.navigate().back();
	Thread.sleep(1000);
	Driver.navigate().forward();
	String At="Show All";
	String AA=Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[1]//Option[1]")).getText();
	System.out.println(AA);
	if(AA.equals(At))
	{
		System.out.println("Default value is seen.");
	}
	else
	{
		System.out.println("Previously selected value is persisting");
	}
	Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[1]")).click();
		WebElement AttentionDropDown = Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[1]"));  
	Select dropdown = new Select(AttentionDropDown); 
	String[] r = AT.split("!"); 
	int co =0;
	boolean ss1;
    java.util.List<WebElement> options = dropdown.getOptions();  
    
   
    for(WebElement item:options)  

    {  
    	ss1=false;
for(String A:r)
	
	{
	
	if (A.contains(item.getText()))
	
         {
		System.out.println("Attention value:"+item.getText());
       	  co = co +1;
       	 ss1=true;
		  if(co==3) 
			{
				 System.out.println("Attention value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!ss1) 
	{
		System.out.println("Attention value:"+ item.getText());
		System.out.println("Attention valu:Not Matches");
	} 
    }

    	  
    
    Actions at = new Actions(Driver);
    at.sendKeys(Keys.ESCAPE).build().perform();
    Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[2]")).click();
	WebElement Validated = Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[2]"));  
	Select DD = new Select(Validated); 
	String[] VA = V.split("!"); 
	int cou =0;
	boolean ss2;
    java.util.List<WebElement> options1 = DD.getOptions();  
    
   
    for(WebElement item:options1)  

    {  
    	ss2=false;
for(String A:VA)
	
	{
	
	if (A.contains(item.getText()))
	
         {
		System.out.println("Validated value:"+item.getText());
       	  cou = cou +1;
       	 ss2=true;
		  if(cou==3) 
			{
				 System.out.println("Validated value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!ss2) 
	{
		System.out.println("Validated value:"+ item.getText());
		System.out.println("Validated value:Not Matches");
	} 
    }
    Actions at1 = new Actions(Driver);
    at1.sendKeys(Keys.ESCAPE).build().perform();
    Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[3]")).click();
 	WebElement AssignedProject = Driver.findElement(By.xpath("//*[contains(text(),'Attention')]//following::select[3]"));  
 	Select AP1 = new Select(AssignedProject); 
 	String[] AP2 = AP.split("!"); 
 	int cou1 =0;
 	boolean ss3;
     java.util.List<WebElement> options3 = AP1.getOptions();  
     
    
     for(WebElement item:options3)  

     {  
     	ss3=false;
 for(String A:AP2)
 	
 	{
 	
 	if (A.contains(item.getText()))
 	
          {
 		System.out.println("Assigned to Project value:"+item.getText());
        	  cou1 = cou1 +1;
        	 ss3=true;
 		  if(cou1==3) 
 			{
 				 System.out.println("Assigned to Project value: Matches");
 			}
 		 break;
 	  }
 	 
 	   }
 	
 	if(!ss3) 
 	{
 		System.out.println("Assigned to Project value:"+ item.getText());
 		System.out.println("Assigned to Project value:Not Matches");
 	} 
     }
      
      Actions at2 = new Actions(Driver);
      at2.sendKeys(Keys.ESCAPE).build().perform();
	/*WebDriverWait wait = new WebDriverWait(Driver, 90);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'+ Add Employee')]")));*/
	AddEmployee.click();
	WebDriverWait t= new WebDriverWait(Driver, 40);
	WebElement ele1 = Driver.findElement(By.xpath("//div[@id='mui-component-select-genderId']"));
	t.until(ExpectedConditions.elementToBeClickable(ele1));
	ele1.click();


	
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	List<WebElement> GE= Driver.findElements(By.xpath("//div[@id='mui-component-select-genderId']//following::ul[2]//li"));
	System.out.println(GE.size());
	String[] arr1 = DGE.split("!"); 
	 boolean strFlag1; 
	 int count1=0;
    for(int i=0;i<GE.size();i++)
	{
    	strFlag1 = false;
    	for (String OG : arr1) 
		   {
  if(GE.get(i).getText().equals(OG))
  {
	  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		  System.out.println("Gender value:"+GE.get(i).getText());
		  strFlag1=true;
		  count1=count1+1;
		  if(count1==4) 
			{
				 System.out.println("Gender value: Matches");
			}
		 break;
	  }
	 
	   }
	
	if(!strFlag1) 
	{
		System.out.println("Gender value:"+ GE.get(i).getText());
		System.out.println("Gender value:Not Matches");
	}
	}
  
		 Actions action = new Actions(Driver);
		    action.sendKeys(Keys.ESCAPE).build().perform();
		WebDriverWait wait1 = new WebDriverWait(Driver, 20);
		WebElement ele = Driver.findElement(By.xpath("//div[@id='mui-component-select-ethnicityId']"));
		wait1.until(ExpectedConditions.elementToBeClickable(ele));
		ele.click();
List<WebElement> E= Driver.findElements(By.xpath("//div[@id='mui-component-select-ethnicityId']//following::ul[2]//li"));		
		System.out.println(E.size());
		String[] arr = DE.split("!"); 
		   boolean strFlag;
		   int count=0;
		   for(int i=0;i<E.size();i++)
			{
		    	strFlag = false;
		    	for (String G : arr) 
				   {
		  if(E.get(i).getText().equals(G))
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
	    	 Actions act = new Actions(Driver);
			    act.sendKeys(Keys.ESCAPE).build().perform();
	    	AddressHistory.click();
		AddNew.click();
		Country.click();
		List<WebElement> CO= Driver.findElements(By.xpath("//div[@id='mui-component-select-country']//following::ul[2]//li"));
		System.out.println(CO.size());
		String[] a1 = DC1.split("!"); 
		boolean s1; 
		int c1=0;
		for(int i1=0;i1<CO.size();i1++)
		{
		s1 = false;
		for (String e1 : a1) 
		   {
		if(CO.get(i1).getText().equals(e1))
		{
		Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		  System.out.println("Country value:"+CO.get(i1).getText());
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
		System.out.println("Country value:"+ CO.get(i1).getText());
		System.out.println("Country value:Not Matches");
		}
		}
		Actions action2 = new Actions(Driver);
		action2.sendKeys(Keys.ESCAPE).build().perform();
		 State.click();
			List<WebElement> ST= Driver.findElements(By.xpath("//div[@id='mui-component-select-state']//following::ul[2]//li"));
			System.out.println(ST.size());
			String[] a2 = ST1.split("!"); 
			boolean s2; 
			int c2=0;
			for(int i1=0;i1<ST.size();i1++)
			{
			s2 = false;
			for (String e2 : a2) 
			   {
			//System.out.println(Pro); 
			//System.out.println("Gender value:"+GE.get(i).getText());
			if(ST.get(i1).getText().equals(e2))
			{
			Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
			  System.out.println("State value:"+ST.get(i1).getText());
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
			System.out.println("State value:"+ ST.get(i1).getText());
			System.out.println("State value:Not Matches");
			}
			}
			Actions N = new Actions(Driver);
			N.sendKeys(Keys.ESCAPE).build().perform();
	    Thread.sleep(1000);
	   /* JavascriptExecutor executor2 = (JavascriptExecutor)Driver;
		executor2.executeScript("arguments[0].click();", Country);*/
		
		Country.click();
		WebElement Ca=Driver.findElement(By.xpath("//*[contains(text(),'Canada')]"));
		if(Ca.isDisplayed())
	     {
	    	Ca.click(); 
	     }
			Province.click();
				List<WebElement> PST= Driver.findElements(By.xpath("//div[@id='mui-component-select-province']//following::ul[2]//li"));
				System.out.println(PST.size());
				String[] a3 = ST2.split("!"); 
				boolean s3; 
				int c3=0;
				for(int i2=0;i2<PST.size();i2++)
				{
				s3 = false;
				for (String e2 : a3) 
				   {
				//System.out.println(Pro); 
				//System.out.println("Gender value:"+GE.get(i).getText());
				if(PST.get(i2).getText().equals(e2))
				{
				Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				  System.out.println("Province value:"+PST.get(i2).getText());
				  s3=true;
				  c3=c3+1;
				  if(c3==14) 
					{
						 System.out.println("Province value: Matches");
					}
				 break;
				}

				}

				if(!s3) 
				{
				System.out.println("Province value:"+ PST.get(i2).getText());
				System.out.println("Province value:Not Matches");
				}
				}
				Actions can=new Actions(Driver);
			 	can.moveToElement(AddressCancel).build();
			 	can.click(AddressCancel).perform();
			 	AddressCancel.click();
WorkInfo.click();
EmployeeStatus.click();
List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
System.out.println(EmpSta.size());
String[] WI = W.split("!"); 
boolean ES; 
int C=0;
for(int i3=0;i3<EmpSta.size();i3++)
{
ES = false;
for (String e1 : WI) 
   {
//System.out.println(Pro); 
//System.out.println("Gender value:"+GE.get(i).getText());
if(EmpSta.get(i3).getText().equals(e1))
{
Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
  System.out.println("Employment Status value:"+EmpSta.get(i3).getText());
  ES=true;
  C=C+1;
  if(C==3) 
	{
		 System.out.println("Employment Status value: Matches");
	}
 break;
}

}

if(!ES) 
{
System.out.println("Employment Status value:"+ EmpSta.get(i3).getText());
System.out.println("Employment Status value:Not Matches");
}
}
JavascriptExecutor ex = (JavascriptExecutor)Driver;
ex.executeScript("arguments[0].click();", PayRate);
EmployeeAssignment.click();
 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
 System.out.println(EmpAssign.size());
 String[] EAL = L.split("!"); 
 boolean EA; 
 int A=0;
 for(int i4=0;i4<EmpAssign.size();i4++)
 {
 EA = false;
 for (String e1 : EAL) 
    {
 //System.out.println(Pro); 
 //System.out.println("Gender value:"+GE.get(i).getText());
 if(EmpAssign.get(i4).getText().equals(e1))
 {
 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
   System.out.println("Employment Assignment Lookup 2 value:"+EmpAssign.get(i4).getText());
   EA=true;
   A=A+1;
   if(A==4) 
 	{
 		 System.out.println("Employment Assignment Lookup 2 value: Matches");
 	}
  break;
 }

 }

 if(!EA) 
 {
 System.out.println("Employment Assignment Lookup 2 value:"+ EmpAssign.get(i4).getText());
 System.out.println("Employment Assignment Lookup 2 value:Not Matches");
 }
 }
 Actions D = new Actions(Driver);
	D.sendKeys(Keys.ESCAPE).build().perform();
Thread.sleep(1000);
 Union.click();
	AddMembershipbutton.click();
	SelectUnion.click();
	 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
	 System.out.println(U.size());
	 String[] UN = SU.split("!"); 
	 boolean S; 
	 int u=0;
	 for(int i5=0;i5<U.size();i5++)
	 {
	 S= false;
	 for (String e1 : UN) 
	    {
	 //System.out.println(Pro); 
	 //System.out.println("Gender value:"+GE.get(i).getText());
	 if(U.get(i5).getText().equals(e1))
	 {
	 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	   System.out.println("Select a Union value:"+U.get(i5).getText());
	   S=true;
	   u=u+1;
	   if(u==5) 
	 	{
	 		 System.out.println("Select a Union value: Matches");
	 	}
	  break;
	 }

	 }

	 if(!S) 
	 {
	 System.out.println("Select a Union value:"+ U.get(i5).getText());
	 System.out.println("Select a Union value:Not Matches");
	 }
	 }
	 Actions Di = new Actions(Driver);
		Di.sendKeys(Keys.ESCAPE).build().perform();
	Thread.sleep(1000);
	DeleteIcon.click();
	 CustomField.click();
		EmployeeType.click();
		 List<WebElement> ET1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
		 System.out.println(ET1.size());
		 String[] ET2 = T.split("!"); 
		 boolean EY; 
		 int y=0;
		 for(int i6=0;i6<ET1.size();i6++)
		 {
		 EY = false;
		 for (String e1 : ET2) 
		    {
		 //System.out.println(Pro); 
		 //System.out.println("Gender value:"+GE.get(i).getText());
		 if(ET1.get(i6).getText().equals(e1))
		 {
		 Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
		   System.out.println("Employee Type value:"+ET1.get(i6).getText());
		   EY=true;
		   y=y+1;
		   if(y==5) 
		 	{
		 		 System.out.println("Employee Type value: Matches");
		 	}
		  break;
		 }

		 }

		 if(!EY) 
		 {
		 System.out.println("Employee Type value:"+ ET1.get(i6).getText());
		 System.out.println("Employee Type value:Not Matches");
		 }
		 }
		 Actions D1 = new Actions(Driver);
			D1.sendKeys(Keys.ESCAPE).build().perform();
		 ImportEmployee.click();
			SelectLayout.click();
			List<WebElement> SelectLayout1= Driver.findElements(By.xpath("//div[@id='mui-component-select-selectedImportId']//following::ul[2]//li"));
			System.out.println(SelectLayout1.size());
			String[] al1 = SL.split("!"); 
			 boolean sl1; 
			 int co1=0;
		    for(int i=0;i<SelectLayout1.size();i++)
			{
		    	sl1 = false;
		    	for (String OG : al1) 
				   {
		  if(SelectLayout1.get(i).getText().equals(OG))
		  {
			  Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
				  System.out.println("Layout Name value:"+SelectLayout1.get(i).getText());
				  sl1=true;
				  co1=co1+1;
				  if(co1==4) 
					{
						 System.out.println("Layout Name value: Matches");
					}
				 break;
			  }
			 
			   }
			
			if(!sl1) 
			{
				System.out.println("Layout Name value:"+ SelectLayout1.get(i).getText());
				System.out.println("Layout Name value:Not Matches");
			}
			}
			
}
public void ImportEmployeesPageImageVerification() throws IOException, AWTException
{
	ImportEmployee.click();
	BufferedImage expectedImage = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ImportEmployees.png"));
	Screenshot ImageScreenshot= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	ImageIO.write(ImageScreenshot.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ImportEmployees.png"));
	BufferedImage actualImage = ImageScreenshot.getImage();
ImageDiffer imgdiffer = new ImageDiffer();
	   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImage, actualImage);
	if(imgdiff.hasDiff()==true)
	{
		System.out.println("Employee Management T1 Page: Import Employees Images are not same");
	}
	else
	{
	System.out.println("Employee Management T1 Page: Import Employees Images are same");
		}
}

public void ImportEmployees() throws InterruptedException
{
	ImportEmployee.click();
	SelectLayout.click();
	WebDriverWait wait1 = new WebDriverWait(Driver, 30);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Template Employee')]")));
	WebElement Wb1=Driver.findElement(By.xpath("//*[contains(text(),'Template Employee')]"));
	Actions A1=new Actions(Driver);
	A1.moveToElement(Wb1).build();
	A1.click(Wb1).perform();
	String ImportFile="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\skillsmart-employee-template.xlsx";
	Drophere.click();
	try {
		Robot robot = new Robot();
		StringSelection Selection = new StringSelection(ImportFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			robot.setAutoDelay(2000);                                                                                
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}
	Actions A=new Actions(Driver);
	A.moveToElement(TestImportbutton).build();
	A.click(TestImportbutton).perform();
	String TestImport="No import conflicts, click the import button to the right to proceed.";
	WebElement Transition2=Driver.findElement(By.xpath("//*[contains(text(),'conflicts')]"));
	String UI1=Transition2.getText();
System.out.println(UI1);
//String St1="We have located this employee in our Database and have pre-populated some fields for you.";
	if(TestImport.equals(UI1))
	{
		System.out.println("Alert Message Matches");
		System.out.println("There is no Import Conflicts.");
	}
	else
	{
		System.out.println("Alert Message not Matches");
	}
Importbutton.click();	
}


public void ValidateImportedEmployee(String FN,String Mi, String Ln,String S,String Ed,
		String SS1,String SS2, String SC, String SS, String SZ,String GE,String ET,String Ph1) throws InterruptedException
{
	AttentionSelect.click();
	Driver.findElement(By.xpath("//*[contains(text(),'Needs a Wage')]")).click();
	if(Driver.findElement(By.xpath("//*[text()[contains(.,'"+FN+"')]]")).isDisplayed()) 
	{
		System.out.println(FN);
		System.out.println("Attention: No Wages Employees are returning correctly");
	}
	else
	{
		System.out.println("Attention: No Wages Employees are not returning correctly");
	}
	Validated.click();
	Driver.findElement(By.xpath("(//*[contains(text(),'Not Validated')])")).click();
	if(Driver.findElement(By.xpath("//*[text()[contains(.,'"+FN+"')]]")).isDisplayed()) 
	{
		System.out.println(FN);
		System.out.println("Not Validated Employees are returning correctly");
	}
	else
	{
		System.out.println("Not Validated Employees are returning incorrectly");
	}
	
	AssignedToProject.click();
	Driver.findElement(By.xpath("(//*[contains(text(),'Not Assigned')])")).click();
	if(Driver.findElement(By.xpath("//*[text()[contains(.,'"+FN+"')]]")).isDisplayed()) 
	{
		System.out.println(FN);
		System.out.println("Employee Not Assigned to Project is returning correctly");
	}
	else
	{
		System.out.println("Employee Not Assigned to Project is returning incorrectly");
	}
	
	WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[1]"));
	Search.sendKeys(FN);
	Thread.sleep(2000);
	Actions Em1=new Actions(Driver);
	WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FN+"')]]"));
	Em1.moveToElement(Emp1).build();
	Em1.click(Emp1).perform();
	String FN1=FirstName.getAttribute("value");
	if(FN1.equals(FN))
	{
		System.out.println("First Name Matches");
	}
	else
	{
		System.out.println("First Name not Matches");
	}
	String MN=MiddleInitial.getAttribute("value");
	if(MN.equals(Mi))
	{
		System.out.println("Middle Initial Matches");
	}
	else
	{
		System.out.println("Middle Initial not Matches");
	}
	String LN=LastName.getAttribute("value");
	if(LN.equals(Ln))
	{
		System.out.println("Last Name Matches");
	}
	else
	{
		System.out.println("Last Name not Matches");
	}
	SSN.click();
	String SN=SSN.getAttribute("value");
	if(SN.equals(S))
	{
		System.out.println("SSN Matches");
	}
	else
	{
		System.out.println("SSN not Matches");
	}
	String EM=EmployeeId.getAttribute("value");
	EmployeeId.click();
	if(EM.equals(Ed))
	{
		System.out.println("EmployeeID Matches");
	}
	else
	{
		System.out.println("EmployeeID not Matches");
		
	}

		
	AddressHistory.click();
	Driver.findElement(By.xpath("//*[contains(text(),'"+SS1+"')]//following::button[1]")).click();		
	//EditAddress.click();
	Street1.click();
	String ST1=Street1.getAttribute("value");
	if(ST1.equals(SS1))
	{
		System.out.println("Address: Street1 Matches");
	}
	else
	{
		System.out.println("Address:Street1 not Matches");
	}
	Street2.click();
	String ST2=Street2.getAttribute("value");
	if(ST2.equals(SS2))
	{
		System.out.println("Address:Street2 Matches");
	}
	else
	{
		System.out.println("Address:Street2 not Matches");
		
	}
	City.click();
	String C=City.getAttribute("value");
	if(C.equals(SC))
	{
		System.out.println("Address:City Matches");
	}
	else
	{
		System.out.println("Address:City not Matches");
		
	}
	Actions A=new Actions(Driver);
	
	Thread.sleep(1000);
	WebElement W1=Driver.findElement(By.xpath("//input[@id='state']"));
	A.moveToElement(W1).build();
	A.click(W1).perform();
	//Driver.findElement(By.xpath("//input[@id='state']")).click();
	String Sta=W1.getAttribute("value");
	if(Sta.equals(SS))
	{
		System.out.println("Address:State Matches");
	}
	else
	{
		System.out.println("Address:State not Matches");
		
	}
	Actions A1=new Actions(Driver);
	WebElement W2=Driver.findElement(By.xpath("//input[@id='zip']"));
	A1.moveToElement(W1).build();
	A1.click(W2).perform();
	//Zip.click();
	String Z=Zip.getAttribute("value");
	if(Z.equals(SZ))
	{
		System.out.println("Address:Zip Code Matches");
	}
	else
	{
		System.out.println("Address:Zip Code not Matches");
		
	}
	
	AddressCancel.click();
	Thread.sleep(1000);
	Driver.findElement(By.xpath("(//*[contains(text(),'History')])[1]//preceding::button[1]")).click();
	String G=GenderId.getText();
	if(G.equals(GE))
	{
		System.out.println("Gender Matches");
	}
	else
	{
		System.out.println("Gender not Matches");
		
	}
	String ETH=EthnicityId.getText();
	if(ETH.equals(ET))
	{
		System.out.println("Ethnicity Matches");
	}
	else
	{
		System.out.println("Ethnicity not Matches");
		
	}
	String PH=Phone.getAttribute("value");
	if(PH.equals(Ph1))
	{
		System.out.println("Phone Matches");
	}
	else
	{
		System.out.println("Phone not Matches");
		
	}
	
	
    
}


public void ImportEditAddEmployee(String FL,String HD,String DDT,String ES,String AN,
		String ET1, String A,
		String JT,String PED,String PD,String BR,String OT,String DT,String FR,
		String Exp,String FL1,String ET2,String A1,
		String JT1,String PED1,String PD1,String BR1,String OT1,String DT1,String FR1,String FL2) throws InterruptedException, IOException
{
	//String UA,String SD,String ED
	WebElement Search=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[2]"));
	Search.sendKeys(FL);
	Thread.sleep(2000);
	Actions Em1=new Actions(Driver);
	WebElement Emp1=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]"));
	Em1.moveToElement(Emp1).build();
	Em1.click(Emp1).perform();

	Driver.findElement(By.xpath("//*[contains(text(),'Veteran')]//preceding::input[1]")).click();
	//WorkInfo
	 WorkInfo.click();
	    HireDate.click();
	    HireDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		HireDate.sendKeys(HD);
		DateTerminated.click();
		DateTerminated.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
		 Thread.sleep(1000);
		 DateTerminated.sendKeys(DDT);
		Thread.sleep(2000);
		EmployeeStatus.click();
		 List<WebElement> EmpSta=Driver.findElements(By.xpath("//div[@id='mui-component-select-employmentStatusId']//following::ul[2]//li"));
		 System.out.println(EmpSta.size());
			for(int l=0;l<=EmpSta.size()-1;l++)
			{
				System.out.println(EmpSta.get(l).getText());
			}
			for(int k=0;k<EmpSta.size();k++)
			{
		 if(EmpSta.get(k).getText().equals(ES))
		 {
			 EmpSta.get(k).click();
			 break;
		 }
			}
			ApprenticeNumber.click();
			ApprenticeNumber.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			ApprenticeNumber.sendKeys(AN);
		//Union
		Union.click();
		/*AddMembershipbutton.click();
		Thread.sleep(1000);
		SelectUnion.click();
		 List<WebElement> U=Driver.findElements(By.xpath("//*[contains(text(),'Select a Union')]//following::ul[2]//li"));
		 System.out.println(U.size());
			for(int k=0;k<U.size();k++)
			{
		 if(U.get(k).getText().equals(UA))
		 {
			 U.get(k).click();
			 break;
		 }
			}
			StartDate.click();
			StartDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			StartDate.sendKeys(SD);
			Thread.sleep(1000);
			EndDate.click();
			EndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
			EndDate.sendKeys(ED);*/
			Thread.sleep(1000);
			CustomField.click();
			EmployeeType.click();
			 List<WebElement> E1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
			 System.out.println(E1.size());
				for(int l=0;l<=E1.size()-1;l++)
				{
					System.out.println(E1.get(l).getText());
				}
				for(int k=0;k<E1.size();k++)
				{
			 if(E1.get(k).getText().equals(ET1))
			 {
				 E1.get(k).click();
				 break;
			 }
				}
				
		//PayRates
		//PayRate.click();
		JavascriptExecutor ex = (JavascriptExecutor)Driver;
		ex.executeScript("arguments[0].click();", PayRate);
		Thread.sleep(1000);
		WebElement On=Driver.findElement(By.xpath("//*[contains(text(),'On Project')]//preceding::input[1]"));
		JavascriptExecutor Pr1= (JavascriptExecutor)Driver;
		Pr1.executeScript("arguments[0].click();", On);
		JavascriptExecutor xe1 = (JavascriptExecutor)Driver;
		xe1.executeScript("arguments[0].click();", PayRate);
		
		EmployeeAssignment.click();
		 List<WebElement> EmpAssign=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
		 System.out.println(EmpAssign.size());
			/*for(int l=0;l<=EmpAssign.size()-1;l++)
			{
				System.out.println(EmpAssign.get(l).getText());
			}*/
			for(int k=0;k<EmpAssign.size();k++)
			{
				Thread.sleep(1000);
		 if(EmpAssign.get(k).getText().equals(A))
		 {
			 System.out.println(A);
			 EmpAssign.get(k).click();
			 break;
		 }
			}
			//Thread.sleep(1000);
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
				Thread.sleep(1000);
				JavascriptExecutor n1 = (JavascriptExecutor)Driver;
				n1.executeScript("arguments[0].click();", Confirm);
				//Confirm.click();
				JavascriptExecutor xe2 = (JavascriptExecutor)Driver;
				xe2.executeScript("arguments[0].click();", PayRate);
				if(Driver.findElement(By.xpath("//*[contains(text(),'This rate')]")).isDisplayed())
				{
					System.out.println("Non-Complaince Alert is seen");
					WebElement W=Driver.findElement(By.xpath("//*[contains(text(),'This rate')]"));
					String S=W.getText();
					String Ex="This rate is not in compliance";
					if(Ex.equals(S))
					{
						System.out.println("Alert message matches");
						Driver.findElement(By.xpath("(//*[contains(text(),'compliance')]//following::button[1])")).click();
					}
					else
					{
						System.out.println("Alert message not matches");
					}
				}
				else
				{
					System.out.println("Non-Compliance Alert is not seen");
				}
				
					
				Thread.sleep(1000);
				WebDriverWait i = new WebDriverWait(Driver, 60);
				i.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
					Validations.click();
					Thread.sleep(1000);
					//AddValidationDocument.click();
					Actions Ad=new Actions(Driver);
					Ad.moveToElement(AddDocumentRow).build();
					Ad.click(AddDocumentRow).perform();
					//AddDocumentRow.click();
					Drophere.click();
					String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\347.pdf";
					try {
						Robot robot = new Robot();
						StringSelection Selection = new StringSelection(strSel);
						Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
							robot.setAutoDelay(2000);                                                                                
							robot.keyPress(KeyEvent.VK_CONTROL);
							robot.keyPress(KeyEvent.VK_V);
							robot.keyRelease(KeyEvent.VK_CONTROL);
							robot.keyRelease(KeyEvent.VK_V);
							robot.keyPress(KeyEvent.VK_ENTER);
							robot.keyRelease(KeyEvent.VK_ENTER);		
							
						} catch (AWTException e1) {
							// TODO Auto-generated catch block
							e1.printStackTrace();
					}
					Expires.click();
					Expires.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
					Expires.sendKeys(Exp);
					ValidationConfirm.click();
					WebDriverWait i1 = new WebDriverWait(Driver, 60);
					i1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(),'Save')])[1]")));
			    	Thread.sleep(3000);
			    	JavascriptExecutor te1 = (JavascriptExecutor)Driver;
					te1.executeScript("arguments[0].click();", Save);
					Thread.sleep(3000);
					ViewAllEmployees.click();
					//Non Compliance Verification
					JavascriptExecutor ten2 = (JavascriptExecutor)Driver;
					ten2.executeScript("arguments[0].click();", AttentionSelect);
					Thread.sleep(1000);
					Driver.findElement(By.xpath("//*[contains(text(),'Out of Compliance')]")).click();
					Thread.sleep(1000);
					if(Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]")).isDisplayed()) 
					{
						System.out.println(FL);
						System.out.println("Attention:Out of Compliance Employees are returning correctly");
					}
					else
					{
						System.out.println("Attention:Out of Compliance Employees are not returning correctly");
					}
					AssignedToProject.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Assigned')])[2]")).click();
					if(Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL+"')]]")).isDisplayed()) 
					{
						System.out.println(FL);
						System.out.println("Employee Assigned to Project is returning correctly");
					}
					else
					{
						System.out.println("Employee Assigned to Project is returning incorrectly");
					}
					AttentionSelect.click();
					Driver.findElement(By.xpath("//*[contains(text(),'Show')]")).click();
					Thread.sleep(2000);
					AssignedToProject.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Show')])")).click();
					AssignedToProject.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Show All')])[3]")).click();
					Thread.sleep(1000);
					WebElement Search1=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[2]"));
					Search1.sendKeys(FL1);
					Thread.sleep(2000);
					Actions Em2=new Actions(Driver);
					WebElement Emp2=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL1+"')]]"));
					Em2.moveToElement(Emp1).build();
					Em2.click(Emp2).perform();
					CustomField.click();
					EmployeeType.click();
					 List<WebElement> E2=Driver.findElements(By.xpath("//div[@id='mui-component-select-10011']//following::ul[2]//li"));
					 System.out.println(E2.size());
						for(int l=0;l<=E2.size()-1;l++)
						{
							System.out.println(E2.get(l).getText());
						}
						for(int k=0;k<E2.size();k++)
						{
					 if(E2.get(k).getText().equals(ET2))
					 {
						 E2.get(k).click();
						 break;
					 }
						}
						JavascriptExecutor ex1 = (JavascriptExecutor)Driver;
						ex1.executeScript("arguments[0].click();", PayRate);
						Thread.sleep(1000);
						WebElement On1=Driver.findElement(By.xpath("//*[contains(text(),'On Project')]//preceding::input[1]"));
						JavascriptExecutor Pr2= (JavascriptExecutor)Driver;
						Pr1.executeScript("arguments[0].click();", On1);
						Thread.sleep(1000);	
						
					//Driver.findElement(By.xpath("//*[contains(text(),'Veteran')]//preceding::input[1]")).click();
					
						//PayRates
						//PayRate.click();
					
						EmployeeAssignment.click();
						 List<WebElement> EmpAssign1=Driver.findElements(By.xpath("//div[@id='mui-component-select-10019']//following::ul[2]//li"));
						 System.out.println(EmpAssign1.size());
							for(int l=0;l<=EmpAssign1.size()-1;l++)
							{
								System.out.println(EmpAssign1.get(l).getText());
							}
							for(int k=0;k<EmpAssign1.size();k++)
							{
						 if(EmpAssign1.get(k).getText().equals(A1))
						 {
							 EmpAssign1.get(k).click();
							 break;
						 }
							}
							AddEntry.click();
							Thread.sleep(3000);
							JavascriptExecutor x1 = (JavascriptExecutor)Driver;
							x1.executeScript("arguments[0].click();", SelectType);
							Thread.sleep(2000);
							SelectType.click();
							 List<WebElement> J1=Driver.findElements(By.xpath("//div[@id='mui-component-select-workClassId']//following::ul[2]//li"));
							 System.out.println(J1.size());
								for(int l=0;l<=J1.size()-1;l++)
								{
									System.out.println(J1.get(l).getText());
								}
								for(int k=0;k<J1.size();k++)
								{
							 if(J1.get(k).getText().equals(JT1))
							 {
								 J1.get(k).click();
								 break;
							 }
								}
								PayEffectiveDate.click();
								PayEffectiveDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								PayEffectiveDate.sendKeys(PED1);
								PayEndDate.click();
								PayEndDate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								PayEndDate.sendKeys(PD1);
								BaseRate.click();
								BaseRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								BaseRate.sendKeys(BR1);
								OTRate.click();
								OTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								OTRate.sendKeys(OT1);
								DTRate.click();
								DTRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								DTRate.sendKeys(DT1);
								FringeRate.click();
								FringeRate.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
								FringeRate.sendKeys(FR1);
								Confirm.click();
								JavascriptExecutor xe4 = (JavascriptExecutor)Driver;
								xe4.executeScript("arguments[0].click();", PayRate);
								JavascriptExecutor te2 = (JavascriptExecutor)Driver;
								te2.executeScript("arguments[0].click();", Save);
								//Deleting an Employee
								ViewAllEmployees.click();
					WebDriverWait wai = new WebDriverWait(Driver, 60);
					wai.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[text()[contains(.,'"+FL2+"')]]")));
					WebElement Search3=Driver.findElement(By.xpath("(//*[contains(text(),'Name')])[1]//following::input[1]"));
					Search3.sendKeys(FL2);
					Actions Em3=new Actions(Driver);
					WebElement Emp3=Driver.findElement(By.xpath("//*[text()[contains(.,'"+FL2+"')]]"));
					Em3.moveToElement(Emp2).build();
					Em3.click(Emp3).perform();
					DeleteEmployee.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[1]")).click();
					DeleteEmployee.click();
					Driver.findElement(By.xpath("(//*[contains(text(),'Are you')])[1]//following::button[2]")).click();
					Thread.sleep(1000);
					if(Driver.getPageSource().contains("'+FL2+'"))
					{
						System.out.println("Deleted Employee is seen");
					}
					else
					{
						System.out.println("Deleted Employee is not seen");
					}	
						
}



public void CreateEmployeeLayout(String LN,String LT1,String VA,String VB,String VC,String VD,String VE,String VF,String VG,
		String VH,String VI,String VJ,String VK,String VL,String VM,String VN,String VO) throws IOException, AWTException
{
	ImportEmployee.click();
	CreateExcelLayout.click();
	GoBackbutton.click();
	CreateExcelLayout.click();
	LayoutName.click();
	LayoutName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	LayoutName.sendKeys(LN);
	Undobutton.click();
	LayoutName.click();
	LayoutName.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
	LayoutName.sendKeys(LN);
	To.click();
	List<WebElement> LT=Driver.findElements(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li"));
	 System.out.println(LT.size());
		for(int k=0;k<LT.size();k++)
		{
	 if(LT.get(k).getText().equals(LT1))
	 {
		 LT.get(k).click();
		 break;
	 }
		}
	
		 Actions D = new Actions(Driver);
			D.sendKeys(Keys.ESCAPE).build().perform();
			Header.click();
			
	
ASelectValue.click();
List<WebElement> A=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[1]//following::ul[2]//li"));
 System.out.println(A.size());
	for(int k=0;k<A.size();k++)
	{
 if(A.get(k).getText().equals(VA))
 {
	 A.get(k).click();
	 break;
 }
	}
Actions D1 = new Actions(Driver);
D1.sendKeys(Keys.ESCAPE).build().perform();
BSelectValue.click();
List<WebElement> B=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[2]//following::ul[2]//li"));
System.out.println(B.size());
	for(int k=0;k<B.size();k++)
	{
if(B.get(k).getText().equals(VB))
{
	 B.get(k).click();
	 break;
}
	}	
	Actions D2 = new Actions(Driver);
D2.sendKeys(Keys.ESCAPE).build().perform();
CSelectValue.click();
List<WebElement> C=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[3]//following::ul[2]//li"));
System.out.println(C.size());
for(int k=0;k<C.size();k++)
{
 if(C.get(k).getText().equals(VC))
 {
C.get(k).click();
 break;
 }
			}
Actions D3 = new Actions(Driver);
D3.sendKeys(Keys.ESCAPE).build().perform();
DSelectValue.click();
List<WebElement> DA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[4]//following::ul[2]//li"));
System.out.println(DA.size());
for(int k=0;k<DA.size();k++)
{
if(DA.get(k).getText().equals(VD))
{
 DA.get(k).click();
break;
}
}
					 Actions D4 = new Actions(Driver);
						D4.sendKeys(Keys.ESCAPE).build().perform();
						ESelectValue.click();
						List<WebElement> EA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[5]//following::ul[2]//li"));
						 System.out.println(EA.size());
							for(int k=0;k<EA.size();k++)
							{
						 if(EA.get(k).getText().equals(VE))
						 {
							 EA.get(k).click();
							 break;
						 }
							}
							 Actions D5= new Actions(Driver);
								D5.sendKeys(Keys.ESCAPE).build().perform();
								FSelectValue.click();
								List<WebElement> F=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[6]//following::ul[2]//li"));
								 System.out.println(F.size());
									for(int k=0;k<F.size();k++)
									{
								 if(F.get(k).getText().equals(VF))
								 {
									 F.get(k).click();
									 break;
								 }
									}
									 Actions D6 = new Actions(Driver);
										D6.sendKeys(Keys.ESCAPE).build().perform();
										GSelectValue.click();
										List<WebElement> G=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[7]//following::ul[2]//li"));
										 System.out.println(G.size());
											for(int k=0;k<G.size();k++)
											{
										 if(G.get(k).getText().equals(VG))
										 {
											 G.get(k).click();
											 break;
										 }
											}
											 Actions D7 = new Actions(Driver);
												D7.sendKeys(Keys.ESCAPE).build().perform();
												HSelectValue.click();
												List<WebElement> H=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[8]//following::ul[2]//li"));
												 System.out.println(H.size());
													for(int k=0;k<H.size();k++)
													{
												 if(H.get(k).getText().equals(VH))
												 {
													 H.get(k).click();
													 break;
												 }
													}
										 Actions D8 = new Actions(Driver);
										 D8.sendKeys(Keys.ESCAPE).build().perform();
										ISelectValue.click();
										List<WebElement> I=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[9]//following::ul[2]//li"));
										 System.out.println(I.size());
										for(int k=0;k<I.size();k++)
										{
										if(I.get(k).getText().equals(VI))
									 {
										I.get(k).click();
										break;
														 }
															}
Actions D9 = new Actions(Driver);
D9.sendKeys(Keys.ESCAPE).build().perform();
JSelectValue.click();
List<WebElement> J=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[10]//following::ul[2]//li"));
System.out.println(J.size());
for(int k=0;k<J.size();k++)
{
if(J.get(k).getText().equals(VJ))
{
	J.get(k).click();
	break;
																 
}
																	
}
Actions D10 = new Actions(Driver);
D10.sendKeys(Keys.ESCAPE).build().perform();
KSelectValue.click();
List<WebElement> KA=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[11]//following::ul[2]//li"));
System.out.println(KA.size());
for(int k=0;k<KA.size();k++)
{
if(KA.get(k).getText().equals(VK))
{
	KA.get(k).click();
	break;
																 
}
																	
}
Actions D11 = new Actions(Driver);
D11.sendKeys(Keys.ESCAPE).build().perform();
LSelectValue.click();
List<WebElement> L=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[12]//following::ul[2]//li"));
System.out.println(L.size());
for(int k=0;k<L.size();k++)
{
if(L.get(k).getText().equals(VL))
{
	L.get(k).click();
	break;
																 
}																	
}
Actions D12 = new Actions(Driver);
D12.sendKeys(Keys.ESCAPE).build().perform();
MSelectValue.click();
List<WebElement> M=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[13]//following::ul[2]//li"));
System.out.println(M.size());
for(int k=0;k<J.size();k++)
{
if(M.get(k).getText().equals(VM))
{
	M.get(k).click();
	break;
																 
}
																	
}

Actions D14 = new Actions(Driver);
D14.sendKeys(Keys.ESCAPE).build().perform();
NSelectValue.click();
List<WebElement> N=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[14]//following::ul[2]//li"));
System.out.println(N.size());
for(int k=0;k<N.size();k++)
{
if(N.get(k).getText().equals(VN))
{
	N.get(k).click();
	break;
																 
}																	
}

Actions D15 = new Actions(Driver);
D15.sendKeys(Keys.ESCAPE).build().perform();
OSelectValue.click();
List<WebElement> O=Driver.findElements(By.xpath("(//*[contains(text(),'A')]//following::div[@id='mui-component-select-property'])[15]//following::ul[2]//li"));
System.out.println(O.size());
for(int k=0;k<O.size();k++)
{
if(O.get(k).getText().equals(VO))
{
	O.get(k).click();
	break;
																 
}																	
}
Actions D16= new Actions(Driver);
D16.sendKeys(Keys.ESCAPE).build().perform();
Createbutton.click();
		}


public void EditEmployeeLayout() throws InterruptedException
{
	
		//Driver=new chromeDriver(options);
	ImportEmployee.click();
	SelectLayout.click();
	//Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedImportId']")).click();
	//Thread.sleep(1000);
	WebDriverWait wait = new WebDriverWait(Driver, 60);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Automation')]")));
	WebElement Wb=Driver.findElement(By.xpath("//*[contains(text(),'Automation')]"));
	Actions A=new Actions(Driver);
	A.moveToElement(Wb).build();
	A.click(Wb).perform();
	
	ViewEdit.click();
	To.click();
	Driver.findElement(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li[17]")).click();
	Undobutton.click();
	To.click();
	Driver.findElement(By.xpath("//div[@id='mui-component-select-mapTo']//following::ul[2]//li[17]")).click();
	Actions D16 = new Actions(Driver);
	D16.sendKeys(Keys.ESCAPE).build().perform();
	PSelectValue.click();
    Driver.findElement(By.xpath("//*[contains(text(),'Skip')]")).click();
	Driver.findElement(By.xpath("//*[contains(text(),'Save')]")).click();
	
}

public void ValidateDownloadEmployeeLayout() throws InterruptedException
{
	ImportEmployee.click();
	SelectLayout.click();
	//Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedImportId']")).click();
	//Thread.sleep(1000);
		

	WebDriverWait wait1 = new WebDriverWait(Driver, 60);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Automation')]")));
	WebElement Wb1=Driver.findElement(By.xpath("//*[contains(text(),'Automation')]"));
	Actions A1=new Actions(Driver);
	A1.moveToElement(Wb1).build();
	A1.click(Wb1).perform();
	DownloadFile.click();
}


public PayrollEntryPageT1 PElaunch() throws InterruptedException {
	// TODO Auto-generated method stub
	Thread.sleep(2000);
	WebDriverWait wait = new WebDriverWait(Driver, 80);
	wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Payroll Entry')]")));
	PayrollEntry.click();
	return new PayrollEntryPageT1();
}



/*	public String pdfcompare()throws IOException
	{
	
	
	//PDF Util
	//String FolderLocation="C:\\Users\\prince\\Downloads\\New";
		//String Actual="C:\\Users\\prince\\Downloads\\Do\\File1.pdf";
		//String Expect="F:\\347\\File2.pdf";
		/*PDFUtil Pdfutil=new PDFUtil();
		
		Pdfutil.setCompareMode(CompareMode.VISUAL_MODE);
		Pdfutil.highlightPdfDifference(true);
		Pdfutil.setImageDestinationPath(FolderLocation);
		Pdfutil.compare(Actual, Expect);*/
	//PDF Box
	/*File file=new File("C:\\Users\\prince\\Downloads\\Do\\File1.pdf");
	FileInputStream fis=new FileInputStream(file);
	PDDocument document=null;										
	document=PDDocument.load(fis);
	String Data=new PDFTextStripper().getText(document);
	System.out.println(Data);
	return Data;
	
/*JavascriptExecutor ex = (JavascriptExecutor)Driver;
	ex.executeScript("arguments[0].click();", ReportDownload);
Driver.findElement(By.xpath("//div[@id='mui-component-select-selectedReport']")).click();
Driver.findElement(By.xpath("//*[contains(text(),'Contact List')]")).click();
Driver.findElement(By.xpath("//*[contains(text(),'Excel')]")).click();*/

/*	}
	}*/
public void ImportEmployeeValidation() throws IOException, InterruptedException
{
	ImportEmployee.click();
	SelectLayout.click();
	WebDriverWait wait1 = new WebDriverWait(Driver, 30);
	wait1.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Validation Check')]")));
	WebElement Wb1=Driver.findElement(By.xpath("//*[contains(text(),'Validation Check')]"));
	Actions A1=new Actions(Driver);
	A1.moveToElement(Wb1).build();
	A1.click(Wb1).perform();
	String ImportFile="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\skillsmart-employee-template_Empty.xlsx";
	Drophere.click();
	try {
		Robot robot = new Robot();
		StringSelection Selection = new StringSelection(ImportFile);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			robot.setAutoDelay(2000);                                                                                
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}	
	Actions A=new Actions(Driver);
	A.moveToElement(TestImportbutton).build();
	A.click(TestImportbutton).perform();
	String Sa1=Driver.findElement(By.xpath("//*[contains(text(),'No import')]")).getText();
	String E1="No import conflicts, click the import button to the right to proceed.";
	if(Sa1.equals(E1))
			{
		System.out.println("Validation message is matching");
			}
	else
	{
		System.out.println("Validation message is matching");
	}
/*	BufferedImage expectedImageC = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ImportValidationEmpty.png."));
	
	WebElement S=Driver.findElement(By.xpath("//*[contains(text(),'proceed')]"));
    // Javascript executor
  ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S);
	


	Screenshot Screenshot = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(Screenshot.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ImportValidationEmpty.png."));
	BufferedImage actualImageC = Screenshot.getImage();
	ImageDiffer imgdifferD = new ImageDiffer();

  ImageDiff imgdiffD = imgdifferD.makeDiff(expectedImageC, actualImageC);
if(imgdiffD.hasDiff()==true)
{
	System.out.println("Import Employees: Import Empty File images are not same");
}
else
{
	System.out.println("Employee Management:Import Empty File images are same");
}*/
	Importbutton.click();
	String Sa=Driver.findElement(By.xpath("//*[contains(text(),'Saved')]")).getText();
	String E="Saved - Located 0 records, added 0";
	if(Sa.equals(E))
			{
		System.out.println("Transition message is matching");
			}
	else
	{
		System.out.println("Transition message is matching");
	}
	Thread.sleep(1000);
	ImportEmployee.click();
	SelectLayout.click();
	WebDriverWait wait2 = new WebDriverWait(Driver, 30);
	wait2.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Validation Check')]")));
	WebElement Wb2=Driver.findElement(By.xpath("//*[contains(text(),'Validation Check')]"));
	Actions A2=new Actions(Driver);
	A2.moveToElement(Wb2).build();
	A2.click(Wb2).perform();
	String ImportFile1="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\src\\main\\java\\testdata\\skillsmart-employee-template_Validation.xlsx";
	Drophere.click();
	try {
		Robot robot = new Robot();
		StringSelection Selection = new StringSelection(ImportFile1);
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
			robot.setAutoDelay(2000);                                                                                
			robot.keyPress(KeyEvent.VK_CONTROL);
			robot.keyPress(KeyEvent.VK_V);
			robot.keyRelease(KeyEvent.VK_CONTROL);
			robot.keyRelease(KeyEvent.VK_V);
			robot.keyPress(KeyEvent.VK_ENTER);
			robot.keyRelease(KeyEvent.VK_ENTER);		
			
		} catch (AWTException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
	}	
	Actions AI2=new Actions(Driver);
	AI2.moveToElement(TestImportbutton).build();
	AI2.click(TestImportbutton).perform();
	BufferedImage expectedImageC1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\ImportValidation.png."));
	WebElement S1=Driver.findElement(By.xpath("//*[contains(text(),'validation')]"));
    // Javascript executor
  ((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", S1);
	Screenshot Screenshot1 = new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);
	//Driver.manage().timeouts().implicitlyWait(TestUtil.Implicit_Time,TimeUnit.SECONDS);
	Driver.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
	ImageIO.write(Screenshot1.getImage(), "png",
			new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\ImportValidation.png."));
	BufferedImage actualImageC1 = Screenshot1.getImage();
	ImageDiffer imgdiffer= new ImageDiffer();

   ImageDiff imgdiff = imgdiffer.makeDiff(expectedImageC1, actualImageC1);
if(imgdiff.hasDiff()==true)
{
	System.out.println("Import Employee: Validation File Images are not same");
}
else
{
	System.out.println("Import Employee: Validation File Images are same");
}
	}
	
}