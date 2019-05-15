package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class RateQuote extends WrapperClass {
	
//	public WebDriver driver;
	By processor;
	By crossButton;
	By rateGroupLookup;
	By rateGroup;
	By rateSchemeLookup;
	By rateScheme;
	By editCustom;
	By annualSalesTextBox;
	By averageTicketTextBox;
	By sicCode;
	By amexDropDown;
	By completedCheckBoxDoubleClick;
	By completedCheckBoxAfter;
	By finalSaveButton;
	By acceptPricing;
	
	public RateQuote(WebDriver driver){
//		this.driver=driver;
		DataReader.getData("RateQuote");
		DataReader.getDataKeyandValue("RateQuote");
	}
	
	public void setProcessor(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, processor);
		Reporter.actions("Processor have been set");
	}
	
	public void clickCrossButton(String dataSet){
		click(dataSet, crossButton);
		Reporter.actions("Cross Button Clicked");
	}
	
	public void clickRateGroupLookupButton(String dataSet){
		click(dataSet, rateGroupLookup);
		Reporter.actions("Rate Group lookup button Clicked");
	}
	
	public void clickRateGroup(String dataSet){
		click(dataSet, rateGroup);
		Reporter.actions("Rate Group selected");
	}
	
	public void clickRateSchemeLookupButton(String dataSet){
		click(dataSet, rateSchemeLookup);
		Reporter.actions("Rate Scheme lookup button Clicked");
	}
	
	public void clickRateScheme(String dataSet){
		click(dataSet, rateScheme);
		Reporter.actions("Rate Scheme Selected");
	}
	
	public void clickSaveButton(String dataSet){
		click(dataSet, rateScheme);
		Reporter.actions("Save Button Clicked");
	}
	
	public void clickEditButton(String dataSet){
		click(dataSet, editCustom);
		Reporter.actions("Edit Custom Button Clicked");
	}
	
	public void setAnnualSalesValue(String dataSet, String dataKey){
		write(dataSet, dataKey, annualSalesTextBox);
		Reporter.actions("Annual sales Value Entered");
	}
	
	public void setAverageTicketValue(String dataSet,String dataKey){
		write(dataSet, dataKey, averageTicketTextBox);
		Reporter.actions("Average Ticket Value Entered");
	}
	
	public void setSICCode(String dataSet,String dataKey){
		write(dataSet, dataKey, sicCode);
		Reporter.actions("SIC Code Entered");
	}
	
	public void selectAmexDropDown(String dataSet,String dataKey, String selectby){
		select(dataSet, dataKey, selectby, amexDropDown);
		Reporter.actions("Amex Drop Down");
	}
	
	public void clickRqSaveButton(String dataSet){
		click(dataSet, editCustom);
		Reporter.actions("Edit Custom Button Clicked");
	}
	
	public void DoubleClickCompletedCheckBox(String dataSet){
		doubleClick(dataSet, completedCheckBoxDoubleClick);
		
	}
	
	public void checkCompletedCheckBox(String dataSet){
		doubleClick(dataSet, completedCheckBoxAfter);
		Reporter.actions("Check Box Checked");
	}
	
	public void clickFinalSaveButton(String dataSet){
		doubleClick(dataSet, finalSaveButton);
	}
	
	public void clickAcceptPricingButton(String dataSet){
		click(dataSet, acceptPricing);
		Reporter.actions("Accept Pricing Button Clicked");
	}
	
	public void doAcceptAlert(){
		acceptAlert();
	}
}

