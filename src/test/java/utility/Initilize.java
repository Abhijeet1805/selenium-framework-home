package utility;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

import constants.Values;

public class Initilize {
	
	/* private instance variables */
	private WebDriver driver;
	private WebDriverWait wait;
	private Properties properties;
	private Browser browser;
	private int timeoutInSec;
	private FileInputStream input;

	
	/* deafult constructor */
	public Initilize() {
		driver = null;
		wait = null;
		properties = null;
		timeoutInSec = 30;
		input = null;
	}
	
	/* public methods -- getters */
	public WebDriver getDriver() {
		return driver;
	}

	public WebDriverWait getWait() {
		return wait;
	}

	
	/* private methods */
	private void initDriver() {
		switch(browser) {
		case CHROME:
			break;
		case EDGE:
			break;
		case FIREFOX:
			break;
		case IE:
			break;
		}
	}

	private void initWait() {
		wait = new WebDriverWait(driver,timeoutInSec);
	}

	private void initBrowser(String browserName) {
		switch(browserName) {
		case "CHROME":
			browser = Browser.CHROME;
			break;
		case "EDGE":
			browser = Browser.EDGE;
			break;
		case "IE":
			browser = Browser.IE;
			break;
		default:
			browser = Browser.FIREFOX;
		}
	}

	private void initTimeoutInSec() {
		try {
			timeoutInSec = Integer.parseInt(properties.getProperty("timeout"));

		} catch(NumberFormatException nfe) {
			nfe.printStackTrace();
		}
	}

	private void initProperties() {
		try {
			properties = new Properties();
			input = new FileInputStream(Values.fileProperties);

			// load a properties file
			properties.load(input);

		} catch (IOException ioe) {
			ioe.printStackTrace();
		} finally {
			if (input != null) {
				try {
					input.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}