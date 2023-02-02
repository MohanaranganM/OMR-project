package com.pages;

import java.awt.AWTException;
import java.awt.RenderingHints.Key;
import java.awt.Robot;
import java.awt.event.KeyEvent;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.base.BaseClass2;

public class LoginPage extends BaseClass2 {
	
	public LoginPage() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id="username")
	private WebElement txtUserName;
	
	@FindBy (id="password")
	private WebElement txtPassword;
	
	@FindBy (id="login")
	private WebElement btnLogin;
	
	@FindBy (xpath="//b[contains(text(),'Invalid')]")
	private WebElement txtErrorMsg;

	public WebElement getInValid() {
		return txtErrorMsg;
	}

	public WebElement getuserName() {
		return txtUserName;
	}

	public WebElement getpassword() {
		return txtPassword;
	}

	public WebElement getbtnLogin() {
		return btnLogin;
	}
	public void loginCommonSteps(String userName, String password) {
		
		sendKeys(getuserName(), userName);
		sendKeys(getpassword(), password);
	}
	public void login(String userName, String password) {
		loginCommonSteps(userName, password);
		click(getbtnLogin());
	}
	public void loginWithEnterKey(String userName, String password) throws AWTException {
		loginCommonSteps(userName, password);
		robotkey(KeyEvent.VK_TAB);
		robotkey(KeyEvent.VK_TAB);
		robotkey(KeyEvent.VK_ENTER);
	}
}
