package com.ShoppersStack_pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Home_page {
	
	public Home_page(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath="//div[text()='s']")
	private WebElement profileSetting;
	
	@FindBy(xpath="//li[text()='My Profile']")
	private WebElement myProfile;
	
	@FindBy(xpath="//li[text()='Logout']")
	private WebElement logout;

	public WebElement getProfileSetting() {
		return profileSetting;
	}

	public WebElement getMyProfile() {
		return myProfile;
	}

	public WebElement getLogout() {
		return logout;
	}
	
}
