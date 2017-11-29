package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class CloseCase extends Base{

	
	Hook hook = new Hook();
	WebApp_Obj WebApplications2 = new WebApp_Obj();
	
	@And("^Click on Close case$")
	public void click_on_Close_case() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnClosecase();
	}

	@Then("^Verify user is automatically navigated to Home screen form$")
	public void verify_user_is_automatically_navigated_to_Home_screen_form() throws Throwable {
	    String ActualTitleForCloseCase=WebApplications2.ReadTitleForCloseCase();
	    ActualTitleForCloseCase.equals("HOME SCREEN");
	}


}
