package com.app.mobile.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.mobile.pages.CountryPage;
import com.app.mobile.pages.FirstPage;
import com.app.mobile.pages.IntroductoryPage;
import com.app.mobile.pages.NamePage;
import com.app.mobile.pages.NumberPage;
import com.app.mobile.pages.SecondPage;

public class StartApplicationTest extends BaseTest {
	String userName="meenakshi";
	String countryName= "ireland_imageBtn";
	String FlagIndexValue="3";
	String PhoneNumber="1234567890";
	String expectedText1 = "1 OF 4";
	String expectedText2 = "2 OF 4";
	String expectedNextText = "Next";
	String expectedIntroText = "Give us a chance, and we'll prove it.";
	String expectedLegalMsg = "For security, we'll need your full legal name.";
	String expectedNumberMsg = "We’ll use this to sign in later.";
	
	@Test
	public void launchAppTest() throws InterruptedException {
		IntroductoryPage introductoryPage = new IntroductoryPage(driver);		 
		 Assert.assertTrue(introductoryPage.verifyProveItPageText(expectedIntroText));
		 FirstPage firstPageobj =  introductoryPage.clickOnProveBtn();	
		 Assert.assertTrue(firstPageobj.verifyFirstPage(expectedText1));
		 SecondPage secondPage=firstPageobj.clickOnStraightFwdBtn();
		 Assert.assertTrue(secondPage.verifySecondPage(expectedText2));
		 CountryPage countryPage = secondPage.clickSkipBtn();
		 countryPage.clickOnCountryFlag(countryName);
		 Assert.assertTrue(countryPage.verifyCountryPage(expectedNextText));
		 NamePage namePage= countryPage.clickNextBtn();
		 Assert.assertTrue(namePage.verifyNamePage(expectedLegalMsg));
		 namePage.enterLegalName(userName);
		 NumberPage numberPage = namePage.clickNextBtn();
		 Assert.assertTrue(namePage.verifyNamePage(expectedNumberMsg));
		 numberPage.defaultFlagIcon();
		 numberPage.selectFlag(FlagIndexValue);
		 numberPage.enterNumber(PhoneNumber);
		 numberPage.clickNextBtn();
		 numberPage.popUpPage();
		 driver.quit();
	}

}
