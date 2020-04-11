package com.cts.testrunner;


import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.cucumber.listener.Reporter;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;

@RunWith(Cucumber.class)
@CucumberOptions(features = "src/main/resources/feature",
				/* plugin = { "pretty","json:target/cucumber-reports/Cucumber.json",
						 "junit:target/cucumber-reports/Cucumber.xml",
						"com.cucumber.listener.ExtentCucumberFormatter:target/cucumber-reports/Extent_report.html"
						 },*/
						 plugin = { "pretty", "html:reports/cucumber-html-report",
									"json:reports/cucumber-html-report/jsonreport",
									"com.cucumber.listener.ExtentCucumberFormatter:reports/Extentreports/Extentreport.html" },
				 glue= {"com.cts.stepdefination"},
				 monochrome=true
						)
public class Webshop_Checkoutrunner {
	@AfterClass
	public static void extendReport() {
		Reporter.loadXMLConfig("src/test/resources/extent_config.xml");
		Reporter.setSystemInfo("user", System.getProperty("user.name"));
		Reporter.setSystemInfo("os", "Windows");
		Reporter.setTestRunnerOutput("Sample test runner output message");
	}

}
