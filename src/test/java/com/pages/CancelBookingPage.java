package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass2;

public class CancelBookingPage extends BaseClass2 {

	public CancelBookingPage() {
		PageFactory.initElements(driver, this);
	}

	@CacheLookup
	@FindBy(id = "order_id_text")
	private WebElement txtSearch;
	@CacheLookup
	@FindBy(id = "search_hotel_id")
	private WebElement btnGo;
	@CacheLookup
	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement chkOrder;
	@CacheLookup
	@FindBy(xpath = "(//input[@type='button'])[1]")
	private WebElement btnCancel;
    @CacheLookup
	@FindBy (id="search_result_error")
	private WebElement txtCancelSuccessMsg;
    
	public WebElement getSuccessMsg() {
		return txtCancelSuccessMsg;
	}
	public WebElement getTxtSearch() {
		return txtSearch;
	}
	public WebElement getBtnGo() {
		return btnGo;
	}
	public WebElement getCbOrder() {
		return chkOrder;
	}
	public WebElement getBtnCancel() {
		return btnCancel;
	}
	
	public void bookingCancelPage(String OrderNo) {
		
		sendKeys(getTxtSearch(), OrderNo);
		click(getBtnGo());
		click(getCbOrder());
		click(getBtnCancel());
		cliclOkAlert();
	}
}
