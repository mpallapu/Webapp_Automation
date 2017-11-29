package com.dimagi.steps;

import junit.framework.Assert;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;


import cucumber.api.java.en.And;

public class ConstraintsFail extends Base {

	
	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();

	@And("^Select the Logic tests module$")
	public void select_the_Logic_tests_module() throws Throwable {
		WebApplications.ClickOnLogictests();
	}

	@And("^Select the constraints form$")
	public void select_the_constraints_form() throws Throwable {
		Thread.sleep(5000);
		WebApplications.ClickOnConstraints();
	}

	@And("^Answer test for the second question$")
	public void answer_test_for_the_second_question() throws Throwable {
		WebApplications.EnterTestInSecondQuestion("test");
	}

	@And("^Validate the error message:Fails to submit\\.$")
	public void validate_the_error_message_Fails_to_submit() throws Throwable {
		String actualText = WebApplications.ValidateErrorMessage();
		String expectedText = WebApplications.ValidateErrorMessage();
       Assert.assertEquals(actualText, expectedText);   
	}

	
}
