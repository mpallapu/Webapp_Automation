package com.dimagi.steps;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.webapps.base.Base;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Then;

public class Fixtures extends Base{

	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();
		
	@And("^Click on Fixtures$")
	public void click_on_Fixtures() throws Throwable {
		WebApplications.ClickOnFixtures();
	}

	@And("^Answer the first question$")
	public void answer_the_first_question() throws Throwable {
		WebApplications.ClickonSelectAtleast2Question();
		Thread.sleep(10000);
	}

	@Then("^Validate the error message$")
	public void validate_the_error_message() throws Throwable {
		 String actualresult= WebApplications.CheckUnableError();
		  actualresult.equals("This answer is outside the allowed range.");
	}

	@And("^Select a second response$")
	public void select_a_second_response() throws Throwable {
		WebApplications.ClickOnSecondCheckBox();
	}

	@Then("^Validate error message goes away$")
	public void validate_error_message_goes_away() throws Throwable {
	   WebApplications.CheckSuccesssymbol();
	}

	@Then("^Select a suffolk county$")
	public void select_a_suffolk_county() throws Throwable {
		WebApplications.ClickOnSuffolk();
		Thread.sleep(5000);
	}

	@Then("^Verify the cities displayed for suffolk country$")
	public void verify_the_cities_displayed_for_suffolk_country() throws Throwable {
		WebApplications.VerifyBoston();
	}

	@Then("^Select a Essex county$")
	public void select_a_Essex_county() throws Throwable {
		WebApplications.ClickOnEssex();
		Thread.sleep(5000);
	}

	@Then("^Verify the cities displayed for Essex country$")
	public void verify_the_cities_displayed_for_Essex_country() throws Throwable {
		WebApplications.VerifySaugus();
	}

	@Then("^Select a Middlesex county$")
	public void select_a_Middlesex_county() throws Throwable {
		WebApplications.ClickOnMiddlesex();
		Thread.sleep(5000);
	}

	@Then("^Verify the cities displayed for Middlesex country$")
	public void verify_the_cities_displayed_for_Middlesex_country() throws Throwable {
		WebApplications.VerifyBillerica();
	}

	@Then("^Select a city$")
	public void select_a_city() throws Throwable {
		WebApplications.ClickOnBillerica();
	}

	
}
