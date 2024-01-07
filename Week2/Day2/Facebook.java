package week2Assignments.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Facebook {
	// Assignment:1

	// FaceBook:
	// ================================
	// Step 1: Download and set the path
	// Step 2: Launch the chromebrowser
	// Step 3: Load the URL https://en-gb.facebook.com/
	// Step 4: Maximise the window
	// Step 5: Add implicit wait
	// Step 6: Click on Create New Account button
	// Step 7: Enter the first name
	// Step 8: Enter the last name
	// Step 9: Enter the mobile number
	// Step 10: Enterthe password
	// Step 11: Handle all the three drop downs
	// Step 12: Select the radio button "Female"
	// ( A normal click will do for this step)
	public static void main(String[] args) {

		ChromeDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));

		driver.findElement(By.xpath("//a[text()='Create new account']")).click();

		driver.findElement(By.xpath("//input[@name= 'firstname']")).sendKeys("Sasi");

		driver.findElement(By.xpath("//input[@name= 'lastname']")).sendKeys("Rekha");

		driver.findElement(By.xpath("//input[@name= 'reg_email__']")).sendKeys("sahseerekh1@gmail.com");
		driver.findElement(By.xpath("//input[@name= 'reg_email_confirmation__']")).sendKeys("sahseerekh1@gmail.com");
	

		driver.findElement(By.xpath("//input[@id= 'password_step_input']")).sendKeys("123123123");

		WebElement DayOpt = driver.findElement(By.id("day"));

		Select osel = new Select(DayOpt);
		osel.selectByVisibleText("24");

		WebElement MonOpt = driver.findElement(By.id("month"));

		Select msel = new Select(MonOpt);
		msel.selectByVisibleText("Feb");

		WebElement yearOpt = driver.findElement(By.id("year"));

		Select ysel = new Select(yearOpt);
		ysel.selectByVisibleText("2000");

		driver.findElement(By.xpath("//label[text()= 'Female']")).click();

		driver.findElement(By.xpath("//button[@name ='websubmit']")).click();

	}
}
