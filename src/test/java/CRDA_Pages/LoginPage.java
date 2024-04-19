package CRDA_Pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {


	@FindBy(xpath="//input[@name='username']") 
	private WebElement username;
	@FindBy(xpath="//input[@name='password']") 
	private WebElement password;
	@FindBy(xpath="//button[@type='submit']") 
	private WebElement submitbutton;

	public LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);


	}

	public WebElement getUsername() {
		return username;
	}

	public WebElement getPassword() {
		return password;
	}

	public WebElement getSubmitbutton() {
		return submitbutton;
	}
	public void Loginele() {
		username.sendKeys("crda_admin");
		password.sendKeys("Crda@321");
		submitbutton.click();

	}



}



