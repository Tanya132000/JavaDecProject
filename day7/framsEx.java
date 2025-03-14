package day7;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class framsEx {

	public static void main(String[] args) throws InterruptedException {

		
WebDriver driver = new ChromeDriver();
		
		driver.get(" https://ui.vision/demo/webtest/frames/");
		Thread.sleep(10);
		driver.manage().window().maximize();
		
	//freme1
		WebElement freame1= driver.findElement(By.xpath("//frame[@src=\"frame_1.html\"]"));
		driver.switchTo().frame(freame1);
		
		 driver.findElement(By.xpath("//input[@type=\"text\"][1]")).sendKeys("testing");

		// jump from frame1 to outer
		 driver.switchTo().defaultContent();
		 // jump outer to frame 2
		 WebElement freame2= driver.findElement(By.xpath("//frame[@src=\"frame_2.html\"]"));
			driver.switchTo().frame(freame2);
			driver.findElement(By.xpath("//input[@name=\"mytext2\"]")).sendKeys("Automation");
		
		//jump from frame 2 to outer
			driver.switchTo().defaultContent();
		//jump outer to frame 3 	
		
			WebElement freame3= driver.findElement(By.xpath("//frame[@src=\"frame_3.html\"]"));
			driver.switchTo().frame(freame3);
			driver.findElement(By.xpath("//input[@name=\"mytext3\"]")).sendKeys("Selenium");
		
		// jumping from frame3 to iframe 
			driver.switchTo().frame(0);
		driver.findElement(By.xpath("//div[@id=\"i9\"]")).click();
		
			
	//jump from iframe to outer	 
		driver.switchTo().defaultContent();
		//jump outer to form 4
		
		
		
		
		
		
		
		
		WebElement freame4= driver.findElement(By.xpath("//frame[@src=\"frame_4.html\"]"));
		driver.switchTo().frame(freame4);
		driver.findElement(By.xpath("//input[@name=\"mytext4\"]")).sendKeys("testng");
//		driver.close();
		
		
		
		
	}

}
