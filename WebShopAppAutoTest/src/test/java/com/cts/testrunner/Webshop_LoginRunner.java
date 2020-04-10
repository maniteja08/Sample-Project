package com.cts.testrunner;

import org.junit.runner.RunWith;

import cucumber.api.CucumberOptions;
import cucumber.api.junit.Cucumber;
@RunWith(Cucumber.class)
@CucumberOptions(
		features = "src/main/resources/feature",
		glue= {"com.cts.stepdefination" },  	
		tags= {"@TC01_Webshopapp"},
		plugin = {"pretty", "json:target/cucumber-reports/Cucumber.json",
				"junit:target/cucumber-reports/Cucumber.xml",},
		monochrome = true
		)
public class Webshop_LoginRunner {
	
	
	
}
