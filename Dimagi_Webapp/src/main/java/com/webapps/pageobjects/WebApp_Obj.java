package com.webapps.pageobjects;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import com.webapps.base.Base;

public class WebApp_Obj extends Base{ 
	
	@FindBy(how = How.XPATH, using = "(//*[contains(text(), 'Applications')])[1]")
	private WebElement WebappsWelcomeText;
	
	@FindBy(how = How.XPATH, using ="//*[@id='menu-region']/div/div[2]/div[1]/")
    private By CloudcareAppTitle;

	public WebApp_Obj()
	{
		PageFactory.initElements(driver, this);
	}
	public String checkwebappsText(){
		
		WebDriverWait wait = new WebDriverWait(driver, 30);
		WebElement siteTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), 'Applications')])[1]")));
		  String webappsWelcomeText = siteTitle.getText();
		  return webappsWelcomeText;
	}	
	
//	public void clickOnCloudcare(){
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//    	WebElement cloudcareicon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Cloudcare']")));
//				ClickOnCloudCare.click();
//					
			
}
