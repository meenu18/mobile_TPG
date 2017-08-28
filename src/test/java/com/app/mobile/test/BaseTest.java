package com.app.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.android.AndroidDriver;

public abstract class BaseTest {
	public static AndroidDriver driver;
	@BeforeSuite(alwaysRun=true)
	public void initializeElement() throws MalformedURLException{
		
	File classpathRoot = new File(System.getProperty("user.dir"));
	File appDir = new File(classpathRoot, "/Apps/IAmBanking/");
	File app = new File(appDir, "IamBank-debug.apk");

	DesiredCapabilities capabilities = new DesiredCapabilities();
	capabilities.setCapability("BROWSER_NAME","");
	capabilities.setCapability("deviceName", "emulator-5554");//"Nexus_6_API_23");
	capabilities.setCapability("VERSION", "6.0");
	capabilities.setCapability("platformName", "Android");
	capabilities.setCapability("app", app.getAbsolutePath());
	capabilities.setCapability("appPackage", "com.iambank.debug");
	capabilities.setCapability("appActivity", "com.iambank.onboarding.ui.activity.IntroActivity");

	driver = new AndroidDriver(new URL("http://127.0.0.1:4723/wd/hub"), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);}
}

