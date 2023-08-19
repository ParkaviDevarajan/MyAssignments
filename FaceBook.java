package week2.day3;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class FaceBook {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		//syntex xpath=//tagname[@Attribute='value']		
		driver.findElement(By.xpath("//a[@data-testid= 'open-registration-form-button']")).click();
		driver.findElement(By.xpath("//input[@aria-label = 'First name']")).sendKeys("Parkavi");
		driver.findElement(By.xpath("//input[@name = 'lastname']")).sendKeys("Devarajan"); 
		driver.findElement(By.xpath("//input[@name = 'reg_email__']")).sendKeys("parkaviloga@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_email_confirmation__']")).sendKeys("parkaviloga@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']")).sendKeys("parkavi951987");
		//select date from dropdown
		WebElement date = driver.findElement(By.id("day"));
		Select dateselect = new Select (date);
		dateselect.selectByIndex(8);
		//select month from dropdown
		WebElement month = driver.findElement(By.id("month"));
		Select monthselect = new Select (month);
		monthselect.selectByIndex(4);
		//select year from dropdown
		WebElement year = driver.findElement(By.id("year"));
		Select yearselect = new Select (year);
		yearselect.selectByIndex(36);
		driver.findElement(By.xpath("//label[contains(text(),'Female')]")).click();
		
		driver.findElement(By.xpath("//button[@name = 'websubmit']")).click();
	   
	    
	}

}
