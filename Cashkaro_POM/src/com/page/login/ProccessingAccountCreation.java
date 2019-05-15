package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class ProccessingAccountCreation extends WrapperClass {

//	public WebDriver driver;
	By newCCAccountButton;
	By dbaName;
	By SearchLookup;
	By goButton;
	By msrfirstResult;
	By accountLink;
	By lookupButton;
	By testRecord;
	By PromotionsNone;
	By NoHwOppNeeded;
	By autoApp;
	By integratedPartner;
	By software;
	By partnerVersion;
	By processor;
	By industry;
	
	public ProccessingAccountCreation(WebDriver driver){
//		this.driver=driver;
		DataReader.getData("ProcessingAccountCreation");
		DataReader.getDataKeyandValue("ProcessingAccountCreation");
		
	}
	
	public void clickAccountLink(String dataSet){
		click(dataSet, accountLink);
		Reporter.actions("Account Link Clicked");
		
	}
	public void clickNewCCAccountButton(String dataSet){
		click(dataSet, newCCAccountButton);
		Reporter.actions("New CC Account Button Clicked");
	}
	
	public void clickLookupButton(String dataSet){
		click(dataSet, lookupButton);
		Reporter.actions("Lookup Button Clicked");
	}
	public void setDBAName(String dataSet, String dataKey){
		write(dataSet, dataKey, dbaName);
		Reporter.actions("DBA Name Entered");
	}
	
	public void searchLookup(String dataSet, String dataKey){
		write(dataSet, dataKey, SearchLookup);
		Reporter.actions("DBA Name Entered");
	}
	
	public void clickGoButton(String dataSet){
		click(dataSet, goButton);
		Reporter.actions("Go Button Clicked");
	}
	
	public void clickFirstResult(String dataSet){
		click(dataSet, msrfirstResult);
		Reporter.actions("Test MSR Selected");
	}
	
	public void setTestRecordTrue(String dataSet){
		click(dataSet, testRecord);
		Reporter.actions("Test record set to true");
	}
	
	public void setPromotionsNone(String dataSet){
		click(dataSet, PromotionsNone);
		Reporter.actions("Promotions none is set to true");
	}
	
	public void setNoHwOppNeeded(String dataSet){
		click(dataSet, NoHwOppNeeded);
		Reporter.actions("No HW Opp Needed true");
	}
	
	public void setAutoApp(String dataSet){
		click(dataSet, autoApp);
		Reporter.actions("Auto App is set true");
	}
	
	public void setPartnerProduct(String dataSet){
		click(dataSet, integratedPartner);
		Reporter.actions("Partner Product Selected");
	}
	
	public void setSoftware(String dataSet){
		click(dataSet, software);
		Reporter.actions("partner product software selected");
	}
	
	public void setSoftwareVersion(String dataSet){
		click(dataSet, partnerVersion);
		Reporter.actions("Partner Product version selected");
	}
	public void selectFirstPartner(String dataSet){
		click(dataSet, msrfirstResult);
		
	}
	public void selectFirstPartnerProduct(String dataSet){
		click(dataSet, msrfirstResult);
		
	}
	public void selectFirstPartnerVersion(String dataSet){
		click(dataSet, msrfirstResult);
		
	}
	
	public void setProcessor(String dataSet,String dataKey, String selectby){
		select(dataSet, dataKey, selectby, processor);
		Reporter.actions("Processor Selected");
	}
	
	public void setIndustry(String dataSet,String dataKey, String selectby){
		select(dataSet, dataKey, selectby, industry);
		Reporter.actions("Industry Selected");
	}
	
	public void setAssociate(String dataSet,String dataKey, String selectby){
		select(dataSet, dataKey, selectby, industry);
		Reporter.actions("Associate Selected");
	}
	
	public void clickSaveButton(String dataSet){
		click(dataSet, goButton);
		Reporter.actions("PA Saved");
	}
}
