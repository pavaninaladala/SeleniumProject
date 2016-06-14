package com.selenium.testmodule;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

import com.selenium.appmodule.ToolsqaBasePage;
import com.selenium.utilmodule.GmailMainPage;

public class GmailLoginTest  {
	WebDriver driver;

	

	@DataProvider(name = "search")
	public static Object[][] searchBox() {
		return new Object[][] { { "selenium" } };
	}

	@Test    //(dataProvider = "search")
	public void f() throws InterruptedException {
		driver = new FirefoxDriver();
		driver.get("http://www.toolsqa.com");
		driver.manage().window().maximize();
		ToolsqaBasePage basepage = new ToolsqaBasePage(driver);
		basepage.actionDemosite();
		
		
		

	}
}
