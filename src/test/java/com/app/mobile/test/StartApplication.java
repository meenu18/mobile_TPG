package com.app.mobile.test;

import org.testng.Assert;
import org.testng.annotations.Test;
import com.app.mobile.pages.CountryPage;
import com.app.mobile.pages.FirstPage;
import com.app.mobile.pages.IntroductoryPage;
import com.app.mobile.pages.NamePage;
import com.app.mobile.pages.NumberPage;
import com.app.mobile.pages.SecondPage;

public class StartApplication extends BaseTest {

	
	@Test
	public void launchApp() throws InterruptedException{
		IntroductoryPage introductoryPage = new IntroductoryPage(driver);		 
		 Assert.assertTrue(introductoryPage.verifyProveItPageText(), "texts are present");
		 FirstPage firstPageobj =  introductoryPage.clickOnProveBtn();	
		 Assert.assertTrue(firstPageobj.verifyFirstPage(),"page 1 of 4");
		 SecondPage secondPage=firstPageobj.clickOnStraightFwdBtn();
		 Assert.assertTrue(secondPage.verifySecondPage(),"page 2 of 4");
		 CountryPage countryPage = secondPage.clickSkipBtn();
		 countryPage.clickOnCountryIcon();
		 Assert.assertTrue(countryPage.verifyCountryPage(), "Next btn enable..");
		 NamePage namePage= countryPage.clickNextBtn();
		 namePage.enterLegalName();
		 NumberPage numberPage = namePage.clickNextBtn();
		 numberPage.defaultFlagIcon();
		 numberPage.selectFlag();
		driver.quit();
}
	
	

}
