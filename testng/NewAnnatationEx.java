package testng;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class NewAnnatationEx {
//// Before and After class
//	@BeforeClass
//	void launchBrowser() {
//		System.out.println("launchBrowser");
//	}
//	@Test(priority=1)
//	void login() {
//		System.out.println("loginUrl");
//	}
//	@Test(priority=0)
//	void enterCredentials() {
//		System.out.println("enterCredentials");
//
//	}
//	@AfterClass
//	void logout() {
//		System.out.println("logout");
//	}
 
	
	
	
	
// Before and After Method
	
	@BeforeMethod
	void launchBrowser() {
		System.out.println("launchBrowser");
	}
	@Test
	void login() {
		System.out.println("loginUrl");
	}
	@Test
	void enterCredentials() {
		System.out.println("enterCredentials");

	}
	@AfterMethod
	void logout() {
		System.out.println("logout");

	}

	
	
	
	
	
	
	
}
