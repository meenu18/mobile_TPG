package com.app.mobile.pages;

import io.appium.java_client.android.AndroidDriver;

public class BasePage {
	protected static AndroidDriver driver;

	protected BasePage(AndroidDriver driver) {
		this.driver = driver;      
	}
}
