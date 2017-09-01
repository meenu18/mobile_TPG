package com.app.mobile.pages;

import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.pagefactory.AjaxElementLocatorFactory;

import io.appium.java_client.AppiumDriver;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidKeyCode;
import io.appium.java_client.pagefactory.AppiumFieldDecorator;

public class BasePage {
	private static final int TimeoutValue = 100;
	protected static AndroidDriver driver;

	protected BasePage(AndroidDriver driver) {
		this.driver = driver;   
		//((AppiumDriver) driver).sendKeyEvent(AndroidKeyCode.ENTER);
		//PageFactory.initElements(new AjaxElementLocatorFactory(driver, TimeoutValue), this);
		PageFactory.initElements(new AppiumFieldDecorator(driver), this);
	}
	
}
