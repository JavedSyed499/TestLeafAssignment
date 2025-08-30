package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

class CreateLead {

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
		//Click on Leads
		driver.findElement(By.linkText("Leads")).click();
		//Click on Create Leads
		driver.findElement(By.linkText("Create Lead")).click();
		//Enter Company Name
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testlead");
		//Enter First Name
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("Syed");
		//Enter Last Name
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("Javed");
		//Enter Title
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("NewProgram");
		//click on Create Lead
		driver.findElement(By.className("smallSubmit")).click();
		//Print the Title
		System.out.println(driver.getTitle());
		//Close the Brower
		driver.quit();
		
	}

}
