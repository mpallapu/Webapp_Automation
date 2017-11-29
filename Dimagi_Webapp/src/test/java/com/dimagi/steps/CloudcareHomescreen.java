package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.SignInPage_Obj;
import com.webapps.pageobjects.WebApp_Obj;


import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CloudcareHomescreen extends Base{

	Hook hook = new Hook();
	WebApp_Obj WebApplications2 = new WebApp_Obj();
	SignInPage_Obj signpage = new SignInPage_Obj();

	@Given("^Signup page for Mobile user$")
	public void signup_page_for_Mobile_user() throws Throwable {
		    hook.loginAsMobileUser();
		    signpage.clickOnSignInLink();
			signpage.enterUsername(prop.getProperty("musername"));
			signpage.enterPassword(prop.getProperty("mpassword"));
			signpage.clickOnSignBTN();
	}

	@And("^Click on Basictests$")
	public void click_on_Basictests() throws Throwable {
		WebApplications2.ClickOnBasicTestsEON();
	}

	@And("^Click on End of form navigation$")
	public void click_on_End_of_form_navigation() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnEON();
	}

	@And("^Click on Home screen$")
	public void click_on_Home_screen() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnHomeScreen();
	}

	@And("^Enter any data$")
	public void enter_any_data() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.EnterHomeScreenQSN("Hello");
	}

	@Then("^Verify User should brought to the Home screen$")
	public void verify_User_should_brought_to_the_Home_screen() throws Throwable {
		Thread.sleep(5000);
		String actBreadCrumbText=WebApplications2.ReadBreadCrumbText();
		actBreadCrumbText.compareTo("BASIC TESTS EON");
	}



}

