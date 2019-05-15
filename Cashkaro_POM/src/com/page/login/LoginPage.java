package com.page.login;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;


public class LoginPage extends WrapperClass {

//	WebDriver driver;
	AttributeFinder af=new AttributeFinder();
	By userName;
	By password;
	By signInButton;
	
	
	public LoginPage(){
		
//		this.driver=driver;
		DataReader.getData("UserLogin");
		DataReader.getDataKeyandValue("UserLogin");
	}

	public void setUsername(String dataSet, String dataKey){
		
		DataReader.getData("UserLogin");
		DataReader.getDataKeyandValue("UserLogin");
		String attribute_attributeValue=DataReader.getAttributeandAttributevalue(dataSet);
		userName=af.attributefinder(userName,attributeSplitter(attribute_attributeValue),attributeValueSplitter(attribute_attributeValue));
		driver.findElement(userName).sendKeys(DataReader.getEachKeyandKeyValue(dataKey));
		Reporter.actions("User Name Entered");
		
	}

	public void setPassword(String dataSet, String dataKey){
		DataReader.getData("UserLogin");
		DataReader.getDataKeyandValue("UserLogin");
		String attribute_attributeValue=DataReader.getAttributeandAttributevalue(dataSet);
		System.out.println(attribute_attributeValue);
		password=af.attributefinder(password,attributeSplitter(attribute_attributeValue), attributeValueSplitter(attribute_attributeValue));
		driver.findElement(password).sendKeys(DataReader.getEachKeyandKeyValue(dataKey));
		Reporter.actions("Password Entered");
	}
	
	public void signInButton(String dataSet){
		DataReader.getData("UserLogin");
		String attribute_attributeValue=DataReader.getAttributeandAttributevalue(dataSet);
		signInButton=af.attributefinder(signInButton, attributeSplitter(attribute_attributeValue),attributeValueSplitter(attribute_attributeValue));
		driver.findElement(signInButton).click();
		System.out.println("Login button clicked");
	}
	

}
