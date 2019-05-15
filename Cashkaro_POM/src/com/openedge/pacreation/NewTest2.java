package com.openedge.pacreation;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.cash.login.WrapperClass;

public class NewTest2 {
	@Test
	public void f() {
		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		
		//Selection Process
		driver.findElement(By.cssSelector("input[name='txtUserLoginID']")).sendKeys("Mathan");
		driver.findElement(By.cssSelector("input[name='txtPassword']")).sendKeys("Nov@1118");
		driver.findElement(By.xpath("//input[@name='txtConfirmPassword']")).sendKeys("Nov@1118");
		WebElement dropDownArea=driver.findElement(By.cssSelector("select[name='txtSecretQuestion']"));
		Select dropDownSelect=new Select(dropDownArea);
		dropDownSelect.selectByVisibleText("High school name?");
		driver.findElement(By.name("txtSecretAnswer")).sendKeys("Kamarajar higher secondary school");
		driver.findElement(By.className("textbox_30")).sendKeys("Mathan Balasubramaniam");
		driver.findElement(By.name("txtEmailId")).sendKeys("mathan83b@gmail.com");
		WebElement dropdownArea1=driver.findElement(By.cssSelector("select[name='selectGender']"));
        Select dropdownselect=new Select(dropdownArea1);
        dropdownselect.selectByVisibleText("Female");
        WebElement dropdownArea2=driver.findElement(By.cssSelector("select[name='selectMartialStatus']"));
        Select dropdownselect1=new Select(dropdownArea2);
        dropdownselect1.selectByVisibleText("Married");
        driver.findElement(By.xpath("//input[@name='txtStreetAddress']")).sendKeys("Gundanalligate");
        driver.findElement(By.xpath("//input[@name='txtState']")).sendKeys("Karnataka");
        driver.findElement(By.xpath("//input[@name='txtZipOrPostalCode']")).sendKeys("637005");
        driver.findElement(By.xpath("//input[@name='txtFaxNo']")).sendKeys("68768768");
        driver.findElement(By.xpath("//input[@name='txtCityOrTown']")).sendKeys("Bangalore");
        WebElement dropdownArea3=driver.findElement(By.name("selectCountry"));
        Select dropdownselect3=new Select(dropdownArea3);
        dropdownselect3.selectByValue("Algeria");
        driver.findElement(By.xpath("//input[@name='txtPhoneNo']")).sendKeys("8760322694");
        driver.findElement(By.xpath("//input[@name='txtMobileNo']")).sendKeys("9513095497");
        driver.findElement(By.xpath("//input[@name='chkRules']")).click();
        driver.findElement(By.className("dboxheader")).click();





        
        
		
	}
}
