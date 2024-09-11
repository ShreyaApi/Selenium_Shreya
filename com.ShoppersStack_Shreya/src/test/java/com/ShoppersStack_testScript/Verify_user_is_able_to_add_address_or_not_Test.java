package com.ShoppersStack_testScript;

import java.io.IOException;

import org.apache.poi.EncryptedDocumentException;
import org.testng.annotations.Test;

import com.ShoppersStack_genericUtility.Base_Test;
import com.ShoppersStack_pom.AddressForm_page;
import com.ShoppersStack_pom.MyAddress_page;
import com.ShoppersStack_pom.MyProfile_page;

public class Verify_user_is_able_to_add_address_or_not_Test extends Base_Test{
	
	@Test
	public void addAddress() throws EncryptedDocumentException, IOException {
		homePage.getProfileSetting().click();
		homePage.getMyProfile().click();
		
		MyProfile_page myProfile=new MyProfile_page(driver);
		myProfile.getMyAddressBtn().click();
		
		MyAddress_page myAddress=new MyAddress_page(driver);
		myAddress.getAddAddressBtn().click();		
		
		AddressForm_page addressForm=new AddressForm_page(driver);
		addressForm.getOfficeBtn().click();
		addressForm.getNameTf().sendKeys(file.readExcelData("Sheet2", 1, 0));
		addressForm.getHouseTf().sendKeys(file.readExcelData("Sheet2", 1, 1));
		addressForm.getStreetTf().sendKeys(file.readExcelData("Sheet2", 1, 2));
		addressForm.getLandmarkTf().sendKeys(file.readExcelData("Sheet2", 1, 3));
		addressForm.getCountryDD().sendKeys(file.readPropertyData("country"));
		addressForm.getStateDD().sendKeys(file.readPropertyData("state"));
		addressForm.getCityDD().sendKeys(file.readPropertyData("city"));
		addressForm.getPincodeTf().sendKeys(file.readExcelData("Sheet2", 1, 4));
		addressForm.getPhoneNumberTf().sendKeys(file.readExcelData("Sheet2", 1, 5));
		addressForm.getAddAddressBtn().click();
		
		
	}

}
