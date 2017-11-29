package com.dimagi.steps;

import static org.testng.Assert.assertTrue;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Functions extends Base{


	
	Hook hook = new Hook();
	WebApp_Obj WebApplications2 = new WebApp_Obj();
	
@And("^Click on Functions form$")
 public void click_on_Functions_form() throws Throwable {
	Thread.sleep(5000);
     WebApplications2.ClickOnFunctions();
 } 

	
@And("^Enter any value otherthan (\\d+) in first question$")
public void enter_any_value_otherthan_in_first_question(int arg1) throws Throwable {
	WebApplications2.EnterFunctionsQues1();
	Thread.sleep(5000);
}

@Then("^Verify the text displayed below the question$")
public void verify_the_text_displayed_below_the_question() throws Throwable {
   WebApplications2.VerifyTextForQues1();
}

@Then("^Enter (\\d+) in the same question$")
public void enter_in_the_same_question(int arg1) throws Throwable {
	WebApplications2.ResetFunctionsQues1();
	Thread.sleep(5000);
}

@Then("^Verify the latest text$")
public void verify_the_latest_text() throws Throwable {
	WebApplications2.VerifyTextAfterEntering0();
}

@Then("^Enter (\\d+) in next question$")
public void enter_in_next_question(int arg1) throws Throwable {
	WebApplications2.EnterFunctionsQues2();
	Thread.sleep(5000);
}

@Then("^Verify the text$")
public void verify_the_text() throws Throwable {
  
	String actualText=WebApplications2.VerifyTextForQues2();
	assertTrue(actualText.endsWith("14"));
   
}
}
