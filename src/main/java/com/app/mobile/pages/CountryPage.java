package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.pagefactory.AndroidFindBy;

public class CountryPage extends BasePage {
	
	/*@AndroidFindBy(xpath="//android.widget.ImageView[contains(@resource-id,'com.iambank.debug:id/$countryName')]")
	private WebElement countryBtn;*/
	@AndroidFindBy(xpath="//android.widget.Button[contains(@text,'Next')]")
	private WebElement nextBtn;	
	
	public CountryPage(AndroidDriver driver) {
		super(driver);
	}
	
	public CountryPage clickOnCountryFlag(String countryName) {
		WebElement countryBtn=driver.findElement(By.xpath("//android.widget.ImageView[contains(@resource-id,'com.iambank.debug:id/"+countryName+"')]"));
		countryBtn.click();
		return new CountryPage(driver);
	}
	
	public NamePage clickNextBtn() {
		nextBtn.click();
		return new NamePage(driver);		
	}
	
	public boolean verifyCountryPage(String expectedNextText) {
		String NextBtn= nextBtn.getText();		
		if (NextBtn.contains(expectedNextText)){
			return true;
		} else {
		
		return false;
	}
		}
	

}
