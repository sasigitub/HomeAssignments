package week5.Assignments.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class DefaultBaseClass {
	
	ChromeDriver driver  = new ChromeDriver();
	@BeforeMethod
	public void preCondition() {
		
		System.out.println("Before method is loading all preconditions");		
		driver.manage().window().maximize();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.linkText("CRM/SFA")).click();		
	}
	
	@AfterMethod
	public void postCondition() {
		System.out.println("After method is loading all postconditions");
		driver.close();
	}

}
