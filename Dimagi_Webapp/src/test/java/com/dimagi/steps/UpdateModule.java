package com.dimagi.steps;

import junit.framework.Assert;

import com.webapps.base.Base;
import com.webapps.pageobjects.SelectAProject_Obj;
import com.webapps.pageobjects.SignInPage_Obj;
import com.webapps.pageobjects.WebApp_Obj;


import cucumber.api.java.en.Then;

public class UpdateModule extends Base {
	
	SignInPage_Obj signpage= new SignInPage_Obj();
	SelectAProject_Obj selectProject = new SelectAProject_Obj();
	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();
	
	@Then("^Click on Webapps$")
	public void click_on_Webapps() throws Throwable {
		selectProject.selectapplication1();
	}

	@Then("^Verify user is navigated to Webapps page$")
	public void verify_user_is_navigated_to_Webapps_page() throws Throwable {
		String actualText = WebApplications.checkwebappsText();
		String expectedText = "Applications";
       Assert.assertEquals(actualText, expectedText);   
	}

	@Then("^Click on Cloudcare application$")
	public void click_on_Cloudcare_application() throws Throwable {
		Thread.sleep(10000);
        WebApplications.ClickOnCloudcare();
	}

	@Then("^Click on Question Checks\\.$")
	public void click_on_Question_Checks() throws Throwable {
		WebApplications.ClickOnQuestionChecks();
	}

	@Then("^Click on Update Test\\.$")
	public void click_on_Update_Test() throws Throwable {
		WebApplications.ClickOnUpdateTest();
	}

	@Then("^Verify only one question is displayed\\(Verify Question (\\d+) is present\\)$")
	public void verify_only_one_question_is_displayed_Verify_Question_is_present(int arg1) throws Throwable {
		if(WebApplications.countQuestions()>1){
			Assert.assertTrue(false);
		}
		else
		{
			WebApplications.EnterValue();
			WebApplications.ClickOnSubmit();
		}
	}

	}



