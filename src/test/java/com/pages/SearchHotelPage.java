package com.pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass2;

public class SearchHotelPage extends BaseClass2 {
	
	public SearchHotelPage() {
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy (id="location")
	private WebElement ddLocation;
	
	@FindBy (id="hotels")
	private WebElement ddHotels;
	
	@FindBy (id="room_type")
	private WebElement ddRoomType;
	
	@FindBy (id="room_nos")
	private WebElement ddNoOfRooms;
	
	@FindBy (id="datepick_in")
	private WebElement txtCheckInDate;
	
	@FindBy (id="datepick_out")
	private WebElement txtCheckOutDate;
	
	@FindBy (id="adult_room")
	private WebElement ddAdultsRoom;
	
	@FindBy (id="child_room")
	private WebElement ddChildrenRoom;
	
	@FindBy (id="Submit")
	private WebElement btnSubmit;
	
	@FindBy (id="checkin_span")
	private WebElement txtCheckInErrorMsg;
	
	@FindBy (id="checkout_span")
	private WebElement txtCheckOutErrorMsg;
	
	@FindBy (id="location_span")
	private WebElement txtLocationErrorMsg;

	@FindBy (id="username_show")
	private WebElement txtSelectHotelSuccessMsg;
	
	
	public WebElement getSuccessMsg() {
		return txtSelectHotelSuccessMsg;
	}

	public WebElement getNoCheckIn() {
		return txtCheckInErrorMsg;
	}

	public WebElement getNoCheckOut() {
		return txtCheckOutErrorMsg;
	}

	public WebElement getNoLocation() {
		return txtLocationErrorMsg;
	}
	
	public WebElement getlocation() {
		return ddLocation;
	}

	public WebElement gethotels() {
		return ddHotels;
	}

	public WebElement getroomType() {
		return ddRoomType;
	}

	public WebElement getnoOfRooms() {
		return ddNoOfRooms;
	}

	public WebElement getcheckInDate() {
		return txtCheckInDate;
	}

	public WebElement getcheckOutDate() {
		return txtCheckOutDate;
	}

	public WebElement getadultsRoom() {
		return ddAdultsRoom;
	}

	public WebElement getchildrenRoom() {
		return ddChildrenRoom;
	}

	public WebElement getsubmit() {
		return btnSubmit;
	}

	public void searchCommonPage(String location,String noOfRooms, 
			String checkInDate, String checkOutDate,String adultsRoom ) {
		selectByTextDropdown(getlocation(), location);
//		selectByIndex(getnoOfRooms(), 1);
		selectByTextDropdown(getnoOfRooms(), noOfRooms);
		clear(getcheckInDate());
		sendKeys(getcheckInDate(), checkInDate);
		clear(getcheckOutDate());
		sendKeys(getcheckOutDate(), checkOutDate);
		selectByTextDropdown(getadultsRoom(), adultsRoom);
	}	
			
	public void allFields(String location,String hotels, 
			String roomType, String noOfRooms,String CheckInDate,String CheckOutDate, String adultsRoom, String childrenRoom) {
		searchCommonPage(location, noOfRooms, CheckInDate, CheckOutDate, adultsRoom);
		//selectByIndex(gethotels(), 1);
		selectByTextDropdown(gethotels(), hotels);
		selectByTextDropdown(getroomType(), roomType);
		selectByTextDropdown(getchildrenRoom(), childrenRoom);
		click(getsubmit());
		
	}
	public void mandatoryFields(String location,String noOfRooms, 
			String checkInDate, String checkOutDate,String adultsRoom) {
		searchCommonPage(location, noOfRooms, checkInDate, checkOutDate, adultsRoom);
		click(getsubmit());
		
	}
	public void dateChecking(String location,String noOfRooms, 
			String checkInDate, String checkOutDate,String adultsRoom,String hotels, String roomType, String childrenRoom) {
		searchCommonPage(location, noOfRooms, checkInDate, checkOutDate, adultsRoom);
		selectByTextDropdown(gethotels(), hotels);
		selectByTextDropdown(getroomType(), roomType);
		selectByTextDropdown(getchildrenRoom(), childrenRoom);
		click(getsubmit());
	}
	public void clckSearch() {
		click(getsubmit());
	}
		
}
