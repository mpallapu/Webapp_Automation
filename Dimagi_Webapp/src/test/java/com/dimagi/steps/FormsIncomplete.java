package com.dimagi.steps;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.WebElement;
import org.testng.Assert;

import com.webapps.base.Base;
import com.webapps.pageobjects.Reports;
import com.webapps.pageobjects.SignInPage_Obj;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class FormsIncomplete extends Base{
	
	SignInPage_Obj signpage = new SignInPage_Obj();
	WebApp_Obj WebApplications = new WebApp_Obj();
	Hook hook = new Hook();
	Reports Reportpage = new Reports();
	String ExpectedText;
		
	@Given("^Mobile user Signup page$")
	public void mobile_user_Signup_page() throws Throwable {
	  
	    hook.loginAsMobileUser();
	    signpage.clickOnSignInLink();
		signpage.enterUsername(prop.getProperty("musername"));
		signpage.enterPassword(prop.getProperty("mpassword"));
		signpage.clickOnSignBTN();
		WebApplications.ClickOnBasicTests();
		
	}

	@And("^Click on Basic form tests$")
	public void click_on_Basic_form_tests() throws Throwable {
		WebApplications.ClickOnBasicForms();
	}

	@And("^Enter some text into 'Enter a name' field$")
	public void enter_some_text_into_Enter_a_name_field() throws Throwable {
		WebApplications.EnteraName("Incomplete text");
	}

	//@And("^Click on outside of the field$")
	//public void click_on_outside_of_the_field() throws Throwable {
	  
	//}

	@And("^Click on back arrow on the browser$")
	public void click_on_back_arrow_on_the_browser() throws Throwable {
		WebApplications.ClickOnHomeButton();
	}

	@And("^Click on incomplete forms$")
	public void click_on_incomplete_forms() throws Throwable {
		WebApplications.ClickOnIncompleteForm();
	}

	@Then("^Verify the form appears in the list$")
	public void verify_the_form_appears_in_the_list() throws Throwable {
		WebApplications.ClickOnCase();
	    Thread.sleep(5000);
		String actText=WebApplications.ReadEnteredText();
		String expText="Incomplete text";
		Assert.assertEquals(actText,expText);
	}


@Then("^Alter the Text in the field$")
public void alter_the_Text_in_the_field() throws Throwable {
	ExpectedText= WebApplications.EnteraNameForAlter("Altered");
}

@Given("^WebUser Signin$")
public void webuser_Signin() throws Throwable {
	Thread.sleep(8000);
	WebApplications.ClickOnShowFullmenu();
	Thread.sleep(5000);
	WebApplications.ClickOnSettingsGearIcon();
	WebApplications.ClickOnSignOut();
	Thread.sleep(10000);
	hook.loginAsWebUser();
	signpage.clickOnSignInLink();
	signpage.enterUsername(prop.getProperty("wusername"));
	signpage.enterPassword(prop.getProperty("wpassword"));
	signpage.clickOnSignBTN();
}

@Given("^Click on Submit button$")
public void click_on_Submit_button() throws Throwable {
	WebApplications.ClickOnFormsubmit();
}

@Given("^Click on Reports dropdown$")
public void click_on_Reports_dropdown() throws Throwable {
	Reportpage.ClickOnReprotsDropdown();
}

@Given("^Click on view All$")
public void click_on_view_All() throws Throwable {
	Reportpage.ClickOnViewAll();
}

@Given("^Click on Submit history$")
public void click_on_Submit_history() throws Throwable {
	Reportpage.ClickOnSubmitHistory();
    
}

@Given("^Select Basic tests-->Basic form tests-->Basis forms from Filter forms dropdowns$")
public void select_Basic_tests_Basic_form_tests_Basis_forms_from_Filter_forms_dropdowns() throws Throwable {
	Reportpage.ClickOnApplicationFilter();
	Reportpage.ClickOnModuleFilter();
	Reportpage.ClickOnFormFilter();
}  

@Given("^Click on Apply$")
public void click_on_Apply() throws Throwable {
	Reportpage.ClickOnApplyButton();
	Thread.sleep(4000);
}

@Then("^Verify the form was received$")
public void verify_the_form_was_received() throws Throwable {
   List<WebElement> forms = Reportpage.numberOfQuestions();
   String actualText;
   Set<String> windowshandles=null;
   List<String> windows=null;
    boolean stringNotMatched = true;
   	for(int i=0; i<forms.size();i++)
	   {
		   WebElement form = forms.get(i);
		     
	       form.click();
	       
	       windowshandles= driver.getWindowHandles();
	       
	       windows = new ArrayList<String>(windowshandles);
	       
	        driver.switchTo().window(windows.get(1));
	        
	        actualText= Reportpage.readFormData();
	             
	       if(actualText.contains(ExpectedText))
	       {   	  
	    	   stringNotMatched =false;
	       		 break;
	    	}
	       
	       driver.switchTo().window(windows.get(0));
	       	
	   }
    	
   	if(stringNotMatched){
	   Assert.assertTrue(false);
   	} 
}
	
}
