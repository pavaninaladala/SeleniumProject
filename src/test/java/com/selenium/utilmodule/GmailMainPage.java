package com.selenium.utilmodule;
// mm r   y/import java.util.concurrent.TimeUnit;

import org.junit.AfterClass;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Parameters;

public class GmailMainPage {
	WebDriver driver;
	public static String URL = "http://www.toolsqa.com";

	public GmailMainPage(WebDriver driver) {
		this.driver = driver;
	}

	@DataProvider(name = "browser")
	public static Object[][] browserType() {
		return new Object[][] { { "firefox" }, { "chrome" }, { "IE" } };
	}

	@Parameters({ "browser" })
	@BeforeTest // (dataProvider = "browser")
	public void setUp(String browser) {
		// System.out.println(browser.compareTo("fireFox"));
		// System.out.println(browser.equals("fireFox"));
		if (browser.equals("firefox")) {
			driver = new FirefoxDriver();

		} else if (browser.contains("chrome")) {
			System.setProperty("webdriver.chrome.driver", "lib//chromedriver.exe");
			driver = new ChromeDriver();

		} else if (browser.startsWith("IE")) {
			System.setProperty("webdriver.ie.driver", "lib//IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		}
		driver.manage().window().maximize();
		driver.get(URL);
//		driver.manage().timeouts().implicitlyWait(30, [v=fg.SECONDS);
	}

	@AfterTest
	public void tearDown() {
		driver.close();
	}

}
