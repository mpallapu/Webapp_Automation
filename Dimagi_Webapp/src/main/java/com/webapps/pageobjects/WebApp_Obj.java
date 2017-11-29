package com.webapps.pageobjects;

import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
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
	
		//@FindBy(xpath="//h3[text()='Cloudcare']")
		@FindBy(xpath="(//div[@class='appicon appicon-default'])[5]")
		private WebElement clickOnCloudCare;
		
		//@FindBy(xpath="//*[contains(text(),'Question checks')]")
		@FindBy(xpath="//h3[text()='Question checks']")	
		
		//Test Comment 
	
		private WebElement QuestionsChecks;
		
		@FindBy(xpath="//h3[text()='Update Test']")	
		private WebElement UpdateTest;
		
		@FindBy(xpath="//div[@class='widget']/span")
		private List<WebElement> Questions;
		
		
		@FindBy(xpath="//*[@class='textfield form-control']")
		private WebElement question1;
		
		
		@FindBy(xpath="//*[@class='submit btn btn-primary']")
		private WebElement submit;
		
		@FindBy(xpath="(//*[@class='appicon appicon-default'])[2]")
		private WebElement BasicTests;
		
		@FindBy(xpath="(//*[@class='module-column module-column-name'])[1]")
		private WebElement BasicForm;
		
		@FindBy(xpath="(//*[@class='textfield form-control'])[1]")
		private WebElement EnterName;
		
		@FindBy(xpath="//i[@class='fa fa-home']")
		private WebElement HomeButton;
		
		@FindBy(xpath="//i[@class='ff ff-incomplete-fg appicon-icon appicon-icon-fg']")
		private WebElement IncompleteForm;
		
		@FindBy(xpath="(//b[contains(text(),'Basic Form')])[1]")
		private WebElement Case;
		
		@FindBy(xpath="(//*[@class='textfield form-control'])[1]")
		private WebElement EnterNameForAlter;
		
		@FindBy(xpath="//*[@id='commcare-menu-toggle']")
		private WebElement ShowFullmenu;
		
		@FindBy(xpath="(//a[@class='dropdown-toggle dropdown-toggle-with-icon track-usage-link']/i)[1]")
		private WebElement SettingsGearIcon;
		
		@FindBy(xpath="(//a[@class='track-usage-link'])[2]")
		private WebElement SignOut;
		
		@FindBy(xpath="(//td[@class='module-column module-column-name'])[3]")
		private WebElement Groups;

		@FindBy(xpath="(//*[@class='module-column module-column-name'])[4]")
		private WebElement Repeats;
		
		@FindBy(xpath="(//*[@class='module-column module-column-name'])[11]")
		private WebElement Logictests;
		
		@FindBy(xpath="(//*[@class='module-column module-column-name'])[1]")
		private WebElement Constraints;
		
		@FindBy(xpath="(//*[@class='module-column module-column-name'])[9]")
		private WebElement Fixtures;
		
		@FindBy(xpath="(//*[@class='group-multiselect239'])[1]")
		private WebElement SelectAtleast2Question;
		
		@FindBy(xpath="(//div[@class='text-danger error-message server-error-message'])[1]")
		private WebElement UnableError;
		
		@FindBy(xpath="(//*[@class='group-multiselect239'])[2]")
		private WebElement SecondCheckBox;
		
		@FindBy(xpath="(//*[@class='fa fa-check text-success'])[1]")
		private WebElement Successsymbol;
		
		
		@FindBy(xpath="(//*[@class='textfield form-control'])[2]")
		private WebElement TestSecondQuestion;
		
		@FindBy(xpath="(//*[@class='text-danger error-message server-error-message'])[2]")
		private WebElement ErrorMessageForTest;
		
		@FindBy(xpath="(//*[@class='textfield form-control'])[1]")
		private WebElement FirstQuestion;
		
		@FindBy(xpath="(//*[@class='form-control'])[1]")
		private WebElement EnterNumberInFunctionsPage;
		
		@FindBy(xpath="(//*[@class='form-control'])[1]")
		private WebElement EnterNumber;
		
		@FindBy(xpath="(//*[@class='form-control'])[2]")
		private WebElement EnterNumberInEnter14;
		
		@FindBy(xpath="(//td[@class='module-column module-column-name'])[2]")
		private WebElement Functions;
		
		@FindBy(xpath="(//div[@class='widget']/input)[1]")
		private WebElement FunctionsQues1;
		
		@FindBy(xpath="//*[contains(text(),'This should only display if you entered any number other than')]")
		private WebElement TextForQues1;
		
		@FindBy(xpath="//*[contains(text(),'This should display a synonym for integer: number')]")
		private WebElement TextAfterEntering0;
		
		@FindBy(xpath="(//div[@class='widget']/input)[2]")
		private WebElement FunctionsQues2;

		@FindBy(xpath="(//*[@class='caption'])[11]")
		private WebElement TextForQues2;

		@FindBy(xpath="(//*[@class='group-select240'])[1]")
		private WebElement Suffolk;
		
		@FindBy(xpath="//*[contains(text(),'Boston')]")
		private WebElement Boston;
		
		@FindBy(xpath="(//*[@class='group-select240'])[2]")
		private WebElement Essex;
		
		@FindBy(xpath="//*[contains(text(),'Saugus')]")
		private WebElement Saugus;
		
		@FindBy(xpath="(//*[@class='group-select240'])[3]")
		private WebElement Middlesex;
		
		@FindBy(xpath="//*[contains(text(),'Billerica')]")
		private WebElement Billerica;
		
		@FindBy(xpath="(//*[@class='textfield form-control'])[1]")
		private WebElement ConstraintsFirstQues;
		
		@FindBy(xpath="(//*[@class='form-control'])[1]")
		private WebElement ConstraintsSecondQues;
		
		@FindBy(xpath="(//*[contains(text(),'Basic Tests EON')])[1]")
		private WebElement BasicTestsEON;
		
		@FindBy(xpath="(//*[contains(text(),'End of Form Navigation')])[1]")
		private WebElement EON;
		
		@FindBy(xpath="(//*[contains(text(),'Home Screen')])[1]")
		private WebElement HomeScreen;
		
		@FindBy(xpath="//*[@class='textfield form-control']")
		private WebElement HomeScreenQSN;
		
		@FindBy(xpath="//*[@class='page-title']")
		private WebElement BreadcrumbText;
		
		@FindBy(xpath="(//*[contains(text(),'Module Screen')])[1]")
		private WebElement ModuleScreen;

		@FindBy(xpath="//*[@class='textfield form-control']")
		private WebElement ModuleScreenQSN;
		
		@FindBy(xpath="(//*[contains(text(),'Previous Screen')])[1]")
		private WebElement PreviousScreen;
		
		@FindBy(xpath="//*[contains(text(),'Hello')]")
		private WebElement Hello;

		@FindBy(xpath="//*[@class='btn btn-success btn-lg module-casedetail-continue']")
		private WebElement Continue;
		
		@FindBy(xpath="//*[@class='textfield form-control']")
		private WebElement PreviousScreenQSN;
		
		@FindBy(xpath="//*[@class='page-title']")
		private WebElement PageTitle;
		
		@FindBy(xpath="(//*[contains(text(),'Current Module')])[1]")
		private WebElement CurrentModule;
		
		@FindBy(xpath="//*[@class='textfield form-control']")
		private WebElement CurrentModuleQSN;
		
		@FindBy(xpath="//*[@class='page-title']")
		private WebElement PageTitleForCurrentModule;
		
		@FindBy(xpath="(//*[contains(text(),'Close Case')])[1]")
		private WebElement Closecase;
		
		@FindBy(xpath="//*[@class='title']")
		private WebElement TitleForClosecase;

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
	
