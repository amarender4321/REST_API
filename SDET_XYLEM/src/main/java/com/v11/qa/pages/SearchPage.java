package com.v11.qa.pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchPage {

	
	WebDriver driver;
	
	@FindBy(linkText ="HP LP3065" )
	private WebElement validHPProduct;

	@FindBy(css=".caption a")
private WebElement actvalProductValue;
	
	@FindBy(xpath="//div[@id='content']/h2/following-sibling::p")
	private WebElement noProductMessage;
	
	public SearchPage(WebDriver driver) {
		this.driver=driver;
		PageFactory.initElements(driver, this);
	}
	public String retrieveNoProductMessageText() {
		String noProductMessageMessageText = noProductMessage.getText();
		return noProductMessageMessageText;
	}
	public String retriveActuvalProduct() {
		String actvalProductText = actvalProductValue.getText();
	return	actvalProductText;
	}
	public boolean displayStatusOfHPValidProduct() {
		boolean displayStatus = validHPProduct.isDisplayed();
		return displayStatus;
	}
}
