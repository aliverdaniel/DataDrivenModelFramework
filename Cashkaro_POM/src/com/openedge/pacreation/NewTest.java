package com.openedge.pacreation;

import org.testng.annotations.Test;

import com.cash.login.DataReader;
import com.cash.login.Excel;
import com.cash.login.ObjectReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;
import com.page.login.ApplicationCreation;
import com.page.login.Common;
import com.page.login.LeadCreation;
import com.page.login.LoginPage;
import com.page.login.ProccessingAccountCreation;
import com.page.login.RateQuote;

import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;

import java.awt.AWTException;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import java.util.logging.Logger;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;

public class NewTest extends WrapperClass{
	
//	public static WrapperClass wOb=new WrapperClass();
//	public static WebDriver driver;
	public static LoginPage loginpage;
	public static LeadCreation leadcreation;
	public static Common common;
	public static RateQuote rateQuote;
	public static ProccessingAccountCreation proccessingAccountCreation;
	public static ApplicationCreation applicationCreation;
	
	
	/*@BeforeTest                                                                                                           
	public void beforeTest(){
		try {
			loggerInitiation();
			Reporter.initialize();
			Excel.ExcelReaderInitialization();
			Excel.excelObjectExtraction();
			
			driver=new ChromeDriver();
			waiting= new WebDriverWait(driver,30);
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}*/
	
	@BeforeClass
	public void beforeClass() throws Throwable {
		loggerInitiation();
		Reporter.initialize();
		Excel.ExcelReaderInitialization();
		Excel.excelObjectExtraction();
		driver=new ChromeDriver();
		waiting= new WebDriverWait(driver,30);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://openedgepay--dev3.cs68.my.salesforce.com");
	}

	@BeforeMethod
	public void beforeMethod() {

		DataReader.mvalueinitialization();
	}

	@Test(priority=1)
	public void Login() {

		try {
			loginpage=new LoginPage();		
			loginpage.setUsername("Username text box", "Username");
			loginpage.setPassword("Password text box", "Password");
			loginpage.signInButton("Press sign in");
			screenshot("HomePage", "jpg");
			String name=driver.findElement(By.xpath("//span[text()='Aliver Samraj']")).getText();
			System.out.println(name+"account Name");
			screenshot("Home_Page", "jpg");
			Reporter.report("Aliver Samraj", name);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}	
	}

	@Test(priority=2)
	public void leadCreation(){

		leadcreation=new LeadCreation(driver);
		String currentWindowHandle;
		leadcreation.clickLeadbutton("Lead button");
		leadcreation.clickNewButton("New button");
		leadcreation.clickContinueButton("Continue button");
		leadcreation.setFirstName("First Name text box", "First Name");
		leadcreation.setLastName("Last Name text box", "Last Name");
		leadcreation.setCompanyName("Company Name text box", "Company Name");
		leadcreation.setCorporateName("Corporate Name Text Box", "Corporate Name");
		leadcreation.industry("Industry Drop Down", "Industry", "By visibleText");
		leadcreation.dbaName("DBA Name Text Box", "DBA Name");
		leadcreation.setWebSite("Website", "Website");
		leadcreation.setleadStatus("Lead Status drop down", "Lead Status", "By visibleText");
		leadcreation.lookUpButton("Lookupwindow button");
		currentWindowHandle=driver.getWindowHandle();
		leadcreation.lookupSwitch(currentWindowHandle);
		leadcreation.frameSwitch("searchFrame");
		leadcreation.partnerSearch("Partner search box", "Partner");
		leadcreation.clickSearchBoxGo("Partner search button");
		driver.switchTo().defaultContent();
		leadcreation.frameSwitch("resultsFrame");
		leadcreation.selectpartner("Partner");
		driver.switchTo().window(currentWindowHandle);
		leadcreation.selectLeadSource("Lead Source drop down", "Lead Source", "By visibleText");
		leadcreation.setPhoneNumber("Phone Text Box", "Phone");
		leadcreation.setMobileNumber("MobileNum Text Box", "Mobile");
		leadcreation.setFaxNumber("FAX Text Box", "Fax");
		leadcreation.setAddress("Address Text Box", "Address");
		leadcreation.setCity("City Text Box", "City");
		leadcreation.setState("State Text Box", "State");
		leadcreation.setCountry("Country Text Box", "Country");
		leadcreation.setZip("ZIP Text Box", "Zip");
		leadcreation.setNumberOfLocations("No. of Locations Text Box", "No. of locations");
		leadcreation.clickSaveButton("Save Button");
		screenshot("Lead_Converted", "jpg");
		Reporter.report("Aliver Samraj", "Aliver Samraj");	
	}

	@Test(priority=3)
	public void opportunityCreation(){

		common=new Common(driver);
		common.clickOpportunityLink("Opportunity Link");
		common.clickRateQuoteLink("Rate Quote linkText");
		common.ClickCustomRateQuoteButton("Custom rate Quote Button");
		screenshot("Lead_Converted", "jpg");
		Reporter.report("Aliver Samraj", "Aliver Samraj");	
	}

