package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class Common extends WrapperClass{
//	public WebDriver driver;

	By opportunityLink;
	By rateQuoteLink;
	By CustomRateQuoteButton;

	
	public Common(WebDriver driver){
//		this.driver=driver;
		DataReader.getData("OpportunityCreation");
		DataReader.getDataKeyandValue("OpportunityCreation");
	}
	
	public void clickOpportunityLink(String dataSet){
		click(dataSet, opportunityLink);
		Reporter.actions("Opportunity link Clicked");
	}
	
	public void clickRateQuoteLink(String dataSet){
		click(dataSet, rateQuoteLink);
		Reporter.actions("Rate Quote Link Clicked");
	}
	
	public void ClickCustomRateQuoteButton(String dataSet){
		click(dataSet, CustomRateQuoteButton);
		Reporter.actions("Custom Rate Quote Button Clicked");
	}
	
	
}

