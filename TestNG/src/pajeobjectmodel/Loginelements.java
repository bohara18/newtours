package pajeobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Loginelements {

	
	WebDriver driver;
	
	By username=By.name("userName");
	By password=By.name("password");
	By login=By.name("login");

	public Loginelements(WebDriver driver)
	{
		this.driver=driver;
	}
 public void userelement(String uid) 
{
 driver.findElement(username).sendKeys(uid);
} 
public void passwordelement(String upwd) 
{
driver.findElement(password).sendKeys(upwd);

}
 public void loginelements() {

	driver.findElement(login).click();
 }
}
