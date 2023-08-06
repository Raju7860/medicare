package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PgObjForSupplierLogin {
	WebDriver driver;

	public PgObjForSupplierLogin(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(xpath="//a[normalize-space()='Login']")
	WebElement login;
	
	@FindBy(xpath="//input[@id='username']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@value='Login']")
	WebElement loginBtn;
	
	public void clickOnLogin() {
		
		login.click();
	}
	
	public void enterEmail() {
		
		email.sendKeys("ajit123@gmail.com");
	}
	
	public void enterPassword() {
		
		password.sendKeys("Ajit@123");
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
}
