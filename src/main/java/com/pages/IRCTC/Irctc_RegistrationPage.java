//POM class of IRCTC

package com.pages.IRCTC;

import java.io.IOException;
import java.util.List;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.generics.IRCTC.AutoConstant;
import com.generics.IRCTC.BasePage;
import com.generics.IRCTC.ExcelLibrary;

public class Irctc_RegistrationPage extends BasePage implements AutoConstant
{

	@FindBy(xpath="(//button[@type='submit'])[1]")
	private WebElement okButton;
	
	@FindBy(id="userName")
	private WebElement userNameTextfield;
	
	@FindBy(id="usrPwd")
	private WebElement passwordTextfield;

	@FindBy(id="cnfUsrPwd")
	private WebElement confirmPasswordTextfield;
	
	@FindBy(xpath="//label[@class='ng-tns-c10-4 ui-dropdown-label ui-inputtext ui-corner-all ui-placeholder ng-star-inserted']")
	private List<WebElement> securityQuesDropdown;
	
	@FindBy(xpath="//input[@placeholder='Security Answer']")
	private WebElement securityAnswerTextfield;
	
	@FindBy(xpath="//label[contains(text(),'Select Preferred Language')]")
	private List<WebElement> preferredLanguageDropdown;
	
	@FindBy(id="firstName")
	private WebElement firstNameTextfield;
	
	@FindBy(id="middleName")
	private WebElement middleNameTextfield;
	
	@FindBy(id="lastname")
	private WebElement lastNameTextfield;
	
	@FindBy(id="M")
	private WebElement maleRadioButton;
	
	@FindBy(id="F")
	private WebElement femaleRadioButton;
	
	@FindBy(id="T")
	private WebElement transgenderRadioButton;
	
	@FindBy(xpath="//span[@class='ng-tns-c11-6 ui-calendar']")
	private WebElement dateOfBirthCalenderDropdown;
	
	@FindBy(xpath="//label[.='Select Occupation']")
	private WebElement selectOccupationDropdown ;
	
	@FindBy(xpath="(//input[@value='M'])[2]")
	private WebElement marriedRadioButton;
	
	@FindBy(xpath="//input[@value='U']")
	private WebElement unmarriedRadioButton;
	
	@FindBy(xpath="//select[@formcontrolname='resCountry']")
	private WebElement countryDropdown;
	
	@FindBy(id="email")
	private WebElement emailTextfield;
	
	@FindBy(id="mobile")
	private WebElement isdMobileTextfield;
	
	@FindBy(xpath="//select[@formcontrolname='nationality']")
	private WebElement nationalityDropdown;
	
	@FindBy(id="resAddress1")
	private WebElement flatBlockNoTextfield;
	
	@FindBy(id="resAddress2")
	private WebElement streetTextfield;
	
	@FindBy(id="resAddress3")
	private WebElement areaTextfield;
	
	@FindBy(xpath="//input[@placeholder='Pin code']")
	private WebElement pinCodeTextfield;
	
	@FindBy(id="resState")
	private WebElement stateTextfield;
	
	@FindBy(xpath="//select[@formcontrolname='resCity']")
	private WebElement cityDropdown;
	
	@FindBy(xpath="//select[@formcontrolname='resPostOff']")
	private WebElement postOfficeDropdown;
	
	@FindBy(xpath="//input[@formcontrolname='resPhone']")
	private WebElement phoneTextfield;
	
	@FindBy(xpath="(//input[@formcontrolname='officeSameAsRes'])[1]")
	private WebElement CopyResidenceYesRadioButton;
	
	@FindBy(xpath="(//input[@formcontrolname='officeSameAsRes'])[2]")
	private WebElement CopyResidenceNoRadioButton;
	
	@FindBy(id="sbi")
	private WebElement sbiCheckbox;
	
	@FindBy(xpath="//input[@formcontrolname='termCondition']")
	private WebElement termsAndConditionsCheckbox ;
	
	@FindBy(xpath="//b[contains(text(),'Back')]")
	private WebElement backButton;
	
	@FindBy(xpath="//b[contains(text(),'REGISTER')]")
	private WebElement registerButton;
	
	@FindBy(id="corover-close-btn")
	private WebElement closeChatBotButton;
	//captcha
	
	//initialization
	public Irctc_RegistrationPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
		
	//utilization
	public void Irctc_Registration(WebDriver driver) throws IOException
	{
		
		okButton.click();                      //click ok on popup that comes up in the beginning.
		
		ExcelLibrary ex=new ExcelLibrary();
		
		//userNameTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 0));
		passwordTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 1));
		confirmPasswordTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 2));
		
		//for(int i=0;i<securityQuesDropdown.size();i++)
        //{
		//if(securityQuesDropdown.get(i).getText().equalsIgnoreCase("What is your pet name?"))
			
		//	securityQuesDropdown.get(i).click();
        //}
		
		securityAnswerTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 3));
		
		for(int i=0;i<preferredLanguageDropdown.size();i++)
        {
		if(preferredLanguageDropdown.get(i).getText().equalsIgnoreCase("English"))
			
			preferredLanguageDropdown.get(i).click();
        }
		//selectbyindex(preferredLanguageDropdown,0);
		
		firstNameTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 4));
		middleNameTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 5));
		lastNameTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 6));
		//maleRadioButton.click();           //any one
		femaleRadioButton.click();
		//transgenderRadioButton.click();
		
		//selectOccupationDropdown          //no select tag
		
		//marriedRadioButton.click();       //any one
		unmarriedRadioButton.click();
		
		selectbyvisibletext(countryDropdown,"India");
		
		emailTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 9));
		isdMobileTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 10));
		
		selectbyvisibletext(nationalityDropdown,"India(NRI)");
		flatBlockNoTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 11));
		streetTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 12));
		areaTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 13));
		pinCodeTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 14));
		stateTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 15));
		selectbyvisibletext(cityDropdown,"Ghaziabad");
		selectbyindex(postOfficeDropdown,1);
		phoneTextfield.sendKeys(ex.getCellValue(excel_path,sheet_name, 1, 16));
		
		CopyResidenceYesRadioButton.click();  //any one
		//CopyResidenceNoRadioButton.click();
		
		javascriptclick(driver,sbiCheckbox);        //sbi checkbox is bydefault clicked, so uncheck it
		javascriptclick(driver,termsAndConditionsCheckbox);
		//sbiCheckbox.click();
		
		closeChatBotButton.click();
		
		//backButton.click();                //any one
		registerButton.click();
		
		dateOfBirthCalenderDropdown.click();     //not wrking
			
	}
	
}
