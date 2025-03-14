package Day5;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationEx {

	public static void main(String[] args) throws MalformedURLException {
   WebDriver Driver = new ChromeDriver();
   
//   Driver.get("https://www.saucedemo.com/");
   
   URL url = new URL("https://www.saucedemo.com/");
   Driver.navigate().to(url);
   
  Driver.navigate().to("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
   
   
  Driver.navigate().back();
  Driver.navigate().forward();  
  Driver.navigate().refresh();
  
  
  
  
	}

}
