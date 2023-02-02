package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass2;

public class BookHotelPage extends BaseClass2 {
	
	public BookHotelPage() {
		PageFactory.initElements(driver,this);
		
	}
	
	@FindBy(id="first_name")
	private WebElement txtFirstName;
	
	@FindBy(id="last_name")
	private WebElement txtLastName;
	
	@FindBy(id="address")
	private WebElement txtBillingAddress;
	
	@FindBy(id="cc_num")
	private WebElement txtCreditCard;
	
	@FindBy(id="cc_type")
	private WebElement ddCreditCardtype;
	
	@FindBy(id="cc_exp_month")
	private WebElement ddExpMonth;
	
	@FindBy(id="cc_exp_year")
	private WebElement ddExpYear;
	
	@FindBy(id="cc_cvv")
	private WebElement ccv;
	
	@FindBy(id="book_now")
	private WebElement btnBookNow;
	
	@FindBy (xpath="//td[text()='Book A Hotel ']")
	private WebElement txtBookAHotelSuccessMsg;
	
	@FindBy (id="first_name_span")
	private WebElement txtFirstNameErrorMsg;
	
	@FindBy (id="last_name_span")
	private WebElement txtLastNameErrorMsg;
	
	@FindBy (id="address_span")
	private WebElement txtAddressErrorMsg;
	
	@FindBy (id="cc_num_span")
	private WebElement txtCreditCardErrorMsg;
	
	@FindBy (id="cc_type_span")
	private WebElement txtCardTypeErrorMsg;
	
	@FindBy (id="cc_expiry_span")
	private WebElement txtCardExpErrorMsg;
	
	@FindBy (id="cc_cvv_span")
	private WebElement txtCvvErrorMsg;
	
	
	

	public WebElement getBookAHotelSuccessMsg() {
		return txtBookAHotelSuccessMsg;
	}

	public WebElement getFirstNameErrorMsg() {
		return txtFirstNameErrorMsg;
	}

	public WebElement getLaststNameErrorMsg() {
		return txtLastNameErrorMsg;
	}

	public WebElement getAddressErrorMsg() {
		return txtAddressErrorMsg;
	}

	public WebElement getCreditCardErrorMsg() {
		return txtCreditCardErrorMsg;
	}

	public WebElement getCardTypeErrorMsg() {
		return txtCardTypeErrorMsg;
	}

	public WebElement getCardExpErrorMsg() {
		return txtCardExpErrorMsg;
	}

	public WebElement getCvvErrorMsg() {
		return txtCvvErrorMsg;
	}

	public WebElement getFirstname() {
		return txtFirstName;
	}

	public WebElement getLastname() {
		return txtLastName;
	}

	public WebElement getBillingAddress() {
		return txtBillingAddress;
	}

	public WebElement getCreditCard() {
		return txtCreditCard;
	}

	public WebElement getCreditcardtype() {
		return ddCreditCardtype;
	}

	public WebElement getExpmonth() {
		return ddExpMonth;
	}

	public WebElement getExpyear() {
		return ddExpYear;
	}

	public WebElement getCardccv() {
		return ccv;
	}

	public WebElement getBooking() {
		return btnBookNow;
	}
	public void selectAllFields(String firstName,String lastName,String billingAddress,String creditCard,String creditCardType,String expMonth,String expYear,String ccv ) {
		
		sendKeys(getFirstname(), firstName);
		sendKeys(getLastname(), lastName);
		sendKeys(getBillingAddress(), billingAddress);
		sendKeys(getCreditCard(), creditCard);
		selectByTextDropdown(getCreditcardtype(), creditCardType);
		selectByTextDropdown(getExpmonth(), expMonth);
		selectByTextDropdown(getExpyear(), expYear);
		sendKeys(getCardccv(), ccv);
		click(getBooking());
	}
	public void clickBookNow() {
		click(getBooking());	
	}
		
}
