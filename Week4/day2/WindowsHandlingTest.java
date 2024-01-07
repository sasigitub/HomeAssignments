package week4.Assignments.day2;

import java.time.Duration;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandlingTest {
	
	public static void main(String[] args) throws InterruptedException {
		
		ChromeDriver driver  = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));

		//Enter the username and password.



		driver.findElement(By.id("username")).sendKeys("Democsr");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		//Click on the Login button.
		driver.findElement(By.className("decorativeSubmit")).click();
		
		//Click on the CRM/SFA link.
		driver.findElement(By.linkText("CRM/SFA")).click();
		
		//Click on the Contacts button
		driver.findElement(By.linkText("Contacts")).click();
		
		//Click on Merge Contacts.
		driver.findElement(By.linkText("Merge Contacts")).click();
		
		//Click on the widget of the "From Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[1]")).click();
		Set<String> hdLList = driver.getWindowHandles();
		List<String> hdl = new ArrayList<String>(hdLList);
		driver.switchTo().window(hdl.get(1));
		
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("testuser");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(1000);
		
		// Click on the first resulting contact
		String leadID = driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).getText();
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(hdl.get(0));
		
		//Click on the widget of the "To Contact"
		driver.findElement(By.xpath("(//img[@alt='Lookup'])[2]")).click();
		
		Set<String> allWindows2 = driver.getWindowHandles();
		List<String> allhandles2 = new ArrayList<String>(allWindows2);
		driver.switchTo().window(allhandles2.get(1));
		driver.findElement(By.xpath("//input[@name='firstName']")).sendKeys("ssr");
		driver.findElement(By.xpath("//button[text()='Find Contacts']")).click();
		Thread.sleep(1000);
		
		//Click on the second resulting contact.
		driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-partyId']/a")).click();
		driver.switchTo().window(allhandles2.get(0));
		//Click on the Merge button.
		driver.findElement(By.xpath("//a[text()='Merge']")).click();
		//accept the alert
		driver.switchTo().alert().accept();
		
		System.out.println(driver.getTitle());
		driver.close();

	}

}



