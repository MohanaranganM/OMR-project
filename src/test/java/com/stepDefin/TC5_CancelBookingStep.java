package com.stepDefin;

import java.io.IOException;

import org.junit.Assert;
import org.openqa.selenium.WebElement;

import com.manager.PageObjectManager;

import io.cucumber.java.en.Then;

/**
 * 
 * @author MOHANARANGAN
 * @see used to maintein the stepDefiniton of cancel booking page
 */
public class TC5_CancelBookingStep {

	PageObjectManager pom = new PageObjectManager();

	/**
	 * @see used to cancel the generated order id after book the hotel
	 * @throws IOException
	 */

	@Then("User Should Cancel the Generated Order Id")
	public void user_should_cancel_the_generated_order_id() throws IOException {
		String confirmBooking = pom.getBookingConfirmationPage().bookingConfirmPageId();
		WebElement lnkBookedItinerary = pom.getBookingConfirmationPage().getLnkBookedItinerary();
		lnkBookedItinerary.click();
		pom.getCancelBookingPage().bookingCancelPage(confirmBooking);
	}

	/**
	 * @see used to get the success message after cancel the order id
	 * @param actCancelOrderIdSuccessMsg
	 */

	@Then("User Should Verify After Cancel Order Id Get success Message {string}")
	public void user_should_verify_after_cancel_order_id_get_success_message(String actCancelOrderIdSuccessMsg) {

		WebElement successMsg = pom.getCancelBookingPage().getSuccessMsg();
		String expCancelOrderIdSuccessMsg = successMsg.getText();
		Assert.assertEquals("verify cancel order id success msg", actCancelOrderIdSuccessMsg,
				expCancelOrderIdSuccessMsg);
	}

	/**
	 * @see used to cancel the exixting order id
	 * @param string
	 */

	@Then("User Should Cancel the Existing Order Id {string}")
	public void user_should_cancel_the_existing_order_id(String string) {
		pom.getBookingConfirmationPage().getLnkBookedItinerary().click();
		pom.getCancelBookingPage().bookingCancelPage(string);
	}

}
