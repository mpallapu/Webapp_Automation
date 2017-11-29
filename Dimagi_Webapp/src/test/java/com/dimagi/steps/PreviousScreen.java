package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;
import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class PreviousScreen extends Base{

	Hook hook = new Hook();
	WebApp_Obj WebApplications2 = new WebApp_Obj();
	
	@And("^Click on PreviousScreen$")
	public void click_on_PreviousScreen() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnPreviousScreen();
	}

	@And("^Select case created in Navigation (\\d+)$")
	public void select_case_created_in_Navigation(int arg1) throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnHello();
	}

	@And("^Click on Continue$")
	public void click_on_Continue() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnContinue();
	}

	@And("^Enter value$")
	public void enter_value() throws Throwable {
		WebApplications2.EnterPreviousScreenQSN("previous");
	}

	@Then("^Verify that user should return to Case list Previous form$")
	public void verify_that_user_should_return_to_Case_list_Previous_form() throws Throwable {
	String actualPagetitle=WebApplications2.ReadPageTitle();
	actualPagetitle.compareTo("PREVIOUS SCREEN");
	}

}
