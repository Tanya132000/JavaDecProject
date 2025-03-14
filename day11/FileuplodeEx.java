package day11;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FileuplodeEx {

	public static void main(String[] args) {

			WebDriver driver = new ChromeDriver();

			driver.get("https://davidwalsh.name/demo/multiple-file-upload.php");
			driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			driver.manage().window().maximize();
//single file upload 		
	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\testing fille\\Day-1 se.txt");
	
//validate the file upload is correct one or not		
	String Actualfile= driver.findElement(By.xpath("//ul[@id=\"fileList\"]//li")).getText();
	String Expectedfile="Day-1 se.txt";
	if(Actualfile.equals(Expectedfile)) {
		System.out.println("condition pass");
	}else {
		System.out.println("condition fail");
	}
	
	
	
	
//multiple file uploading 		
		
//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\testing fille\\Day-1 se.txt");	
//	driver.findElement(By.xpath("//input[@id='filesToUpload']")).sendKeys("C:\\testing fille\\Day-2 se.txt");	

	}

}
