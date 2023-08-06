package PageObject;

import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjectAsUser {

	WebDriver driver;

	public PageObjectAsUser(WebDriver driver) {

		this.driver = driver;
		PageFactory.initElements(driver, this);

	}
	
	@FindBy(xpath="//a[normalize-space()='Sign Up']")
	WebElement SignUpBtn;
	
	@FindBy(xpath="//input[@id='firstName']")
	WebElement firstName;
	
	@FindBy(xpath="//input[@id='lastName']")
	WebElement lastName;
	
	@FindBy(xpath="//input[@id='email']")
	WebElement email;
	
	@FindBy(xpath="//input[@id='contactNumber']")
	WebElement contactNo;
	
	@FindBy(xpath="//input[@id='password']")
	WebElement password;
	
	@FindBy(xpath="//input[@id='confirmPassword']")
	WebElement confirmPassword;
	
	@FindBy(xpath="//input[@id='role1']")
	WebElement radiobtnUser;
	
	@FindBy(xpath="//button[normalize-space()='Next - Billing']")
	WebElement nextBillingBtn;
	
	@FindBy(xpath="//input[@id='addressLineOne']")
	WebElement addressLineOne;
	
	@FindBy(xpath="//a[@class='btn btn-lg btn-primary']")
	WebElement confirmBtn;
	
	public void clickonSignUpBtn() {
		SignUpBtn.click();
	}
	
	public void signUpPage_PersonalAsUser() {
		firstName.sendKeys("Raju Kumar");
		lastName.sendKeys("Sharma");
		email.sendKeys("raju.sharma@gmail.com");
		contactNo.sendKeys("8285908070");
		password.sendKeys("Raju@123");
		confirmPassword.sendKeys("Raju@123");
		radiobtnUser.click();
		nextBillingBtn.click();
				
	}
	
	public void signUpPage_AddressAsUser() {
		
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions 
				.moveToElement(addressLineOne)
				.click()
				.sendKeys(Keys.TAB)
				.sendKeys(Keys.TAB)
				.sendKeys("1071 Madurdaha",Keys.TAB)
				.sendKeys("Hussainpur",Keys.TAB)
				.sendKeys("Kolkata",Keys.TAB)
				.sendKeys("700107",Keys.TAB)
				.sendKeys("West Bengal",Keys.TAB)
				.sendKeys("India",Keys.TAB,Keys.TAB,Keys.ENTER).build();
		seriesOfAction.perform();	
		
	}
	
	public void clickOnConfirmBtn(){
		
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		confirmBtn.click();
	}
	
	

	

}
