package com.ShoppersStack_genericUtility;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.io.FileHandler;
import org.openqa.selenium.support.ui.Select;

public class WebDriver_Utility {
  
	Java_Utility javaUtility=new Java_Utility();
	
	Select sel;
	
	public void SelectbyValue(WebElement ele,String value) {
		sel=new Select(ele);
		sel.selectByValue(value);
		}
	
	public void selectbyIndex(WebElement ele,int index) {
		
		sel=new Select(ele);
		sel.selectByIndex(index);
		}
	
	public void SelectbyvisibleText(WebElement ele,String text) {
		sel=new Select(ele);
		sel.selectByVisibleText(text);
	}
	
	public void deSelectbyValue(WebElement ele,String value) {
		sel=new Select(ele);
		sel.deselectByValue(value);
	}
	
	public void deSelectByIndex(WebElement ele,int index) {
		sel=new Select(ele);
		sel.deselectByIndex(index);
	}
	
	public void deSelctbyVisibleText(WebElement ele,String text) {
		sel=new Select(ele);
		sel.deselectByVisibleText(text);
	}
	
	public void deSelectAll(WebElement ele) {
		sel=new Select(ele);
		sel.deselectAll();
	}	
		
		public void  getScreenshotOfCompleteWebPage() throws IOException {
			TakesScreenshot ts=(TakesScreenshot)Base_Test.sDriver;
			File temp = ts.getScreenshotAs(OutputType.FILE);
			File dest=new File(Framework_Constants.screenshotPath+javaUtility.localDateTime()+".png");
			FileHandler.copy(temp, dest);
			
		}
		
		public void getScreenshotOfWebElement(WebElement element) throws IOException {
			File temp=element.getScreenshotAs(OutputType.FILE);
			File dest=new File(Framework_Constants.screenshotPath+javaUtility.localDateTime()+".png");
			FileHandler.copy(temp, dest);
			
		


}

}


