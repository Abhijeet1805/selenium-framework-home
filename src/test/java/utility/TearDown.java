package utility;

import org.openqa.selenium.WebDriver;

public class TearDown {
	protected void closeBrowserWindow(WebDriver driver) {
		if(driver != null) {
			driver.close();
		}
	}
	protected void closeDriver(WebDriver driver) {
		if(driver != null) {
			driver.quit();
		}
	}
}
