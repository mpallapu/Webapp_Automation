package com.webapps.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapps.base.Base;

public class ApplicationSettings_Obj extends Base{
	//Application Settings and Deploy Page WebElements and Actions
	@FindBy(how = How.XPATH, using = "//a[@href='/a/ccqa4/apps/view/c7c0b279d0d74cf7834e32c19586819d/settings/']")
	private WebElement ProjectSettingsgearIcon;
	
	@FindBy(how = How.XPATH, using = "//a[@href='#languages']")
	private WebElement LanguagesText;
	
	@FindBy(how = How.XPATH, using = "//a[@href='#commcare-settings']")
	private WebElement AdvancedSettingsTab;
    
	@FindBy(how = How.ID, using = "cloudcare_enabled-input")
	private WebElement WebAPPCheckboxUncheck;
	
	@FindBy(how = How.XPATH, using = "(//div[contains(text(),'Save')])[5]")
	private WebElement SaveAdvancedSettings;
	
	@FindBy(how = How.XPATH, using = "(//a[@href='/a/ccqa4/apps/view/c7c0b279d0d74cf7834e32c19586819d/'])[2]")
	private WebElement Cloudcarereleasepage;
	
	@FindBy(how = How.XPATH, using = "//a[@href='#versions-tab']")
	private WebElement VersionText;
		
	@FindBy(how = How.XPATH, using = "(//button[@class= 'btn btn-success'])[3]")
	private WebElement MakeNewVersion;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Released')][1]")
	private WebElement ReleasedText;
	
	@FindBy(how = How.XPATH, using = "//button[contains(text(),'Released')][1]")
	private WebElement clickOnReleased;
	
	public ApplicationSettings_Obj()
	{
		PageFactory.initElements(driver, this);
	}
		public void clickonProjectSettingsgearIcon(){
		ProjectSettingsgearIcon.click();
		
	}
	public String languagesText(){
		String languagesText1 = LanguagesText.getText();
		return languagesText1;
	}
	public void clickonAdvancedSettingsTab(){
		AdvancedSettingsTab.click();
	}
	
      public boolean WebAPPCheckboxUncheck(){
    	  boolean operationStatus=false;
		if(WebAPPCheckboxUncheck.isSelected()){
		   WebAPPCheckboxUncheck.click();
		   operationStatus=true;
		}
		return operationStatus;
		
	}
	
	public boolean WebAPPCheckboxCheck(){
		 boolean operationStatus=false;
		if(!WebAPPCheckboxUncheck.isSelected()){
			WebAPPCheckboxUncheck.click();
			 operationStatus=true;
		}
		return operationStatus;
	}
	
	public void clickonSave(){
		SaveAdvancedSettings.click();
	}
	public void clickoncloudcarereleasepage(){
		Cloudcarereleasepage.click();
	}
	
	public String versionText(){
		String versionText1 = VersionText.getText(); 
		return versionText1;
	}
	public void clickonMakeNewVersion(){
		MakeNewVersion.click();
	}
	
	public String ReleasedText(){
		String releasedText1 = ReleasedText.getText();
		return releasedText1;
	}
	public void SelectReleasedbutton(){
		ReleasedText.click();
	}
	
}
