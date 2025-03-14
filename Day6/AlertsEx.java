package Day6;

import java.time.Duration;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class AlertsEx {

	public static void main(String[] args) throws InterruptedException {

		WebDriver driver = new ChromeDriver();
		
		driver.get(" https://the-internet.herokuapp.com/javascript_alerts");
		
		driver.manage().window().maximize();
		WebDriverWait Mywait= new WebDriverWait(driver,Duration.ofSeconds(20));// for wait the drive
		
		
//simple alert		
		WebElement simpleAlert=driver.findElement(By.xpath("//button[@onclick='jsAlert()']"));
		simpleAlert.click();

//except of above line we can use below line 
// how to handle alert without using switch method(We can handle using explicit wait and formula)
		
		 Alert alert =Mywait.until(ExpectedConditions.alertIsPresent()); 
		 alert.accept();
		
		 
//		driver.switchTo().alert().accept(); // Ok button
		Thread.sleep(20);

		
		
		//Confirm alert 	
		
driver.findElement(By.xpath("//button[@onclick='jsConfirm()']")).click();
driver.switchTo().alert().dismiss();

// prompt alert
driver.findElement(By.xpath("//button[@onclick='jsPrompt()']")).click();
driver.switchTo().alert().sendKeys("welcome to prompt alert");
driver.switchTo().alert().accept();

String actualresult = driver.findElement(By.xpath("//p[@id=\"result\"]")).getText();
System.out.println(actualresult);

String expectedresult = "You entered: welcome to prompt alert";
if (expectedresult.equals(actualresult)) {
	System.out.println("Matched");
	
}else {
	System.out.println("not matched ");
}


	}

}
