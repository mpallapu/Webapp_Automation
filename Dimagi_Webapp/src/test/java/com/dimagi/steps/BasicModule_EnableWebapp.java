package com.dimagi.steps;

import com.webapps.pageobjects.ApplicationSettings_Obj;

import cucumber.api.java.en.Then;

public class BasicModule_EnableWebapp {
	CommonStepsInBasicModule basic=new CommonStepsInBasicModule();
	ApplicationSettings_Obj appSettingsObj=new ApplicationSettings_Obj();
	@Then("^Selecting webapp checkbox to deploy new version$")
	public void Selecting_webapp_checkbox_to_deploy_new_version() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   boolean operationStatus= appSettingsObj.WebAPPCheckboxCheck();
	   CommonStepsInBasicModule.status = operationStatus;
	    }
}
