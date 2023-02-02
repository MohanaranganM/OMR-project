package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass2;

public class SelectHotelPage extends BaseClass2 {
	
	public SelectHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(id="radiobutton_0")
	private WebElement radButton;
	
	@FindBy(id="continue")
	private WebElement btnContinue;
	
	@FindBy (xpath="//td[@class='login_title']")
	private WebElement txtSelectHotelSuccessMsg;
	
	@FindBy (id="radiobutton_span")
	private WebElement txtSelectHotelErrorMsg;
	
	public WebElement getSelectHotelSuccessMsg() {
		return txtSelectHotelSuccessMsg;
	}

	public WebElement getSelectHotelErrorMsg() {
		return txtSelectHotelErrorMsg;
	}

	public WebElement getRadiobutton() {
		return radButton;
	}

	public WebElement getClickcontinue() {
		return btnContinue;
	}

	public void selecthotels() {
		click(getRadiobutton());
		click(getClickcontinue());
	}	


	public void clckContinue() {
		click(getClickcontinue());
	}
}
