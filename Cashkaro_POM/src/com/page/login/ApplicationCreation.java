package com.page.login;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;

import com.cash.login.DataReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;

public class ApplicationCreation extends WrapperClass{

//	public WebDriver driver;
	By applicationWizard;
	By contactLookup;
	By contactName;
	By goButton;
	By firstResult;
	By setEmail;
	By copyButton;
	By legalElement;
	By nextButton;
	By textPresent;
	By businessType;
	By rqLookup;
	By rqLink;
	By fedTaxId;
	By sicCode;
	By serviceSold;
	By selectable;
	WebElement wb;
	AttributeFinder af=new AttributeFinder();

	public ApplicationCreation(WebDriver driver){
	//	this.driver=driver;
		DataReader.getData("ApplicationCreation");
		DataReader.getDataKeyandValue("ApplicationCreation");		
	}

	public void clickApplicationwizard(String dataSet){
		click(dataSet, applicationWizard);
		Reporter.actions("Clicked Application wizard button");
	}

	public void clickContactLookup(String dataSet){
		click(dataSet, contactLookup);
		Reporter.actions("Clicked Contact Lookup button");
	}

	public void setContactName(String dataSet, String dataKey){
		write(dataSet, dataKey, contactName);
		Reporter.actions("Contact Name selected");
	}

	public void clickGoButton(String dataSet){
		click(dataSet, goButton);
		Reporter.actions("Clicked go button in Lookup Window");
	}

	public void selectFirstResult(String dataSet){
		click(dataSet, firstResult);
		Reporter.actions("First Result Selected");
	}

	public void setEmailAddress(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Email Id Entered");
	}

	public void clickCopyButton(String dataSet){
		click(dataSet, copyButton);
		Reporter.actions("Copy DBA address to legal button is clicked");

	}

	public void verifyTextIsCopied(String dataSet, String sourceDataSet){
		waitForText(dataSet, sourceDataSet, textPresent);
		Reporter.actions("DBA address is copied to Legal");
	}

	public void clickNextButton(String dataSet){
		click(dataSet, nextButton);
		Reporter.actions("Next button Clicked");
	}

	public void selectBusinessType(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		waitForAjax(dataKey);
		Reporter.actions("Business Type selected");
	}

	public void clickRateQuoteLookup(String dataSet){
		click(dataSet, rqLookup);
		Reporter.actions("Next button Clicked");
	}

	public void clickRateQuoteLink(String dataSet){
		click(dataSet, rqLink);
		Reporter.actions("Next button Clicked");
	}
	public void setFederalTaxId(String dataSet, String dataKey){
//		write(dataSet, dataKey, fedTaxId);
		WebElement fedexId;
		javaScriptWrite(dataSet, dataKey, fedTaxId);
		Reporter.actions("Email Id Entered");
	}

	public void setSICCode(String dataSet, String dataKey){
		write(dataSet, dataKey, sicCode);
		Reporter.actions("Email Id Entered");
	}

	public void setServicesSold(String dataSet, String dataKey){
		write(dataSet, dataKey, serviceSold);
		Reporter.actions("Email Id Entered");
	}

	public void selectWarranties(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Business Type selected");
	}

	public void selectCardAcceptance(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Card Acceptance is set");
	}

	public void setAnnualSalesValue(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Annual Sales Value is set");
	}

	public void selectMarketType(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Market Type is selected");
	}

	public void setYearsUnderBusiness(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Years under the Business is entered");
	}

	public void setAverageTransaction(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}

	public void selectPCICompliance(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Market Type is selected");
	}

	public void waitForPagetoRefresh(){
		boolean ticker=waitforPageLoad();
		if(ticker==true){
			Reporter.actions("Page Refreshed");
		}
	}
	
	public void clickNext(String dataSet){
		click(dataSet, nextButton);
		
	}
	
	public void setDate(String dataSet,String month,String day, String year){
		String attribute_attributeValue=DataReader.getAttributeandAttributevalue(dataSet);
		selectable=AttributeFinder.attributefinder(selectable, attributeSplitter(attribute_attributeValue),attributeValueSplitter(attribute_attributeValue));
		wb=driver.findElement(selectable);
		datePicker(month, day, year, wb);
	}
	
	public void setCardSwipeValue(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setKeyedValue(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setMailValue(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setInternetValue(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setOwnerFirstName(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setOwnerSecondName(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setTitle(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setSocialSecurityNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setHomeAddress(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setCity(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setState(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setZip(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setPercentageOwned(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setHomePhoneNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setFax(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setOwnerEmailAddress(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setYearsThere(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void selectOwn_Rent(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Business Type selected");
	}
	public void setBankName(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void clickDate(String dataSet){
		click(dataSet, rqLookup);
		Reporter.actions("Next button Clicked");
	}

	public void setBusinessName(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setRoutingNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void setAccountNumber(String dataSet, String dataKey){
		write(dataSet, dataKey, setEmail);
		Reporter.actions("Average Transaction is set");
	}
	public void selectDocument(String dataSet, String dataKey, String selectby){
		select(dataSet, dataKey, selectby, businessType);
		Reporter.actions("Business Type selected");
	}
	public void clickChooseFileButton(String dataSet){
		click(dataSet, rqLookup);
		Reporter.actions("Next button Clicked");
	}
	public void clickAttachFile(String dataSet){
		click(dataSet, rqLookup);
		Reporter.actions("Next button Clicked");
	}
	public void clickSubmitButton(String dataSet){
		click(dataSet, rqLookup);
		Reporter.actions("Next button Clicked");
	}
	public void selectFile() throws InterruptedException, AWTException{

		Robot robot = new Robot();
		StringSelection selecttext =new StringSelection("D:\\Learning\\First Data\\Voided Check.pdf");
		/*Clipboard clip=Toolkit.getDefaultToolkit().getSystemClipboard();
		clip.setContents(selecttext, null);*/
		Toolkit.getDefaultToolkit().getSystemClipboard().setContents(selecttext, null);
		Thread.sleep(3000);
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_V);
		robot.keyRelease(KeyEvent.VK_CONTROL);
		robot.delay(1500);
		robot.keyPress(KeyEvent.VK_ENTER);
		robot.keyRelease(KeyEvent.VK_ENTER);
		Thread.sleep(4000);
	}
}
