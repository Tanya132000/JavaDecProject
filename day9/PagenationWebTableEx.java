package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PagenationWebTableEx {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();
        driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//Total size count	
		
		List<WebElement> cellcount =driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr//td"));
		System.out.println(cellcount.size());//20

// total page count

		List<WebElement> pagecount =driver.findElements(By.xpath("//ul[@class='pagination']//li//a"));
		System.out.println(pagecount.size());//4
//Row count		
		List<WebElement> rowcount =driver.findElements(By.xpath("//div[@class='table-container']//tbody//tr"));
		System.out.println(rowcount.size());//5
		
//for loop
		for(int p=1;p<=pagecount.size();p++) { //pagination
			driver.findElement(By.xpath("//ul[@class='pagination']//li["+p+"]//a")).click();
			Thread.sleep(30);
			if(p==3 || p==4) {
			for(int r=2;r<=rowcount.size();r++) {
			
				Thread.sleep(30);

			driver.findElement(By.xpath("//div[@class='table-container']//tbody//tr["+r+"]//td[4]//input")).click();	
				
			}	
							
			}
		}		
		
		
		
		
	}

}
