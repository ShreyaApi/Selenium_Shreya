package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MyAddress_page {
	public MyAddress_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
		
	}
 @FindBy(xpath="//button[text()='Add Address']")
	private WebElement addAddressBtn;
 
 @FindBy(xpath="(//span[contains(@class,'MuiButton-startIcon')])[2]")
	private WebElement deleteBtn;
	
 @FindBy(xpath="//button[text()='Yes']")
 private WebElement yesBtn;

public WebElement getAddAddressBtn() {
	return addAddressBtn;
}

public WebElement getDeleteBtn() {
	return deleteBtn;
}

public WebElement getYesBtn() {
	return yesBtn;
}


 
 
}
