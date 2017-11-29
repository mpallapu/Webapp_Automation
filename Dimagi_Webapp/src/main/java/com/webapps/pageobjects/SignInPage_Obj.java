package com.webapps.pageobjects;

import org.openqa.selenium.WebElement;
//import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapps.base.Base;

public class SignInPage_Obj extends Base{

	@FindBy(how = How.XPATH, using = "//*[@class='btn btn-primary navbar-btn']")
	private WebElement SignIn_lnk;
	
	@FindBy(how = How.ID, using = "id_auth-username")
	private WebElement Username;
	
	@FindBy(how = How.ID, using = "id_auth-password")
	private WebElement Password;
	
	@FindBy(how = How.XPATH, using = "//*[text()=('Sign In') and @type='submit']")
	private WebElement SignIn_BTN;
	
	@FindBy(how = How.XPATH, using = "//div[@id='hq-messages-container']/following::div[2]/h1")
	private WebElement WelcomeNote;
	
	public SignInPage_Obj()
	{
		PageFactory.initElements(driver, this);
	}
	
	public void clickOnSignInLink()
	{
		SignIn_lnk.click();
	}
	
	public void enterUsername(String username)
	{
		Username.sendKeys(username);
	}
	
	public void enterPassword(String password)
	{
		Password.sendKeys(password);
	}
	
	public void clickOnSignBTN()
	{
		SignIn_BTN.click();
	}
	public String readWelcomeText()
	{
		String Welcometext = WelcomeNote.getText();
		System.out.println(Welcometext);
		return Welcometext;
	}
}
