package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class Groups extends Base{

	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();

	@Given("^Click on Groups form$")
	public void click_on_Groups_form() throws Throwable {
		WebApplications.ClickOnGroups();
	}

	@Given("^Proceed through the form$")
	public void proceed_through_the_form() throws Throwable {
	   
	}

	
	
	
	
	
}



