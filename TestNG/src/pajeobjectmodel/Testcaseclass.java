package pajeobjectmodel;

import org.testng.annotations.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import testNG.LoginTest;
import testNG.Logintest2;

public class Testcaseclass {

	@Test
	public void verifylogin() {
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\aarad\\\\Documents\\\\seleniumworkspace\\\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("http://newtours.demoaut.com");
		Loginelements login=new Loginelements(driver);
		login.userelement("ramesh");
	    login.passwordelement("ramesh12");
		login.loginelements();
	}
	
}
