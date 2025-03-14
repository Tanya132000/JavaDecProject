package Day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LocatorsEx {

	public static void main(String[] args) throws InterruptedException {

WebDriver driver = new ChromeDriver();	
	 driver.get("https://www.saucedemo.com/");	
		
// for maximize the output window	
		driver.manage().window().maximize();
		
// for minimize the output window		
//		driver.manage().window().minimize();
	
		WebElement username = driver.findElement(By.id("user-name"));	
		username.sendKeys("standard_user");
		
		WebElement password	= driver.findElement(By.name("password"));
		 password.sendKeys("secret_sauce");
		
		    WebElement Login=driver.findElement(By.name("login-button"));
		     Login.click();	
		 
		 
     Thread.sleep(1000);
		WebElement Swaglablogo = driver.findElement(By.className("app_logo"));
		Swaglablogo.isEnabled();
		
		System.out.println(Swaglablogo.getText());
		
		if(Swaglablogo.getText().equals("Swag Labs")) {
			System.out.println("passed");
		}else {
			System.out.println("failed");
		}
		 
		
	     Thread.sleep(1000);
	   WebElement Products = driver.findElement(By.className("title"));
	   Products.isEnabled();
		 System.out.println(Products.getText());
		 if (Products.getText().equals("Products")) {
			
			 System.out.println("Passed");
		 }else {System.out.println("fail");
		 }
		
		 WebElement saurcelabBack= driver.findElement(By.xpath("//div[@data-test=\'inventory-item-name'][1]"));
		 
		 saurcelabBack.click();
		 
		 //another way to click any button
	 
//		 WebElement saurcelabBack= driver.findElement(By.className("inventory_item_name"));
//		 saurcelabBack.click();
		 
//		WebElement AddToCart = driver.findElement(By.xpath("//drv[@data-test=\\'data-test']"));
//		AddToCart.click();
		
		 WebElement AddToCart = driver.findElement(By.name("add-to-cart"));
       	AddToCart.click();
       	
       	WebElement ShoopingCart = driver.findElement(By.className("shopping_cart_badge"));
       	ShoopingCart.click();
       	
       	WebElement Checkout = driver.findElement(By.name("checkout"));
       	Checkout.click();
       	
       	WebElement FirstName = driver.findElement(By.id("first-name"));	
		FirstName.sendKeys("Tanya");
		
		WebElement LastName= driver.findElement(By.name("lastName"));
		LastName.sendKeys("Gupta");
		
		WebElement postcoad= driver.findElement(By.name("postalCode"));
		postcoad.sendKeys("560049");
		
		
		WebElement contiune=driver.findElement(By.name("continue"));
		contiune.click();
		
		WebElement finish=driver.findElement(By.name("finish"));
		finish.click();
		
	
		
		
		
	}
	
	
}
