package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class simpledropdownEx {

	public static void main(String[] args) throws InterruptedException {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://testautomationpractice.blogspot.com/");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		//  //select[@class="form-control"][1]
		WebElement dropdown= driver.findElement(By.xpath("//select[@class=\"form-control\"][1]"));
//		WebElement dropdown= driver.findElement(By.xpath("//select[@id=\"country\"]"));
		dropdown.click();
		
// to handle dropdown
//	Select sc= new Select(dropdown);
//		sc.selectByIndex(9);
//	sc.selectByValue("australia");
//	sc.selectByVisibleText("China");
//	
	
// count of the element in dropdown menu
	
	List<WebElement> alloption= driver.findElements(By.xpath("//select[@id=\"country\"]//option"));
System.out.println(alloption.size());
		
		
		for(int i=0;i<alloption.size(); i++) {
			System.out.println(alloption.get(i).getText());
			
			if(alloption.get(i).getText().equals("India")) {
				alloption.get(i).click();
			}
			
			
			driver.close();
			
			
			
			
			
			
		}
		
		
		
	}

}
