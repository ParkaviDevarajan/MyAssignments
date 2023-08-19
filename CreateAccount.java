package week2.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class CreateAccount {

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
		driver.findElement(By.linkText("Accounts")).click();
		driver.findElement(By.linkText("Create Account")).click();
		driver.findElement(By.xpath("//input[@id = 'accountName']")).sendKeys("Parkavi");
		driver.findElement(By.xpath("//input[@id = 'groupNameLocal']")).sendKeys("loganathan");
		driver.findElement(By.xpath("//input[@id = 'officeSiteName']")).sendKeys("Testleaf");
		driver.findElement(By.xpath("//input[@id = 'annualRevenue']")).sendKeys("500000");
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester");
		
		WebElement industry = driver.findElement(By.name("industryEnumId"));
		Select industryselect = new Select (industry);
		industryselect.selectByIndex(2);
		
		WebElement ownership = driver.findElement(By.name("ownershipEnumId"));
		Select ownershipselect = new Select(ownership);
		ownershipselect.selectByVisibleText("Sole Proprietorship");
		
		WebElement datasource = driver.findElement(By.name("dataSourceId"));
		Select datasourceselect = new Select(datasource);
		datasourceselect.selectByValue("LEAD_EMPLOYEE");
		
		WebElement market = driver.findElement(By.id("marketingCampaignId"));
		Select marketselect = new Select (market);
		marketselect.selectByIndex(6);
		
		WebElement statepro = driver.findElement(By.name("generalStateProvinceGeoId"));
		Select stateproselect = new Select(statepro);
		stateproselect.selectByValue("TX");
		
		driver.findElement(By.xpath("//input[@value = 'Create Account']")).click();
		

	}

}