//	public String checkwebappsText(){
//		WebDriverWait wait = new WebDriverWait(driver, 30); 
//		 WebElement siteTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("(//*[contains(text(), 'Applications')])[1]")));  
//		  String webappsWelcomeText = siteTitle.getText();    
//		return webappsWelcomeText;
//		//String webappsWelcomeText = WebappsWelcomeText.getText();
//	    // return webappsWelcomeText;
//}

       
		public void ClickOnCloudcare() {
			
			clickOnCloudCare.click();
			 
	}
		public void ClickOnQuestionChecks(){
			QuestionsChecks.click();
		}
		public void ClickOnUpdateTest(){
			UpdateTest.click();
			
			//List  totalTextboxes=driver.findElements(By.xpath("//input[@type='text']"));
			//System.out.println("total textboxes "+totalTextboxes.size());
			
		}
	
			public int countQuestions(){
				int noOfQuestions = Questions.size();
			
				return noOfQuestions;
			}
			
		
		public void EnterValue(){
			question1.sendKeys("Enter you name");
		}
		public void ClickOnSubmit(){
			submit.click();
		}
		public void ClickOnBasicTests(){
			BasicTests.click();
		}
		public void ClickOnBasicForms(){
			BasicForm.click();
		}
		public void EnteraName(String text){
			EnterName.sendKeys(text);
		}
		public void ClickOnHomeButton(){
			HomeButton.click();
		}
		public void ClickOnIncompleteForm(){
			IncompleteForm.click();
		}
		public void ClickOnCase(){
			Case.isDisplayed();
			Case.click();
			
		}
		public String ReadEnteredText(){
			String ReadText=EnterName.getText();
			return ReadText;
		}
		public String EnteraNameForAlter(String text){
			Date date = new Date();
			long time=date.getTime();
			String enteredText = text+time;
			EnterNameForAlter.sendKeys(enteredText);
			return enteredText;
			
		}
		
		public void ClickOnShowFullmenu(){
			ShowFullmenu.click();
		}
		public void ClickOnSettingsGearIcon(){
			SettingsGearIcon.click();
		}
		
		public void ClickOnSignOut(){
			SignOut.click();
		}
		public void ClickOnGroups(){
			Groups.click();
		}
		public void ClickOnRepeats(){
			Repeats.click();
		}
		public void ClickOnLogictests(){
			Logictests.click();
		}
		public void ClickOnConstraints(){
			Constraints.click();
		}
		public void EnterTestInSecondQuestion(String text){
			TestSecondQuestion.sendKeys(text);
			TestSecondQuestion.sendKeys(Keys.TAB);
		}
		
		public String ValidateErrorMessage(){
			String ErrorMessage=ErrorMessageForTest.getText();
			return ErrorMessage;
		}
		
		
		
		public void EnterFirstQuestion(String text){
			FirstQuestion.sendKeys(text);
			
		}
		public void EnteraNumber(String text){
			EnterNumber.sendKeys(text);
			
		}
		public void EnteraNumberInFunctionsPage(String text){
			EnterNumberInFunctionsPage.sendKeys(text);
			
		}
		public void EnteraNumberInEnter14(String text){
			EnterNumberInEnter14.sendKeys(text);
			
		}
		public void ClickOnFixtures(){
			Fixtures.click();
		}
		public void ClickonSelectAtleast2Question(){
			SelectAtleast2Question.click();
		}
		public String CheckUnableError(){
			UnableError.isDisplayed();
			String Xyz=UnableError.getText();
			return Xyz;
			
		}
		public void ClickOnSecondCheckBox(){
			SecondCheckBox.click();
		}
		public void CheckSuccesssymbol(){
			Successsymbol.isDisplayed();
		}	
	
		public void ClickOnFunctions(){
			Functions.click();
		}
		public void EnterFunctionsQues1(){
			FunctionsQues1.sendKeys("1");
			FunctionsQues1.sendKeys(Keys.TAB);
		}

		public void VerifyTextForQues1(){
			TextForQues1.isDisplayed();
		}
		public void ResetFunctionsQues1(){
			FunctionsQues1.clear();
			FunctionsQues1.sendKeys("0");
			FunctionsQues1.sendKeys(Keys.TAB);
		}
		public void VerifyTextAfterEntering0(){
			TextAfterEntering0.isDisplayed();
		}
		public void EnterFunctionsQues2(){
			FunctionsQues2.sendKeys("14");
			FunctionsQues2.sendKeys(Keys.TAB);
		}
		public String VerifyTextForQues2(){
			String a=TextForQues2.getText();
		    return a;
		}
		public void ClickOnSuffolk(){
			Suffolk.click();
		}
		public void VerifyBoston(){
			Boston.isDisplayed();
		}
		public void ClickOnEssex(){
			Essex.click();
		}
		public void VerifySaugus(){
			Saugus.isDisplayed();
		}
		public void ClickOnMiddlesex(){
			Middlesex.click();
		}
		public void VerifyBillerica(){
			Billerica.isDisplayed();
			
		}
		public void ClickOnBillerica(){
			Billerica.click();
		}
		public void EnterConstraintsFirstQues(String text){
			ConstraintsFirstQues.sendKeys(text);
			ConstraintsFirstQues.sendKeys(Keys.TAB);
		}
		public void EnterConstraintsSecondQues(){
			ConstraintsSecondQues.sendKeys("25");
			ConstraintsSecondQues.sendKeys(Keys.TAB);
		}

		public void ClickOnBasicTestsEON(){
			BasicTestsEON.click();
		}
		public void ClickOnEON(){
			EON.click();
		}
		public void ClickOnHomeScreen(){
			HomeScreen.click();
		}
		public void EnterHomeScreenQSN(String text){
			HomeScreenQSN.sendKeys(text);
		}
		public String ReadBreadCrumbText(){
			String Title=BreadcrumbText.getText();
			return Title;
		}
		public void ClickOnModuleScreen(){
			ModuleScreen.click();
		}
		public void EnterModuleScreenQSN(String text){
			ModuleScreenQSN.sendKeys(text);
		}
		public void ClickOnPreviousScreen(){
			PreviousScreen.click();
		}
		public void ClickOnHello(){
			Hello.click();
		}
		public void ClickOnContinue(){
			Continue.click();
		}
		public void EnterPreviousScreenQSN(String text){
			PreviousScreenQSN.sendKeys(text);
		}
		public String ReadPageTitle(){
			String PageTitleCase=PageTitle.getText();
			return PageTitleCase;
		}
		public void ClickOnCurrentModule(){
			CurrentModule.click();
		}
		public void EnterCurrentModuleQSN(String text){
			CurrentModuleQSN.sendKeys(text);
		}
		public String ReadPageTitleCurrentModule(){
			String PageTitleCurrentModule=PageTitleForCurrentModule.getText();
			return PageTitleCurrentModule;
		}
		public void ClickOnClosecase(){
			Closecase.click();
		}
		public String ReadTitleForCloseCase(){
			String TitleCloseCase=TitleForClosecase.getText();
			return TitleCloseCase;
		}		
//	public void clickOnCloudcare(){
//	WebDriverWait wait = new WebDriverWait(driver, 30);
//    	WebElement cloudcareicon = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//h3[text()='Cloudcare']")));
//				ClickOnCloudCare.click();
//					
			
}
