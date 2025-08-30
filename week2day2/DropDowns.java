package week2.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDowns {

	public static void main(String[] args) {
		
	//	ChromeOptions options = new ChromeOptions();
	//	options.addArguments("guest");
		
		FirefoxDriver driver=new FirefoxDriver();
	//	ChromeDriver driver = new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login Button
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRMSFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//driver.findElement(By.xpath("//a[contains(text()='CRM/SFA')]")).click();
		//Click on Leads Tab
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Link
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Mandatory Items
		//driver.findElement(By.id("createLeadForm_companyName")).sendKeys("testleaf");
		//driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Syed");
		//driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Javed");
		driver.findElement(By.xpath("//input[@id='createLeadForm_companyName']")).sendKeys("testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Syed");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Javed");
		//Select Source
		driver.findElement(By.id("createLeadForm_dataSourceId")).click();
		//Select Employee
		WebElement datasourceId = driver.findElement(By.id("createLeadForm_dataSourceId"));
		Select datasource = new Select(datasourceId);
		datasource.selectByIndex(4);
		//select Marketing Campign
		driver.findElement(By.id("createLeadForm_marketingCampaignId")).click();
		//Select Automobile
		WebElement MktCpn = driver.findElement(By.id("createLeadForm_marketingCampaignId"));
		Select marcpn = new Select(MktCpn);
		marcpn.selectByVisibleText("Automobile");
		
		driver.findElement(By.id("createLeadForm_ownershipEnumId")).click();
		//Select Automobile
		WebElement Owner = driver.findElement(By.id("createLeadForm_ownershipEnumId"));
		Select ownership = new Select(Owner);
		ownership.selectByValue("OWN_CCORP");
		
		//driver.findElement(By.id("ext-gen675")).click();
		//driver.quit();
		

	}

}
