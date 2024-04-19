package CRDA_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PlotsAllocationforCRDAFarmer {
	@FindBy(xpath="//button[text()='New Allocation']")
	private WebElement New_Allocation;
	
	
	public WebElement getNew_Allocation() {
		return New_Allocation;
	}




	public PlotsAllocationforCRDAFarmer(WebDriver driver) {
		PageFactory.initElements(driver, this);
	
	
	

}}