	@Test(priority=4)
	public void rateQuote(){

		rateQuote=new RateQuote(driver);
		String currentWindowHandle;
		rateQuote.setProcessor("Processor","Processor","By VisibleText");
		rateQuote.clickCrossButton("Cross Button");
		currentWindowHandle=driver.getWindowHandle();
		rateQuote.clickRateGroupLookupButton("Rate Group lookup button");
		lookupSwitch(currentWindowHandle);
		rateQuote.frameSwitch("resultsFrame");
		rateQuote.clickRateGroup("Custom Rate Schema");
		driver.switchTo().window(currentWindowHandle);
		rateQuote.clickRateGroupLookupButton("Rate Scheme Lookup Button");
		rateQuote.lookupSwitch(currentWindowHandle);
		rateQuote.frameSwitch("resultsFrame");
		rateQuote.clickRateScheme("Rate Scheme");
		driver.switchTo().window(currentWindowHandle);
		rateQuote.clickSaveButton("Save Button");
		rateQuote.clickEditButton("edit button");
		rateQuote.setAnnualSalesValue("Annual Sales Text Box", "Annual Sales");
		rateQuote.setAverageTicketValue("Average Ticket Text Box", "Average Ticket");
		rateQuote.setSICCode("SIC Code", "SIC Code");
		rateQuote.selectAmexDropDown("Amex drop down", "Amex Drop Down", "By VisibleText");
		rateQuote.clickRqSaveButton("RQ Save Button");
		/*rateQuote.DoubleClickCompletedCheckBox("Double Click Completed Check Box");
		rateQuote.checkCompletedCheckBox("Check Completed Check Box");*/
		rateQuote.clickFinalSaveButton("Overall Save Button");
		rateQuote.clickAcceptPricingButton("Accept Pricing Button");
		rateQuote.doAcceptAlert();
		rateQuote.screenshot("Rate_Quote", "jpg");
		Reporter.report("Aliver Samraj", "Aliver Samraj");	
	}

	@Test(priority=5)
	public void proccessingAccountCreation(){

		proccessingAccountCreation=new ProccessingAccountCreation(driver);
		String currentWindowHandle = null;
		proccessingAccountCreation.clickAccountLink("Account Link");
		proccessingAccountCreation.clickNewCCAccountButton("New CC Account Link");
		currentWindowHandle=driver.getWindowHandle();
		proccessingAccountCreation.setDBAName("DBA Name", "DBA Name");
		proccessingAccountCreation.clickLookupButton("Test MSR Lookup Button");
		proccessingAccountCreation.lookupSwitch(currentWindowHandle);
		proccessingAccountCreation.frameSwitch("searchFrame");
		//	proccessingAccountCreation.searchLookup("Lookup Window Search Box", "Lookup Window Search");
		proccessingAccountCreation.clickGoButton("Lookup window go Button");
		driver.switchTo().defaultContent();
		proccessingAccountCreation.frameSwitch("resultsFrame");
		proccessingAccountCreation.clickFirstResult("First Result");
		driver.switchTo().window(currentWindowHandle);
		proccessingAccountCreation.setTestRecordTrue("Test Record");
		proccessingAccountCreation.setPromotionsNone("Promotions None");
		proccessingAccountCreation.setNoHwOppNeeded("No HW opp Needed");
		proccessingAccountCreation.setAutoApp("Auto App");

		proccessingAccountCreation.setPartnerProduct("Partner Product");
		proccessingAccountCreation.lookupSwitch(currentWindowHandle);
		proccessingAccountCreation.frameSwitch("resultsFrame");
		proccessingAccountCreation.selectFirstPartner("Partner First Result");
		driver.switchTo().window(currentWindowHandle);

		proccessingAccountCreation.setSoftware("Software");
		proccessingAccountCreation.lookupSwitch(currentWindowHandle);
		proccessingAccountCreation.frameSwitch("resultsFrame");
		proccessingAccountCreation.selectFirstPartnerProduct("Software First Result");
		driver.switchTo().window(currentWindowHandle);

		proccessingAccountCreation.setSoftwareVersion("Partner Version");
		proccessingAccountCreation.lookupSwitch(currentWindowHandle);
		proccessingAccountCreation.frameSwitch("resultsFrame");
		proccessingAccountCreation.selectFirstPartnerVersion("Version First Result");
		driver.switchTo().window(currentWindowHandle);

		proccessingAccountCreation.setProcessor("Processor", "Processor Type", "By VisibleText");
		proccessingAccountCreation.setIndustry("Industry", "Industry", "By VisibleText");
		proccessingAccountCreation.setAssociate("Associate", "Associate", "By VisibleText");
		proccessingAccountCreation.clickSaveButton("Save Button");
		Reporter.report("Aliver Samraj", "Aliver Samraj");

	}

