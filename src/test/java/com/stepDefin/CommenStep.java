package com.stepDefin;

import java.io.FileNotFoundException;

import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.base.BaseClass2;
import com.manager.PageObjectManager;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

/**
 * 
 * @author MOHANARANGAN
 * @see used to maintain all common steps
 * @date 26/01/2023
 */

public class CommenStep extends BaseClass2 {
	PageObjectManager pom = new PageObjectManager();

	/**
	 * 
	 * @see used to launch webpage
	 * @throws IOException
	 */
	@Given("User is on the Adactin Page")
	public void userIsOnTheAdactinPage() throws IOException {
		browserLaunch(getPropertyFileValue("browser"));
		getUrl(getPropertyFileValue("url"));
		maximize();
		implicityWait(20);
	}

	/**
	 * @see used to perform login
	 * @param userName
	 * @param password
	 */
	@When("User Should Perform Login {string} and {string}")
	public void userShouldPerformLogin(String userName, String password) {
		pom.getLoginPage().login(userName, password);

	}

	/**
	 * @see used to verify success msg after login
	 * @param actLoginSuucessMsg
	 */
	@Then("User Should Verify After Login Success Message {string}")
	public void userShouldVerifyAfterLoginSuccessMessage(String actLoginSuucessMsg) {
		WebElement successMsg2 = pom.getSearchHotelPage().getSuccessMsg();
		String expLoginSuucessMsg = getAttribute(successMsg2);
		Assert.assertEquals("Verify after login success message", actLoginSuucessMsg, expLoginSuucessMsg);
	}
}
