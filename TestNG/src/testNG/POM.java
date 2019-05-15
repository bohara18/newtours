package testNG;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class POM {
WebDriver driver;

// login page

public static By un=By.xpath("//input[@name='userName']");
public static By pw=By.name("password");
public static By login_bn=By.name("userName");
static String uname="mercury";
// regi page
public static By fn=By.name("firstName");


@Test(priority=0)
public void login() {
System.out.println("login");


driver.findElement(un).sendKeys(uname);
driver.findElement(pw).sendKeys("ramesh");
driver.findElement(login_bn).click();
System.out.println("login success");
}


@Test(dependsOnMethods="login")
public void logout() throws InterruptedException {
Thread.sleep(3000);
driver.findElement(By.linkText("SIGN-OFF")).click();

System.out.println("login success");



}


}

