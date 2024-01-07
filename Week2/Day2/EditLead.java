package week2Assignments.day2;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class EditLead {
	
	public static void main(String[] args) {
		
		ChromeDriver driver = new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();

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
		
		
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TS");

		//Click Find leads button
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();

		driver.getTitle() ;
		
		//click the first resulting page
		//driver.findElement(By.xpath("//div[@class='x-grid3-cell-inner x-grid3-col-firstName']/following::a)[1]")).click();
		
		driver.findElement(By.xpath("//a[text()='TS']")).click();
		//driver.findElement(By.xpath("(//a[text()='S.Sasi'])[1]")).click();
		
		//Verify title of the page
		String title = driver.getTitle() ;
				
				System.out.println(title);
		// Click Edit
				
		driver.findElement(By.xpath("//a[@class='subMenuButton'][3]")).click();
		
		// Click Update"
		
		//Enter first name
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).clear();
		driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TS1");
		
		driver.findElement(By.xpath("//input[@name='submitButton']")).click();
		
		// Confirm the changed name appears
		
				driver.findElement(By.xpath("//a[(text()='Find Leads')]")).click();
				driver.findElement(By.xpath("(//input[@name='firstName'])[3]")).sendKeys("TS1");
			//	driver.findElement(By.xpath("//td[@class='x-btn-center']/following::button)[6]")).click();
				
				
		// Close the browser (Do not log out)
				driver.close() ;
			
		
	}
	
	
}
