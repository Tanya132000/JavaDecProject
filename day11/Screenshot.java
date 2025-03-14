package day11;

import java.io.File;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();
        driver.get("https://tutorialsninja.com/demo/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//		1) full page Screenshot 
		
//		TakesScreenshot ts= (TakesScreenshot) driver;     //casting 
//		File sourcefile= ts.getScreenshotAs(OutputType.FILE);
//		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\fullpageScreenshot.png");
//		sourcefile.renameTo(targetfile);   // copy source file to target file
		
// particular area screenshot 		
		WebElement image= driver.findElement(By.xpath("//img[@title='iPhone']"));
		
		File sourcefile= image.getScreenshotAs(OutputType.FILE);
		File targetfile = new File(System.getProperty("user.dir")+"\\Screenshot\\Iphoneimg.png");
		sourcefile.renameTo(targetfile);   // copy source file to target file
		
		
	}

}
