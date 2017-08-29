package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class CountryPage extends BasePage {
	String countryIcon= "ireland_imageBtn";
	
	
	public CountryPage(AndroidDriver driver) {
		super(driver);
	}
	public CountryPage clickOnCountryIcon(){
		WebElement countryBtn=driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'com.iambank.debug:id/"+countryIcon+"')]"));
		countryBtn.click();
		return new CountryPage(driver);
	}
	public NamePage clickNextBtn(){
		WebElement nextBtn=driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Next')]"));
		nextBtn.click();
		return new NamePage(driver);
		
	}
	public boolean verifyCountryPage(){
		WebElement nextBtn=driver.findElement(By.xpath("//android.widget.Button[contains(@text,'Next')]"));
		String NextBtn= nextBtn.getText();
		String expectedText = "Next";
		if (NextBtn.contains(expectedText)){
			return true;
		}else {
		
		return false;
	}}
	

}
