package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.BeforeClass;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class GoogleSearch extends WrapperClass{
	By setSearchValue;
	By SearchBar;
	By LinkToVerify;
	By enterKeyPress;
	By randomKeyPress;
	
	public GoogleSearch(WebDriver driver){
	//	this.driver=driver;
		DataReader.getData("GoogleSearch");
		DataReader.getDataKeyandValue("GoogleSearch");
	}
	
	public void setSearchValue(String dataSet, String dataKey) {
		write(dataSet, dataKey, setSearchValue);
//		pressEnter(dataSet, enterKeyPress);
		Reporter.actions("Search Value Entered");	
		
	}
	
	public void clickSearchButton(String dataSet){
		click(dataSet, SearchBar);
		Reporter.actions("Search Button Clicked");
	}
	
	public void clickRandom(String dataSet){
		click(dataSet, randomKeyPress);
		Reporter.actions("Random Click to avoid suggestions");
	}
	
	public void verifyElement(String dataSet) {
		verifyElement(dataSet, LinkToVerify);
		Reporter.actions("Link Verification enabled");
	}
	
	public void FirstLink(String dataSet) {
		click(dataSet, LinkToVerify);
		Reporter.actions("Link Verification enabled");
	}
}
