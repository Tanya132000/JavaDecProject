package day12;

import java.time.Duration;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollupEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
		driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		JavascriptExecutor js= (JavascriptExecutor)driver;

//1) scroll down page by pixel number		
	
	js.executeScript("window.scrollBy(0,1000)","");
		System.out.println(js.executeScript("return window.pageYoffset;"));
		
	//2) scroll up page by pixel number		
//	js.executeScript("window.scrollBy(500,0)","");

		
	}

}
