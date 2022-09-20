package pages;

import java.awt.AWTException;
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
import java.net.URL;
import java.util.concurrent.TimeUnit;

import javax.imageio.ImageIO;

import org.apache.pdfbox.pdmodel.PDDocument;
import org.apache.pdfbox.text.PDFTextStripper;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.testautomationguru.utility.CompareMode;
import com.testautomationguru.utility.PDFUtil;

import base.TestBase;
import de.redsix.pdfcompare.CompareResult;
import de.redsix.pdfcompare.PdfComparator;
import de.redsix.pdfcompare.RenderingException;
//import de.redsix.pdfcompare.CompareResult;
//import de.redsix.pdfcompare.PdfComparator;
import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.comparison.ImageDiff;
import ru.yandex.qatools.ashot.comparison.ImageDiffer;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class WH347GenerationPageT1 extends TestBase {
	
	@FindBy(xpath="//*[contains(text(),'Cancel')]")
	WebElement Cancel;
	
	@FindBy(id="mui-component-select-selectedPayrollId")
	WebElement PayrollWeekEnding;
	
	@FindBy(xpath="//*[contains(text(),'WH-347 Generation')]")
	WebElement WH347Generation;
	
	@FindBy(xpath="//*[contains(text(),'Preview Report')]")
	WebElement PreviewReport;
	
	@FindBy(id="signatorTitle")
	WebElement SignatoryTitle;
	
	
	@FindBy(id="comments")
	WebElement Comment;
	
	
	@FindBy(xpath="//*[contains(text(),'in addition')]//preceding::input[1]")
	WebElement Checkbox1;
	
	@FindBy(xpath="//*[contains(text(),'Each laborer')]//preceding::input[1]")
	WebElement Checkbox2;
	
	
	@FindBy(xpath="//button[@title='Add an exception']")
	WebElement AddExceptionIcon;
	
	@FindBy(id="exception")
	WebElement Exception;
	
	@FindBy(id="explanation")
	WebElement Explanation;
	
	
	@FindBy(xpath="//*[contains(text(),'Remove')]//following::button[1]")
	WebElement Deleteicon;
	
	@FindBy(id="remarks")
	WebElement Remarks;
	
	@FindBy(xpath="//*[contains(text(),'Close Preview')]")
	WebElement ClosePreview;
	
	
	@FindBy(xpath="//*[contains(text(),'Open Document')]")
	WebElement OpenDocument;
	
	@FindBy(xpath="//*[contains(text(),'Delete')]")
	WebElement Delete;
	
	
	@FindBy(xpath="//*[contains(text(),'Sign & Generate')] ")
	WebElement SignandGenerate;
	
	
	
	
	
	
	
	
	public WH347GenerationPageT1()
	{
		PageFactory.initElements(Driver,this);	
	}
	
	
	public void WH347GenerationImageVerification() throws IOException
	{
		
		WebDriverWait wait = new WebDriverWait(Driver, 40);
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Create WH-347 Report')]")));
		//Driver.navigate().refresh();
		
	//BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WH347GenerationPage1.png."));

		
		Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

		ImageIO.write(ImageScreenshotS.getImage(), "png",
				new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WH347GenerationPage1.png"));
		BufferedImage actualImageS = ImageScreenshotS.getImage();

/*
	ImageDiffer imgdifferS = new ImageDiffer();

	   ImageDiff imgdiffS = imgdifferS.makeDiff(expectedImageS, actualImageS);
	if(imgdiffS.hasDiff()==true)
	{
		System.out.println("Images are not same");
	}
	else
	{
		System.out.println("Images are same");
	}*/
		

	}
	
	public String ValidateCancelbutton()
	{
		return Cancel.getText();
	}
	
	public void ValidatePreviewReportbutton()
	{
		if(PreviewReport.isEnabled())
		{
			System.out.println("Preview Report button is enabled");
		}
		else
		{
			System.out.println("Preview Report button is disabled as expected");
		}
	}
	
	public void WH347GenerationCreation(String PW,String ST,String CW, String E,String Ex,String R) throws IOException, InterruptedException, AWTException
	{
		Cancel.click();
		WH347Generation.click();
		PayrollWeekEnding.click();
        Actions A=new Actions(Driver);
		WebElement P=Driver.findElement(By.xpath("//*[contains(text(),'"+PW+"')]"));
		A.moveToElement(P).build();
		A.click(P).perform();	
		Thread.sleep(2000);
		BufferedImage expectedImageS = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WH347GenerationPage1.png."));

		
				Screenshot ImageScreenshotS= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				ImageIO.write(ImageScreenshotS.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WH347GenerationPage1.png"));
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
				((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", PreviewReport);
				BufferedImage expectedImageS1 = ImageIO.read(new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\WH347GenerationPage2.png."));

				
				Screenshot ImageScreenshotS1= new AShot().shootingStrategy(ShootingStrategies.viewportPasting(1000)).takeScreenshot(Driver);

				ImageIO.write(ImageScreenshotS1.getImage(), "png",
						new File("F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\UI Image\\WH347GenerationPage2.png"));
				BufferedImage actualImageS1 = ImageScreenshotS1.getImage();

		
			ImageDiffer imgdifferS1 = new ImageDiffer();

			   ImageDiff imgdiffS1 = imgdifferS1.makeDiff(expectedImageS1, actualImageS1);
			if(imgdiffS1.hasDiff()==true)
			{
				System.out.println("Images are not same");
			}
			else
			{
				System.out.println("Images are same");
			}
		
				SignatoryTitle.click();
				SignatoryTitle.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				SignatoryTitle.sendKeys(ST);
				Comment.click();
				Comment.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Comment.sendKeys(CW);
				Checkbox1.click();
				Checkbox2.click();
				AddExceptionIcon.click();
				Exception.click();
				Exception.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Exception.sendKeys(E);
				Explanation.click();
				Explanation.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Explanation.sendKeys(Ex);
				Deleteicon.click();
				Thread.sleep(1000);
				Driver.findElement(By.xpath("//*[contains(text(),'Exception')]//following::button[1]")).click();
				Exception.click();
				Exception.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Exception.sendKeys(E);
				Explanation.click();
				Explanation.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Explanation.sendKeys(Ex);
				Remarks.click();
				Remarks.sendKeys(Keys.chord(Keys.CONTROL,"a",Keys.DELETE));
				Remarks.sendKeys(R);
				PreviewReport.click();
				WebDriverWait wait = new WebDriverWait(Driver, 40);
				wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//*[contains(text(),'Close Preview')]")));
				String D=Driver.findElement(By.xpath("//*[contains(text(),'(Any')] ")).getText();
				 String De="(Any delete warning can go here)";
				 if(D.equals(De))
				 {
					 System.out.println("Delete message matches");
				 }
				 else 
				 {
					 System.out.println("Delete message not matches");
				 }
				 String S=Driver.findElement(By.xpath("//*[contains(text(),'Signed Reports')] ")).getText();
				 String SI="Signed Reports will automatically be saved to your WH-347 Archives";
				 if(S.equals(SI))
				 {
					 System.out.println("Signed Reports message matches");
				 }
				 else 
				 {
					 System.out.println("Signed Reports message not matches");
				 }
				ClosePreview.click();
				OpenDocument.click();
				Delete.click();
				Thread.sleep(1000);
				if(Driver.getPageSource().contains("Signed Report"))
			    {
			    	System.out.println("Preview is still seen");
			    }
			    else
			    {
			    	System.out.println("Preview is not seen as expected");
			    }
				PreviewReport.click();
				SignandGenerate.click();
				 String Sign=Driver.findElement(By.xpath("//*[contains(text(),'Signed and stored')] ")).getText();
				 String Signed="Signed and stored in archives";
				 if(Sign.equals(Signed))
				 {
					 System.out.println("Report got signed and message matches");
				 }
				 else 
				 {
					 System.out.println("Report is not singed and message not matches");
				 }
				 if(Driver.getPageSource().contains("WH-347 has"))
				    {
				    	System.out.println("WH-347 has been Signed");
				    }
				    else
				    {
				    	System.out.println("WH-347 is not Signed");
				    }
				 WebElement C=Driver.findElement(By.xpath("//*[contains(text(),'Close Preview')]"));
					((JavascriptExecutor)Driver).executeScript("arguments[0].scrollIntoView(true);", C);
					//Driver.switchTo().frame("347preview");
					WebElement C1=Driver.findElement(By.xpath("//iframe[@id='347preview']"));
					((JavascriptExecutor)Driver).executeScript("arguments[0].click();", C1);
					
				
					 Robot robot = new Robot();
					 Thread.sleep(1000);
					 robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_TAB);
					    robot.keyRelease(KeyEvent.VK_TAB);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_ENTER);
					    robot.keyRelease(KeyEvent.VK_ENTER);
					    Thread.sleep(1000);
					    robot.keyPress(KeyEvent.VK_BACK_SPACE);
					    robot.keyRelease(KeyEvent.VK_BACK_SPACE);
					    String strSel = "F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Download\\WH347Generation.pdf";
						try {
							Robot robot1 = new Robot();
							StringSelection Selection = new StringSelection(strSel);
							Toolkit.getDefaultToolkit().getSystemClipboard().setContents(Selection, null);
								robot1.setAutoDelay(2000);                                                                                
								robot1.keyPress(KeyEvent.VK_CONTROL);
								robot1.keyPress(KeyEvent.VK_V);
								robot1.keyRelease(KeyEvent.VK_CONTROL);
								robot1.keyRelease(KeyEvent.VK_V);
								robot1.keyPress(KeyEvent.VK_ENTER);
								robot1.keyRelease(KeyEvent.VK_ENTER);
								
								
							} catch (AWTException e1) {
								// TODO Auto-generated catch block
								e1.printStackTrace();
						}
						Thread.sleep(2000);
					String FolderLocation="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Difference\\DiffWH347Generation";
						String Actual="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Download\\WH347Generation.pdf";
						String Expect="F:\\SkillSmart\\SkillSmart Automation\\Workspace\\InsightTest\\Baseline\\BaselineWH347Generation.pdf";
					final CompareResult result = new PdfComparator(Actual, Expect).compare();
						if (result.isNotEqual()) {
						    System.out.println("Differences found!");
						}
						if (result.isEqual()) {
						    System.out.println("No Differences found!");
						}
						if (result.hasDifferenceInExclusion()) {
						    System.out.println("Differences in excluded areas found!");
						}
						result.getDifferences();

						boolean isEquals = new PdfComparator(Actual, Expect).compare().writeTo(FolderLocation);
						if (!isEquals) {
						    System.out.println("Differences found!");
						}
					}
					
}