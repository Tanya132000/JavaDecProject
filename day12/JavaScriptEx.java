package day12;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class JavaScriptEx {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
	WebElement inputbox=driver.findElement(By.xpath("//input[@id='name']"));
	
//passing the text into input box- alternate option of sendKyes() 
		JavascriptExecutor js= (JavascriptExecutor)driver;
		js.executeScript("arguments[0].setAttribute('value','Tanya')",inputbox);
		
//clicking on element - alternate of click()
		WebElement radiobutton = driver.findElement(By.xpath("//input[@id='female']"));
		js.executeScript("arguments[0].click()", radiobutton);
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
