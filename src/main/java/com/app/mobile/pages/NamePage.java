package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class NamePage extends BasePage {

	protected NamePage(AndroidDriver driver) {
		super(driver);
	}
	public void enterLegalName(){
		WebElement nameTextBox=driver.findElement(By.xpath("//android.widget.EditText[contains(@resource-id,'com.iambank.debug:id/legal_name')]"));
		nameTextBox.sendKeys("meenakshi");
	}
	public NumberPage clickNextBtn(){
		WebElement nextBtn=driver.findElement(By.xpath("//android.widget.Button[@text='Next']"));
		nextBtn.click();
		return new NumberPage(driver);
	}

}
