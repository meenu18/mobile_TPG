package com.app.mobile.pages;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public  class IntroductoryPage extends BasePage{	
	@AndroidFindBy(xpath="//android.widget.Button[@text='Ok, so prove it!']")
	private WebElement proveItBtn;
	@AndroidFindBy(xpath="//android.widget.TextView[contains(@text,'chance')]")
	private WebElement proveItPageText;
	
	public IntroductoryPage(AndroidDriver driver) {
		super(driver);		
	}
	public FirstPage clickOnProveBtn(){	
		proveItBtn.click();
		return new FirstPage(driver);
		
	}
	public String getProveItPageText(){	
		return proveItPageText.getText();		
	}
	public boolean verifyProveItPageText(String expectedIntroText){
		return getProveItPageText().contains(expectedIntroText);
		}

}