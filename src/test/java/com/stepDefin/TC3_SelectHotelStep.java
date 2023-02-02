package com.stepDefin;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author MOHANARANGAN
 * @see used to maintain the select hotel page stepdefinitions
 * @Date 26/01/2023
 * 
 */
public class TC3_SelectHotelStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see used to select the hotel
	 */

	@Then("User Should perform select hotel")
	public void user_should_perform_select_hotel() {

		pom.getSelectHotelPage().selecthotels();

	}

	/**
	 * @see used to verify success message after select the hotel
	 * @param actSelectHotelSuccessMsg
	 */

	@Then("User Should Verify After Select Hotel Success Message {string}")
	public void user_should_verify_after_select_hotel_success_message(String actSelectHotelSuccessMsg) {
		WebElement selectHotelSuccessMsg = pom.getBookHotelPage().getBookAHotelSuccessMsg();
		String expSelectHotelSuccessMsg = selectHotelSuccessMsg.getText();
		Assert.assertEquals("verify select hotel success msg", actSelectHotelSuccessMsg, expSelectHotelSuccessMsg);
	}

	/**
	 * @see used to select the hotel without filling any fields
	 */

	@Then("User Should perform  without selecting hotel field")
	public void user_should_perform_without_selecting_hotel_field() {
		pom.getSelectHotelPage().clckContinue();
	}

	/**
	 * @see used to verify the error message after click select hotel without
	 *      filling any fields
	 * @param actSelectHotelErrorMsg
	 */

	@Then("User should Verify After selecting hotel error Message {string}")
	public void user_should_verify_after_selecting_hotel_error_message(String actSelectHotelErrorMsg) {

		WebElement selectHotelErrorMsg = pom.getSelectHotelPage().getSelectHotelErrorMsg();
		String expSelectHotelErrorMsg = selectHotelErrorMsg.getText();
		Assert.assertEquals("verify select hotel error msg", actSelectHotelErrorMsg, expSelectHotelErrorMsg);
	}

}
