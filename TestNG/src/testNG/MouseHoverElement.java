package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class MouseHoverElement {
WebDriver driver;
@Test
public void mouseHover() throws InterruptedException {
Thread.sleep(2000);
WebElement element=driver.findElement(By.linkText("Products"));
Actions mouse=new Actions(driver);
mouse.moveToElement(element).build().perform();
Thread.sleep(3000);
element=driver.findElement(By.linkText("Cards"));
mouse.moveToElement(element).build().perform();
Thread.sleep(3000);


element=driver.findElement(By.linkText("Credit Cards"));
mouse.moveToElement(element).click().build().perform();
Thread.sleep(3000);
String windowtitle=driver.getTitle();
if(windowtitle.contains("Credit Cards")) {
System.out.println("Credit Cards links are found and working");

}
else
{
System.out.println("credit cards links are not found and working");
}
}
	@BeforeTest
	public void launchapp() throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\aarad\\Documents\\seleniumworkspace\\chromedriver.exe");
	driver=new ChromeDriver();
	driver.get("http://hdfcbank.com");
	driver.manage().window().maximize();
	
	Thread.sleep(4000);
	}
@AfterTest
public void exit() {
	//driver.quit();
	
}
	
}