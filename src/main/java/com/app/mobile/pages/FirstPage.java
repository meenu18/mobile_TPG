package com.app.mobile.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import io.appium.java_client.android.AndroidDriver;

public class FirstPage extends BasePage {
protected FirstPage(AndroidDriver driver) {
		super(driver);
}
	public SecondPage clickOnStraightFwdBtn(){
		 WebElement straightFwdBtn=driver.findElement(By.xpath("//android.widget.Button[contains(@text,'straightforward')]"));
		straightFwdBtn.click();
		return new SecondPage(driver);
	}
	public String getFirstPageText(){	
		WebElement firstPageText= driver.findElement(By.xpath("//android.widget.TextView[contains(@text,'1 OF 4')]"));
		//System.out.println("text is ....." + firstPageText.getText());
		return firstPageText.getText();	
	}
	public boolean verifyFirstPage(){
		String expectedText = "1 OF 4";
		return getFirstPageText().contains(expectedText);
	}
	
}
