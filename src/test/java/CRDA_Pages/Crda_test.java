package CRDA_Pages;

import static org.testng.Assert.assertEquals;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Crda_test {

	WebDriver driver=new ChromeDriver();
	@BeforeMethod
	public void ChromeLaunch() {
		driver.get("https://crda.dev.nidhi.apcfss.in/");
		
		
	}
	@Test
	public void PlotsFileupload() throws InterruptedException{
		LoginPage LP= new LoginPage(driver);
		LP.Loginele();
		driver.manage().window().maximize();
		Services Sr=new Services(driver);
		Sr.getPlotsAllocationforFarmers().click();
		Sr.getUnallocated_Plots().click();
		
		PlotsAllocationforCRDAFarmer PACF=new PlotsAllocationforCRDAFarmer(driver);
		PACF.getNew_Allocation().click();
//		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		driver.findElement(By.xpath("//div/h5[text()='Plots Allocation for CRDA Farmers']")).click();//Plots Allocation for CRDA Farmers tile click
//		driver.findElement(By.xpath("//button[text()='Unallocated Plots']")).click();//Unallocated Plots button click
//		WebElement UnallocatedPlots=driver.findElement(By.xpath("//div/h2[text()='No Unallocated Data Available']")); //No Unallocated Data Available error msg identifying
//		if(UnallocatedPlots.isDisplayed()) {
//			assertEquals("No Unallocated Data Available", UnallocatedPlots.getText());
//			driver.findElement(By.xpath("//button[text()='OK']")).click();
//			System.out.println("No Unallocated Data Available");
//		}
//
//		driver.findElement(By.xpath("//button[text()='New Allocation']")).click();
////		WebElement PlotUploadElement=driver.findElement(By.xpath("//input[@name='file']"));
////		PlotUploadElement.sendKeys("C:\\Users\\new\\eclipse-workspace\\Crda_test\\src\\test\\resources\\ExcelData\\RAYAPUDI_Plot_2.xlsx");
////		driver.findElement(By.xpath("//h1[.='Plots  File Upload']/..//following-sibling::table//descendant::button")).click();
////		driver.findElement(By.xpath("//button[.='ok']")).click();
////		driver.findElement(By.xpath("//div[.='Data Uploaded Successfully']/../*[@class='swal2-actions']/*[.='OK']")).click();
////		Thread.sleep(1000);
////		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
////		jsExecutor.executeScript("window.scrollBy(0,4000)");
////		WebElement FarmerUploadElement=driver.findElement(By.name("bfile"));
////		FarmerUploadElement.sendKeys("C:\\Users\\new\\eclipse-workspace\\Crda_test\\src\\test\\resources\\RAYAPUDI_Farmer_2.xlsx");
////		driver.findElement(By.xpath("//h1[.='Farmers File Upload']/..//following-sibling::table//descendant::button")).click();
////		driver.findElement(By.xpath("//button[text()='ok']")).click();
////		driver.findElement(By.xpath("//button[text()='OK']")).click();
//
////		
//		UploadFunction();
//		cleardata();
//		UploadFunction();
//		Thread.sleep(1000);
//
//		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
//		WebElement valRec=driver.findElement(By.xpath("//button[text()='Validate Records']"));
//		//jsExecutor.executeScript("scrollTo(0, document.body.scrollHeight)");
//		jsExecutor.executeScript("arguments[0].scrollIntoView();",valRec);
//		Thread.sleep(1000);
//		valRec.click();
//		driver.findElement(By.xpath("//button[text()='Ok']")).click();
//        WebElement ViewButton=driver.findElement(By.xpath("//button[text()='View']"));
//        ViewButton.click();
//        
//		
//	
//
//
//
//
//	}
//
//	public void cleardata() throws InterruptedException {
//		WebElement PlotCleardata=driver.findElement(By.xpath("//h1[.='Plots  File Upload']/../following-sibling::table//*[text()='Clear Data']"));
//		if(PlotCleardata.isDisplayed()) {
//			PlotCleardata.click();
//			driver.findElement(By.xpath("//button[text()='OK']")).click();
//			Thread.sleep(3000);
//			driver.findElement(By.xpath("//button[text()='OK']")).click();
//		}
//
//		WebElement FarmerCleardata=driver.findElement(By.xpath("//h1[.='Farmers File Upload']/../following-sibling::table//*[text()='Clear Data']"));
//		if(FarmerCleardata.isDisplayed()) {
//			FarmerCleardata.click();
//			driver.findElement(By.xpath("//button[text()='OK']")).click();
//			Thread.sleep(3000);
//
//			driver.findElement(By.xpath("//button[text()='OK']")).click();
//		}
//	}
//	public void UploadFunction() throws InterruptedException {
//		WebElement PlotUploadElement=driver.findElement(By.xpath("//input[@name='file']"));
//		PlotUploadElement.sendKeys("C:\\Users\\new\\eclipse-workspace\\Crda_test\\src\\test\\resources\\ExcelData\\RAYAPUDI_Plot_2.xlsx");
//		driver.findElement(By.xpath("//h1[.='Plots  File Upload']/..//following-sibling::table//descendant::button")).click();
//		driver.findElement(By.xpath("//button[.='ok']")).click();
//		driver.findElement(By.xpath("//div[.='Data Uploaded Successfully']/../*[@class='swal2-actions']/*[.='OK']")).click();
//		Thread.sleep(1000);
//		JavascriptExecutor jsExecutor=(JavascriptExecutor)driver;
//		jsExecutor.executeScript("window.scrollBy(0,4000)");
//		WebElement FarmerUploadElement=driver.findElement(By.name("bfile"));
//		FarmerUploadElement.sendKeys("C:\\Users\\new\\eclipse-workspace\\Crda_test\\src\\test\\resources\\RAYAPUDI_Farmer_2.xlsx");
//		driver.findElement(By.xpath("//h1[.='Farmers File Upload']/..//following-sibling::table//descendant::button")).click();
//		driver.findElement(By.xpath("//button[text()='ok']")).click();
//		driver.findElement(By.xpath("//button[text()='OK']")).click();
//	}
//
//
//
//	//	@AfterTest
//	//	public void Teardown(){
//	//		driver.close();

}}


