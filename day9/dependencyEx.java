package day9;

import org.testng.Assert;
import org.testng.annotations.Test;

public class dependencyEx {
// openapp
//login
//Search
//Advsearch
//logout
	
	@Test
	 void openapp() {
		System.out.println("openapp"); 
		Assert.assertEquals(true, true);
	 }
	@Test(dependsOnMethods="openapp")

	 void login() {
		 System.out.println("login");
	 }
	@Test(dependsOnMethods="login")

    void search() {
		System.out.println("search"); 
	 }
	@Test(dependsOnMethods="search")

   void advsearch() {
	 System.out.println("advsearch");
	 Assert.assertEquals(true, false);
     }
	@Test(dependsOnMethods="advsearch")

    void logout() {
	 System.out.println("logout");
    }


}
