package com.dimagi.steps;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;


import cucumber.api.java.en.And;

public class ConstrainsSuccess extends Base{

	
	WebApp_Obj WebApplications = new WebApp_Obj();
    Hook hook = new Hook();
       	
     @And("^Answer all questions$")
    public void answer_all_questions() throws Throwable {
    	 WebApplications.EnterConstraintsFirstQues("xyz");
    	 WebApplications.EnterConstraintsSecondQues();
    }

   
    
    
}

