package PageObject;

import org.junit.Assert;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Action;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PageObjForUserLogin {
	WebDriver driver;

	public PageObjForUserLogin(WebDriver driver) {

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
	
	@FindBy(xpath="//a[normalize-space()='View Products']")
	WebElement viewProduct;
	
	@FindBy(xpath="//tbody/tr[1]/td[6]/a[1]/span[1]")
	WebElement 	ParacetamolProduct;
	
	@FindBy(xpath="//a[normalize-space()='Add to Cart']")
	WebElement 	addToCardBtn;
	
	
	@FindBy(xpath="//a[normalize-space()='Continue Shopping']")
	WebElement 	continueShoppingBtn;
	
	@FindBy(xpath="//tbody/tr[2]/td[6]/a[1]/span[1]")
	WebElement 	combiflame;
	
	
	
	@FindBy(xpath="//a[normalize-space()='Checkout']")
	WebElement 	checkoutBtn;
	
	@FindBy(xpath="//input[@id='addressLineOne']")
	WebElement 	addressLineOne;
	
	@FindBy(xpath="//input[@id='addressLineTwo']")
	WebElement 	addressLineTwo;
	
	@FindBy(xpath="//input[@id='city']")
	WebElement 	city;
	
	@FindBy(xpath="//input[@id='postalCode']")
	WebElement 	postalCode;
	
	@FindBy(xpath="//input[@id='state']")
	WebElement 	state;
	
	@FindBy(xpath="//input[@id='country']")
	WebElement 	country;
	
	@FindBy(xpath="//button[normalize-space()='Add Address']")
	WebElement 	addAddressBtn;
	
	@FindBy(xpath="//input[@id='cardNumber']")
	WebElement 	cardNumber;
	
	@FindBy(xpath="//h3[normalize-space()='Your Order is Confirmed!!']")
	WebElement 	ConfirmedTxt;

	
	public void clickOnLogin() {
		
		login.click();
	}
	
	public void enterEmail() {
		
		email.sendKeys("raju.sharma@gmail.com");
	}
	
	public void enterPassword() {
		
		password.sendKeys("Raju@123");
	}
	
	public void clickOnLoginBtn() {
		loginBtn.click();
	}
	
	public void clickOnViewProductOption() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		viewProduct.click();
	}
	
	public void addToCardParacetamol() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		ParacetamolProduct.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		addToCardBtn.click();
	}
	
	
//	public void clickonAddToCardBtn() {
//		try {
//			Thread.sleep(2000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		};
//		addToCardBtn.click();
//	}
	
	public void clickOnContinueShoppingBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		continueShoppingBtn.click();
	}
	
	public void addToCardCombiflame() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		combiflame.click();
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		addToCardBtn.click();
	}
	
	public void clickOnCheckoutBtn() {
		try {
			Thread.sleep(2000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		};
		checkoutBtn.click();
	}
	
	public void addAddress() {
		
		addressLineOne.sendKeys("1071 Madurdaha");
		addressLineTwo.sendKeys("Hussainpur");
		city.sendKeys("Kolkata");
		postalCode.sendKeys("700107");
		state.sendKeys("West Bengal");
		country.sendKeys("India");
		addAddressBtn.click();	
	}
	
	public void onebuyProduct() {
		Actions actions = new Actions(driver);
		Action seriesOfAction = actions 
				.moveToElement(cardNumber)
				.click()
				.sendKeys(Keys.TAB,Keys.TAB)
				.sendKeys("1234567899876543",Keys.TAB)
				.sendKeys("10",Keys.TAB)
				.sendKeys("2020",Keys.TAB)
				.sendKeys("123",Keys.TAB,Keys.TAB,Keys.ENTER).build();
				
		seriesOfAction.perform();
	}
	
	public void validateTxt() {
		String txt = ConfirmedTxt.getText();	
		Assert.assertTrue(txt.contains("Your Order is Confirmed!!"));
	}
}
