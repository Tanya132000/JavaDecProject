package Day3;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkText {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.demoblaze.com/index.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

//Boolean logo= driver.findElement(By.linkText("PRODUCT STORE")).isEnabled();
//System.out.println("logo");

		Boolean logo = driver.findElement(By.partialLinkText("PRODUCT")).isEnabled();
		System.out.println(logo);

		Boolean logo1 = driver.findElement(By.linkText("PRODUCT STORE")).isEnabled();
		System.out.println(logo1);
//TagName
		
List<WebElement> totel_image= driver.findElements(By.tagName("a"));		
		System.out.println(totel_image.size());
		
		
		
	}

}
