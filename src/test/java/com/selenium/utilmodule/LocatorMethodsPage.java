package com.selenium.utilmodule;

import java.util.List;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NotFoundException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class LocatorMethodsPage {
	protected WebDriver driver;
	public LocatorMethodsPage(WebDriver driver){
		this.driver = driver;
	}
	public void buttonClick(WebElement element){
		 element.click();
	}
	public void textBoxField(WebElement element,String str){
		element.sendKeys(str);
	}
	public void enterKey(WebElement element){
		element.sendKeys(Keys.ENTER);
	}
	public void actionClass(WebElement element){
		 Actions action = new Actions(driver);
		 action.moveToElement(element).build().perform();
	}
	public void timeOut(int time) throws InterruptedException{
		Thread.sleep(time);
	}
	public void scriptExecutor(WebElement element){
		JavascriptExecutor executor = (JavascriptExecutor)driver;
		executor.executeScript("arguments[0].click();", element);
	}

	public void inputRadioButton(WebDriver driver, List<WebElement> element, int option) {

		if (option > 0 && option <= element.size()) {
            element.get(option).click();
            }else{
            	throw new NotFoundException("Option"+option+"not found");
            }
		// System.out.println(element);
	}
	
}


