package com.webapps.pageobjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.webapps.base.Base;

public class Reports extends Base{
	
	@FindBy(xpath="(//a[@class='dropdown-toggle'])[2]")
	private WebElement ReprotsDropdown;
	
	@FindBy(xpath="(//a[@href='/a/ccqa4/reports/saved/'])[1]")
	private WebElement ViewAll;
	
	@FindBy(xpath="(//a[@href='https://www.commcarehq.org/a/ccqa4/reports/submit_history/'])[1]")
	private WebElement SubmitHistory;
	
	@FindBy(xpath="(//div[@class='col-xs-8 col-md-10']/select)[2]")
	private WebElement ApplicationFilter;
	
	@FindBy(xpath="(//select[@class='form-control'])[3]")
	private WebElement ModuleFilter;
	
	@FindBy(xpath="(//select[@class='form-control'])[4]")
	private WebElement FormFilter;
	
	@FindBy(xpath="//*[@class='filters btn btn-primary']")
	private WebElement ApplyButton;

	@FindBy(xpath="//table[@id='report_table_submit_history']//tbody/tr/td[1]/a")
	private List<WebElement> NumberOfForms;
	
	@FindBy(xpath="//div[@class='table-responsive']//tr[2]/td[2]/div")
	private WebElement formData;

public Reports() 
{  
	PageFactory.initElements(driver, this);
	}


public void ClickOnReprotsDropdown() {
	
	ReprotsDropdown.click();
	 
}

public void ClickOnViewAll() {
	
	ViewAll.click();
	 
}
public void ClickOnSubmitHistory() {
	
	SubmitHistory.click();
	 
}

public void ClickOnApplicationFilter() {
	
	ApplicationFilter.click();
	ApplicationFilter.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	 
}

public void ClickOnModuleFilter() {
	
	ModuleFilter.click();
	ModuleFilter.sendKeys(Keys.ARROW_DOWN,Keys.ENTER);
	 
}
public void ClickOnFormFilter() {
	
	FormFilter.click();
	FormFilter.sendKeys(Keys.ARROW_DOWN,Keys.ARROW_DOWN,Keys.ENTER);
	 
}

public void ClickOnApplyButton() {
	
	ApplyButton.click();
	 
}

public List<WebElement> numberOfQuestions()
{
	
	return NumberOfForms;
	
}

public String readFormData()
{
	return formData.getText();
}

}
