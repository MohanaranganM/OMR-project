package com.stepDefin;

import java.awt.AWTException;

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
 * @see used to maintain login page step definition
 * @date 26/01/2023
 */
public class TC1_LoginStep extends BaseClass2 {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see used to perform login
	 * @param string
	 * @param string2
	 * @throws AWTException
	 */

	@When("User should Perform Login {string} and {string} with Enter Key")
	public void user_should_perform_login_and_with_enter_key(String string, String string2) throws AWTException {
		pom.getLoginPage().loginWithEnterKey(string, string2);
	}

	/**
	 * @see used to verify error msg login by invalid credentials
	 * @param expErrorMsg
	 */

	@Then("User should Verify Login with Invalid Login Credential and Error Message contains {string}")
	public void user_should_verify_login_with_invalid_login_credential_and_error_message_contains(String expErrorMsg) {

		WebElement error = pom.getLoginPage().getInValid();
		String text = getText(error);
		boolean b = text.contains(expErrorMsg);
		Assert.assertTrue("verify login error msg", b);
	}

}
