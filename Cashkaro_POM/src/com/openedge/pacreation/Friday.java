package com.openedge.pacreation;

import java.io.FileInputStream;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com.cash.login.DataReader;
import com.cash.login.DataSheetReader;
import com.cash.login.Excel;
import com.cash.login.ObjectReader;
import com.cash.login.Reporter;
import com.cash.login.WrapperClass;
import com.page.login.GoogleSearch;
import com.page.login.LoginPage;


public class Friday extends WrapperClass {
	public static GoogleSearch googleSearch;
	
	
	@BeforeTest
	public void FridayBeforeClass() throws Throwable {
//		loggerInitiation();
		Reporter.initialize();
		Excel.ExcelReaderInitialization();
		Excel.excelObjectExtraction();
		driver=new ChromeDriver();
		waiting= new WebDriverWait(driver,30);	
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.in");
		
	}
	
	@BeforeClass
	public void FridayLoadTestCase() {		
		DataReader.mvalueinitialization();
	}
	
	@Test
	public void fridayTest() {
		googleSearch = new GoogleSearch(driver);
		googleSearch.setSearchValue("SearchBar", "SearchValue");
		googleSearch.clickRandom("RandomClick");
		googleSearch.clickSearchButton("SearchButton");
		googleSearch.verifyElement("LinkToVerify");		
		googleSearch.FirstLink("FirstLink");
		screenshot("ScreenShot", "jpeg");
		Reporter.report("abcd", "abcd");
	}
	
	@Test
	public void fridayTest2() {
		googleSearch = new GoogleSearch(driver);
		googleSearch.setSearchValue("SearchBar", "SearchValue");
		googleSearch.clickRandom("RandomClick");
		googleSearch.clickSearchButton("SearchButton");
		googleSearch.verifyElement("LinkToVerify");		
		googleSearch.FirstLink("FirstLink");
		screenshot("ScreenShot", "jpeg");
		Reporter.report("abcd", "abcd");
	}
	@AfterClass
	public void afterMethod() {
		System.out.println("after method called");
		Reporter.writeResults();
		driver.close();
	}
}

//
//
//
//public class Friday {
//
//	public static List<ObjectReader> excelTestList;
//	public static List<DataSheetReader> dataSheetKeysandvalues;
//	static Workbook workbook;
//	static Sheet sheet1;
//	static Sheet sheet2;
//	static Sheet dataSheet;
//
//	public static  void ExcelReaderInitialization(){
//		excelTestList=new ArrayList<ObjectReader>();
//		dataSheetKeysandvalues=new ArrayList<DataSheetReader>();		
//	}
//
//	public static void excelObjectExtraction() throws Throwable{
//		try {
//			String fileInputpath="F:\\Selenium\\Test Data Sheet\\PA_Creation.xlsx";
//
//			FileInputStream fis=null;		
//			fis = new FileInputStream(fileInputpath);
//			workbook = new XSSFWorkbook(fis);
//
//			List<String> methodNameList=new ArrayList<String>();
//			sheet1 = workbook.getSheetAt(0);
//			dataSheet=workbook.getSheetAt(2);
//			int lastRowNumberFirstSheet=sheet1.getLastRowNum();
//			System.out.println(lastRowNumberFirstSheet);
//			int lastRowofDataSheet=dataSheet.getLastRowNum();
//			System.out.println(lastRowofDataSheet);
//			
//			String methodNamesFromFirstSheet="";
//			for(int i=1;i<=lastRowNumberFirstSheet;i++){
//				Row row=sheet1.getRow(i);
//				methodNamesFromFirstSheet=row.getCell(1).toString();
//				System.out.println(methodNamesFromFirstSheet);
//				methodNameList.add(methodNamesFromFirstSheet);	
//			}
//
//			sheet2=workbook.getSheetAt(1);
//			int lastRowNumberSecondSheet=sheet2.getLastRowNum();
//
//			String attribute="";
//			String type="";
//			String locator="";
//			String methodName="";
//
//			for(int i=0;i<methodNameList.size();i++){
//
//				methodName=methodNameList.get(i);
//				System.out.println("Method name to match with second sheet : " +methodName);
//
//				String previousMethodName="";
//				for(int j=0;j<=lastRowNumberSecondSheet;j++){
//
//					Row row=sheet2.getRow(j);
//
//					//if first cell from row not null then store in previous method name field
//					if(row.getCell(0)!=null){
//						previousMethodName=row.getCell(0).toString();
//					}
//
//					//if first cell from row not null and matches method name from first sheet				 
//					if(row.getCell(0)!=null && methodName.equalsIgnoreCase(row.getCell(0).toString())){
//						previousMethodName=row.getCell(0).toString();
//						System.out.println("Method name : "+methodName+", previous method name : "+previousMethodName);					
//						methodName=row.getCell(0).toString();
//						attribute=row.getCell(1).toString();
//						type=row.getCell(2).toString();
//						locator=row.getCell(3).toString();
//						ObjectReader excelTest=new ObjectReader(previousMethodName,attribute,type,locator);
//						excelTestList.add(excelTest);
//					}
//
//					//if first cell from row is null and matches previous method name				 
//					if(row.getCell(0)==null&&previousMethodName.equalsIgnoreCase(methodName)){
//
//						System.out.println("Method name : "+methodName+", previous method name------- : "+previousMethodName);
//						attribute=row.getCell(1).toString();
//						type=row.getCell(2).toString();
//						locator=row.getCell(3).toString();
//						ObjectReader excelTest=new ObjectReader(previousMethodName, attribute, type, locator);
//						excelTestList.add(excelTest);
//					}
//
//				}
//			}
//
//			String dataSheetMethodName="";
//			String previousDataSheetMethodName="";
//			String dataKey="";
//			String datakeyValue="";
//			System.out.println("lastrowofdatasheet"+lastRowNumberFirstSheet);
//			for(int i=1;i<=lastRowofDataSheet;i++){
//				Row row =dataSheet.getRow(i);
//				if(row.getCell(0)!=null){
//					dataSheetMethodName=row.getCell(0).toString();
//					dataKey=row.getCell(1).toString();
//					datakeyValue=row.getCell(2).toString();
//					DataSheetReader dataSheetValues=new DataSheetReader(dataSheetMethodName, dataKey, datakeyValue);
//					dataSheetKeysandvalues.add(dataSheetValues);
//				}
//				else{
//					previousDataSheetMethodName=dataSheetMethodName;
//					dataKey=row.getCell(1).toString();
//					datakeyValue=row.getCell(2).toString();
//					DataSheetReader dataSheetValues=new DataSheetReader(previousDataSheetMethodName, dataKey, datakeyValue);
//					dataSheetKeysandvalues.add(dataSheetValues);
//				}
//
//			}
//			/*for(int i=0;i<dataSheetKeysandvalues.size();i++){
//				System.out.println("dataSheetKeysandvalues: "+dataSheetKeysandvalues.get(i).getDataSheetMethodName() +" "+dataSheetKeysandvalues.get(i).getDatakey()+" "+dataSheetKeysandvalues.get(i).getDatakeyValue());
//			}
//			System.out.println("Excel Test List size : " +excelTestList.size());
//			for(int i=0;i<excelTestList.size();i++){
//				System.out.println("Excel Test List data : "+excelTestList.get(i).getdataSet() +" "+excelTestList.get(i).getattribute()+" "+excelTestList.get(i).getattributeName()+" "+excelTestList.get(i).getmethodName());
//			}*/
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			System.out.println("Error in reading excel file");
//		}
//	} 
//
//
//}
