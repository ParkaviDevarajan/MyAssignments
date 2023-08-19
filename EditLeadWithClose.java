package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.RemoteWebDriver;

public class EditLeadWithClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");	//load the new url
		driver.manage().window().maximize();	//Maximize the window
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");	//Enter the Loginname
		driver.findElement(By.id("password")).sendKeys("crmsfa");	//Enter the password
		driver.findElement(By.className("decorativeSubmit")).click();	//Click Login button
		String title = driver.getTitle();	//Get Title of the page
		System.out.println(title);	//print the title
		driver.findElement(By.linkText("CRM/SFA")).click();		//Click CRM/SFA
		String title1 = driver.getTitle();	//Get Title of the page
		System.out.println(title1);	//print the title
		driver.findElement(By.linkText("Leads")).click();	//Click Lead
		driver.findElement(By.linkText("Create Lead")).click();	//click createlead
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");	//Enter Company name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Parkavi");	//Enter first name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Devarajan");	//Enterlastname
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("parkaviloga09@gamil.com"); //Enter EmailID
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("8056065600");
		driver.findElement(By.name("submitButton")).click();	//click CreateLead
		String text = driver.findElement(By.id("viewLead_companyName_sp")).getText();	//Verify the text
		System.out.println(text);	//print the text
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_companyName")).clear();	//clear Company name
		driver.findElement(By.id("updateLeadForm_companyName")).sendKeys("Amazon");	//Enter New Company name
		driver.findElement(By.name("submitButton")).click();    //   update the form
		String newtext = driver.findElement(By.id("viewLead_companyName_sp")).getText();	//Verify the new text
		System.out.println(newtext);	//print the new text
		driver.close();
		
			}

	}


