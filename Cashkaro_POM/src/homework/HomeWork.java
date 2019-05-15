package homework;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HomeWork {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "F:\\Selenium\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("http://www.tnstc.in/TNSTCOnline/preUserRegistration.do");
		
		//to select
		WebElement Selectable=driver.findElement(By.xpath("//select[@name='selectCountry']"));
		Select selecThis=new Select(Selectable);
		selecThis.selectByVisibleText("Canada");	
		
		
		
				
	}
	


}
