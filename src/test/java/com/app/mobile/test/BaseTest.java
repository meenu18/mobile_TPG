package com.app.mobile.test;

import java.io.File;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.BeforeSuite;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.service.local.AppiumDriverLocalService;
import io.appium.java_client.service.local.AppiumServiceBuilder;

public abstract class BaseTest {
	 public static AndroidDriver<MobileElement> driver;
    //String appiumServiceUrl="http://127.0.0.1:4723/wd/hub";
    String Appium_Node_Path="C:\\Program Files\\nodejs\\node.exe";
    String Appium_JS_Path="C:\\Program Files (x86)\\Appium\\node_modules\\appium\\bin\\appium.js";
    
	@BeforeSuite(alwaysRun=true)
	public void setUp() throws MalformedURLException, Exception {
		AppiumDriverLocalService appiumService = AppiumDriverLocalService.buildService(new AppiumServiceBuilder()
		.usingDriverExecutable(new File (Appium_Node_Path))
		.withAppiumJS(new File (Appium_JS_Path))
		.withLogFile(new File("D:\\apiumlogs\\logs.txt")));
		appiumService.start();
		Thread.sleep(2000);
        //String appiumServiceUrl = appiumService.getUrl().toString();
		String appiumServiceUrl="http://127.0.0.1:4723/wd/hub";
        System.out.println("Appium Service Address : - "+ appiumServiceUrl);
		
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

	driver = new AndroidDriver<MobileElement>(new URL(appiumServiceUrl), capabilities);
	driver.manage().timeouts().implicitlyWait(80, TimeUnit.SECONDS);
	//appiumService.stop();
	}
	
	
}

