package MedicareTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PgObjForSupplierLogin;
import resources.Base;

public class LoginPgAsSupplier extends Base {
	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));
		
		
	}
	
	@Test
	public void LoginTest() {
	
		 PgObjForSupplierLogin login = new PgObjForSupplierLogin(driver);
		 login.clickOnLogin();
		login.enterEmail();
		login.enterPassword();
		login.clickOnLoginBtn();
		
	}
}