	@Test(priority=6)
	public void applicationCreation() throws InterruptedException, AWTException{

		applicationCreation =new ApplicationCreation(driver);
		String currentWindowHandle = null;
		currentWindowHandle=driver.getWindowHandle();
		applicationCreation.clickApplicationwizard("Application wizard button");
		applicationCreation.clickContactLookup("Contact Lookup Button");
		applicationCreation.lookupSwitch(currentWindowHandle);
		applicationCreation.frameSwitch("searchFrame");
		applicationCreation.setContactName("Contact Textbox", "Contact Name");
		applicationCreation.clickGoButton("Go button");
		driver.switchTo().defaultContent();
		applicationCreation.frameSwitch("resultsFrame");
		applicationCreation.selectFirstResult("First Result");
		driver.switchTo().window(currentWindowHandle);
		applicationCreation.setEmailAddress("Email address box", "Email ID");
		System.out.println(getTextBoxValue("DBA Name in Application"));
		applicationCreation.clickCopyButton("Copy address button");
		applicationCreation.verifyTextIsCopied("Legal Name", "DBA Name in Application");
		applicationCreation.clickNextButton("Next Button");
		applicationCreation.selectBusinessType("Business Type select", "Business type", "By VisibleText");
		applicationCreation.selectMarketType("Market Type", "Market Type", "By VisibleText");
		applicationCreation.clickRateQuoteLookup("Rate Quote");
		applicationCreation.lookupSwitch(currentWindowHandle);
		applicationCreation.frameSwitch("resultsFrame");
		applicationCreation.clickRateQuoteLink("Rate Quote link");
		driver.switchTo().window(currentWindowHandle);
		applicationCreation.waitForPagetoRefresh();
		applicationCreation.setFederalTaxId("Federal Tax ID text box", "Federal tax ID");
		applicationCreation.setServicesSold("Product details text box", "Product details");
		applicationCreation.selectCardAcceptance("Cards select", "Card details", "By VisibleText");
		applicationCreation.selectWarranties("Warranties select", "Warranties", "By VisibleText");
		applicationCreation.setYearsUnderBusiness("Years in Business text box", "Years in business");
		applicationCreation.selectCardAcceptance("Do you accept other card select", "accept transactions before goods", "By VisibleText");
		applicationCreation.selectPCICompliance("PCI Compliance select", "PCI", "By VisibleText");
		applicationCreation.setCardSwipeValue("Card swipe box", "Card swipe");
		applicationCreation.setKeyedValue("Keyed box", "Keyed");
		applicationCreation.setMailValue("Mail box", "Mail");
		applicationCreation.setInternetValue("Internet box", "Internet");
		applicationCreation.clickNext("Next Button");
		applicationCreation.clickDate("Datebox");
		applicationCreation.setDate("Date Picker", "December", "3", "1993");
		applicationCreation.setOwnerFirstName("Owner First Name input", "Owner First Name ");
		applicationCreation.setOwnerSecondName("Owner Second Name input", "Owner Second Name");
		applicationCreation.setTitle("Title input", "Title");
		applicationCreation.setHomeAddress("Home address input", "Home address");
		applicationCreation.setSocialSecurityNumber("Social Security Number input", "Social Security Number");
		applicationCreation.setCity("City input", "City");
		applicationCreation.setState("State input", "State");
		applicationCreation.setZip("ZIP/Postal Code", "ZIP/Postal Code");
		applicationCreation.setPercentageOwned("Percentage Owned input", "Percentage Owned");
		applicationCreation.setHomePhoneNumber("Home Phone Number input", "Home Phone Number");
		applicationCreation.setEmailAddress("Email Address input", "Email Address");
		applicationCreation.setYearsThere("Years There input", "Years There");
		applicationCreation.selectOwn_Rent("Own/Rent select", "Own/Rent", "By VisibleText");
		applicationCreation.clickNext("Next Button");
		applicationCreation.setBankName("Bank Name input", "Bank Name");
		applicationCreation.setRoutingNumber("ABA Routing Number input", "ABA Routing Number");
		applicationCreation.setBusinessName("Business Name input", "Business Name");
		applicationCreation.setAccountNumber("DDA input", "DDA");
		applicationCreation.clickNext("Next Button");
		applicationCreation.selectDocument("Documents Selection", "Document", "By VisibleText");
		applicationCreation.clickChooseFileButton("Choose file Button");
		applicationCreation.selectFile();
		applicationCreation.clickAttachFile("Attach File");
		applicationCreation.clickNext("Next Button");
		applicationCreation.clickSubmitButton("Submit Button");
		Reporter.report("Aliver Samraj", "Aliver Samraj");
	}



	@AfterMethod
	public void afterMethod() {
		System.out.println("after method called");
		Reporter.writeResults();
	}

	@AfterClass
	public void afterClass() {
		//driver.close();
	}

}
