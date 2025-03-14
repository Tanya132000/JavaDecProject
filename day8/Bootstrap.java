package day8;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Bootstrap {

	public static void main(String[] args) {
WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.jquery-az.com/boots/demo.php?ex=63.0_2");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().window().maximize();
		
// click the box
		driver.findElement(By.xpath("//button[@type=\"button\"]")).click();
		List<WebElement> drop = driver.findElements(By.xpath("//button[@type=\"button\"]//li//a//input"));	

//		driver.findElement(By.xpath("//span[@class='multiselect-native-select]")).click();	
		
//	List<WebElement> drop = driver.findElements(By.xpath("//span[@class='multiselect-native-select]//li//a//input"));	
//		System.out.println(drop.size());
		
		for(WebElement dp:drop) {
			System.out.println(dp);
		}
		
	List<WebElement> Alloptions=driver.findElements(By.xpath("//ul[contains(@class,'multiselect')]//label"));
		System.out.println(Alloptions.size());
		
		for(WebElement aloop:Alloptions)
			System.out.println(aloop.getText());
		
		
	}

}
