package CRDA_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Services {
	
	@FindBy(xpath="//div/h5[text()='Plots Allocation for CRDA Farmers']")
	private WebElement PlotsAllocationforFarmers;
	@FindBy(xpath="//button[text()='Unallocated Plots']")
	private WebElement Unallocated_Plots;
	
	public Services(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	public WebElement getPlotsAllocationforFarmers() {
		return PlotsAllocationforFarmers;
	}
	public WebElement getUnallocated_Plots() {
		return Unallocated_Plots;
	}

	
			
}
