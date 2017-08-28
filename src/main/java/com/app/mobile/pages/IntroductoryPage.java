package com.app.mobile.pages;

import io.appium.java_client.android.AndroidDriver;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public  class IntroductoryPage extends BasePage{	
	
	public IntroductoryPage(AndroidDriver driver) {
		super(driver);
		
	}
	public FirstPage clickOnProveBtn(){	
		WebElement proveItBtn= driver.findElement(By.xpath("//android.widget.Button[@text='Ok, so prove it!']"));
		proveItBtn.click();
		return new FirstPage(driver);
		
	}
	public String getProveItPageText(){	
		 WebElement proveItPageText= driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'chance')]"));
		return proveItPageText.getText();		
	}
	public boolean verifyProveItPageText(){
		String expectedText = "Give us a chance, and we'll prove it.";
		return getProveItPageText().contains(expectedText);
		}

}