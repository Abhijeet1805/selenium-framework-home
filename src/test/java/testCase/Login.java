package testCase;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import pageObjects.LoginPage;

public class Login {

	private WebDriver driver;

	//	public WebDriver getDriver() {
	//		return driver;
	//	}

	@BeforeClass
	private void setDriver(WebDriver driver) {
		this.driver = driver;

		if(driver != null) {
			driver.manage().window().maximize();	
		}
	}

	@Test
	private void invalidUserName(String username, String password) {
		LoginPage.inputEmail(driver).sendKeys(username);
		LoginPage.inputPassword(driver).sendKeys(password);
		LoginPage.btnLogIn(driver).submit();
	}

	@Test
	private void invalidPasswrod(String username, String password) {

	}

	@Test
	private void invalidUsernameAndPassword(String username, String password) {

	}

	@Test
	private void validUsernameAndPassword(String username, String password) {

	}
}
