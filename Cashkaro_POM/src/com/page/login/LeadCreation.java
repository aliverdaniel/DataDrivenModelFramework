package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class LeadCreation extends WrapperClass{

	public WebDriver driver;
	
//	AttributeFinder af=new AttributeFinder();
	By leadButton;
	By newButton;
	By continueButton;
	By setFirstName;
	By setLastName;
	By setCorporateName;
	By setCompanyName;
	By industry;
	By dbaName;
	By webSite;
	By leadStatus;
	By lookUpButton;
	By partnerSearch;
	By partnerSearchGo;
	By partner;
	By leadSource;
	By setphoneNumber;
	By setmobileNumber;
	By setfaxNumber;
	By setAddress;
	By setCity;
	By setzipCode;
	By setState;
	By numberOfLocations;
	By setCountry;
	By saveButton;
	
	public LeadCreation(WebDriver driver){
		this.driver=driver;
		DataReader.getData("LeadCreation");
		DataReader.getDataKeyandValue("LeadCreation");
	}
	
	public void clickLeadbutton(String dataSet){
		click(dataSet, leadButton);
		Reporter.actions("Lead Button Clicked");
	}
	
	public void clickNewButton(String dataSet){
		click(dataSet, newButton);
		Reporter.actions("New Button Clicked");
	}
	
	public void clickContinueButton(String dataSet){
		click(dataSet, newButton);
		Reporter.actions("Continue Button Clicked");
	}
	
	public void setFirstName(String dataSet, String dataKey){
		write(dataSet, dataKey, setFirstName);
		Reporter.actions("First name Enetered");
	}
	
	public void setLastName(String dataSet, String dataKey){
		write(dataSet, dataKey, setLastName);
		Reporter.actions("Last name Enetered");
	}
	
	public void setCompanyName(String dataSet, String dataKey){
		write(dataSet, dataKey, setCompanyName);
		Reporter.actions("Company Name Entered");
	}
	
	public void setCorporateName(String dataSet, String dataKey){
		write(dataSet, dataKey, setCorporateName);
		Reporter.actions("Corporate Name Entered");
	}
		
	public void industry(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, industry);
		Reporter.actions("Industry Name Entered");
	}
	
	public void dbaName(String dataSet, String dataKey){
		write(dataSet, dataKey, dbaName);
		Reporter.actions("DBA Name Entered");
	}
	
	public void setWebSite(String dataSet, String dataKey){
		write(dataSet, dataKey, webSite);
		Reporter.actions("Website Name Entered");
	}
	
	public void setleadStatus(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, leadStatus);
		Reporter.actions("Lead Status is selected");
	}
	
	public void lookUpButton(String dataSet){
		click(dataSet, lookUpButton);
		Reporter.actions("Lookup button clicked");
	}
	
	public void doLookupSwitch(String currentWindowHandle){
		lookupSwitch(currentWindowHandle);
		Reporter.actions("Window switched");
	}
	

	public void partnerSearch(String dataSet, String dataKey){
		write(dataSet, dataKey, partnerSearch);
		Reporter.actions("Partner search intiated");
	}
	
	public void clickSearchBoxGo(String dataSet){
		click(dataSet, partnerSearchGo);
		Reporter.actions("clicked Search icon");
	}
	
	public void selectpartner(String dataSet){
		click(dataSet, partner);
		Reporter.actions("partner Selected");
	}
	
	public void selectLeadSource(String dataSet,String dataKey, String selectby){
		select(dataSet, dataKey, selectby, leadSource);
		Reporter.actions("Lead Soutce selected");
	}
	
	public void setPhoneNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setphoneNumber);
		Reporter.actions("Phone Number Entered");
	}
	
	public void setMobileNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setmobileNumber);
		Reporter.actions("Mobile Number Entered");
	}
	
	public void setFaxNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setfaxNumber);
		Reporter.actions("Fax Number Entered");
	}
	
	public void setAddress(String dataSet, String dataKey){
		write(dataSet, dataKey, setAddress);
		Reporter.actions("Address Entered");
	}
	
	public void setCity(String dataSet, String dataKey){
		write(dataSet, dataKey, setCity);
		Reporter.actions("City Name Entered");
	}
	
	public void setZip(String dataSet, String dataKey){
		write(dataSet, dataKey, setzipCode);
		Reporter.actions("ZIPCode Entered");
	}
	
	public void setState(String dataSet, String dataKey){
		write(dataSet, dataKey, setCountry);
		Reporter.actions("State Name Entered");
	}
	
	public void setCountry(String dataSet, String dataKey){
		write(dataSet, dataKey, setState);
		Reporter.actions("Country Name Entered");
	}
	
	public void setNumberOfLocations(String dataSet, String dataKey){
		write(dataSet, dataKey, numberOfLocations);
		Reporter.actions("Numbert of locations Entered");
	}
	
	public void clickSaveButton(String dataSet){
		click(dataSet, saveButton);
		Reporter.actions("Save Button Clicked");
	}
}
