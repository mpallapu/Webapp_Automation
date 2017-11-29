package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;

public class Repeats extends Base{

	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();

	@And("^click on Repeats form$")
	public void click_on_Repeats_form() throws Throwable {
		WebApplications.ClickOnRepeats();
	}

	@And("^Proceed through the Repeats form$")
	public void proceed_through_the_Repeats_form() throws Throwable {
	   
	}

	
}
