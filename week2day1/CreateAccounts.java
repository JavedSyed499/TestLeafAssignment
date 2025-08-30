package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class CreateAccounts {

	public static void main(String[] args) {
		
		FirefoxDriver driver=new FirefoxDriver(); // Create Firefox instance
		driver.get("http://leaftaps.com/opentaps/control/main"); //call the URL
		driver.manage().window().maximize(); //Maximize the window
		//Enter User Name
		driver.findElement(By.id("username")).sendKeys("demosalesmanager");
		//Enter Password
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on Login
		driver.findElement(By.className("decorativeSubmit")).click();
		//Click on CRM/SFA
		driver.findElement(By.partialLinkText("CRM/SFA")).click();
		//Click on Accounts
		driver.findElement(By.linkText("Accounts")).click();
		//Click on Create Account
		driver.findElement(By.linkText("Create Account")).click();
		//Enter Account Name
		driver.findElement(By.id("accountName")).sendKeys("NewAccount");
		//Enter Description
		driver.findElement(By.name("description")).sendKeys("Selenium Automation Tester.");
		//Enter No of Employees
		driver.findElement(By.id("numberEmployees")).sendKeys("10");
		//Enter Site Name
		driver.findElement(By.id("officeSiteName")).sendKeys("LeafTaps");
		//Click on Create button
		driver.findElement(By.className("smallSubmit")).click();
		//Print Title Name
		System.out.println(driver.getTitle());
		//Close the Browser
		driver.quit();
	}

}
