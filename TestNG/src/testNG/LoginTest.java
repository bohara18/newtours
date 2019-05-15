package testNG;

import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class LoginTest {
@Test(priority=0)
public void login() {
	System.out.println("login");
}
@Test(priority=1)
public void logout() {
	System.out.println("logout");
}

@BeforeTest
public void launch() {
	System.out.println("launch");
}

}
