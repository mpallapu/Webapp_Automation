package com.dimagi.steps;

import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import com.webapps.base.Base;
import com.webapps.pageobjects.ApplicationSettings_Obj;
import com.webapps.pageobjects.SelectAProject_Obj;
import com.webapps.pageobjects.SignInPage_Obj;
import com.webapps.pageobjects.WebApp_Obj;

import cucumber.api.java.en.And;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class CommonStepsInBasicModule extends Base{
	
	Hook hook = new Hook();
	SignInPage_Obj signpage = new SignInPage_Obj();
	SelectAProject_Obj selectProject = new SelectAProject_Obj();
	ApplicationSettings_Obj applicationSettings = new ApplicationSettings_Obj();
	WebApp_Obj webApplication = new WebApp_Obj();
	
	public static boolean status;
	
	@Given("^Webuser Signuppage$")
	public void Webuser_Signuppage() throws Throwable {
		hook.loginAsWebUser();
		signpage.clickOnSignInLink();
		signpage.enterUsername(prop.getProperty("wusername"));
		signpage.enterPassword(prop.getProperty("wpassword"));
		signpage.clickOnSignBTN();
		Thread.sleep(5000);
		String ActualWelcomeText = signpage.readWelcomeText();
		String ExpectedWelcomeText = "Select A Project";
		Assert.assertEquals(ActualWelcomeText, ExpectedWelcomeText);
		ExpectedWelcomeText="";
		Thread.sleep(4000);
		selectProject.clickonselectproject();
		selectProject.clickCCQA4project();
		String DashboardTitle = selectProject.checkdashboartext();
		String expectedDashboardTitle = "Welcome Back to CommCare HQ";
		   
		if(DashboardTitle.contains(expectedDashboardTitle))
		   {
			   Assert.assertTrue(true);
		   }
		   else
			   Assert.assertTrue(false);
		    expectedDashboardTitle="";
			selectProject.clickonapplicationdropdown();
			Thread.sleep(5000);
			selectProject.selectapplication();
			String LeftPanelTitle = selectProject.verifyLeftPanelText();
			Thread.sleep(4000);
			String ActualLeftPanelTitle ="Cloudcare";
			Assert.assertEquals(LeftPanelTitle, ActualLeftPanelTitle);
			
			    }
	@Given("^click on CCQA(\\d+) project settings gear icon$")
	public void click_on_CCQA_project_settings_gear_icon(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	           applicationSettings.clickonProjectSettingsgearIcon();
	}

	@Then("^verify user is navigated to settings page$")
	public void verify_user_is_navigated_to_settings_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    String ActualLanguagesText = applicationSettings.languagesText();
	    String ExpectedLanguagesText= "Languages";
	    Thread.sleep(4000);
	    Assert.assertEquals(ActualLanguagesText, ExpectedLanguagesText);
	    
	}

	@Then("^click on Advanced settings Tab$")
	public void click_on_Advanced_settings_Tab() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    applicationSettings.clickonAdvancedSettingsTab();
	}

	@Then("^click on Save button$")
	public void click_on_Save_button() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions		
		if(status==true) //Verify whether operation is performed on WebApp check box
		{
			System.out.println("clicking on save button");
	   applicationSettings.clickonSave();
	   Thread.sleep(4000);
	   }
	}

	@Then("^click on Cloudcare release page$")
	public void click_on_Cloudcare_release_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(status==true)
		{
	    applicationSettings.clickoncloudcarereleasepage();
	}
	}
	@Then("^verify is user is navigated to Cloudcare release page$")
	public void verify_is_user_is_navigated_to_Cloudcare_release_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(status==true)
		{
		String ActualVersionText = applicationSettings.versionText();
		Thread.sleep(5000);
		String ExpectedVersionText= "Versions";
	    Assert.assertEquals(ActualVersionText, ExpectedVersionText);
	    Thread.sleep(5000);
		}
		}
	@And("^click on MakeNewVersion$")
	public void click_on_MakeNewVersion() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if(status==true)
		{
		applicationSettings.clickonMakeNewVersion();
		Thread.sleep(40000);
	 }
	}
	@Then("^verify new Version is created$")
	public void verify_new_Version_is_created() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		if(status==true)
		{
		String ActualReleasedText = applicationSettings.ReleasedText();
	    String ExpectedReleasedText= "Released";
	    Assert.assertEquals(ActualReleasedText, ExpectedReleasedText);
		}
		}
	@And("^click on Released button$")
	public void click_on_Released_button() throws Throwable {
		// Write code here that turns the phrase above into concrete actions
		if(status==true)
		{
		applicationSettings.SelectReleasedbutton();
	}
	}
	@Given("^Mobileworker Signin$")
	public void Mobileworker_Signin() throws Throwable {
		hook.loginAsMobileUser();   
		signpage.clickOnSignInLink();
		signpage.enterUsername(prop.getProperty("musername"));
		signpage.enterPassword(prop.getProperty("mpassword"));
		signpage.clickOnSignBTN();
	    
	}
	
	@Then("^verify user is navigated Webapps page$")
	public void verify_user_is_navigated_Webapps_page() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		  String ActualWebAppText = webApplication.checkwebappsText();
		  String ExpectedWebAppText = "APPLICATIONS";
		  Assert.assertEquals(ActualWebAppText, ExpectedWebAppText); 
		  	}
	@Then("^verify Cloudcare Title$")
	public void verify_Cloudcare_Title() throws Throwable {

			WebDriverWait wait = new WebDriverWait(driver, 30);
			 List<WebElement> appTitleList=null;
			 WebElement element=null; 
			String xpath="//*[@id='menu-region']/div/div[2]/div[1]/div";
			By appTitleElement= By.xpath(xpath);	
			try{
				wait.until(ExpectedConditions.visibilityOfElementLocated(appTitleElement));
				appTitleList=driver.findElements(appTitleElement);
			 for(int i=1;i<=appTitleList.size();i++){
				 xpath=xpath+"["+i+"]/div/div/h3";
				 element= driver.findElement(By.xpath(xpath));
			    	if(element.getText().contains("Cloudcare")){
			    		Assert.assertFalse(true);
			    		break;
			    	}
			    }
			
						
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
		}
		
	
//		  @And("^click on cloudcare$")
//			public void click_on_cloudcare() throws Throwable {
//			    // Write code here that turns the phrase above into concrete actions
//			    webApplication.clickOnCloudcare();
//			    Thread.sleep(7000);
//			    webApplication.clickOnCloudcare();
			  		  
	}
