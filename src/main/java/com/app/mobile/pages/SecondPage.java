package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class SecondPage extends BasePage {
	public SecondPage(AndroidDriver driver) {
		super(driver);
	}

	public CountryPage clickSkipBtn(){
		 WebElement skipBtn=driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'Skip')]"));
		skipBtn.click();
		return new CountryPage(driver);
	}
	public String getSecondPageText(){	
		WebElement firstPageText= driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'2 OF 4')]"));
		//System.out.println("text is ....." + firstPageText.getText());
		return firstPageText.getText();	
	}
	public boolean verifySecondPage(){
		String expectedText = "2 OF 4";
		return getSecondPageText().contains(expectedText);
	}
	
}
