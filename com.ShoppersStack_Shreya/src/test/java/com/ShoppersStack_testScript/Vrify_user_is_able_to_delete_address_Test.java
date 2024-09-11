package com.ShoppersStack_testScript;

import java.io.IOException;

import org.testng.annotations.Test;

import com.ShoppersStack_genericUtility.Base_Test;
import com.ShoppersStack_pom.MyAddress_page;
import com.ShoppersStack_pom.MyProfile_page;

public class Vrify_user_is_able_to_delete_address_Test extends Base_Test {
	
	@Test
	public void deleteAddress() throws InterruptedException, IOException {
		
		homePage.getProfileSetting().click();
		homePage.getMyProfile().click();
		
		MyProfile_page myProfile=new MyProfile_page(driver);
		myProfile.getMyAddressBtn().click();
		
		MyAddress_page myAddressPage=new MyAddress_page(driver);
		
		Thread.sleep(2000);
		myAddressPage.getDeleteBtn().click();
		Thread.sleep(3000);
		myAddressPage.getYesBtn().click();
		Thread.sleep(3000);
		driver.switchTo().alert().accept();
		
	
		webDriverUtility.getScreenshotOfCompleteWebPage();
	}

}
