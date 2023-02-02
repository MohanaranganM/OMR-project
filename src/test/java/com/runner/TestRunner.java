package com.runner;

import java.io.IOException;

import org.junit.AfterClass;
import org.junit.runner.RunWith;

import com.base.BaseClass2;
import com.report.Reporting;

import io.cucumber.junit.Cucumber;
import io.cucumber.junit.CucumberOptions;


/**
 * 
 * @author MOHANARANGAN
 * @see used to execute the feature files
 * @Date 26/01/2023	
 */

@RunWith(Cucumber.class)
@CucumberOptions(tags = (""),stepNotifications = true,dryRun = false,monochrome = true,plugin = {"pretty","json:target\\index.json"},
                 features = "C:\\Users\\ADMIN\\eclipse-workspace\\OMRBranchAutomationNew\\src\\test\\resources\\Feature",glue = "com.stepDefin")
public class TestRunner extends BaseClass2{
	
	@AfterClass
	public static void afterClass() throws IOException {
		Reporting.generateJvmReport(getProjectPath()+getPropertyFileValue("jsonPath"));
	}
	
	
}

