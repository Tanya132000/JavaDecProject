package day10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DatePickerEx {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://jqueryui.com/datepicker/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
//frame 
		driver.switchTo().frame(0);
// method1: using SendKey
		driver.findElement(By.id("datepicker")).sendKeys("11/19/2024");
		
// method2: using SendKey		
		
		String Expectedmonth = "September";
		String Expectedyear = "2022";
		String Expecteddate = "28";
	// take xpath for month and year
		driver.findElement(By.xpath("//input[@id='datepicker']")).click();
		
		while(true) {
			String Actualmonth = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']")).getText();// month
			String Actualyear = driver.findElement(By.xpath("//span[@class='ui-datepicker-year'] ")).getText();// year

		if(Expectedmonth.equals(Actualmonth)&&Expectedyear.equals(Actualyear)) {
			
			break;
			
		}
		driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-w']")).click();
		
		}
//	// for date
		List<WebElement> Actualdate= driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']//tbody//tr//td//a"));
		
		for(WebElement date:Actualdate) {
			date.click();
			break;
		}
		
		
		
		
		
		
		
	}

}
