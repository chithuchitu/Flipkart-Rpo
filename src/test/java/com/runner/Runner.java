package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.runner.RunWith;

import com.baseclass.BaseClass;
import com.property.ConfigurationHelper;



@RunWith(cucumber.api.junit.Cucumber.class)
@cucumber.api.CucumberOptions(features="src\\test\\resources\\FeatureFiles",
glue="com.stepdefinition",
monochrome = true,
dryRun = false,
plugin = {"html:Reports/facebook_cucumber_report.html","pretty",
		"com.cucumber.listener.ExtentCucumberFormatter:Reports/ExtendReport.html",
		"json:Reports/JsonFile.json"})




public class Runner  extends BaseClass {
	 
	 @BeforeClass
	public static  void setUp() throws Exception {
		launchBrowser(ConfigurationHelper.getInstance().getBrowser());
		chromeOptions();
		launchUrl(ConfigurationHelper.getInstance().getUrl());
				
 
	}
	 @AfterClass
	 
	public static  void tearDown() {
		driver.quit();

	}

}
