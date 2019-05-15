package testNG;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Logintest2 {
WebDriver driver;

@Test(priority=0)
public void login() throws IOException {
	FileInputStream file=new FileInputStream("C:\\Users\\aarad\\Documents\\Testdatasheet\\Testdatasheet.xlsx");
	
	XSSFWorkbook wb =new XSSFWorkbook(file);
		XSSFSheet sh=wb.getSheet("Sheet2");
		
		Row rows=null;

		String un=sh.getRow(1).getCell(0).getStringCellValue();
		String pw=sh.getRow(1).getCell(1).getStringCellValue();
		System.out.println("login testdata: "+ un +","+ pw );
		
	driver.findElement(By.name("userName")).sendKeys(un);
	driver.findElement(By.name("password")).sendKeys(pw);
	driver.findElement(By.name("login")).click();
	System.out.println("login success");
}

	@Test(dependsOnMethods="login")
	public void logout() throws InterruptedException 
		{
		Thread.sleep(2000);
		driver.findElement(By.linkText("SIGN-OFF")).click();
		
		System.out.println("Logout success");
		
	}
		@BeforeTest
		public void launch() {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\aarad\\Documents\\seleniumworkspace\\chromedriver.exe");
			driver=new ChromeDriver();
			driver.get("http://www.newtours.demoaut.com");
			driver.manage().window().maximize();
		}

		public static void passwordelement(String string) {
			// TODO Auto-generated method stub
			
		}
	}


