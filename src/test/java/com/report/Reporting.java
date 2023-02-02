package com.report;

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.base.BaseClass2;

import net.masterthought.cucumber.Configuration;
import net.masterthought.cucumber.ReportBuilder;

public class Reporting extends BaseClass2 {

	public static void generateJvmReport(String jsonfile) throws IOException {
		
	
			File file = new File(getProjectPath()+getPropertyFileValue("jvmPath"));

		      Configuration configuration = new Configuration(file, "OMRBranchAutomation");

							
			configuration.addClassifications("Browser", "Chrome");
			configuration.addClassifications("Version", "108");
			configuration.addClassifications("Os", "WIN10");
			configuration.addClassifications("Sprint", "34");
			
			List<String> li = new ArrayList<String>();
			
			li.add(jsonfile);
			
			ReportBuilder builder = new ReportBuilder(li, configuration);
			
			builder.generateReports();
		} 	
		
		
	}


