package MedicareTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PageObjectAsUser;
import resources.Base;

public class SignUpAsUser extends Base {

	

	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));
		
		
	}
	
	@Test
	public void medicareWebPageTest() {
	
		PageObjectAsUser medicare = new PageObjectAsUser(driver);
		medicare.clickonSignUpBtn();
		medicare.signUpPage_PersonalAsUser();
		medicare.signUpPage_AddressAsUser();
		medicare.clickOnConfirmBtn();	
		
	}
	
}

