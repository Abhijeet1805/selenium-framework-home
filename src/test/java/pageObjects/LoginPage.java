package pageObjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class LoginPage {

//	private static WebElement element = null;
	
	public static WebElement inputEmail(WebDriver driver) {
		return (driver.findElement(By.id("email")));	
	}
	
	public static WebElement inputPassword(WebDriver driver) {
		return (driver.findElement(By.id("pass")));
	}
	
	public static WebElement btnLogIn(WebDriver driver) {
		return (driver.findElement(By.id("u_0_0")));
	}
}
