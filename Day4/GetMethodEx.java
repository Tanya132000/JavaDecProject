package Day4;

import java.time.Duration;
import java.util.ArrayList;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetMethodEx {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

// getTitle- get the title of the application		
//String AppTitel=driver.getTitle();
//System.out.println(AppTitel);	
// 
// getCurrentUrl= get the url of application
//String url= driver.getCurrentUrl();		
//		System.out.println(url);
		
// getPageSource= get the DOM page (HTML code)
//	String pagesource= 	driver.getPageSource();
//		System.out.println(pagesource);
	
//get window handle= it will give u one internal application id which is randomly created every time different.
	

String id= driver.getWindowHandle();
System.out.println(id);

//get window handles=  it will give u more then one internal application id which is randomly created every time different.

WebElement link =driver.findElement(By.xpath("//a[normalize-space()='OrangeHRM, Inc']"));
link.click();

Set<String> windowids= driver.getWindowHandles();
System.out.println(windowids);

 ArrayList<String> ids= new ArrayList<String>(windowids);
String parent= ids.get(0);
String child= ids.get(1);

//for Title of parent and child
  String ParentTitle= driver.switchTo().window(parent).getTitle();
System.out.println(ParentTitle);


String ChildTitle= driver.switchTo().window(parent).getTitle();
System.out.println(ChildTitle);


System.out.println(parent);
System.out.println(child);


// for closing one windows

//for(String Win:windowids) {
//	if (ids.get(1).equals(child)) {
//		driver.close();

//one more way to close the windows		
		
		for(String id1:ids) {
			if (id1.equals(child)) {
				driver.close();	
		
		
		
		
		
	}
}




		

	}

		
		
}	
	  
