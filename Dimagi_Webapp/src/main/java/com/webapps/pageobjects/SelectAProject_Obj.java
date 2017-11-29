package com.webapps.pageobjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import com.webapps.base.Base;


public class SelectAProject_Obj extends Base{

	@FindBy(how = How.XPATH, using = "//li[@id='settingsmenu-project']/a")
	@CacheLookup
	private WebElement SelectProject;
	
	@FindBy(how = How.XPATH, using = "//li[@id='settingsmenu-project']//a[@href='/a/ccqa4/']")
	@CacheLookup
	private WebElement SelectCCQA4Project;
	
	@FindBy(how = How.XPATH, using = "//div[@id='hq-content']/div/h1")
	@CacheLookup
	private WebElement DashboardWelcomeText;
	
	@FindBy(how = How.XPATH, using = "//li[@id='ApplicationsTab']")
	@CacheLookup
	private WebElement ApplicationsDropDown;
	
	@FindBy(how = How.XPATH, using = "//a[@data-id='c7c0b279d0d74cf7834e32c19586819d']")
	@CacheLookup
	private WebElement SelectCloudcareApplication;
	
	@FindBy(how = How.XPATH, using = "//a[@class='appnav-responsive']/span")
	@CacheLookup
	private WebElement LeftPanelAppTitle;
	
	@FindBy(xpath="//a[contains(text(),'Web Apps')]")
	private WebElement SelectWebapps;
	
	public SelectAProject_Obj()
	{
		PageFactory.initElements(driver,this);
	}
	
	public void clickonselectproject(){
		SelectProject.click();
	}
	public void clickCCQA4project(){
			SelectCCQA4Project.click();
		}
		
	public String checkdashboartext(){
		String DashboardWelcometext = DashboardWelcomeText.getText();
		return DashboardWelcometext;
	}
	
    public void clickonapplicationdropdown(){
    	ApplicationsDropDown.click();
    }
    public void selectapplication(){
    	SelectCloudcareApplication.click();
    	   	
    }
    public String verifyLeftPanelText(){

    	String LeftPanelTitle = LeftPanelAppTitle.getText();
    	return LeftPanelTitle;
    }
    public void selectapplication1(){
    	SelectWebapps.click();
    }
    
	}
	
