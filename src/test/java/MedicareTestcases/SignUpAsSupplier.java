package MedicareTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PageObjectAsSupplier;
import resources.Base;

public class SignUpAsSupplier extends Base {

	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));
		
	}
	
	@Test
	public void medicareWebPageTest() {
	
		 PageObjectAsSupplier medicare = new PageObjectAsSupplier(driver);
		medicare.clickonSignUpBtn();
		medicare.signUpPage_PersonalAsUser();
		medicare.signUpPage_AddressAsUser();
		medicare.clickOnConfirmBtn();	
		
	}
}
