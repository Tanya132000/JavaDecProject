package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HiddenDropDown {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type='submit']")).click();
        driver.findElement(By.xpath("//span[normalize-space()='PIM']")).click();		
         driver.findElement(By.xpath("//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div[1]/div[2]/form/div[1]/div/div[6]/div/div[2]/div/div")).click();
	////div[@role='listbox']//div//span	
		
         
         
		List<WebElement> dropsize= driver.findElements(By.xpath("//div[@role='listbox']//div//span"));
		System.out.println(dropsize.size());
		for(WebElement dp:dropsize) {
			
			if(dp.getText().equals("Chief Executive Officer")) {
				dp.click();
			}
			
		
		}
		
			
		
	}

}
