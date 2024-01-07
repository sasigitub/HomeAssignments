package week2Assignments.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DeleteLead {

	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		

		// enter username

		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");

		// enter password crmsfa
		driver.findElement(By.id("password")).sendKeys("crmsfa");

		// click Login Button

		driver.findElement(By.className("decorativeSubmit")).click();

		// click crmsfa link

		driver.findElement(By.xpath("//a[contains(text(),'SFA')]")).click();

		// Click on Leads Button

		driver.findElement(By.xpath("//a[(text()='Leads')]")).click();

		// Click Find leads
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		


		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1111");

		// Click find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		
		
		// Click First Resulting lead

	
		driver.findElement(By.linkText("DEMO1")).click();
		// Click Delete
		driver.findElement(By.className("subMenuButtonDangerous")).click();
		
		// Click Find leads
		driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

		// Click on Phone
		driver.findElement(By.xpath("//span[text()='Phone']")).click();

		// Enter phone number
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("1111");
		
		// Click find leads button
				driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		
		// Verify message "No records to display" in the Lead List. This message
				String noRecordsTo = driver.findElement(By.xpath("//div[text()='No records to display']")).getText();
	
		
		System.out.println(noRecordsTo);
		
		driver.close();

		// Close the browser (Do not log out)

	}

}
