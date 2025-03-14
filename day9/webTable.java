package day9;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class webTable {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();

		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
//find total no of rows and column		

		List<WebElement> totalcount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tbody//tr//td"));
		System.out.println(totalcount.size());// 24
		
		//find total no of rows		
		List<WebElement> rowcount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tbody//tr"));
		System.out.println(rowcount.size()); 
		
//find total no of column		
	    List<WebElement> columncount = driver.findElements(By.xpath("//table[@name=\"BookTable\"]//tbody//th"));	
		System.out.println(columncount.size());
		
//for loop for print the table
		for(int r=2; r<=rowcount.size();r++) {// row
			
			for(int c=1; c<=columncount.size();c++) {//column
				
		String webtable=driver.findElement(By.xpath("//table[@name=\"BookTable\"]//tbody//tr["+r+"]//td["+c+"]")).getText();
				System.out.println(webtable+"\t");	
				
			}
			System.out.println();
		}
		
	
	}

}
