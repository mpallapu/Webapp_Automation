package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;
import cucumber.api.java.en.And;

public class ModuleScreen extends Base{
	Hook hook = new Hook();
	WebApp_Obj WebApplications2 = new WebApp_Obj();
	
	
	@And("^Click on ModuleScreen$")
	public void click_on_ModuleScreen() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.ClickOnModuleScreen();
	}

	@And("^Enter Any data in the question$")
	public void enter_Any_data_in_the_question() throws Throwable {
		Thread.sleep(3000);
		WebApplications2.EnterModuleScreenQSN("Module");
	}

}
