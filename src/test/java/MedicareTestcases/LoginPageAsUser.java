package MedicareTestcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import PageObject.PageObjForUserLogin;
import resources.Base;

public class LoginPageAsUser extends Base {
	@BeforeTest
	public void openUrl() throws IOException {
		WebDriver driver = openBrowser();
		driver.get(prop.getProperty("Url"));

	}

	@Test
	public void LoginTest() {

		PageObjForUserLogin login = new PageObjForUserLogin(driver);
		login.clickOnLogin();
		login.enterEmail();
		login.enterPassword();
		login.clickOnLoginBtn();
		login.clickOnViewProductOption();
		login.addToCardParacetamol();
		login.clickOnContinueShoppingBtn();
		login.addToCardCombiflame();
		login.clickOnCheckoutBtn();
		login.addAddress();
		login.onebuyProduct();
		login.validateTxt();

	}

}
