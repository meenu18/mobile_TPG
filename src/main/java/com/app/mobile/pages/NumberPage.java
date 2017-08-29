package com.app.mobile.pages;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.appium.java_client.android.AndroidDriver;

public class NumberPage extends BasePage {
	String FlagIndexValue="4";
	public NumberPage(AndroidDriver driver){
		super(driver);
	}
	public NumberPage defaultFlagIcon(){
		WebElement defaultFlag=driver.findElement(By.xpath("//android.widget.Spinner/android.widget.LinearLayout[@index='0']"));
		//[@resource-id='com.iambank.debug:id/spinner']
		defaultFlag.click();		
		return new NumberPage(driver);
	}
	
	public void selectFlag(){
		WebElement flagIcon=driver.findElement(By.xpath("//android.widget.ListView/android.widget.LinearLayout[@index='"+FlagIndexValue+"']"));
		flagIcon.click();
		
		
	}

}
