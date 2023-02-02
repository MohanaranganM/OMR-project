package com.stepDefin;

import java.io.FileNotFoundException;
import java.io.IOException;

import com.base.BaseClass2;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.Scenario;

public class Hooks extends BaseClass2 {
	
	@Before
	public void beforeScenario() throws FileNotFoundException, IOException {

		browserLaunch(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
		maximize();
		implicityWait(10);
	}

	@After
	public void afterScenario(Scenario scenario) {
		
		scenario.attach(screenShot(), "Image/png", "EveryScenario");
		
	    closeCurrentWindow();
	}


}
