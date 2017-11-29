package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.ApplicationSettings_Obj;
import cucumber.api.java.en.Then;

public class BasicModule_DisableWebApp extends Base{
	CommonStepsInBasicModule commonObject=new CommonStepsInBasicModule();
	ApplicationSettings_Obj appSettingsObj=new ApplicationSettings_Obj();
	@Then("^Deselecting webapp checkbox to deploy new version$")
	public void Deselecting_webapp_checkbox_to_deploy_new_version() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	   boolean operationStatus= appSettingsObj.WebAPPCheckboxUncheck();
	   CommonStepsInBasicModule.status = operationStatus;
	   	 }
	}
