package com.selenium.appmodule;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import com.selenium.utilmodule.LocatorMethodsPage;

public class ToolsqaBasePage extends LocatorMethodsPage{
	
	@FindBy(how=How.XPATH, using=".//*[@id='navigation']/div[2]/form/a") public WebElement searchbutton;
	@FindBy(how=How.NAME, using="s") public WebElement searchtextbox;
	@FindBy(how = How.XPATH, using=".//*[@id='main-nav']/li[2]/a/span") public WebElement tutorials;
	@FindBy(how = How.XPATH, using=".//*[@id='main-nav']/li[2]/ul/li[3]/a/span") public WebElement javaselenium;
	@FindBy(how = How.XPATH, using=".//*[@id='main-nav']/li[9]/a/span") WebElement demosite;
	@FindBy(how = How.XPATH, using=".//*[@id='main-nav']/li[9]/ul/li[3]/a/span") WebElement practiseform;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using="Partial") WebElement partiallinktest;
	@FindBy(how = How.LINK_TEXT, using="Link Test") WebElement linktest;
	By linktest1 = By.linkText("Link Test");
	@FindBy(how = How.NAME, using="firstname") WebElement firstname;
	@FindBy(how = How.NAME, using="lastname") WebElement lastname;
	@FindBy(how = How.NAME, using="sex") List<WebElement> gender;
	@FindBy(how = How.CLASS_NAME, using="control-group") List<WebElement> exp;
	public ToolsqaBasePage(WebDriver driver) {
		super(driver);
		PageFactory.initElements(driver, this);
	}
	public void typeSearch(String search){
		//This is hari comment
		/*JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", searchbutton);
		WebDriverWait wait = new WebDriverWait(driver, 40);
		wait.until(ExpectedConditions.elementToBeClickable(searchbutton));*/
		//buttonClick(searchbutton);
		//textBox(searchtextbox, search);
		//enterKey(searchtextbox);
	}
	public void actionTutorial(){
		actionClass(tutorials);
		scriptExecutor(javaselenium);
		
	}
	public void actionDemosite() throws InterruptedException{
		actionClass(demosite);
		scriptExecutor(practiseform);
		buttonClick(partiallinktest);
		WebDriverWait wait = new WebDriverWait(driver,20);
		wait.until(ExpectedConditions.elementToBeClickable(linktest1));
		buttonClick(linktest);
		
		driver.navigate().back();
		Thread.sleep(1000);
		textBoxField(firstname, "Pavani");
		textBoxField(lastname, "Naladala");
		inputRadioButton(driver,gender,1);
		inputRadioButton(driver, exp, 4);
	}
	 

}