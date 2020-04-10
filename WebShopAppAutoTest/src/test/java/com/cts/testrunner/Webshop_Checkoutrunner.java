package com.cts.testrunner;

import java.io.File;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature", 
				 glue = { "com.cts.stepdefination" },
				 plugin = { "pretty", "json:target/cucumber-reports/Cucumber.json",
							"junit:target/cucumber-reports/Cucumber.xml",
							"com.cucumber.listener.ExtentCucumberFormatter:target/html/ExtentReport.html "
							}
				)
public class Webshop_Checkoutrunner {
	@AfterClass
	public static void setup()
	{
	Reporter.loadXMLConfig(new File("C:\\Users\\iVIS\\git\\sample_selenium_project\\WebShopAppAutoTest\\src\\test\\resources\\extent_config.xml"));
	Reporter.setSystemInfo("Test User", System.getProperty("user.name"));
	Reporter.setSystemInfo("User Name", "maniteja");
	Reporter.setSystemInfo("Application Name", "webshop app");
	Reporter.setSystemInfo("Operating System Type", System.getProperty("os.name").toString());
	Reporter.setSystemInfo("Environment", "Production");
	Reporter.setTestRunnerOutput("Test Execution Cucumber Report");
	}
	}

